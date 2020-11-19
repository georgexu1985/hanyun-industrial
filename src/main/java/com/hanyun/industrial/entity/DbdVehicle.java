

package com.hanyun.industrial.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * 
 *
 * @author george
 * @date 2020-11-19 16:37:51
 */
@Data
@TableName("dbd_vehicle")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "")
public class DbdVehicle extends Model<DbdVehicle> {
private static final long serialVersionUID = 1L;
    /**
     * 终端ID
     */
    @TableId
    @ApiModelProperty(value="终端ID")
    private String terminalId;
    /**
     * VIN码
     */
    @ApiModelProperty(value="VIN码")
    private String vincode;
    /**
     * 发动机号
     */
    @ApiModelProperty(value="发动机号")
    private String engineCode;
    /**
     * 车架号
     */
    @ApiModelProperty(value="车架号")
    private String chassisCode;
    /**
     * 车辆品牌
     */
    @ApiModelProperty(value="车辆品牌")
    private String productType;
    /**
     * 车辆型号
     */
    @ApiModelProperty(value="车辆型号")
    private String modelType;
    /**
     * 车牌号
     */
    @ApiModelProperty(value="车牌号")
    private String carNumber;
    /**
     * 生产日期
     */
    @ApiModelProperty(value="生产日期")
    private Date productDate;
    /**
     * 购买日期
     */
    @ApiModelProperty(value="购买日期")
    private Date buyDate;
    /**
     * 工况时间
     */
    @ApiModelProperty(value="工况时间")
    private Date workdatatime;
    /**
     * 经度
     */
    @ApiModelProperty(value="经度")
    private BigDecimal lng;
    /**
     * 纬度
     */
    @ApiModelProperty(value="纬度")
    private BigDecimal lat;
    /**
     * 速度(公里/小时)
     */
    @ApiModelProperty(value="速度(公里/小时)")
    private BigDecimal speed;
    /**
     * 累计油耗(L)
     */
    @ApiModelProperty(value="累计油耗(L)")
    private BigDecimal totalenginefuel;
    /**
     * 累计工时(小时)
     */
    @ApiModelProperty(value="累计工时(小时)")
    private BigDecimal totalenginehours;
    /**
     * 累计里程(公里)
     */
    @ApiModelProperty(value="累计里程(公里)")
    private BigDecimal totalmileage;
    /**
     * 机油压力(KPa)
     */
    @ApiModelProperty(value="机油压力(KPa)")
    private BigDecimal engineoilpressure;
    /**
     * 发动机水温(度)
     */
    @ApiModelProperty(value="发动机水温(度)")
    private BigDecimal enginewatertemperature;
    /**
     * 发动机转速(转/分钟)
     */
    @ApiModelProperty(value="发动机转速(转/分钟)")
    private BigDecimal enginespeed;
    /**
     * 在线状态(1在线0离线)
     */
    @ApiModelProperty(value="在线状态(1在线0离线)")
    private Integer onlinestate;
    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date createtime;
    /**
     * 更新时间
     */
    @ApiModelProperty(value="更新时间")
    private Date updatetime;
    }
