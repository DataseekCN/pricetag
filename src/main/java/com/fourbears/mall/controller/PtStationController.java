package com.fourbears.mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fourbears.mall.dto.CommonResult;
import com.fourbears.mall.model.PtStation;
import com.fourbears.mall.model.UmsRole;
import com.fourbears.mall.service.PtStationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Controller
@Api(tags = "PtStationController", description = "设备基站管理")
@RequestMapping("/station")
public class PtStationController {
	
	 @Autowired
	 private PtStationService stationService;

	 @ApiOperation("添加基站")
	 @RequestMapping(value = "/create", method = RequestMethod.POST)
	 @ResponseBody
	 public Object create(@RequestBody PtStation station) {
	        int count = stationService.create(station);
	        if(count>0){
	            return new CommonResult().success(count);
	        }
	        return new CommonResult().failed();
	  } 
	 
	  @ApiOperation("获取所有基站信息")
	  @RequestMapping(value = "/list",method = RequestMethod.GET)
	  @ResponseBody
	  public Object list(){
	      List<PtStation> stationList = stationService.list();
	      return new CommonResult().success(stationList);
	  }  

}


