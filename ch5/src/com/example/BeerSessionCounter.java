package com.example;

import javax.servlet.http.*;

public class BeerSessionCounter implements HttpSessionListener
{
	private static int activeSessions;
	
	public int getActiveSessions()
	{
		return activeSessions;
	}
	
	public void sessionCreated(HttpSessionEvent event)
	{
		activeSessions++;
		System.out.println("Session created: " + activeSessions);
	}
	
	public void sessionDestroyed(HttpSessionEvent event)
	{
		activeSessions--;
		System.out.println("Session destroyed: " + activeSessions);
	}
}