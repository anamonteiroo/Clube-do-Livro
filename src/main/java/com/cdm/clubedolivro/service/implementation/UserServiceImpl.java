package com.cdm.clubedolivro.service.implementation;

import com.cdm.clubedolivro.exceptions.NotFoundException;
import com.cdm.clubedolivro.model.entity.User;
import com.cdm.clubedolivro.model.repository.UserRepository;
import com.cdm.clubedolivro.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User autenticate(String email, String password) {
        Optional<User> user = repository.findByEmailAndDeleteDateIsNull(email);

        if(user.isEmpty()) {
            throw new NotFoundException("Usuário não cadastrado.");
        }
        return null;
    }
}
