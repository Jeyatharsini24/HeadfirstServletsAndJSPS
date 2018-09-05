package com.example;

import javax.servlet.ServletContextListener;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

public class MyServletContextListener implements ServletContextListener
{
	public void contextInitialized(ServletContextEvent e)
	{
		ServletContext context = e.getServletContext();
		String dogBreed = context.getInitParameter("breed");
		Dog dog = new Dog(dogBreed);
		context.setAttribute("dog", dog);
	}
	
	public void contextDestroyed(ServletContextEvent e)
	{
	
	}
}