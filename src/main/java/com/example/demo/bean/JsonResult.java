package com.example.demo.bean;

import lombok.Data;
import lombok.extern.java.Log;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Data
@Component
public class JsonResult<T> {
    private T data;
    private String code;
    private String msg;

    public JsonResult() {
        this.code = "200";
        this.msg = "Success";
    }

    public JsonResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(T data) {
        this.data = data;
        this.code = "200";
        this.msg = "Success";
    }

    public JsonResult(T data, String msg) {
        this.data = data;
        this.code = "200";
        this.msg = msg;
    }
}
