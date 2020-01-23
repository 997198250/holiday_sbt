package com.fh.controller;

import com.fh.entity.po.Temp;
import com.fh.entity.vo.DataUtil;
import com.fh.entity.vo.SearchUtil;
import com.fh.service.TempService;
import com.fh.util.ExcelUtil;
import com.fh.util.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("temp")
@CrossOrigin
public class TempController {

    @Autowired
    private TempService tempService;

    @RequestMapping("queryTempByName")
    @ResponseBody
    public Map queryTempByName(String name,Integer dape){
        Map map=new HashMap();
        Temp temp=tempService.queryTempByName(name,dape);
        if(temp==null){
            map.put("code",200);
            map.put("message","可以添加");
        }else {
            map.put("code",201);
            map.put("message","该部门下已有名字");
        }
        return map;
    }

    @RequestMapping("queryTempJob")
    @ResponseBody
    public List<Map<String,Object>> queryTempJob(){
        List<Map<String,Object>> list=tempService.queryTempJob();
        return list;
    }
    @RequestMapping("queryTempDept")
    @ResponseBody
    public List<Map<String,Object>> queryTempDept(){
        List<Map<String,Object>> list=tempService.queryTempDept();
        return list;
    }

    @RequestMapping("addTempList")
    @ResponseBody
    public Temp addTempList(Temp temp){
        tempService.addTempList(temp);
        return temp;
    }

    @RequestMapping("queryTempList")
    @ResponseBody
    public ResponseData queryTempList(SearchUtil searchUtil){
        DataUtil<Temp> dataUtil=tempService.queryTempList(searchUtil);
        return ResponseData.success(dataUtil);
    }

    //deleteEmp\
    @RequestMapping("deleteEmp")
    @ResponseBody
    public ResponseData deleteEmp(Integer id){
        tempService.deleteEmp(id);
        return ResponseData.success(null);
    }

    @RequestMapping("exportExecl")
    public void exportExecl(HttpServletResponse response){
        List<Temp> tempList=tempService.queryTempAllList();
        ExcelUtil.exceleUtil(tempList,response);
    }
}
