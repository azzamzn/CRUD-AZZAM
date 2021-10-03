/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spboot.tugas3sc3.interfaces;

import com.spboot.tugas3sc3.models.Todo;
import java.util.List;

/**
 *
 * @author Dell
 */


public interface TodoInterface {
    List<Todo> getAll();
    void store(Todo todo);
    Todo getById(long id);
    void delete(long id);
}


