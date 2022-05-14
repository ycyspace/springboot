package com.example.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SlightVo {
    private List<Slight> slightList;
    private Integer dayNO;
    private Double price;
    private Double score;
    private Double playTime;
    private Double driveTime;
}
