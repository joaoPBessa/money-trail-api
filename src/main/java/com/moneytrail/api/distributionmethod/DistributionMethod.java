package com.moneytrail.api.distributionmethod;

import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "distribution_methods")
public class DistributionMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(name = "spend_percentage", nullable = false)
    private int spendPercentage;

    @Column(name = "investment_percentage", nullable = false)
    private int investmentPercentage;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private Instant updatedAt;

    protected DistributionMethod() {
    }

    public DistributionMethod(String title, int spendPercentage, int investmentPercentage) {
        this.title = title;
        this.spendPercentage = spendPercentage;
        this.investmentPercentage = investmentPercentage;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSpendPercentage() {
        return spendPercentage;
    }

    public void setSpendPercentage(int spendPercentage) {
        this.spendPercentage = spendPercentage;
    }

    public int getInvestmentPercentage() {
        return investmentPercentage;
    }

    public void setInvestmentPercentage(int investmentPercentage) {
        this.investmentPercentage = investmentPercentage;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }
}
