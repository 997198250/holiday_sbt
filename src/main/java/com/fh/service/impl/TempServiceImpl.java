package com.fh.service.impl;

import com.fh.dao.TempDao;
import com.fh.entity.po.Temp;
import com.fh.entity.vo.DataUtil;
import com.fh.entity.vo.SearchUtil;
import com.fh.service.TempService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TempServiceImpl implements TempService {
    @Resource
    private TempDao tempDao;

    @Override
    public Temp queryTempByName(String name, Integer dape) {
        return tempDao.queryTempByName(name,dape);
    }

    @Override
    public List<Map<String, Object>> queryTempJob() {
        return tempDao.queryTempJob();
    }

    @Override
    public List<Map<String, Object>> queryTempDept() {
        return tempDao.queryTempDept();
    }

    @Override
    public void addTempList(Temp temp) {
        tempDao.insert(temp);
    }

    @Override
    public DataUtil<Temp> queryTempList(SearchUtil searchUtil) {
        long count =tempDao.queryTempCoumt(searchUtil);
        List<Temp> tempList=tempDao.queryTempList(searchUtil);
        DataUtil<Temp> dataUtil=new DataUtil<>();
        dataUtil.setDraw(searchUtil.getDraw());
        dataUtil.setData(tempList);
        dataUtil.setRecordsFiltered((int)count);
        dataUtil.setRecordsTotal((int)count);
        return dataUtil;
    }
}
