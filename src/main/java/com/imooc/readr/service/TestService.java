package com.imooc.readr.service;

import com.imooc.readr.mapper.TestMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.beans.Transient;

@Service
public class TestService {
    @Resource
    private TestMapper mapper;

    @Transactional
    public void batchImport(){
        for (int i = 0; i < 5; i++) {
            mapper.insert();
        }
    }
}
