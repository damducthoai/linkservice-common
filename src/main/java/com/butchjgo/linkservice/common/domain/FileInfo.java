package com.butchjgo.linkservice.common.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class FileInfo implements Serializable {

    private String url = "";
    private String name = "";
    private String size = "";

    public FileInfo(String url, String name, String size) {
        this.url = url;
        this.name = name;
        this.size = size;
    }

    @Override
    public int hashCode() {
        return url.concat(name).concat(size).hashCode();
    }

    @Override
    public String toString() {
        return "FileInfo{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
