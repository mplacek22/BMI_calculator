package com.placekm.bmi_calculator

class BMICalculatorImperial:ICalculateBMI {
    override fun calculate(heightInIn: Double, weightInLb: Double): Double {
        return 703 * weightInLb / heightInIn / heightInIn
    }
}