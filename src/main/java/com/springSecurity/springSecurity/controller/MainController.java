package com.springSecurity.springSecurity.controller;

import com.springSecurity.springSecurity.Entity.ToDo;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/todoapp")
public class MainController {

    /**
     * create Todo App
     */
    @PostMapping("/createApp")
    public ResponseEntity<ToDo> createApp(@RequestBody ToDo toDo) {
        try {
            return new ResponseEntity<>(, HttpStatusCode.);
        } catch(Exception e) {

        }
    }

    /**
     * List all the TODO App
     */


    /**
     * delete by id in TODO App
     */


    /**
     * Edit TODO App
     */

}
