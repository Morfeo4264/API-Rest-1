package com.example.Api.Prueba.service;

import java.util.List;

import com.example.Api.Prueba.entity.User;

public interface UserService {

    public List<User> findAll();

    public User findById(int id);

    public void save(User user);

    public void deleteById(int id);
}
