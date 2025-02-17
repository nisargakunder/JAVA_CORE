package com.peaks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FirstAscend {
    private int year;
    public FirstAscend(int year) {
        this.year = year;
    }
    public String ToString() {
        return "FirstAscend{" +
                "year=" + year +
                '}';
    }
}
