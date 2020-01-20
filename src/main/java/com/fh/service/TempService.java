package com.fh.service;

import com.fh.entity.po.Temp;
import com.fh.entity.vo.DataUtil;
import com.fh.entity.vo.SearchUtil;

import java.util.List;
import java.util.Map;

public interface TempService {
    Temp queryTempByName(String name, Integer dape);

    List<Map<String, Object>> queryTempJob();

    List<Map<String, Object>> queryTempDept();

    void addTempList(Temp temp);

    DataUtil<Temp> queryTempList(SearchUtil searchUtil);
}
