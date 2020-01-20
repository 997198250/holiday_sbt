package com.fh.controller;

import com.fh.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("temp")
@CrossOrigin
public class TempController {

    @Autowired
    private TempService tempService;



}
