package com.example.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class CountryDao {

	static Log log = LogFactory.getLog(CityDao.class);
	
	public void init() {
		log.info("#####################");
		log.info("5. 커스텀 init()...");
		log.info("#####################");
	}
	
	BasicDataSource ds;
	
	public void setDataSource(BasicDataSource ds) {
		this.ds = ds;
		log.info("############################");
		log.info(" CountryDaosetDataSource()...");
		log.info("############################");
	}
	
	public List<String> selectAll() throws SQLException {
		Connection conn = ds.getConnection();			
		PreparedStatement pstmt = conn.prepareStatement("select name from country");
//		pstmt.setString(1, "KOR");
		
		ResultSet rs = pstmt.executeQuery();
		
		List<String> list = new ArrayList<>();
		while(rs.next()) {
			list.add(rs.getString("name"));
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		return list;
	}
	
	public void close() {
		log.info("############################");
		log.info("8.커스텀 close()...");
		log.info("############################");
	}
}
