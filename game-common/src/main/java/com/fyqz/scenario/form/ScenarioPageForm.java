package com.fyqz.scenario.form;

import com.fyqz.base.BasePage;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by zeng_sun on 2020/3/12.
 */
@Data
public class ScenarioPageForm extends BasePage {
    @ApiModelProperty(value = "想定名称")
    private String scenarioName;
}
