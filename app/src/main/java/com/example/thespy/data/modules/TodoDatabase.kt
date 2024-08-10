package com.example.thespy.data.modules

import androidx.room.Database

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract  class TodoDatabase {

    abstract fun todoDao(): TodoDao

}