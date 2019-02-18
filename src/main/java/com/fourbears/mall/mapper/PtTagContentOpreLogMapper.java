package com.fourbears.mall.mapper;

import com.fourbears.mall.model.PtTagContentOpreLog;
import com.fourbears.mall.model.PtTagContentOpreLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtTagContentOpreLogMapper {
    int countByExample(PtTagContentOpreLogExample example);

    int deleteByExample(PtTagContentOpreLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PtTagContentOpreLog record);

    int insertSelective(PtTagContentOpreLog record);

    List<PtTagContentOpreLog> selectByExample(PtTagContentOpreLogExample example);

    PtTagContentOpreLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PtTagContentOpreLog record, @Param("example") PtTagContentOpreLogExample example);

    int updateByExample(@Param("record") PtTagContentOpreLog record, @Param("example") PtTagContentOpreLogExample example);

    int updateByPrimaryKeySelective(PtTagContentOpreLog record);

    int updateByPrimaryKey(PtTagContentOpreLog record);
}