package com.ykb.planet.service;

import com.ykb.planet.entity.Principal;
import com.ykb.planet.entity.User;
import com.ykb.planet.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User u=userRepository.findByUsername(username);
        if (u == null) {
            throw new UsernameNotFoundException(username);
        }
        return new Principal(u);
    }
}
