package com.fyqz.scenario.controller;


import com.fyqz.base.BaseController;
import com.fyqz.scenario.form.ScenarioPageForm;
import com.fyqz.scenario.service.IScenarioService;
import com.fyqz.user.entity.SystemUserEntity;
import fyqz.result.Result;
import fyqz.result.ResultUtil;
import fyqz.util.LogUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 想定信息表 前端控制器
 * </p>
 *
 * @author zengchao
 * @since 2020-05-03
 */
@Slf4j
@RestController
@Api(description = "想定API管理")
@RequestMapping("/scenario")
public class ScenarioController extends BaseController {

    @Reference
    IScenarioService scenarioService;

    @ApiOperation("查询想定列表")
    @ApiImplicitParam(name = "scenarioPage", value = "查询想定列表", required = true, dataType = "ScenarioPageForm")
    @RequestMapping(value = "/queryScenarioList", method = RequestMethod.POST)
    public Result queryScenarioList(@RequestBody ScenarioPageForm scenarioPage) {
        return scenarioService.queryScenarioPage(scenarioPage);
    }



    @ApiOperation(value = "根据ID获取想定信息", notes = "根据ID获取想定信息")
    @ApiImplicitParam(name = "scenarioId", value = "想定ID", required = true, dataType = "String")
    @RequestMapping(value = "/queryScenario/{scenarioId}", method = RequestMethod.GET)
    public Result queryScenario(@PathVariable("scenarioId") String scenarioId) {
        LogUtil.debug(log, "根据ID获取想定信息,ID=【{}】", scenarioId);
        return scenarioService.queryScenario(scenarioId);
    }


    @ApiOperation(value = "根据ID获取用户信息---Dubbo" , notes = "根据ID获取用户信息---Dubbo" )
    @ApiImplicitParam(name = "userId" , value = "用户ID" , required = true, dataType = "long" )
    @RequestMapping(value = "/get/user/{userId}" , method = RequestMethod.GET)
    public Result getUser(@PathVariable("userId" ) Long userId) {
        SystemUserEntity user = scenarioService.queryUserById(userId);
        return ResultUtil.success(user);
    }
}

