package com.example.thespy.ui.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.thespy.data.modules.ToDoTask
import com.example.thespy.data.repository.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class SharedViewModel @Inject constructor(
    private val repository: ToDoRepository) :
    ViewModel() {


    private val _allTasks =
        MutableStateFlow<List<ToDoTask>>(emptyList())

val allTasks: StateFlow<List<ToDoTask>> = _allTasks



fun getAllTasks() {
    viewModelScope.launch {
   //     repository.getAllTasks().collect {
     //       _allTasks.value = it
        }
    }

}


    /*fun getALlTasks() {
       viewModelScope.launch {
            repository.getAllTasks().collect {
                _allTasks.value = it
            }

        }
    }*/
