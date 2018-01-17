package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ResultInfo implements Serializable {

    private boolean success = true;
    private String id;
    private String msg;
    private String clientid;

    public ResultInfo(String id, String msg) {
        this.id = id;
        this.msg = msg;
    }
}
