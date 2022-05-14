package com.example.springboot.controller;

import com.example.springboot.pojo.PlanningData;
import com.example.springboot.pojo.SlightVo;
import com.example.springboot.pojo.User;
import com.example.springboot.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MapController {
   @Autowired
   MapService mapService;
    @RequestMapping("/getMap/lat={lat}&lng={lng}")
    public String  getMap(Model model, @PathVariable("lat") Double lat, @PathVariable("lng") Double lng){
        model.addAttribute("lat",lat);
        model.addAttribute("lng",lng);
        return "map";
    }
    @ResponseBody
    @RequestMapping("/getPlan")
    public List<SlightVo>  getMap(@RequestBody PlanningData planningData){
        System.out.println(planningData.toString());
        SlightVo slightVo=new SlightVo();
        List<SlightVo> list=new ArrayList<>();
        list.add(slightVo);
        return list;
    }
}
