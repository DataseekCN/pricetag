package com.fourbears.mall.mapper;

import com.fourbears.mall.model.PtTagContent;
import com.fourbears.mall.model.PtTagContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtTagContentMapper {
    int countByExample(PtTagContentExample example);

    int deleteByExample(PtTagContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PtTagContent record);

    int insertSelective(PtTagContent record);

    List<PtTagContent> selectByExample(PtTagContentExample example);

    PtTagContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PtTagContent record, @Param("example") PtTagContentExample example);

    int updateByExample(@Param("record") PtTagContent record, @Param("example") PtTagContentExample example);

    int updateByPrimaryKeySelective(PtTagContent record);

    int updateByPrimaryKey(PtTagContent record);
}