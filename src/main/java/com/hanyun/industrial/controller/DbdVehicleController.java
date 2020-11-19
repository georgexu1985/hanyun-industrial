

package com.hanyun.industrial.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hanyun.industrial.util.R;
import com.hanyun.industrial.entity.DbdVehicle;
import com.hanyun.industrial.service.DbdVehicleService;
//import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 
 *
 * @author george
 * @date 2020-11-19 16:37:51
 */
@RestController
@AllArgsConstructor
@RequestMapping("/dbdvehicle" )
@Api(value = "dbdvehicle", tags = "管理")
public class DbdVehicleController {

    private final  DbdVehicleService dbdVehicleService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param dbdVehicle 
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    public R getDbdVehiclePage(Page page, DbdVehicle dbdVehicle) {
        System.out.println("#####################" + dbdVehicleService.count(""));
        return R.ok(dbdVehicleService.page(page, Wrappers.query(dbdVehicle)));
    }


    /**
     * 通过id查询
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{id}" )
    public R getById(@PathVariable("id" ) String id) {
        return R.ok(dbdVehicleService.getById(id));
    }

    /**
     * 新增
     * @param dbdVehicle 
     * @return R
     */
    @ApiOperation(value = "新增", notes = "新增")
    @PostMapping
    public R save(@RequestBody DbdVehicle dbdVehicle) {
        return R.ok(dbdVehicleService.save(dbdVehicle));
    }

    /**
     * 修改
     * @param dbdVehicle 
     * @return R
     */
    @ApiOperation(value = "修改", notes = "修改")
    @PutMapping
    public R updateById(@RequestBody DbdVehicle dbdVehicle) {
        return R.ok(dbdVehicleService.updateById(dbdVehicle));
    }

    /**
     * 通过id删除
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id删除", notes = "通过id删除")
    @DeleteMapping("/{id}" )
    public R removeById(@PathVariable String id) {
        return R.ok(dbdVehicleService.removeById(id));
    }

}
