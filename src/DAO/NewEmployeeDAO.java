package DAO;

import java.sql.*;
import DTO.*;

public class NewEmployeeDAO extends CommonDAO {

	public int addUser(EmployeeDTO emp) throws DAOException {
		init();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	try {
//		pstmt = conn.prepareStatement("SELECT test.NEXTVAL('id') ");
//		rs = pstmt.executeQuery();
//		if (rs.next()){
//			int no = rs.getInt(1);
//			int no = 2;
//			emp.setId(no);
//		} else{
//			return -1;
		pstmt = conn.prepareStatement("INSERT INTO test.employee" + "(id,password,name,) values(?,?,?)");
		pstmt.setInt(1, 2);
		pstmt.setString(2, emp.getPassword());
		pstmt.setString(3, emp.getName());
		int result = pstmt.executeUpdate();		
		return result;
	} catch (SQLException e) {
		e.printStackTrace();
		throw new DAOException();
	} finally {
		destroy();
	}
	}
}
