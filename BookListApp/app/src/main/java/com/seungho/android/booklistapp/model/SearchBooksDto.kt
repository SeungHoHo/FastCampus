package com.seungho.android.booklistapp.model

import com.google.gson.annotations.SerializedName

data class SearchBooksDto(
    @SerializedName("title") val title: String,
    @SerializedName("item") val books: List<Book>
)