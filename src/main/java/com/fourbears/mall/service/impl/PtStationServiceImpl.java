package com.fourbears.mall.service.impl;



import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourbears.mall.mapper.PtStationMapper;
import com.fourbears.mall.model.PtStation;
import com.fourbears.mall.model.PtStationExample;
import com.fourbears.mall.service.PtStationService;

/**
 * 后台设备基站管理
 */
@Service
public class PtStationServiceImpl implements PtStationService {
	
    @Autowired
    private PtStationMapper stationMapper;

	@Override
	public int create(PtStation station) {
		
		station.setStatus(1);
		station.setCreateTime(new Date());
		
		return stationMapper.insert(station);
	}
	
	@Override
    public List<PtStation> list() {
        return stationMapper.selectByExample(new PtStationExample());
    }
    
    
   
}
