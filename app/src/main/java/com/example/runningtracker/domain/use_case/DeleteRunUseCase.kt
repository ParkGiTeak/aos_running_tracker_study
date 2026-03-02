package com.example.runningtracker.domain.use_case

import com.example.runningtracker.domain.model.Run
import com.example.runningtracker.domain.repository.RunRepository

class DeleteRunUseCase(
    private val runRepository: RunRepository
) {
    suspend operator fun invoke(run: Run) {
        runRepository.deleteRun(run)
    }
}