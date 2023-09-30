package com.cafe.bakeitbro.model.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
public class BaseResponseObject implements Serializable {
    private ResponseStatusCustomCode status;

    public BaseResponseObject() {
        this(new ResponseStatusCustomCode());
    }

    public BaseResponseObject(ResponseStatusCustomCode status) {
        this.status = status;
    }

    public BaseResponseObject(String code) {
        this(new ResponseStatusCustomCode(code));
    }

    public BaseResponseObject(String code, String description) {
        this(new ResponseStatusCustomCode(code, description));
    }

    public BaseResponseObject(String code, String header, String description) {
        this(new ResponseStatusCustomCode(code, header, description));
    }

    public BaseResponseObject(Integer code) {
        this(new ResponseStatusCustomCode(code));
    }

    public BaseResponseObject(Integer code, String description) {
        this(new ResponseStatusCustomCode(code, description));
    }

    public BaseResponseObject(Integer code, String header, String description) {
        this(new ResponseStatusCustomCode(code, header, description));
    }

    @JsonIgnore
    public String getCode() {
        return this.status.getCode();
    }

    public BaseResponseObject setCode(String code) {
        this.status.setCode(code);
        return this;
    }

    @JsonIgnore
    public String getHeader() {
        return this.status.getHeader();
    }

    public BaseResponseObject setHeader(String header) {
        this.status.setHeader(header);
        return this;
    }

    @JsonIgnore
    public String getDescription() {
        return this.status.getDescription();
    }

    public BaseResponseObject setDescription(String description) {
        this.status.setDescription(description);
        return this;
    }

    public String toString() {
        return "{status=" + this.status + "}";
    }

    public ResponseStatusCustomCode getStatus() {
        return this.status;
    }

    public BaseResponseObject setStatus(final ResponseStatusCustomCode status) {
        this.status = status;
        return this;
    }
}
