package com.demo.entity;

public class Job {
    private Integer jid;

    private Integer pid;

    private String jcontent;

    private Integer jstatus;

    public Integer getJid() {
        return jid;
    }

    public void setJid(Integer jid) {
        this.jid = jid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getJcontent() {
        return jcontent;
    }

    public void setJcontent(String jcontent) {
        this.jcontent = jcontent == null ? null : jcontent.trim();
    }

    public Integer getJstatus() {
        return jstatus;
    }

    public void setJstatus(Integer jstatus) {
        this.jstatus = jstatus;
    }
}