package com.program.application.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="emp")
public class Emp {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String firstName,lastName,gender,reportingManager,address,designation,status,bloodGroup,dob,joiningDate,retiringDate,dFName,dLName,dGender,dDOB,dRelationship,type,startDate,endDate,institution,instAddress,percentage;
    public Emp()
    {

    }

    public Emp(int id,String firstName, String lastName, String gender, String reportingManager, String address, String designation, String status, String bloodGroup, String dob, String joiningDate, String retiringDate, String dFName, String dLName, String dGender, String dDOB, String dRelationship, String type, String startDate, String endDate, String institution, String instAddress, String percentage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.reportingManager = reportingManager;
        this.address = address;
        this.designation = designation;
        this.status = status;
        this.bloodGroup = bloodGroup;
        this.dob = dob;
        this.joiningDate = joiningDate;
        this.retiringDate = retiringDate;
        this.dFName = dFName;
        this.dLName = dLName;
        this.dGender = dGender;
        this.dDOB = dDOB;
        this.dRelationship = dRelationship;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.institution = institution;
        this.instAddress = instAddress;
        this.percentage = percentage;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setReportingManager(String reportingManager) {
        this.reportingManager = reportingManager;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setRetiringDate(String retiringDate) {
        this.retiringDate = retiringDate;
    }

    public void setdFName(String dFName) {
        this.dFName = dFName;
    }

    public void setdLName(String dLName) {
        this.dLName = dLName;
    }

    public void setdGender(String dGender) {
        this.dGender = dGender;
    }

    public void setdDOB(String dDOB) {
        this.dDOB = dDOB;
    }

    public void setdRelationship(String dRelationship) {
        this.dRelationship = dRelationship;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public void setInstAddress(String instAddress) {
        this.instAddress = instAddress;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}

