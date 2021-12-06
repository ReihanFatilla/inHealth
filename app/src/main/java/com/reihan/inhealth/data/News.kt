package com.reihan.inhealth.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class News(
    val title: String,
    val content: String,
    val author: String,
    val date: String,
    val desc: String,
    val photo: Int
) : Parcelable
