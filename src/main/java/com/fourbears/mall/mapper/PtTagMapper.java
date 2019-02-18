package com.fourbears.mall.mapper;

import com.fourbears.mall.model.PtTag;
import com.fourbears.mall.model.PtTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtTagMapper {
    int countByExample(PtTagExample example);

    int deleteByExample(PtTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PtTag record);

    int insertSelective(PtTag record);

    List<PtTag> selectByExample(PtTagExample example);

    PtTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PtTag record, @Param("example") PtTagExample example);

    int updateByExample(@Param("record") PtTag record, @Param("example") PtTagExample example);

    int updateByPrimaryKeySelective(PtTag record);

    int updateByPrimaryKey(PtTag record);
}