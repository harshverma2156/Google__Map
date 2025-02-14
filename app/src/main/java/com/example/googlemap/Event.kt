package com.example.googlemap

class Event {

    data class Event(
        val id: String,
        val name: String,
        val latitude: Double,
        val longitude: Double,
        val description: String
    )

}