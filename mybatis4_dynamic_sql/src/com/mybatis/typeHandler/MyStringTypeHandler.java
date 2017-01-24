package com.mybatis.typeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MyStringTypeHandler implements TypeHandler<String>{
	private Logger log = Logger.getLogger(MyStringTypeHandler.class.getSimpleName());
	
	@Override
	public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
		log.info("ʹ���ҵ� TypeHandler");
		ps.setString(i, parameter);
	}

	@Override
	public String getResult(ResultSet rs, String columnName) throws SQLException {
		log.info("ʹ���ҵ� TypeHandler, ResultSet ������ȡ �ַ���!");
		return rs.getString(columnName);
	}

	@Override
	public String getResult(ResultSet rs, int columnIndex) throws SQLException {
		log.info("ʹ���ҵ�Typehandler, ResultSet �±��ȡ�ַ���");
		return rs.getString(columnIndex);
	}

	@Override
	public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
		log.info("ʹ���ҵ� TypeHandler�� CallableStatement �±��ȡ�ַ���.");
		return cs.getString(columnIndex);
	}
}
