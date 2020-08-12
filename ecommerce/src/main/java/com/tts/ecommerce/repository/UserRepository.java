package com.tts.ecommerce.repository;

import com.tts.ecommerce.model.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    public User findByUserName(String userName);

}
