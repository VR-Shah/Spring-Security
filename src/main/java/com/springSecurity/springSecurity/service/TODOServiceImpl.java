package com.springSecurity.springSecurity.service;

import com.springSecurity.springSecurity.Entity.ToDo;
import com.springSecurity.springSecurity.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TODOServiceImpl implements  TODOService {

    @Autowired
    private TodoRepo todoRepo;

    @Override
    public ToDo saveTodoInformation(ToDo todo) {
        return todoRepo.save(todo);
    }

    @Override
    public void deleteToDoApp(Long id) {

    }

    @Override
    public List<ToDo> getALlToDoApp() {
        return null;
    }

    @Override
    public ToDo updateToDo(Long id) {
        return null;
    }

}
