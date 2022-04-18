package com.demo.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TxService {

	@Pointcut("execution(public void com.demo.dao.EmployeeDao.saveEmployee())")
	public void p1()
	{	
	}
	
	// advice
	@Before("p1()") //joinpoint
	public void beginTx()
	{
		System.out.println("tx started !!");
	}
	
      @After("p1()") 
	  public void sendReport() 
	  { 
		  System.out.println("Report sent!");
	  }
	 
	@AfterReturning("p1()")
	public void commitTx()
	{
		System.out.println("Tx is committed..");
	}
	
	
}
