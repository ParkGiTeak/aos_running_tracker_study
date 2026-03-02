package com.example.runningtracker.domain.model

import com.example.runningtracker.domain.location.LocationPoint

data class Run(
    val id: Int? = null,
    val distanceInMeters: Double = 0.0,
    val timeInMillis: Long = 0L,
    val timeStamp: Long = 0L,
    val avgSpeedInKMG: Float = 0f,
    val pathPoints: List<LocationPoint> = listOf<LocationPoint>(),
)