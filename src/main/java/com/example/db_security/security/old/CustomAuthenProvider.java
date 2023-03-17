//package com.example.db_security.security.old;
//
//import com.example.db_security.model.entity.User;
//import com.example.db_security.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CustomAuthenProvider implements AuthenticationProvider {
//    @Autowired
//    UserRepository userRepository;
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String userName = authentication.getName();
//        String pass = String.valueOf(authentication.getCredentials());
//        User user = userRepository.findByUsername(userName);
//        if(user!=null){
//            if(pass.equals(user.getPassword())){
//                List<GrantedAuthority> authorities = new ArrayList<>();
//                for (GrantedAuthority authority : user.getAuthorities()) {
//                    authorities.add(new SimpleGrantedAuthority(authority.getAuthority()));
//                }
//                return new UsernamePasswordAuthenticationToken(authentication.getPrincipal(),authentication.getCredentials(),authorities);
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return  authentication.equals(UsernamePasswordAuthenticationToken.class);
//    }
//}
