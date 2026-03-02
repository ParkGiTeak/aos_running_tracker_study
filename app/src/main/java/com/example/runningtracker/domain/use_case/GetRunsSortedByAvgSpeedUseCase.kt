package com.example.runningtracker.domain.use_case

import com.example.runningtracker.domain.model.Run
import com.example.runningtracker.domain.repository.RunRepository
import kotlinx.coroutines.flow.Flow

class GetRunsSortedByAvgSpeedUseCase(
    private val runRepository: RunRepository
) {
    operator fun invoke(): Flow<List<Run>> {
        return runRepository.getAllRunsSortedByAvgSpeed()
    }
}