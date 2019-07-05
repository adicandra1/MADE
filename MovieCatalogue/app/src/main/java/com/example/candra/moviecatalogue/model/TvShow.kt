package com.example.candra.moviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TvShow (
    var title: String? = null,

    var overview: String? = null,

    var casts: List<Cast>? = null,

    var status: String? = null,

    var type: String? = null,

    var originalLanguage: String? = null,

    var runtime: String? = null,

    var genres: Array<String>? = null,

    var keywords: Array<String>? = null

) : Parcelable