package com.fyqz.scenario.service;

import com.fyqz.scenario.entity.ScenarioEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fyqz.scenario.form.ScenarioPageForm;
import com.fyqz.user.entity.SystemUserEntity;
import fyqz.result.Result;

/**
 * <p>
 * 想定信息表 服务类
 * </p>
 *
 * @author zengchao
 * @since 2020-05-03
 */
public interface IScenarioService extends IService<ScenarioEntity> {

    Result queryScenarioPage(ScenarioPageForm scenarioPage);

    Result queryScenario(String scenarioId);

    SystemUserEntity queryUserById(Long userId);
}
