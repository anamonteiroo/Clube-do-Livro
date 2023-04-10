package com.cdm.clubedolivro.service;

import com.cdm.clubedolivro.model.entity.User;

public interface UserService {
    User autenticate(String email, String password);
}
