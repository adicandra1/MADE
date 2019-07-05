package com.example.candra.moviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(

    var movieTitle: String? = null,

    var moviePoster: Int? = null,

    var releasedDate: String? = null,

    var runtime: String? = null,

    var genres: Array<String>? = null,

    var casts: List<Cast>? = null,

    var overview: String? = null,

    var budget: String? = null,

    var revelue: String? = null,

    var keywords: Array<String>? = null

) : Parcelable