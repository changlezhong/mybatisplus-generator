package com.time.trip.mybatisplus.service;

import com.time.trip.mybatisplus.infrastructure.entity.TestTableDO;
import com.baomidou.mybatisplus.extension.service.IService;
import com.time.trip.mybatisplus.infrastructure.entity.ext.TestTableExtDO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author trip
 * @since 2024-01-10
 */
public interface ITestTableService extends IService<TestTableDO> {

    TestTableExtDO getByName(String name);

}
