package com.time.trip.mybatisplus.infrastructure.mapper.ext;

import com.time.trip.mybatisplus.infrastructure.entity.ext.TestTableExtDO;

public interface TestTableExtMapper {

    TestTableExtDO getByName(String name);

}
