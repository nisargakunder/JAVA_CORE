package com.peaks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Ascents {
    private FirstAscend first;
    private FirstAscend firstWinter;
    private int total;
    public Ascents(FirstAscend first, FirstAscend firstWinter, int total) {
        this.first = first; this.firstWinter = firstWinter; this.total = total;
    }
    public String toString() {
        return "Ascents{" +
                "first=" + first +
                ", firstWinter=" + firstWinter +
                ", total=" + total +
                '}';
    }
}
