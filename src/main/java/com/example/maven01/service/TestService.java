package com.example.maven01.service;

import com.example.maven01.domain.Test;
import com.example.maven01.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private final TestMapper testMapper;

    @Autowired
    public TestService(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    public int testService() {
        return testMapper.selectTest();
    }
}
