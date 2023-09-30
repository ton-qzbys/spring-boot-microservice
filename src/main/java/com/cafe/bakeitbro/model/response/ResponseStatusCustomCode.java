package com.cafe.bakeitbro.model.response;

import lombok.Getter;

import java.io.Serializable;
public class ResponseStatusCustomCode implements Serializable {
    private String code;
    private String header;
    private String description;

    public ResponseStatusCustomCode(String code) {
        this.code = code;
    }

    public ResponseStatusCustomCode(Integer code) {
        this.code = String.valueOf(code);
    }

    public ResponseStatusCustomCode(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public ResponseStatusCustomCode(Integer code, String description) {
        this.code = String.valueOf(code);
        this.description = description;
    }

    public ResponseStatusCustomCode(Integer code, String header, String description) {
        this.code = String.valueOf(code);
        this.header = header;
        this.description = description;
    }

    public String getCode() {
        return this.code;
    }

    public String getHeader() {
        return this.header;
    }

    public String getDescription() {
        return this.description;
    }

    public ResponseStatusCustomCode setCode(final String code) {
        this.code = code;
        return this;
    }

    public ResponseStatusCustomCode setHeader(final String header) {
        this.header = header;
        return this;
    }

    public ResponseStatusCustomCode setDescription(final String description) {
        this.description = description;
        return this;
    }

    public String toString() {
        String var10000 = this.getCode();
        return "ResponseStatusCustomCode(code=" + var10000 + ", header=" + this.getHeader() + ", description=" + this.getDescription() + ")";
    }

    public ResponseStatusCustomCode(final String code, final String header, final String description) {
        this.code = code;
        this.header = header;
        this.description = description;
    }

    public ResponseStatusCustomCode() {
    }
}
