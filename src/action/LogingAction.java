package action;

import javax.servlet.http.*;
import DAO.*;
import DTO.*;

public class LogingAction implements Action{
	 private int empId;
	 private String password;

	 	public boolean check(HttpServletRequest req) {
	 		String paramId = req.getParameter("EMPID");
	 		if ((paramId == null) || (paramId.equals(""))) {
	 			return false;
	 		}
	 		try {
	 			empId = Integer.parseInt(paramId);
	 		} catch (NumberFormatException e) {
	 			e.printStackTrace();
	 			return false;
	 		}

	 		password = req.getParameter("PASSWORD");
	 		if ((password == null) || (password.equals(""))) {
	 			return false;
	 		}
	 	return true;
	 	}

	 	public String execute(HttpServletRequest req) throws DAOException {
	 		EmployeeDTO emp = new EmployeeDTO(empId, "", password);
	 		EmployeeDAO dao = new EmployeeDAO();
	 		if (dao.checkLogin(emp)) {
	 			HttpSession session = req.getSession(true);
	 			session.setAttribute("login_dto", emp);
	 			return "/jsp/menu.jsp";
	 		} else {
	 			return "/jsp/loginerror.html";
	 		}
	 	}

}
