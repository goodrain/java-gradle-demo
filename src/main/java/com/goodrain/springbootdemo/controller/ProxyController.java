package com.goodrain.springbootdemo.controller;

import com.goodrain.springbootdemo.service.ProxyService;
import com.goodrain.springbootdemo.vo.ProxyReqVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;

@RestController
public class ProxyController {
    @Autowired
    public ProxyService proxyService;

    @RequestMapping(value = "/proxy", method = RequestMethod.POST, produces = "application/json")
    public String proxyGet(@Valid @RequestBody ProxyReqVO proxyReqVO) throws IOException {
        return proxyService.doProxy(proxyReqVO);
    }
}
