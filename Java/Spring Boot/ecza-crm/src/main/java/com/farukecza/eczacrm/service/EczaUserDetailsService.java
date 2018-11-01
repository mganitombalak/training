package com.farukecza.eczacrm.service;

import com.farukecza.eczacrm.entity.EczaPrincipal;
import com.farukecza.eczacrm.repository.UserRepository;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EczaUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        var u = userRepository.findByUserName(s); //User burdan geliyo
        if(u==null){
            throw new UsernameNotFoundException(s);
        }
        return new EczaPrincipal(u);
    }
}
