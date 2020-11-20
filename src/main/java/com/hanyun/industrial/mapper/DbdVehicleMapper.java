

package com.hanyun.industrial.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanyun.industrial.entity.DbdVehicle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * @author george
 * @date 2020-11-19 16:37:51
 */
@Mapper
public interface DbdVehicleMapper extends BaseMapper<DbdVehicle> {
    /**
     * 查询车辆统计信息
     *
     */
    HashMap<String, Object> queryVehicleNum();

    /**
     * 查询车辆里程等信息
     *
     */
    HashMap<String, Object> queryVehicleInfo();

    /**
     * 更新车辆信息
     *
     * @param terminalId 车辆Id
     */
    void updateVehicleInfo(@Param("terminalId") String terminalId);
}
