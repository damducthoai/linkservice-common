package com.butchjgo.linkservice.common.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "account")
@IdClass(AccountEntityPK.class)
public class AccountInfo implements Serializable {

    @Id
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "password")
    private String password;
    @Id
    @NotNull
    @Column(name = "server")
    private String server;

    @Column(name = "active")
    private boolean active;

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public AccountInfo() {
    }

    public AccountInfo(@NotNull String name, @NotNull String password, @NotNull String server) {
        this.name = name;
        this.password = password;
        this.server = server;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int hashCode() {
        return this.name.concat(server).hashCode();
    }
}
