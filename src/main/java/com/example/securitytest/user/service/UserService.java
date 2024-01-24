package com.example.securitytest.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@RequiredArgsConstructor
//@Service
//public class UserService implements UserDetailsService {
//
//    private final MemberRepository memberRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Member member = memberRepository.findByName(username)
//                .orElseThrow(() -> new UsernameNotFoundException("not found " + username));
//        UserDetails userDetails = User.builder()
//                .username(member.getName())
//                .roles(member.getRole())
//                .password(member.getPassword())
//                .passwordEncoder(p -> createDelegatingPasswordEncoder().encode(p))
//                .build();
//        return userDetails;
//    }
//}
