package com.example.codingchallenge.models

import com.google.gson.annotations.SerializedName


data class MovieResponse(
    @SerializedName("results")

    val movies : List<ModelResult>
)
