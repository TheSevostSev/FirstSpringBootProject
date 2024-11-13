
package com.fundesplai.firstspringbootproject.persistence.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fundesplai.firstspringbootproject.persistence.entities.User;

import java.util.ArrayList;
import java.util.Collection;

public class CustomUserDetails implements UserDetails {

    private final User user;  // The actual user entity

    public CustomUserDetails(User user) {
        this.user = user;
    }

    public int getId() {
        return user.getId(); 
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// Devolvemos un ArrayList vacío porque nuestra app no tiene roles
		return new ArrayList<>();
	}

    @Override
    public boolean isAccountNonExpired() {
        return true;  // Customize based on your needs
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;  // Customize based on your needs
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;  // Customize based on your needs
    }

    @Override
    public boolean isEnabled() {
        return true;  // Customize based on your needs
    }
}
