package com.company.contractcreator.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Table(name = "CONTRACTCREATOR_CONTRACT")
@Entity(name = "contractcreator_Contract")
public class Contract extends StandardEntity {
    private static final long serialVersionUID = 7444752859797281632L;

    @NotNull
    @Column(name = "CONCLUSION", nullable = false)
    protected LocalDate conclusion;

    @NotNull
    @Column(name = "EXECUTION", nullable = false)
    protected LocalDate execution;

    @NotNull
    @Column(name = "AMOUNT", nullable = false)
    protected Double amount;

    @NotNull
    @Column(name = "TOTAL_COST", nullable = false)
    protected Double totalCost;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "CUSTOMER_ID")
    protected Customer customer;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PROVIDER_ID")
    protected Provider provider;

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setExecution(LocalDate execution) {
        this.execution = execution;
    }

    public LocalDate getExecution() {
        return execution;
    }

    public void setConclusion(LocalDate conclusion) {
        this.conclusion = conclusion;
    }

    public LocalDate getConclusion() {
        return conclusion;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

}