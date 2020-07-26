package com.company.contractcreator.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s %s %s|fio,inn,director")
@Table(name = "CONTRACTCREATOR_PROVIDER")
@Entity(name = "contractcreator_Provider")
public class Provider extends StandardEntity {
    private static final long serialVersionUID = -2535134432856143784L;

    @NotNull
    @Column(name = "PERSON", nullable = false)
    protected Boolean person = false;

    @Column(name = "FIO")
    protected String fio;

    @Column(name = "PHONE", unique = true)
    protected String phone;

    @Email
    @Column(name = "EMAIL", unique = true)
    protected String email;

    @Column(name = "SPECIALTY")
    protected String specialty;

    @Column(name = "ADDRESS")
    protected String address;

    @NumberFormat(pattern = "#")
    @Column(name = "INN", unique = true)
    protected Long inn;

    @Column(name = "DIRECTOR")
    protected String director;

    public void setInn(Long inn) {
        this.inn = inn;
    }

    public Long getInn() {
        return inn;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setPerson(Boolean person) {
        this.person = person;
    }

    public Boolean getPerson() {
        return person;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

}