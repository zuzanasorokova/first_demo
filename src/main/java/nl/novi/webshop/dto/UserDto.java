package nl.novi.webshop.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import nl.novi.webshop.model.Authority;
import nl.novi.webshop.model.Customer;

import java.util.Set;

public class UserDto {

    public String username;
    public String password;
    public Boolean enabled;
    public String apikey;
    public String email;
    public Customer customer;
    @JsonSerialize
    public Set<Authority> authorities;

    public String getUsername() {
        return username;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPassword() {
        return password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public String getApikey() {
        return apikey;
    }

    public String getEmail() {
        return email;
    }

    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }
}
