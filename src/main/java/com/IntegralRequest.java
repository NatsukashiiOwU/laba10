package com;

import javax.validation.constraints.NotBlank;

public class IntegralRequest {
    @NotBlank
    private String code;

    @NotBlank
    public float A;

    @NotBlank
    public float h;

    @NotBlank
    public float B;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
