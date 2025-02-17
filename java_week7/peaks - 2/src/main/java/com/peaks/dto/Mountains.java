package com.peaks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "peaks")
public class Mountains {
    @Id
    private String id;
    private String name;
    private int height;
    private List<String> location;
    private Ascents ascents;

    public Mountains(String name, int height, List<String> location, Ascents ascents) {
        this.name = name;
        this.height = height;
        this.location = location;
        this.ascents = ascents;
    }

    @Override
    public String toString() {
        return "Mountains{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", location=" + location +
                ", ascents=" + ascents +
                '}';
    }
}
