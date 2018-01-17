package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class ResultData implements Serializable {

    private String id;
    private String result;
    private String clientid;
    private String original;
    private String name;
    private String size;
    private String time;
    private boolean success;

    public ResultData(String id, String result) {
        this.id = id;
        this.result = result;
    }
}
