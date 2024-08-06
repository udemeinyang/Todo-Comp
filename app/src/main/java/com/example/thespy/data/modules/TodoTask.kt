package com.example.thespy.data.modules

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.thespy.Util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class TodoTask(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    var title: String,
    var description: String,
    var priority: Priority


)
