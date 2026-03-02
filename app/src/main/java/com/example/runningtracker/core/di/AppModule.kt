package com.example.runningtracker.core.di

import com.example.runningtracker.data.repository.MockRunRepositoryImpl
import com.example.runningtracker.domain.repository.RunRepository
import com.example.runningtracker.domain.use_case.DeleteRunUseCase
import com.example.runningtracker.domain.use_case.GetRunsSortedByAvgSpeedUseCase
import com.example.runningtracker.domain.use_case.GetRunsSortedByDateUseCase
import com.example.runningtracker.domain.use_case.GetRunsSortedByDistanceUseCase
import com.example.runningtracker.domain.use_case.SaveRunUseCase
import org.koin.dsl.module

val appModule = module {
    // REPOSITORY
    single<RunRepository> { MockRunRepositoryImpl() }

    // USECASE
    single { DeleteRunUseCase(get()) }
    single { GetRunsSortedByAvgSpeedUseCase(get()) }
    single { GetRunsSortedByDateUseCase(get()) }
    single { GetRunsSortedByDistanceUseCase(get()) }
    single { GetRunsSortedByAvgSpeedUseCase(get()) }
    single { SaveRunUseCase(get()) }
}