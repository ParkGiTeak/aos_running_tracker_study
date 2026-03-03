package com.example.runningtracker.presentation

import com.example.runningtracker.domain.model.Run
import com.example.runningtracker.domain.model.SortType

sealed interface MainAction {
    data object ClickRun: MainAction
    data object FinishRun: MainAction
    data class DeleteRun(val run: Run): MainAction
    data class ChangeSortType(val sortType: SortType): MainAction
    data class SelectRun(val run: Run): MainAction
    data object ToggleGpsStatus: MainAction
}