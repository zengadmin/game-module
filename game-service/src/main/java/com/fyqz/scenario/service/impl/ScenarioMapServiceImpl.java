package com.fyqz.scenario.service.impl;

import com.fyqz.scenario.entity.ScenarioMapEntity;
import com.fyqz.scenario.mapper.ScenarioMapMapper;
import com.fyqz.scenario.service.IScenarioMapService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.dubbo.config.annotation.Service;

/**
 * <p>
 * 地图表 服务实现类
 * </p>
 *
 * @author zengchao
 * @since 2020-05-03
 */
@Service
public class ScenarioMapServiceImpl extends ServiceImpl<ScenarioMapMapper, ScenarioMapEntity> implements IScenarioMapService {

}
