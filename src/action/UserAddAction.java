package action;

import javax.servlet.http.*;
import DAO.*;
import DTO.*;

public class UserAddAction implements Action{
	 private String name;
	 private String password;

	 	public boolean check(HttpServletRequest req) {
	 		name = req.getParameter("name");
	 		if ((name == null) || (name.equals(""))) {
	 			return false;
	 		}
	 		password = req.getParameter("password");
	 		if ((password == null) || (password.equals(""))) {
	 			return false;
	 		}
	 		return true;
	 	}

	 	public String execute(HttpServletRequest req) throws DAOException {
	 		EmployeeDTO dto = new EmployeeDTO(-1, name, password);
	 		NewEmployeeDAO dao = new NewEmployeeDAO();
	 		int result = dao.addUser(dto);
	 		if(result != 1){
	 			return "/jsp/systemerror.html";
	 		}
	 			HttpSession session = req.getSession(true);
	 			session.setAttribute("emp_dto", dto);
	 			return "/jsp/adduserchecke.jsp";
	 		}
}
