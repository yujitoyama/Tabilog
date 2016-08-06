package action;
import javax.servlet.http.*;
import DAO.*;


public interface Action {
	boolean check(HttpServletRequest req);
	String execute(HttpServletRequest req) throws DAOException;
}
