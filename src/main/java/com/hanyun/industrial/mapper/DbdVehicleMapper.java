

package com.hanyun.industrial.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hanyun.industrial.entity.DbdVehicle;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author george
 * @date 2020-11-19 16:37:51
 */
@Mapper
public interface DbdVehicleMapper extends BaseMapper<DbdVehicle> {
    Integer count(@Param("name") String name);
}
