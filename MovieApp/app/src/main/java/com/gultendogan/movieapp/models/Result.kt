package com.gultendogan.movieapp.models

data class Result (
    val backdrop_path: String,
    val genre_ids: List<Int>,
    val id: Int,
    val overview: String,
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String,
    val vote_average: Double,
    var genrestringTr: String,
    var genrestring: String
    )