package action;

import javax.servlet.http.*;
import DAO.*;
import DTO.*;

public class MenuScreenAction implements Action{

	 	public boolean check(HttpServletRequest req) {
	 		return true;
	 	}

	 	public String execute(HttpServletRequest req) throws DAOException {
	 			return "/jsp/menu.jsp";
	 	}

}
