package com.example;

import javax.servlet.http.*;
import java.io.*;

public class Dog implements HttpSessionBindingListener/*not in deployment descriptor*/, HttpSessionActivationListener/*in dep*/, Serializable
{
	private String breed;
	// more instance variables, including some are not Serializable
	// should be there. otherwise wont start
	public Dog()
	{
	
	}
	
	public Dog(String breed)
	{
		this.breed = breed;
	}
	
	String getBreed()
	{
		return breed;
	}
	
	public void valueUnbound(HttpSessionBindingEvent event)
	{
		// no longer part of a session
	}
	
	public void valueBound(HttpSessionBindingEvent event)
	{
		// part of a session
	}
	
	public void sessionWillPassivate(HttpSessionEvent event)
	{
		// non-serializable fields -> able to survive when move to new VM
	}
	
	public void sessionDidActivate(HttpSessionEvent event)
	{
		// restore fields or undo things in sessionWillPassivate
	}
}