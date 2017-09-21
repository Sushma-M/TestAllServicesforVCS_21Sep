/*Copyright (c) 2016-2017 vcstest4.com All Rights Reserved.
 This software is the confidential and proprietary information of vcstest4.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcstest4.com*/
package com.hrdb.models.query;

/*This is a Studio Managed File. DO NOT EDIT THIS FILE. Your changes may be reverted by Studio.*/


import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wavemaker.runtime.data.annotations.ColumnAlias;

public class EmployeedatabyIdResponse implements Serializable {


    @JsonProperty("BIRTHDATE")
    @ColumnAlias("BIRTHDATE")
    private Date birthdate;

    @JsonProperty("CITY")
    @ColumnAlias("CITY")
    private String city;

    @JsonProperty("DEPT_ID")
    @ColumnAlias("DEPT_ID")
    private Integer deptId;

    @JsonProperty("EMP_ID")
    @ColumnAlias("EMP_ID")
    private Integer empId;

    @JsonProperty("FIRSTNAME")
    @ColumnAlias("FIRSTNAME")
    private String firstname;

    @JsonProperty("JOB_TITLE")
    @ColumnAlias("JOB_TITLE")
    private String jobTitle;

    @JsonProperty("LASTNAME")
    @ColumnAlias("LASTNAME")
    private String lastname;

    @JsonProperty("MANAGER_ID")
    @ColumnAlias("MANAGER_ID")
    private String managerId;

    @JsonProperty("PASSWORD")
    @ColumnAlias("PASSWORD")
    private String password;

    @JsonProperty("PICURL")
    @ColumnAlias("PICURL")
    private String picurl;

    @JsonProperty("ROLE")
    @ColumnAlias("ROLE")
    private String role;

    @JsonProperty("STATE")
    @ColumnAlias("STATE")
    private String state;

    @JsonProperty("STREET")
    @ColumnAlias("STREET")
    private String street;

    @JsonProperty("TENANT_ID")
    @ColumnAlias("TENANT_ID")
    private Integer tenantId;

    @JsonProperty("USERNAME")
    @ColumnAlias("USERNAME")
    private String username;

    @JsonProperty("ZIP")
    @ColumnAlias("ZIP")
    private String zip;

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getDeptId() {
        return this.deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getEmpId() {
        return this.empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getJobTitle() {
        return this.jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getManagerId() {
        return this.managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicurl() {
        return this.picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeedatabyIdResponse)) return false;
        final EmployeedatabyIdResponse employeedatabyIdResponse = (EmployeedatabyIdResponse) o;
        return Objects.equals(getBirthdate(), employeedatabyIdResponse.getBirthdate()) &&
                Objects.equals(getCity(), employeedatabyIdResponse.getCity()) &&
                Objects.equals(getDeptId(), employeedatabyIdResponse.getDeptId()) &&
                Objects.equals(getEmpId(), employeedatabyIdResponse.getEmpId()) &&
                Objects.equals(getFirstname(), employeedatabyIdResponse.getFirstname()) &&
                Objects.equals(getJobTitle(), employeedatabyIdResponse.getJobTitle()) &&
                Objects.equals(getLastname(), employeedatabyIdResponse.getLastname()) &&
                Objects.equals(getManagerId(), employeedatabyIdResponse.getManagerId()) &&
                Objects.equals(getPassword(), employeedatabyIdResponse.getPassword()) &&
                Objects.equals(getPicurl(), employeedatabyIdResponse.getPicurl()) &&
                Objects.equals(getRole(), employeedatabyIdResponse.getRole()) &&
                Objects.equals(getState(), employeedatabyIdResponse.getState()) &&
                Objects.equals(getStreet(), employeedatabyIdResponse.getStreet()) &&
                Objects.equals(getTenantId(), employeedatabyIdResponse.getTenantId()) &&
                Objects.equals(getUsername(), employeedatabyIdResponse.getUsername()) &&
                Objects.equals(getZip(), employeedatabyIdResponse.getZip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBirthdate(),
                getCity(),
                getDeptId(),
                getEmpId(),
                getFirstname(),
                getJobTitle(),
                getLastname(),
                getManagerId(),
                getPassword(),
                getPicurl(),
                getRole(),
                getState(),
                getStreet(),
                getTenantId(),
                getUsername(),
                getZip());
    }
}
