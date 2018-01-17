package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class RequestData implements Serializable {

    private String id;

    @NotNull
    private String url;

    private String password;

    private String clientid;

    public RequestData(String url, String password) {
        this.url = url;
        this.password = password;
    }

    public RequestData(String id, @NotNull String url, String password, String clientid) {
        this.id = id;
        this.url = url;
        this.password = password;
        this.clientid = clientid;
    }

    public RequestData doClone()  {
        return new RequestData(id,url,password,clientid);
    }
}
