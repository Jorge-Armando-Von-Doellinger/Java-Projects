package com.dio_study_documentation.project_documented.handler;

import lombok.Data;

import java.util.Date;

@Data
public class ResponseError {
    private final Date timestamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;
}
