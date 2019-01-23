package com.ankki.cfcmms.dao;

import com.ankki.cfcmms.model.DataBoard;
import com.ankki.cfcmms.model.DataBoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataBoardMapper {
    long countByExample(DataBoardExample example);

    int deleteByExample(DataBoardExample example);

    int deleteByPrimaryKey(Integer boardId);

    int insert(DataBoard record);

    int insertSelective(DataBoard record);

    List<DataBoard> selectByExample(DataBoardExample example);

    DataBoard selectByPrimaryKey(Integer boardId);

    int updateByExampleSelective(@Param("record") DataBoard record, @Param("example") DataBoardExample example);

    int updateByExample(@Param("record") DataBoard record, @Param("example") DataBoardExample example);

    int updateByPrimaryKeySelective(DataBoard record);

    int updateByPrimaryKey(DataBoard record);
}