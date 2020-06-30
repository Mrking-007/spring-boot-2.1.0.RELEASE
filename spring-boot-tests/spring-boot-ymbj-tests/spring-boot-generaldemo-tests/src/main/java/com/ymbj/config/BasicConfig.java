package com.ymbj.config;

import com.ymbj.condition.ConditionConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

/**
 * @Author By: zhangyuhang
 * @Description:
 * @Date: Created on 2020/6/27
 */
@Import(ConditionConfig.class)//参见https://www.cnblogs.com/iiiiiher/p/12781618.html
@Configuration //该注解相当于xml
public class BasicConfig {
	@Bean("student1")//默认不指定名字，则bean id是返回值类型名字，该注解相当于xml中<bean id="student" name="getSut1" type="com.ymbj.config.Student"></bean>
	//@Primary
	public Student getStu1() {
		return new Student("小张", 12);
	}

	@Bean
	public Student getStu2() {
		return new Student("小李", 20);
	}
}

// id name https://www.cnblogs.com/xiewuqing/p/4678407.html
// bean name https://www.cnblogs.com/1540340840qls/p/6962777.html
// Spring创建bean默认的id值 https://www.jianshu.com/p/77d0ec46703c
//spring中bean配置和bean注入 https://www.cnblogs.com/wuchanming/p/5426746.html