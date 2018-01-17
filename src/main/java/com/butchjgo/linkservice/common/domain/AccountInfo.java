package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "account")
@IdClass(AccountPK.class)
@Getter
@Setter
@NoArgsConstructor
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

    public AccountInfo(@NotNull String name, @NotNull String password, @NotNull String server) {
        this.name = name;
        this.password = password;
        this.server = server;
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
        return this.name.concat(server).hashCode();
    }
}
