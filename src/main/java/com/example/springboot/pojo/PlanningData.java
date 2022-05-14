package com.example.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanningData {
    Integer dayNum;
    Long time;
    Double lng;
    Double lat;
    List<Slight> mustSlight;
    List<Slight> noSlight;
    List<String> tags;
    String city;
}
