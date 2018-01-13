package com.butchjgo.linkservice.common.domain;

public class FileInfo {
    private String url;
    private String name;
    private String size;

    public FileInfo() {
    }

    public FileInfo(String url, String name, String size) {
        this.url = url;
        this.name = name;
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
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
