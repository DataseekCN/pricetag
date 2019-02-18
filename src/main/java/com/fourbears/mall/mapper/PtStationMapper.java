package com.fourbears.mall.mapper;

import com.fourbears.mall.model.PtStation;
import com.fourbears.mall.model.PtStationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtStationMapper {
    int countByExample(PtStationExample example);

    int deleteByExample(PtStationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PtStation record);

    int insertSelective(PtStation record);

    List<PtStation> selectByExample(PtStationExample example);

    PtStation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PtStation record, @Param("example") PtStationExample example);

    int updateByExample(@Param("record") PtStation record, @Param("example") PtStationExample example);

    int updateByPrimaryKeySelective(PtStation record);

    int updateByPrimaryKey(PtStation record);
}