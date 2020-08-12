package com.tts.ecommerce.controller;

import java.util.List;

import com.tts.ecommerce.dto.UserDTO;
import com.tts.ecommerce.model.User;
import com.tts.ecommerce.repository.UserRepository;

// import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController {
     
    private UserRepository userRepository;

    // standard constructors    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
    // Request Mappings
   
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }
 
    @PostMapping("/users")
    User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/user")
    UserDTO findUser(@RequestBody User user) {
        UserDTO userDTO = new UserDTO();
        User autheticatedUser  = userRepository.findByUserName(user.getUserName());
        if (autheticatedUser != null && autheticatedUser.getPassword().equalsIgnoreCase(user.getPassword()))
        {
            System.out.println(" User is autheticated." );
            userDTO.setAuthenticated(true);

            userDTO.setUserName(autheticatedUser.getUserName());            
            userDTO.setFirstName(autheticatedUser.getFirstName());
            userDTO.setLastName(autheticatedUser.getLastName());
            userDTO.setEmailAddress(autheticatedUser.getEmailAddress());
            userDTO.setPhoneNumber(autheticatedUser.getPhoneNumber());
           
        }
        else
        { 
            System.out.println(" User is NOT autheticated." );
            userDTO.setAuthenticated(false);
            userDTO.setUserName(user.getUserName());
        }

        return userDTO;
    }

    
}