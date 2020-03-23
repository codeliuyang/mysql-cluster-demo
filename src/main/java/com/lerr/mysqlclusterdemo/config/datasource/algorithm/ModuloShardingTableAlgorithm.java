package com.lerr.mysqlclusterdemo.config.datasource.algorithm;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;

import java.util.Collection;

/**
 * 分表策略，如下实现分表策略。
 *
 * 最简单的即是根据
 */
@Slf4j
public class ModuloShardingTableAlgorithm implements PreciseShardingAlgorithm<Long> {

    /**
     * 分表策略
     *
     * @param tableNames 表名称
     * @param shardingValue 表主键
     * @return
     */
    @Override
    public String doSharding(final Collection<String> tableNames, final PreciseShardingValue<Long> shardingValue) {
        for (String each : tableNames) {
            log.info(tableNames.toString());
            log.info("table = " + shardingValue.getLogicTableName() + " ,column = " + shardingValue.getColumnName() + " , value=" + shardingValue.getValue());
            if (each.endsWith(shardingValue.getValue() % 2 + "")) {
                return each;
            }
        }
        throw new UnsupportedOperationException();
    }
}
