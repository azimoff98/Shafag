package az.shafag.testapp.security;

import az.shafag.testapp.model.Users;
import az.shafag.testapp.service.UserService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import static java.util.Collections.emptyList;

@Service("userDetailService")
public class UserDetailsServiceImpl implements UserDetailsService {


    private UserService userService;

    public UserDetailsServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userService.getByUsername(username);
        return new User(user.getUsername(), user.getPassword(), emptyList());
    }
}
