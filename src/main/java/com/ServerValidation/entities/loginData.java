package com.ServerValidation.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class loginData {

	@NotBlank(message="Username can't be empty..!!")
	@Size(min=3,max=12,message="The username size must be 3 - 12 character")
	private String username;
	@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message="Invalid Email..!")
	private String email;
	
	@AssertTrue(message="must be agree terms and conditions.")
	private boolean agreed;

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "loginData [username=" + username + ", email=" + email + ", agreed=" + agreed + "]";
	}

}
