package com.butchjgo.linkservice.common.domain;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class AccountInfo implements Serializable {
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private String server;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public AccountInfo() {
    }

    public AccountInfo(@NotNull String email, @NotNull String password, @NotNull String server) {
        this.email = email;
        this.password = password;
        this.server = server;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof AccountInfo) {
            return obj.hashCode() == this.hashCode();
        }
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return this.email.concat(server).hashCode();
    }
}
