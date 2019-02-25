package com.dadao.mall.admin.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.Data;

/**
 * 管理员对象
 */
@Data
@ApiModel("管理员对象")
public class Admin {

    @ApiModelProperty("管理员Id")
    private String id;

    @ApiModelProperty("管理员名字")
    private String name;


}
