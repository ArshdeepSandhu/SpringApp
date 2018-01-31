package com.bank.model.web;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.model.persistance.Account;
import com.bank.model.persistance.AccountDao;
import com.bank.model.persistance.AccountDaoImp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-config.xml");
		
		AccountDao dao=ctx.getBean("accountDaoImp", AccountDaoImp.class);
		dao.save(new Account(122, "amit", 10));
 
	}

}
