package com.reihan.inhealth.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Artikel(
    val title: String,
    val author: String,
    val date: String,
    val photo: Int,
    val desc: String
) : Parcelable
