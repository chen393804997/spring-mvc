package com.example.springmvc.common;

public class Result<T> {
    public boolean success;
    public T value;

    public Result() {}

    public Result(boolean success) {
        this.success = success;
    }

    public Result(boolean success, T value) {
        this.success = success;
        this.value = value;
    }
}
