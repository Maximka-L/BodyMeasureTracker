package com.yourname.bodymeasuretracker.domain.use_case

import com.yourname.bodymeasuretracker.domain.model.MeasurementRecord
import com.yourname.bodymeasuretracker.domain.repository.MeasurementRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllMeasurementsUseCase @Inject constructor(
    private val repository: MeasurementRepository
) {
    operator fun invoke(): Flow<List<MeasurementRecord>> {
        return repository.getAllRecords()
    }
}
