//package com.example.Williams_Tyler_ArtistManagementSystem_CaseStudy.services;
//
//import com.example.Williams_Tyler_ArtistManagementSystem_CaseStudy.models.Role;
//import com.example.Williams_Tyler_ArtistManagementSystem_CaseStudy.repositories.RoleRepository;
//import com.example.Williams_Tyler_ArtistManagementSystem_CaseStudy.repositories.UserRepository;
//import com.example.Williams_Tyler_ArtistManagementSystem_CaseStudy.models.User;
//import com.example.Williams_Tyler_ArtistManagementSystem_CaseStudy.web.dto.UserRegistrationDto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//@Service
//public class UserServiceImpl implements UserService{
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private RoleRepository roleRepository;
//
//
////    public User save(UserRegistrationDto registrationDto){
////        User user = new User(registrationDto.getFirstName(),
////                registrationDto.getLastName(), registrationDto.getUsername(),
////                registrationDto.getEmail(), registrationDto.getPassword(),
////                Arrays.asList(new Role("ROLE_USER")));
////
////        return userRepository.save(user);
////    }
////    @Override
////    public User save(User user) {
////        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
////        user.setActive(1);
////        Role userRole = roleRepository.findByRole("USER");
////        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
////        return userRepository.save(user);
////    }
//}
