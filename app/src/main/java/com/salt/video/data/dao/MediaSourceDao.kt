package com.salt.video.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.salt.video.data.entry.MediaSource
import kotlinx.coroutines.flow.Flow

@Dao
interface MediaSourceDao {

    @Insert
    suspend fun insert(mediaSource: MediaSource)

    @Query("SELECT * FROM MediaSource")
    fun getAll(): Flow<List<MediaSource>>

}