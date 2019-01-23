package com.ankki.cfcmms.service;

import com.ankki.cfcmms.model.DataBoard;

import java.util.List;

/**
 * Created by Administrator on 2019/1/18.
 */
public interface DataBoardService {
    List<DataBoard> queryDataboard(String name);
}
