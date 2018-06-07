package listener;

import java.util.HashMap;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session = se.getSession();
		HashMap<Integer,String> books = new HashMap<Integer,String>();
		session.setAttribute("books", books);
		session.setAttribute("money", 0F);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
	}
	
}
