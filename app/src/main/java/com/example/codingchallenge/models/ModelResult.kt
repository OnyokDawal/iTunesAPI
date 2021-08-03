package com.example.codingchallenge.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class ModelResult(

    val artistId: Int,

    val artistName: String,

    val artistViewUrl: String,

    val artworkUrl100: String,

    val artworkUrl60: String,

    val artworkUrl30: String,

    val collectionArtistId: Int,

    val collectionArtistName: String,

    val collectionArtistViewUrl: String,

    val collectionCensoredName: String,

    val collectionExplicitness: String,

    val collectionHdPrice: Double,

    val collectionViewUrl: String,

    val contentAdvisoryRating: String,

    val copyright: String,

    val country: String,

    val currency: String,

    val description: String,

    val discCount: Int,

    val discNumber: Int,

    val kind: String,

    val longDescription: String,

    val previewUrl: String,

    val primaryGenreName: String,

    val releaseDate: String,

    val shortDescription: String,

    val trackCensoredName: String,

    val trackCount: Int,

    val trackExplicitness: String,

    val trackHdPrice: Double,

    val trackHdRentalPrice: Double,

    val trackId: Int,

    val trackName: String,

    val trackNumber: Int,

    val trackPrice: Double,

    val trackRentalPrice: Double,

    val trackTimeMillis: Int,

    val trackViewUrl: String,

    val wrapperType: String)

//) : Parcelable{
//    constructor() : this(
//        0, "", "", "", "", "",
//        0, "", "", "", "",
//        0.0, "", "", "", "", "", "",
//        0, 0, "", "","", "",
//        "", "", "", 0, "", 0.0,
//        0.0, 0, "", 0,0.0,0.0,0,
//        "","")
//
//}
//
//data class itunesResult(
//    val resultCount: Int,
//    val results: List<Result>
//)

