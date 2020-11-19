
package com.hanyun.industrial.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hanyun.industrial.entity.DbdVehicle;
import com.hanyun.industrial.mapper.DbdVehicleMapper;
import com.hanyun.industrial.service.DbdVehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Integer count(String name) {
        return dbdVehicleMapper.count(name);
    }
}
