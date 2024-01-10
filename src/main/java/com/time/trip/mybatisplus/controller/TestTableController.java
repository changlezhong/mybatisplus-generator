package com.time.trip.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.time.trip.mybatisplus.infrastructure.entity.TestTableDO;
import com.time.trip.mybatisplus.infrastructure.entity.ext.TestTableExtDO;
import com.time.trip.mybatisplus.service.ITestTableService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author trip
 * @since 2024-01-10
 */
@Controller
@RequestMapping("/test")
public class TestTableController {

    @Resource
    private ITestTableService testTableService;

    @GetMapping("/table")
    public TestTableDO testTableDO(@RequestParam String name) {
        LambdaQueryWrapper<TestTableDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(TestTableDO::getName, name);
        TestTableDO one = testTableService.getOne(wrapper);
        return testTableService.getOne(wrapper);
    }

    @GetMapping("/ext/table")
    public TestTableExtDO testTableExtDO(@RequestParam String name) {
        return testTableService.getByName(name);
    }

}
