package com.in.pojo;

import java.util.Date;

public class Course {
    private Integer id;

    private String subject;

    private String level;

    private String location;

    private Double price;

    private Integer totalclass;

    private Integer currentclass;

    private Integer status;

    private Date endtime;

    private Date starttime;

    private Integer classteacher;

    private String latitude;

    private String longitude;

    private Integer minnum;

    private Integer maxnum;

    private String describe;

    private Integer courseno;

    private String grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTotalclass() {
        return totalclass;
    }

    public void setTotalclass(Integer totalclass) {
        this.totalclass = totalclass;
    }

    public Integer getCurrentclass() {
        return currentclass;
    }

    public void setCurrentclass(Integer currentclass) {
        this.currentclass = currentclass;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Integer getClassteacher() {
        return classteacher;
    }

    public void setClassteacher(Integer classteacher) {
        this.classteacher = classteacher;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public Integer getMinnum() {
        return minnum;
    }

    public void setMinnum(Integer minnum) {
        this.minnum = minnum;
    }

    public Integer getMaxnum() {
        return maxnum;
    }

    public void setMaxnum(Integer maxnum) {
        this.maxnum = maxnum;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    public Integer getCourseno() {
        return courseno;
    }

    public void setCourseno(Integer courseno) {
        this.courseno = courseno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}