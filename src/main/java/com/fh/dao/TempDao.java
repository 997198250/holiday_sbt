package com.fh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.entity.po.Temp;
import com.fh.entity.vo.SearchUtil;

import java.util.List;
import java.util.Map;

public interface TempDao extends BaseMapper<Temp> {
    Temp queryTempByName(String name, Integer dape);

    List<Map<String, Object>> queryTempJob();

    List<Map<String, Object>> queryTempDept();

    long queryTempCoumt(SearchUtil searchUtil);

    List<Temp> queryTempList(SearchUtil searchUtil);
}
