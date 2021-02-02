package cn.fall.thee.charming.legs.service.impl;

import cn.fall.thee.charming.legs.entity.Person;
import cn.fall.thee.charming.legs.service.IDisciplineStatisticService;
import cn.fall.thee.charming.legs.service.IPersonService;
import com.baomidou.mybatisplus.toolkit.IdWorker;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 *  测试类
 * </p>
 *
 * @author maxingjun
 * @since 2021-01-31
 */
public class PersonServiceImplTest {

    private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void getHobbiesById() {
        IPersonService personService = (IPersonService) context.getBean("personService");
        IDisciplineStatisticService disciplineStatisticService = (IDisciplineStatisticService) context.getBean("disciplineStatisticService");
        Person person = new Person();
        person.setId(13800138001L);
        personService.getHobbiesById(person);
        person.setId(IdWorker.getId());
        person.setAge(45);
        person.setName("Beckham");
        personService.insertPerson(person);

        disciplineStatisticService.avgScore();

    }


}