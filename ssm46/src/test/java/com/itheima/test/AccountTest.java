package com.itheima.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;

public class AccountTest {

	@Test
	public void mybatisTest() throws Exception {
		InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
		//查询
//		List<Account> list = accountDao.findAll();
//		System.out.println(list);
		//保存
		Account account = new Account();
		account.setName("test");
		account.setMoney(100d);
		accountDao.saveAccount(account);
		sqlSession.commit();
		
		
		
	}
}
