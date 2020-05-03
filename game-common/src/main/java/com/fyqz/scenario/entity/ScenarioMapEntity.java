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
 * 地图表
 * </p>
 *
 * @author zengchao
 * @since 2020-05-03
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("scenario_map")
@ApiModel(value="ScenarioMapEntity对象", description="地图表")
public class ScenarioMapEntity extends BaseModel {

	private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "[地图表ID] ID值来自IdGeneratorUtil")
	private String mapId;

    @ApiModelProperty(value = "[地图地址]")
	private String mapUrl;

    @ApiModelProperty(value = "[底图名称]")
	private String desicName;

    @ApiModelProperty(value = "[描述]")
	private String description;

    @ApiModelProperty(value = "六角格宽度")
	private Integer hexagonWidth;

    @ApiModelProperty(value = "六角格名称")
	private String layerHexagonName;

    @ApiModelProperty(value = "地图名称")
	private String name;

    @ApiModelProperty(value = "最小x范围")
	private String xMin;

    @ApiModelProperty(value = "最大x范围")
	private String xMax;

    @ApiModelProperty(value = "最小y范围")
	private String yMin;

    @ApiModelProperty(value = "最大y范围")
	private String yMax;

    @ApiModelProperty(value = "坐标系")
	private String srs;

    @ApiModelProperty(value = "单位")
	private String unit;

    @ApiModelProperty(value = "分辨率")
	private String resolutions;

    @ApiModelProperty(value = "子图层(json格式）")
	private String sonLayer;

    @ApiModelProperty(value = "六角格编号")
	private String layerLabelName;

    @ApiModelProperty(value = "中心点")
	private String centercoordinate;

    @ApiModelProperty(value = "[创建人]")
	private String createBy;

    @ApiModelProperty(value = "限定单位")
	private String limitExtent;

    @ApiModelProperty(value = "[状态  1. 有效  2. 无效]")
	private Integer status;

    @ApiModelProperty(value = "[删除标识] 1. 未删除 -1. 已删除  (默认1)")
	private Integer statusDel;

    @ApiModelProperty(value = "[创建时间]")
	private LocalDateTime createTime;

    @ApiModelProperty(value = "[修改时间]")
	private LocalDateTime lastEditTime;

    @ApiModelProperty(value = "[修改人]")
	private String lastEditBy;

	private Integer param1;

	private Integer param2;

	private Integer param3;

	private String param4;

	private String param5;

	private String param6;

    @ApiModelProperty(value = "最小级别")
	private Integer minZoom;

    @ApiModelProperty(value = "最大级别")
	private Integer maxZoom;

    @ApiModelProperty(value = "当前级别")
	private Integer zoom;


    public static final String MAP_ID = "map_id";

    public static final String MAP_URL = "map_url";

    public static final String DESIC_NAME = "desic_name";

    public static final String DESCRIPTION = "description";

    public static final String HEXAGON_WIDTH = "hexagon_width";

    public static final String LAYER_HEXAGON_NAME = "layer_hexagon_name";

    public static final String NAME = "name";

    public static final String X_MIN = "x_min";

    public static final String X_MAX = "x_max";

    public static final String Y_MIN = "y_min";

    public static final String Y_MAX = "y_max";

    public static final String SRS = "srs";

    public static final String UNIT = "unit";

    public static final String RESOLUTIONS = "resolutions";

    public static final String SON_LAYER = "son_layer";

    public static final String LAYER_LABEL_NAME = "layer_label_name";

    public static final String CENTERCOORDINATE = "centercoordinate";

    public static final String CREATE_BY = "create_by";

    public static final String LIMIT_EXTENT = "limit_extent";

    public static final String STATUS = "status";

    public static final String STATUS_DEL = "status_del";

    public static final String CREATE_TIME = "create_time";

    public static final String LAST_EDIT_TIME = "last_edit_time";

    public static final String LAST_EDIT_BY = "last_edit_by";

    public static final String PARAM1 = "param1";

    public static final String PARAM2 = "param2";

    public static final String PARAM3 = "param3";

    public static final String PARAM4 = "param4";

    public static final String PARAM5 = "param5";

    public static final String PARAM6 = "param6";

    public static final String MIN_ZOOM = "min_zoom";

    public static final String MAX_ZOOM = "max_zoom";

    public static final String ZOOM = "zoom";

}
