package cn.fall.thee.charming.legs.service;

import cn.fall.thee.charming.legs.entity.Hobby;
import cn.fall.thee.charming.legs.entity.Person;

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
public interface IPersonService {

    List<Hobby> getHobbiesById(Person person);

    Map<String, Object> insertPerson(Person person);
}
