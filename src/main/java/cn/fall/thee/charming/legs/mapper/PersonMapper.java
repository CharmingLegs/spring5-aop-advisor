package cn.fall.thee.charming.legs.mapper;

import cn.fall.thee.charming.legs.entity.Hobby;
import cn.fall.thee.charming.legs.entity.Person;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * <p>
 *
 * </p>
 *
 * @author maxingjun
 * @since 2021-01-31
 */
public interface PersonMapper extends BaseMapper<Person> {

    List<Hobby> getHobbiesById(@Param("id") Long id);
}
