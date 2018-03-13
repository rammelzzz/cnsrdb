package org.cnsrdb.po;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Created by rammel on 2018/1/6.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Book {

    private String b_id;
    private String b_name;
    private String b_author;
    private String b_publicYear;
    private String b_in;

    public String getB_id() {
        return b_id;
    }

    public void setB_id(String b_id) {
        this.b_id = b_id;
    }

    public String getB_name() {
        return b_name;
    }

    public void setB_name(String b_name) {
        this.b_name = b_name;
    }

    public String getB_author() {
        return b_author;
    }

    public void setB_author(String b_author) {
        this.b_author = b_author;
    }

    public String getB_publicYear() {
        return b_publicYear;
    }

    public void setB_publicYear(String b_publicYear) {
        this.b_publicYear = b_publicYear;
    }

    public String getB_in() {
        return b_in;
    }

    public void setB_in(String b_in) {
        this.b_in = b_in;
    }

    @Override
    public String toString() {
        return "Book{" +
                "b_id=" + b_id +
                ", b_name='" + b_name + '\'' +
                ", b_author='" + b_author + '\'' +
                ", b_publicYear=" + b_publicYear +
                ", b_in='" + b_in + '\'' +
                '}';
    }
}
