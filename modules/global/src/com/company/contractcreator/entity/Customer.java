package com.company.contractcreator.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NamePattern("%s|fio")
@Table(name = "CONTRACTCREATOR_CUSTOMER")
@Entity(name = "contractcreator_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 4985751991004775769L;

    @NotNull
    @Column(name = "FIO", nullable = false)
    protected String fio;

    @NotNull
    @Column(name = "PHONE", nullable = false, unique = true)
    protected String phone;

    @NotNull
    @Email
    @Column(name = "EMAIL", nullable = false, unique = true)
    protected String email;

    @NotNull
    @Column(name = "ADDRESS", nullable = false, unique = true)
    protected String address;

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