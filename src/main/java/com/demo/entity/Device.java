package com.demo.entity;

public class Device {
    private Integer id;

    private String name;

    private String type;

    private String eleLevel;

    private String rang;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getEleLevel() {
        return eleLevel;
    }

    public void setEleLevel(String eleLevel) {
        this.eleLevel = eleLevel == null ? null : eleLevel.trim();
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang == null ? null : rang.trim();
    }
}