
package com.hanyun.industrial.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hanyun.industrial.entity.DbdVehicle;
import com.hanyun.industrial.mapper.DbdVehicleMapper;
import com.hanyun.industrial.service.DbdVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 *
 * @author george
 * @date 2020-11-19 16:37:51
 */
@Service
public class DbdVehicleServiceImpl extends ServiceImpl<DbdVehicleMapper, DbdVehicle> implements DbdVehicleService {
    @Autowired
    private DbdVehicleMapper dbdVehicleMapper;

    @Override
    public void updateVehicleInfo(String terminalId) {
        dbdVehicleMapper.updateVehicleInfo(terminalId);
    }

    @Override
    public HashMap<String, Object> queryVehicleSumInfo() {
        HashMap<String, Object> vehicleNumMap = new HashMap<>();
        try {
            vehicleNumMap = dbdVehicleMapper.queryVehicleNum();
        } catch (Exception e) {
            System.err.println("");
            vehicleNumMap.put("vehicleCount",  2);
            vehicleNumMap.put("onlineCount", 2);
            vehicleNumMap.put("alarmCount", 0);
        }

        HashMap<String, Object> vehicleInfoMap = new HashMap<>();
        try {
            vehicleInfoMap = dbdVehicleMapper.queryVehicleInfo();
        } catch (Exception e) {
            vehicleInfoMap.put("mileage", 20000);
            vehicleInfoMap.put("fuel", 800);
            vehicleInfoMap.put("hours", 100);
        }

        HashMap<String, Object> result = new HashMap<>();
        result.put("vehicleCount", vehicleNumMap.get("vehicleCount"));
        result.put("onlineCount", vehicleNumMap.get("onlineCount"));
        result.put("alarmCount", vehicleNumMap.get("alarmCount"));

        result.put("mileage", vehicleInfoMap.get("mileage"));
        result.put("fuel", vehicleInfoMap.get("fuel"));
        result.put("hours", vehicleInfoMap.get("hours"));
        return result;
    }
}
