package com.fyqz.scenario.service.impl;

import com.fyqz.scenario.entity.ScenarioEntity;
import com.fyqz.scenario.mapper.ScenarioMapper;
import com.fyqz.scenario.service.IScenarioService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

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

}
