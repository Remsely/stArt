package edu.mirea.remselybokgosha.start.user.service;

import edu.mirea.remselybokgosha.start.user.entity.User;
import edu.mirea.remselybokgosha.start.user.entity.UserRole;
import edu.mirea.remselybokgosha.start.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional(readOnly = true)
    @Override
    public User findUserByEmail(String email) {
        User user = userRepository.findByUsernameIgnoreCase(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
        log.info("User found by email successful. User : {} ", user);
        return user;
    }

    @Transactional
    @Override
    public User addUser(User user) {
        user.setRole(UserRole.USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User savedUser = userRepository.save(user);
        log.info("User saved successful. User {}", savedUser);
        return savedUser;
    }

    @Transactional(readOnly = true)
    @Override
    public boolean userExistByEmail(String email) {
        boolean exists = userRepository.existsByUsernameIgnoreCase(email);
        log.info("User existence by email {} has been checked. existence : {} ", email, exists);
        return exists;
    }
}
