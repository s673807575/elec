package com.demo.entity;



import java.util.Date;

public class Pro_message {
    private Integer id;

    private String name;

    private String textType;

    private String period;

    private Date startTime;

    private Date endTime;

    private String devicemess;

    private Integer isqualified;

    private Report report;


    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

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

    public String getTextType() {
        return textType;
    }

    public void setTextType(String textType) {
        this.textType = textType == null ? null : textType.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period == null ? null : period.trim();
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

    public String getDevicemess() {
        return devicemess;
    }

    public void setDevicemess(String devicemess) {
        this.devicemess = devicemess == null ? null : devicemess.trim();
    }

    public Integer getIsqualified() {
        return isqualified;
    }

    public void setIsqualified(Integer isqualified) {
        this.isqualified = isqualified;
    }
}