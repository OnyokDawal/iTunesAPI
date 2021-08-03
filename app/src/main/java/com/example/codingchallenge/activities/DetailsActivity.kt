package com.example.codingchallenge.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.codingchallenge.R
import kotlinx.android.synthetic.main.activity_details.*
import kotlinx.android.synthetic.main.movie_item.view.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        displayResultDetails()
        displayImage()
    }

    fun displayResultDetails(){
        val artisttrackname = intent.getStringExtra("trackname")
        val trackname: TextView =findViewById(R.id.txtview_trackname)

        val artisttrackgenre = intent.getStringExtra("genre")
        val genre: TextView =findViewById(R.id.txtview_genre)

        val artisttrackprice = intent.getStringExtra("price")
        val price: TextView =findViewById(R.id.txtview_price)

        val artistlongdescription = intent.getStringExtra("description")
        val longdescription: TextView =findViewById(R.id.txtview_longdescription)

        trackname.text = artisttrackname
        genre.text = artisttrackgenre
        price.text = artisttrackprice
        longdescription.text = artistlongdescription
        txtview_longdescription.text = artistlongdescription



    }

    fun displayImage(){
        val artistartwork = intent.getStringExtra("artworkurl")
        val artwork: TextView =findViewById(R.id.artworkurl)

        artwork.text = artistartwork


        Glide.with(this).load(artistartwork)
            .placeholder(R.drawable.itunes)
            .error(R.drawable.erroricon)
            .into(img_artwork)
    }



}