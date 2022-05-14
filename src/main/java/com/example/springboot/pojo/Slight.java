package com.example.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Slight {
    private String name;
    private Double lat;
    private Double lng;
    private String country;
    private String address;
    private String province;
    private String city;
    private String area;
    private String level;//景点评级
    private Integer sid;//主键
    private Double spend_time;//游玩时间
    private Double price;//票价
    private String business_time;//开放时间
    private Double over_rating;//初始评分，前端不作展示，仅为景点打分用
    private Integer comment_num;//初始评论数，前端不作展示，仅为景点打分用
    private Integer best_time_start;//元素小于365，元素为1代表1月1号，有且只包含两个元素，首位为开始时间，末位为终止时间
    private Integer best_time_end;//元素小于365，元素为1代表1月1号，有且只包含两个元素，首位为开始时间，末位为终止时间
    private List<String> tags;//景点初始标签
    private List<String> slight_pictures;//景点图
    private String detail;//景点描述
    private String phone_number;//景区电话
}
