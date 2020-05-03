package com.fyqz.scenario.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fyqz.base.BaseModel;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 想定信息表
 * </p>
 *
 * @author zengchao
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scenario")
@ApiModel(value="ScenarioEntity对象", description="想定信息表")
public class ScenarioEntity extends BaseModel {

	private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "想定名称")
	private String scenarioName;

    @ApiModelProperty(value = "想定开始时间")
	private LocalDateTime scenarioStartTime;

    @ApiModelProperty(value = "想定结束时间")
	private LocalDateTime scenarioEndTime;

    @ApiModelProperty(value = "地图id")
	private String mapId;

    @ApiModelProperty(value = "想定描述")
	private String scenarioDesc;

    @ApiModelProperty(value = "想定状态")
	private Integer scenarioStatus;

    @ApiModelProperty(value = "操作人Id")
	private String opId;

    @ApiModelProperty(value = "状态")
	private Integer status;

    @ApiModelProperty(value = "创建时间")
	private LocalDateTime ctime;

    @ApiModelProperty(value = "修改时间")
	private LocalDateTime utime;

    @ApiModelProperty(value = "版本号")
	private Integer ver;


    public static final String SCENARIO_NAME = "scenario_name";

    public static final String SCENARIO_START_TIME = "scenario_start_time";

    public static final String SCENARIO_END_TIME = "scenario_end_time";

    public static final String MAP_ID = "map_id";

    public static final String SCENARIO_DESC = "scenario_desc";

    public static final String SCENARIO_STATUS = "scenario_status";

    public static final String OP_ID = "op_id";

    public static final String STATUS = "status";

    public static final String CTIME = "ctime";

    public static final String UTIME = "utime";

    public static final String VER = "ver";

}
