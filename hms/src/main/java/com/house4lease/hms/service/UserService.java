package com.house4lease.hms.service;

import com.house4lease.hms.entity.Phone;
import com.house4lease.hms.entity.User;
import com.house4lease.hms.repo.PhoneRepository;
import com.house4lease.hms.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PhoneRepository phoneRepository;

    public Optional<User> selectUser(Integer id){
        return userRepository.findById(id);
    }

    public Optional<User> selectUserByLogin(Integer pNumber, String password){
        Optional<Phone> phone = phoneRepository.findById(pNumber);
        if (phone.isPresent()) {
            return userRepository.findUserByLoginMethod(phone.get().getUserID(), password);
        }

        return  Optional.empty();
    }
}
