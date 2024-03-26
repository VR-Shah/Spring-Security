package com.springSecurity.springSecurity.service;

import com.springSecurity.springSecurity.Entity.ToDo;

import java.util.List;

public interface TODOService {
    ToDo saveTodoInformation(ToDo todo);

    void deleteToDoApp(Long id);

    List<ToDo> getALlToDoApp();

    ToDo updateToDo(Long id);

}
