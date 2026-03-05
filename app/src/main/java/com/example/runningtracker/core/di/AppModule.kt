package com.example.runningtracker.core.di

import com.example.runningtracker.data.repository.MockRunRepositoryImpl
import com.example.runningtracker.domain.repository.RunRepository
import com.example.runningtracker.domain.use_case.DeleteRunUseCase
import com.example.runningtracker.domain.use_case.GetRunsUseCase
import com.example.runningtracker.domain.use_case.SaveRunUseCase
import org.koin.dsl.module

val appModule = module {
    // REPOSITORY
    single<RunRepository> { MockRunRepositoryImpl() }

    // USECASE
    single { DeleteRunUseCase(get<RunRepository>()) }
    single { GetRunsUseCase(get<RunRepository>()) }
    single { SaveRunUseCase(get<RunRepository>()) }
}