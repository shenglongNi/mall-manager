package com.mall.domain;

import com.mall.core.model.UserPermission;
import org.assertj.core.util.Lists;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class CustUserDetails implements UserDetails{

    private String username;

    private String password;

    private Integer status;

    private List<UserPermission> permissions;

    public CustUserDetails(String username, String password, Integer status, List<UserPermission> permissions) {
        this.username = username;
        this.password = password;
        this.status = status;
        this.permissions = permissions;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

//        TODO 添加permission验证
        return null;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.status.equals(1);
    }


}
