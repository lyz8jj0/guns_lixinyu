package com.lixinyu.guns.rest.common.persistence.model;

import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 * 账号实体
 *
 * @author by 李新宇
 * @date 2020-04-06 11:41
 */
@Data
public class User extends Model<User> {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String username;

	protected Serializable pkVal() {
		return this.id;
	}
}
