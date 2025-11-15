package com.yourname.bodymeasuretracker.domain.repository

import com.yourname.bodymeasuretracker.domain.model.MeasurementRecord
import kotlinx.coroutines.flow.Flow

interface MeasurementRepository {
    fun getAllRecords(): Flow<List<MeasurementRecord>>
    suspend fun getRecordById(id: Long): MeasurementRecord?
    suspend fun insertRecord(record: MeasurementRecord): Long
    suspend fun deleteRecord(record: MeasurementRecord)
    
    // Методы для графиков
    fun getChestHistory(): Flow<List<MeasurementPoint>>
    fun getWaistHistory(): Flow<List<MeasurementPoint>>
    fun getHipsHistory(): Flow<List<MeasurementPoint>>
}
