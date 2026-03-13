package com.hareesh.career.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Student {

    @NotNull(message = "ID cannot be null")
    private Integer id;

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Branch cannot be empty")
    private String branch;

    public Student(Integer id, String name, String branch) {
        this.id = id;
        this.name = name;
        this.branch = branch;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }
}