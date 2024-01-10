package com.time.trip.mybatisplus.infrastructure.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.time.trip.mybatisplus.infrastructure.BaseEntity;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author trip
 * @since 2024-01-10
 */
@Getter
@Setter
@TableName("t_test_table")
public class TestTableDO extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 名称
     */
    private String name;
}
