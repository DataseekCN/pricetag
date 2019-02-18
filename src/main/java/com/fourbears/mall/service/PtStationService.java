package com.fourbears.mall.service;

import java.util.List;

import com.fourbears.mall.model.PtStation;
import com.fourbears.mall.model.UmsRole;

/**
 * 后台设备基站管理Service
 */
public interface PtStationService {
    /**
     * 添加基站
     */
    int create(PtStation station);

    /**
     * 获取基站列表
     */
    List<PtStation> list();
}
