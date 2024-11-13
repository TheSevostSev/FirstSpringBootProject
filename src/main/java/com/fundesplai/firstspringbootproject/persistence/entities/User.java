package com.fundesplai.firstspringbootproject.persistence.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Para generar números autoincrementados
	private int id;
	private String userName;
	private String password;
	private boolean accountNonExpired;
	private boolean accountNonLocked;
	private boolean credentialsNonExpired;
	private boolean enabled;

	@JsonIgnore
	@OneToMany(mappedBy = "receiverId", cascade = CascadeType.ALL)
	private List<MessageUser> receivedMessages;

	@JsonIgnore
	@OneToMany(mappedBy = "createdBy", cascade = CascadeType.ALL)
	private List<MessageUser> sentMessages;

	public int getId(){
		return id;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// Devolvemos un ArrayList vacío porque nuestra app no tiene roles
		return new ArrayList<>();
	}

	@Override
	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}

	@Override
	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public String getPassword() {
		return password;
	}
}