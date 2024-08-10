package com.example.thespy.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.thespy.Util.Constants.DATABASE_NAME
import com.example.thespy.data.modules.TodoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent :: class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase (
        @ApplicationContext context: Context
    ) = Room.databaseBuilder(
        context,
        RoomDatabase::class.java,
        DATABASE_NAME
    ).build()


    fun provideDao(database: TodoDatabase) = database.todoDao()
}


// Now i have described how to provide our room database and the Dao as well