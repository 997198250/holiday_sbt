package com.fh.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fh.common.ExcelFild;
import com.fh.common.ExcleHeard;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@TableName("t_emp")
@ExcleHeard(title = "员工信息")
public class Temp {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;// 员工id
    @TableField("name")
    @ExcelFild(name = "名称")
    private String name;
    @TableField("jobid")
    private Integer jobid;// 岗位id
    @TableField("salary")
    @ExcelFild(name = "工资")
    private double salary;// 工资
    @TableField("entrytime")
    @ExcelFild(name = "入职时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entrytime;// 入职时间
    @TableField("leaderid")
    private Integer leaderid;// 领导id
    @TableField("deptid")
    private Integer deptid;// 部门id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJobid() {
        return jobid;
    }

    public void setJobid(Integer jobid) {
        this.jobid = jobid;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    public Integer getLeaderid() {
        return leaderid;
    }

    public void setLeaderid(Integer leaderid) {
        this.leaderid = leaderid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}
