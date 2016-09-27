package com.demo.entity;

import java.util.Date;

public class Report {
    private Integer id;

    private String name;

    private Integer pid;

    private String rang;

    private String eleLevel;

    private String deviceType;

    private String textType;

    private Date startTime;

    private Date endTime;

    private String mount;

    private String person;

    private Date date;

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

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang == null ? null : rang.trim();
    }

    public String getEleLevel() {
        return eleLevel;
    }

    public void setEleLevel(String eleLevel) {
        this.eleLevel = eleLevel == null ? null : eleLevel.trim();
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    public String getTextType() {
        return textType;
    }

    public void setTextType(String textType) {
        this.textType = textType == null ? null : textType.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getMount() {
        return mount;
    }

    public void setMount(String mount) {
        this.mount = mount == null ? null : mount.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}