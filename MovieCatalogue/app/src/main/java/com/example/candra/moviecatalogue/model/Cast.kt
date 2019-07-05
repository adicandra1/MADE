package com.example.candra.moviecatalogue.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Cast(

    var castName: String? = null,

    var castRole: String? = null,

    var castPhotoFileName: Int? = null

) : Parcelable