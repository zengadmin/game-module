package com.fyqz.scenario.form;


import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by zeng_sun on 2020/3/12.
 */
@Data
public class ScenarioForm implements Serializable {

    @ApiModelProperty(value = "想定id")
    @NotBlank(message="想定id不能为空")
    private Long id;
    /**
     * 想定名称
     */
    @ApiModelProperty(value = "想定名称")
    @NotBlank(message="想定名称不能为空")
    @Size(min = 1,max=30,message = "想定名称长度在1-30位之间")
    private String scenarioName;
    /**
     * 想定开始时间
     */
    @ApiModelProperty(value = "想定开始时间")
    @NotNull(message="想定开始时间不能为空")
    private Date scenarioStartTime;
    /**
     * 想定结束时间
     */
    @ApiModelProperty(value = "想定结束时间")
    private Date scenarioEndTime;
    /**
     * 地图id
     */
    @ApiModelProperty(value = "地图id")
    @NotBlank(message="地图id不能为空")
    private String mapId;
    /**
     * 想定描述
     */
    @ApiModelProperty(value = "想定描述")
    @NotBlank(message="想定描述不能为空")
    @Size(min = 1,max=500,message = "想定描述长度在1-500之间")
    private String scenarioDesc;



    @ApiModelProperty(value = "想定状态")
    @NotNull(message="想定状态")
    private Integer scenarioStatus;
}
