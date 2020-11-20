

package com.hanyun.industrial.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanyun.industrial.entity.DbdVehicle;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * @author george
 * @date 2020-11-19 16:37:51
 */
public interface DbdVehicleService extends IService<DbdVehicle> {
    /**
     * 查询车辆里程等信息
     *
     */
    HashMap<String, Object> queryVehicleSumInfo();


    /**
     * 更新车辆信息
     *
     * @param terminalId 车辆Id
     */
    void updateVehicleInfo(String terminalId);

}
