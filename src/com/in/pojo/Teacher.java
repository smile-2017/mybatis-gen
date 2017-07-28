package com.in.pojo;

public class Teacher {
    private Integer id;

    private String tname;

    private String password;

    private String sex;

    private String idcode;

    private String level;

    private String area;

    private String phone;

    private Integer age;

    private String introducecode;

    private String teachyear;

    private String education;

    private String title;

    private String subject;

    private String headurl;

    private Double totalclass;

    private Integer totalstudent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode == null ? null : idcode.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIntroducecode() {
        return introducecode;
    }

    public void setIntroducecode(String introducecode) {
        this.introducecode = introducecode == null ? null : introducecode.trim();
    }

    public String getTeachyear() {
        return teachyear;
    }

    public void setTeachyear(String teachyear) {
        this.teachyear = teachyear == null ? null : teachyear.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }

    public Double getTotalclass() {
        return totalclass;
    }

    public void setTotalclass(Double totalclass) {
        this.totalclass = totalclass;
    }

    public Integer getTotalstudent() {
        return totalstudent;
    }

    public void setTotalstudent(Integer totalstudent) {
        this.totalstudent = totalstudent;
    }
}