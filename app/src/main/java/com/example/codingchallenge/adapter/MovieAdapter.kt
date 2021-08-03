package com.example.codingchallenge.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.Placeholder
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.codingchallenge.models.ModelResult
import com.bumptech.glide.Glide
import com.example.codingchallenge.R
import com.example.codingchallenge.activities.DetailsActivity
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.activity_details.view.*
import kotlinx.android.synthetic.main.movie_item.view.*

class MovieAdapter (
    private val movies : List<ModelResult>,
    ) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val intent = Intent(itemView.context, DetailsActivity::class.java)
        fun bindResult(result: ModelResult) {
            Glide.with(itemView).load(result.artworkUrl100)
                .placeholder(R.drawable.itunes)
                .error(R.drawable.erroricon)
                .into(itemView.imageview_artwork)

            if(result.trackName.isNullOrEmpty()){
                itemView.textviewtrackname.text = "Could not load track name data!"
            } else{
                itemView.textviewtrackname.text = "Track name: " + result.trackName
            }

            if(result.trackPrice.toString().isNullOrEmpty()){
                itemView.textviewprice.text = "Could not load track price data!"
            } else{
                itemView.textviewprice.text = "Price: " +result.trackPrice.toString()
            }

            if(result.primaryGenreName.isNullOrEmpty()){
                itemView.textviewgenre.text = "Could not load genre data!"
            } else{
                itemView.textviewgenre.text = "Genre: " + result.primaryGenreName
            }

            if(result.description.isNullOrBlank()){
                itemView.containerld.text = "a sodales arcu. Nullam tempus at orci in efficitur.Fusce eu ipsum eget mi aliquam iaculis. Donec eget ex risus. Aenean condimentum mi at ipsum semper tempus. Etiam elementum sem felis, vel auctor mauris luctus eget. Nulla tempus et"
            } else{
                itemView.containerld.text = result.description
            }





            itemView.containerld.text = result.description
            itemView.containeraw.text = result.artworkUrl100.toString()
            itemView.setOnClickListener {

                val trackname = itemView.textviewtrackname.text
                val trackgenre = itemView.textviewgenre.text
                val trackprice = itemView.textviewprice.text
                val tracklongdescription = itemView.containerld.text
                val artworkurl = itemView.containeraw.text



                intent.putExtra("trackname",trackname)
                intent.putExtra("genre",trackgenre)
                intent.putExtra("price",trackprice)
                intent.putExtra("description",tracklongdescription)
                intent.putExtra("artworkurl",artworkurl)


                itemView.context.startActivity(intent)
            }

        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        )
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bindResult(movies.get(position))
    }




    //**** On item click listener ****//


}


