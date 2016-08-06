package DAO;
import java.sql.*;

public class CommonDAO {
	private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/test?characterEncoding=sjis";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "oracle";

	 protected Connection conn = null;

	 protected void init() throws DAOException{
		try{
		 Class.forName(DRIVER_NAME);
		 conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
		}catch(ClassNotFoundException e){
		 	e.printStackTrace();
		 	throw new DAOException();
		}catch(SQLException e){
		 	e.printStackTrace();
		 	throw new DAOException();
		}
	 	}

	 protected void destroy() throws DAOException {
		 try{
			 if(conn !=null){
				 conn.close();
			 }
		 }catch(SQLException e){
			 e.printStackTrace();
			 throw new DAOException();
			 }
		 }
	 }
