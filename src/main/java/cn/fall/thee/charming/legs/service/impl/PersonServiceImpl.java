package cn.fall.thee.charming.legs.service.impl;

import cn.fall.thee.charming.legs.entity.Hobby;
import cn.fall.thee.charming.legs.entity.Person;
import cn.fall.thee.charming.legs.mapper.PersonMapper;
import cn.fall.thee.charming.legs.service.IPersonService;
import cn.fall.thee.charming.legs.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-01-31
 */

@Slf4j
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private PersonMapper personMapper;

    public List<Hobby> getHobbiesById(Person person) {
        log.info("获取人员兴趣爱好请求：{}", JsonUtil.objectToJson(person));
        List<Hobby> hobbyList = personMapper.getHobbiesById(person.getId());
        log.info("获取人员兴趣爱好返回：{}", JsonUtil.objectToJson(hobbyList));
        return hobbyList;
    }

    public Map<String, Object> insertPerson(Person person) {
        log.info("添加人员信息请求：{}", JsonUtil.objectToJson(person));
        Map<String, Object> response = new HashMap<String, Object>();
        try {
            personMapper.insert(person);
            log.info("添加人员信息成功");
        } catch (Exception e) {
            log.error("error: {}" + e.getMessage(), e);
        }
        response.put("returnCode", 1000);
        response.put("message", "success");
        return response;
    }
}
