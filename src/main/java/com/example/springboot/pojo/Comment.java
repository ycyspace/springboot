package com.example.springboot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Double uid;
    private Double sid;
    private String comment_detail;//评论内容
    private Double over_rating;//评分1-5
    private List<String> comment_photos;//评论照片url
    private List<String> comment_tags;
    private Date comment_date;//自动获取
    private Double comment_like;//评论点赞数，初始为零
}
