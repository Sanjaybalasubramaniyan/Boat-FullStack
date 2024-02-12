package com.boat.jagan.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.boat.jagan.model.User;
import com.boat.jagan.repository.UserRepository;

import static enumurated.Role.ADMIN;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
@SuppressWarnings("null")
public class UserCLI implements CommandLineRunner{
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count() > 0)
            return;
        var user = User.builder()
            .name("Admin")
            .email("admin@gmail.123")
            .password(passwordEncoder.encode("Admin@123"))
            .role(ADMIN)
            .build();
        userRepository.save(user);
    }

}
