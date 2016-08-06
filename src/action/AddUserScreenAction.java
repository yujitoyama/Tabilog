package action;

import javax.servlet.http.*;
import DAO.*;
import DTO.*;

public class AddUserScreenAction implements Action{

	 	public boolean check(HttpServletRequest req) {
	 		return true;
	 	}

	 	public String execute(HttpServletRequest req) throws DAOException {
	 			return "/jsp/adduser.jsp";
	 	}

}
