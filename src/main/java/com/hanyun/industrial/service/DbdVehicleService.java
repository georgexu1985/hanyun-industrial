

package com.hanyun.industrial.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hanyun.industrial.entity.DbdVehicle;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author george
 * @date 2020-11-19 16:37:51
 */
public interface DbdVehicleService extends IService<DbdVehicle> {
    Integer count(@Param("name") String name);
}
