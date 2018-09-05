package foo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class RequestParams extends HttpServlet
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		Person person = new Person();
		person.setName(name);
		
		request.setAttribute("person", person);
		
		Person3 p1 = new Employee();
		p1.setName("Person1");
		request.setAttribute("p1", p1);
		
		Person p2 = new Person();
		p2.setName("Person2");
		request.setAttribute("p2", p2);
		
		Employee p3 = new Employee();
		p3.setName("Person3");
		request.setAttribute("p3", p3);
		
		List<String> favFood = new ArrayList<>();
		favFood.add("chai ice cream");
		favFood.add("grrrr");
		favFood.add("crrrr");
		request.setAttribute("favFood", favFood);
		
		Map<String, String> musicMap = new HashMap<>();
		musicMap.put("m1", "music1");
		musicMap.put("m2", "music2");
		request.setAttribute("favMusic", musicMap);
		request.setAttribute("omg", "m1");
		
		Map<String, String> musicMap2 = new HashMap<>();
		musicMap2.put("Ambient", "Zero 7");
		musicMap2.put("Surf", "Tahiti 80");
		musicMap2.put("DJ", "BT");
		musicMap2.put("Indie", "Frou Frou");
		musicMap2.put("1", "one");
		request.setAttribute("musicMap", musicMap2);
		
		String[]musicTypes = {"Ambient", "Surf", "DJ", "Indie"};
		request.setAttribute("MusicType", musicTypes);
		
		List<String>nums = new ArrayList<>();
		nums.add("1");
		nums.add("2");
		nums.add("3");
		request.setAttribute("numbers", nums);
		String[]favoriteMusic = {"Zero 7", "Tahiti 80", "BT", "Frou Frou"};
		request.setAttribute("musicList", favoriteMusic);
		
		Person p = new Person();
		p.setName("Leelu");
		Dog d = new Dog();
		d.setName("Clyde");
		Toy t1 = new Toy();
		t1.setName("stick");
		Toy t2 = new Toy();
		t2.setName("neighbor's cat");
		Toy t3 = new Toy();
		t3.setName("Barbie doll head");
		d.setToys(new Toy[]{t1, t2, t3});
		p.setDog(d);
		request.setAttribute("person", p);
		
		request.getServletContext().setAttribute("globally", "globally from servlet");
		
		RequestDispatcher view = request.getRequestDispatcher("getPropertyFromRequestAttributeConditional.jsp");
		view.forward(request, response);
	}
}