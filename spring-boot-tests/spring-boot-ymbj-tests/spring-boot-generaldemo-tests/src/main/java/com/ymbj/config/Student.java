package com.ymbj.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @Author By: zhangyuhang
 * @Description:
 * @Date: Created on 2020/6/27
 */
@Data
@AllArgsConstructor
@ToString
public class Student {
	private String stuName;
	private Integer stuAge;
}
