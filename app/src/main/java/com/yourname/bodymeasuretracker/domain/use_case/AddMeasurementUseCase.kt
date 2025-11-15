package com.yourname.bodymeasuretracker.domain.use_case

import com.yourname.bodymeasuretracker.domain.model.MeasurementRecord
import com.yourname.bodymeasuretracker.domain.repository.MeasurementRepository
import javax.inject.Inject

class AddMeasurementUseCase @Inject constructor(
    private val repository: MeasurementRepository
) {
    suspend operator fun invoke(record: MeasurementRecord): Long {
        return repository.insertRecord(record)
    }
}
