package DAO;

import java.sql.*;
import DTO.*;

//welcom github!

public class EmployeeDAO extends CommonDAO {

	public boolean checkLogin(EmployeeDTO emp) throws DAOException {
		init();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	try {
		pstmt = conn.prepareStatement("SELECT * FROM test.employee WHERE ID = ? AND PASSWORD = ?" );
		pstmt.setInt(1, emp.getId());
		pstmt.setString(2, emp.getPassword());
		rs  = pstmt.executeQuery();
		return rs.next();
	} catch (SQLException e) {
		e.printStackTrace();
		throw new DAOException();
	} finally {
		destroy();
	}
	}
}
