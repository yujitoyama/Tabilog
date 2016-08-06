package control;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import action.*;
import DAO.*;
import DTO.*;

//@WebServlet("/controlloer")
public class controlloer extends HttpServlet {
//	private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        RequestDispatcher rd = req.getRequestDispatcher("/jsp/login.jsp");
        rd.forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        RequestDispatcher rd = null;
        String actionName = req.getParameter("action");
        Action action = createAction(actionName);
        res.setContentType("text/html; charset=UTF-8");
        if(action !=null){
            try{
            if(action.check(req)){
                String path = action.execute(req);
                rd = req.getRequestDispatcher(path);
            }else{
                rd = req.getRequestDispatcher("/jsp/erro.html");
            }
            }catch(DAOException e){
                e.printStackTrace();
                rd = req.getRequestDispatcher("/jsp/errordb.html");
            }
        rd.forward(req, res);
        }
    }

    
    
    private Action createAction(String name){
        if(name.equals("login")){
            return new LogingAction();
        }
        else if(name.equals("add")){
            return new AddUserScreenAction();
        }
        else if(name.equals("regist")){
            return new UserAddAction();
        }
        else if(name.equals("menu")){
            return new MenuScreenAction();
        }
        return null;
    }

}
