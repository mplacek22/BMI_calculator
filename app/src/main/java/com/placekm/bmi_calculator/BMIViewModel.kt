package com.placekm.bmi_calculator

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BMIViewModel : ViewModel(){
//    private val _uiState = MutableStateFlow(BMIUIState())
//    val uiState: StateFlow<BMIUIState> = _uiState.asStateFlow()
//
//    fun calculate() {
//        _uiState.update { currentState ->
//            currentState.copy(
//                bmi = 0.0
//
//            )
//        }
//    }

    var bmi by mutableStateOf(0.0)
        private set
    var message by mutableStateOf("")
        private set
    var selectedMode by mutableStateOf(ModeEnum.Metric)
        private set
//    var heightState by mutableStateOf(ValueState("Height", "m"))
//        private set
//    var weightState by mutableStateOf(ValueState("Weight", "kg"))
//        private set



}