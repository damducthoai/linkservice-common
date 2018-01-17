package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
public class AccountPK implements Serializable {
    @Id
    @Column(name = "server")
    private String server;

    @Id
    @Column(name = "name")
    private String name;

    public AccountPK(String server, String name) {
        this.server = server;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountPK that = (AccountPK) o;
        return Objects.equals(server, that.server) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(server, name);
    }
}
