package com.ankki.cfcmms.service.impl;

import com.ankki.cfcmms.dao.DataBoardMapper;
import com.ankki.cfcmms.model.DataBoard;
import com.ankki.cfcmms.model.DataBoardExample;
import com.ankki.cfcmms.service.DataBoardService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2019/1/18.
 */
@Service("dataBoardService")
public class DataBoardServiceImpl implements DataBoardService{

    @Resource
    private DataBoardMapper dataBoardMapper;

    @Override
    public List<DataBoard> queryDataboard(String name) {
        DataBoardExample example = new DataBoardExample();
        example.createCriteria().andDataBoardNameEqualTo(name);
        PageHelper.startPage(2,2);
        List<DataBoard> list = dataBoardMapper.selectByExample(example);
        System.out.println(list.size());
        System.out.println(((Page)list).getTotal());
        return list;
    }
}
