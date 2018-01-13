package com.butchjgo.linkservice.common.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AccountEntityPK implements Serializable {
    private String server;
    private String name;

    public AccountEntityPK() {
    }

    public AccountEntityPK(String server, String name) {
        this.server = server;
        this.name = name;
    }

    @Column(name = "server")
    @Id
    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    @Column(name = "name")
    @Id
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountEntityPK that = (AccountEntityPK) o;
        return Objects.equals(server, that.server) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(server, name);
    }
}
