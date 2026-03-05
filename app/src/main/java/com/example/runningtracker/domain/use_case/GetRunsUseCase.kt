package com.example.runningtracker.domain.use_case

import com.example.runningtracker.domain.model.Run
import com.example.runningtracker.domain.model.SortType
import com.example.runningtracker.domain.repository.RunRepository
import kotlinx.coroutines.flow.Flow

class GetRunsUseCase(
    private val runRepository: RunRepository
) {
    operator fun invoke(sortType: SortType): Flow<List<Run>> {
        return when(sortType) {
            SortType.DATE -> runRepository.getAllRunsSortedByDate()
            SortType.RUNNING_TIME -> runRepository.getAllRunsSortedByTimeInMillis()
            SortType.DISTANCE -> runRepository.getAllRunsSortedByDistance()
            SortType.AVG_SPEED -> runRepository.getAllRunsSortedByAvgSpeed()
        }
    }
}