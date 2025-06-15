package com.example.devmail_ai.Entities;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "summary_request")
public class CommitSummaryRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int days;
    private String tone;

    @Column(name = "report_type")
    private String reportType;

    @Column(name ="manual_commits")
    private String manualCommits;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    public CommitSummaryRequest(){

    }

    public CommitSummaryRequest(long id, int days, String tone, LocalDateTime createdAt, String manualCommits, String reportType) {
        this.id = id;
        this.days = days;
        this.tone = tone;
        this.createdAt = createdAt;
        this.manualCommits = manualCommits;
        this.reportType = reportType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getManualCommits() {
        return manualCommits;
    }

    public void setManualCommits(String manualCommits) {
        this.manualCommits = manualCommits;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTone() {
        return tone;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
}
