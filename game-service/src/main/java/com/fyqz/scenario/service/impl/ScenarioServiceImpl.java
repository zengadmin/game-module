package com.fyqz.scenario.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.fyqz.scenario.entity.ScenarioEntity;
import com.fyqz.scenario.form.ScenarioPageForm;
import com.fyqz.scenario.mapper.ScenarioMapper;
import com.fyqz.scenario.service.IScenarioService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fyqz.user.entity.SystemUserEntity;
import com.fyqz.user.service.ISystemUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import fyqz.result.Result;
import fyqz.result.ResultUtil;
import fyqz.util.DataValidateUtil;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

/**
 * <p>
 * 想定信息表 服务实现类
 * </p>
 *
 * @author zengchao
 * @since 2020-05-03
 */
@Service
public class ScenarioServiceImpl extends ServiceImpl<ScenarioMapper, ScenarioEntity> implements IScenarioService {

    @Reference
    ISystemUserService systemUserService;

    @Override
    public Result queryScenarioPage(ScenarioPageForm scenarioPage) {
        PageHelper.startPage(scenarioPage.getPageNum(), scenarioPage.getPageSize());
        QueryWrapper wrapper = new QueryWrapper<ScenarioEntity>();
        if (DataValidateUtil.isNotEmpty(scenarioPage.getScenarioName())) {
            wrapper.like("scenario_name", scenarioPage.getScenarioName());
        }
        wrapper.orderByDesc(ScenarioEntity.CTIME);
        List<ScenarioEntity> list = this.list(wrapper);
        PageInfo pageInfo = new PageInfo<>(list);
        return ResultUtil.success(pageInfo);
    }

    @Override
    public Result queryScenario(String scenarioId) {
        return ResultUtil.success(this.getById(scenarioId));
    }

    @Override
    public SystemUserEntity queryUserById(Long userId) {
        return systemUserService.getById(userId);
    }
}
