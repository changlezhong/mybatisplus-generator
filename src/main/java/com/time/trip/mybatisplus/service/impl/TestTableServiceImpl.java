package com.time.trip.mybatisplus.service.impl;

import com.time.trip.mybatisplus.infrastructure.entity.TestTableDO;
import com.time.trip.mybatisplus.infrastructure.entity.ext.TestTableExtDO;
import com.time.trip.mybatisplus.infrastructure.mapper.ext.TestTableExtMapper;
import com.time.trip.mybatisplus.infrastructure.mapper.TestTableMapper;
import com.time.trip.mybatisplus.service.ITestTableService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author trip
 * @since 2024-01-10
 */
@Service
public class TestTableServiceImpl extends ServiceImpl<TestTableMapper, TestTableDO> implements ITestTableService {

    @Resource
    private TestTableExtMapper testTableExtMapper;

    @Override
    public TestTableExtDO getByName(String name) {
        return testTableExtMapper.getByName(name);
    }
}
