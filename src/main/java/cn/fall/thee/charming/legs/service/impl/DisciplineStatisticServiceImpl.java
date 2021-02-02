package cn.fall.thee.charming.legs.service.impl;

import cn.fall.thee.charming.legs.mapper.DisciplineMapper;
import cn.fall.thee.charming.legs.service.IDisciplineStatisticService;
import cn.fall.thee.charming.legs.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-02-01
 */

@Slf4j
public class DisciplineStatisticServiceImpl implements IDisciplineStatisticService {

    @Autowired
    private DisciplineMapper disciplineMapper;

    public Map<String, Object> avgScore() {
        Map<String, Object> result = new HashMap<String, Object>();
        try {
            List<Map<String, Object>> avgScoreList = disciplineMapper.avgScore();
            log.info("返回各科平均成绩：{}", JsonUtil.objectToJson(avgScoreList));
            if (CollectionUtils.isEmpty(avgScoreList)) {
                result.put("returnCode", 1002);
                result.put("message", "数据不存在");
                return result;
            }
            result.put("returnCode", 1000);
            result.put("message", "成功");
            result.put("dataInfo", avgScoreList);
        } catch (Exception e) {
            log.error("error: {}" + e.getMessage(), e);
        }

        return result;
    }
}
