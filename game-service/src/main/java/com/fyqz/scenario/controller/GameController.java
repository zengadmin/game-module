package com.fyqz.scenario.controller;


import com.fyqz.user.entity.SystemUserEntity;
import com.fyqz.user.service.ISystemUserService;
import fyqz.result.Result;
import fyqz.result.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/game")
@Api(value = "game", tags = "游戏中心")
@Slf4j
public class GameController {

    @Reference
    ISystemUserService userService;

    @ApiOperation(value = "根据ID获取用户信息---Dubbo" , notes = "根据ID获取用户信息---Dubbo" )
    @ApiImplicitParam(name = "userId" , value = "用户ID" , required = true, dataType = "String" )
    @RequestMapping(value = "/get/user/{userId}" , method = RequestMethod.GET)
    public Result getUser(@PathVariable("userId" ) Long userId) {
        SystemUserEntity user = userService.queryById(userId);
        return ResultUtil.success(user);
    }
}
