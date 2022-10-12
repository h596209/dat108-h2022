package no.hvl.dat108.webshop.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class LoginUtil {
	
	private final static int MAX_INTERACTIVE_INTERVAL = 10;

	public static void loggUtBruker(HttpSession session) {

		session.invalidate();
	}

	public static void loggInnBruker(HttpServletRequest request, String username) {

		loggUtBruker(request.getSession());

		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(MAX_INTERACTIVE_INTERVAL);
		session.setAttribute("username",username);
		session.addAttribute("cart", new Cart());
	}
	
	public static boolean erBrukerInnlogget(HttpSession session) {
		return session != null && session.getAttribute("username") != null;
	}

}
