package com.placekm.bmi_calculator

import android.view.Display.Mode

data class BMIUIState(
    val label: String? = null,
    val weight: Double? = null,
    val mode: ModeEnum = ModeEnum.Metric,
    val bmi: Double? = null


//            data class ValueState(
//        val label: String, // lable
//        val suffix: String, // units
//        val value: String = "", // A string representing the user's input value.
//        val error: String? = null // error meaage if any
//    ) {
//        fun toNumber() = value.toDoubleOrNull()
//    }
)
