package com.captano.app.Employee_Management.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Entity
@Table(name = "employees")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "bu_code")
    private String bu_code;
    @Column(name="bu_name")
    private String bu_name;

    @Column(name="region_code")
    private String region_code;

    @Column(name="region_name")
    private String region_name;

    @CreatedDate
    private Date created_date;

    public EmployeeModel(){}

    public EmployeeModel(String first_name, String last_name, String bu_code, String bu_name, String region_code, String region_name, Date created_date) {
        super();
        this.first_name = first_name;
        this.last_name = last_name;
        this.bu_code = bu_code;
        this.bu_name = bu_name;
        this.region_code = region_code;
        this.region_name = region_name;
        this.created_date = created_date;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBu_code() {
        return bu_code;
    }

    public void setBu_code(String bu_code) {
        this.bu_code = bu_code;
    }

    public String getBu_name() {
        return bu_name;
    }

    public void setBu_name(String bu_name) {
        this.bu_name = bu_name;
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }
}
