package com.example.thespy.data.repository

import com.example.thespy.data.modules.ToDoDao
import com.example.thespy.data.modules.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {

    val getAllTask: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> =toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> =toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int):   Flow<ToDoTask> {
        return toDoDao.getSelectTask(taskId = taskId)

    }
    suspend fun addTask(todoTask: ToDoTask){
      toDoDao.addTask(todoTask = todoTask)
    }

    suspend fun updateTask(todoTask: ToDoTask){
        toDoDao.updateTask(todoTask = todoTask)
    }

    suspend fun deleteAllTask(){
        toDoDao.deleteAllTask()
    }
    fun searchDatabase(searchQuery: String): Flow<List<ToDoTask>> {
        return toDoDao.searchDatabase(searchQuery = searchQuery)
    }




}
// i hav successful created the ToDo Repository by injecting this Dao