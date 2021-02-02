package cn.fall.thee.charming.legs.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
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

@Data
@ToString
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    private int age;

    private List<Hobby> hobbies;

    private Map<String, Discipline> scores;
}
