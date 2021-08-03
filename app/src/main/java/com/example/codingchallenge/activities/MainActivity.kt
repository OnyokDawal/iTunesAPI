package com.example.codingchallenge.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.codingchallenge.R
import com.example.codingchallenge.adapter.MovieAdapter
import com.example.codingchallenge.models.ModelResult
import com.example.codingchallenge.models.MovieResponse
import com.example.codingchallenge.services.ApiInterface
import com.example.codingchallenge.services.ApiService
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview_movie_list.layoutManager = LinearLayoutManager(this)
        recyclerview_movie_list.setHasFixedSize(true)
        getMovieData {
            movies : List<ModelResult> ->
            recyclerview_movie_list.adapter = MovieAdapter(movies)
        }

    }

    private fun getMovieData(callback: (List<ModelResult>) -> Unit) {

        val apiService = ApiService.getInstance().create(ApiInterface::class.java)
        apiService.getiTunesApiList().enqueue(object : Callback<MovieResponse>{
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                println(callback(response.body()!!.movies))

                return callback(response.body()!!.movies)
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {

            }

        })
    }
}