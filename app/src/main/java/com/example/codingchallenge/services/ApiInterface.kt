package com.example.codingchallenge.services

import com.example.codingchallenge.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    //;country=au&amp;media=movie&amp;all
    @GET("/search?term=star&amp;country=au&amp;media=movie&amp;all")
    fun getiTunesApiList(): Call<MovieResponse>
}