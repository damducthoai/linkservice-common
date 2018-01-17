package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterInfo {
    private String server,pattern,chanel;
    private boolean registration = true;

    public RegisterInfo(String server, String pattern, String chanel) {
        this.server = server;
        this.pattern = pattern;
        this.chanel = chanel;
    }

    public RegisterInfo(String server, String pattern, String chanel, boolean registration) {
        this.server = server;
        this.pattern = pattern;
        this.chanel = chanel;
        this.registration = registration;
    }

    @Override
    public int hashCode() {
        return server.concat(pattern).concat(chanel).hashCode();
    }
}
