package com.example.runningtracker.presentation.service

import com.example.runningtracker.domain.location.LocationPoint

data class TrackingState(
    val isTracking: Boolean = false,
    val pathPoints: List<LocationPoint> = listOf<LocationPoint>(),
    val distanceInMeters: Double = 0.0,
    val timeInMillis: Long = 0L,
    val avgSpeedInKMH: Float = 0f,
)
