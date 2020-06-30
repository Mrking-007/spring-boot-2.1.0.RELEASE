package com.ymbj;

import com.ymbj.config.BasicConfig;
import com.ymbj.config.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author By: zhangyuhang
 * @Description:
 * @Date: Created on 2020/6/27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MainApplication.class})
public class MainApplicationTest {
	@Autowired
	//@Qualifier("getStu1")
	private Student student1;//指定启动类

	@Test
	public void contextLoad(){
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BasicConfig.class);
//		BeanDefinition beanDefinition1=applicationContext.getBeanDefinition("getStu1");
//		BeanDefinition beanDefinition2=applicationContext.getBeanDefinition("getStu2");
//		String[] beanNames = applicationContext.getBeanDefinitionNames();
//		for(int i=0;i<beanNames.length;i++){
//			System.out.println("bean名称为==="+beanNames[i]);
//		}
		System.out.println(student1);
	}
}
