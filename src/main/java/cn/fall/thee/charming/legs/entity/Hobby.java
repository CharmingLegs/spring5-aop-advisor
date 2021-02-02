package cn.fall.thee.charming.legs.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

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
public class Hobby implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String hobbyName;
}
