package com.itheima.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.domain.Account;
import com.itheima.service.AccountService;

public class SpringTest {

	@Test
	public void accountTest() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		AccountService accountService = ac.getBean(AccountService.class);
		List<Account> list = accountService.findAll();
		System.out.println(list);
	}
}
