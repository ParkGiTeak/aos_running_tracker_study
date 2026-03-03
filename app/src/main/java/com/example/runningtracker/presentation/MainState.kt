package com.example.runningtracker.presentation

import com.example.runningtracker.domain.location.LocationPoint
import com.example.runningtracker.domain.model.GpsStatus
import com.example.runningtracker.domain.model.Run
import com.example.runningtracker.domain.model.SortType
import com.example.runningtracker.presentation.service.TrackingState

data class MainState(
    val runs: List<Run> = listOf<Run>(),
    val sortType: SortType = SortType.DATE,
    val gpsStatus: GpsStatus = GpsStatus.Acquired,
    val trackingState: TrackingState = TrackingState(),
    val selectedRun: Run? = null,
    val displayPathPoints: List<LocationPoint> = listOf<LocationPoint>(),
)
