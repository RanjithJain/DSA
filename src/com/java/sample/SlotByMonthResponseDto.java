package com.java.sample;

import java.util.Date;

public class SlotByMonthResponseDto {
    public void setMonth(String month) {
        this.month = month;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setTotalElements(Long totalElements) {
        this.totalElements = totalElements;
    }


    public String getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Long getTotalElements() {
        return totalElements;
    }
    private String month;
    private Integer year;
    private String createdAt;
    private String createdBy;
    private Long totalElements;


}
