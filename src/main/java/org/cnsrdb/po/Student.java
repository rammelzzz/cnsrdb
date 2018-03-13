package org.cnsrdb.po;

import java.util.Date;

/**
 * Created by rammel on 2018/1/7.
 */
public class Student {

    private String s_id;
    private String s_chineseName;
    private String s_gender;
    private String s_type;
    private String s_country;
    private String s_tutor;
    private Date s_enrollTime;
    private Date s_graduateTime;
    private String s_firseWorkPlace;

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getS_chineseName() {
        return s_chineseName;
    }

    public void setS_chineseName(String s_chineseName) {
        this.s_chineseName = s_chineseName;
    }

    public String getS_gender() {
        return s_gender;
    }

    public void setS_gender(String s_gender) {
        this.s_gender = s_gender;
    }

    public String getS_type() {
        return s_type;
    }

    public void setS_type(String s_type) {
        this.s_type = s_type;
    }

    public String getS_country() {
        return s_country;
    }

    public void setS_country(String s_country) {
        this.s_country = s_country;
    }

    public String getS_tutor() {
        return s_tutor;
    }

    public void setS_tutor(String s_tutor) {
        this.s_tutor = s_tutor;
    }

    public Date getS_enrollTime() {
        return s_enrollTime;
    }

    public void setS_enrollTime(Date s_enrollTime) {
        this.s_enrollTime = s_enrollTime;
    }

    public Date getS_graduateTime() {
        return s_graduateTime;
    }

    public void setS_graduateTime(Date s_graduateTime) {
        this.s_graduateTime = s_graduateTime;
    }

    public String getS_firseWorkPlace() {
        return s_firseWorkPlace;
    }

    public void setS_firseWorkPlace(String s_firseWorkPlace) {
        this.s_firseWorkPlace = s_firseWorkPlace;
    }
}
