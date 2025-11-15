package com.yourname.bodymeasuretracker.domain.model

data class MeasurementRecord(
    val id: Long = 0,
    val date: Long = System.currentTimeMillis(),
    val chest: Float = 0f,
    val waist: Float = 0f,
    val hips: Float = 0f,
    val leftBicep: Float = 0f,
    val rightBicep: Float = 0f,
    val leftThigh: Float = 0f,
    val rightThigh: Float = 0f,
    val weight: Float? = null,
    val note: String = ""
) {
    val allMeasurements: Map<String, Float>
        get() = mapOf(
            "Chest" to chest,
            "Waist" to waist,
            "Hips" to hips,
            "Left Bicep" to leftBicep,
            "Right Bicep" to rightBicep,
            "Left Thigh" to leftThigh,
            "Right Thigh" to rightThigh
        )
}
