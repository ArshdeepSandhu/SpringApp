package com.bank.model.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class AccountDaoImp implements AccountDao 
{
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void update(Account account) {
		
	}

	@Override
	public void save(Account account) {
String sql = "INSERT INTO account (id, name, balance ) VALUES (?, ?, ?)";
		
		jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, new Object[]{account.getId(), account.getName(), account.getBalance()});

		/*String sql = "INSERT INTO account (id, name, balance ) VALUES (?, ?, ?)";
		Connection conn = null;

			try {
					conn = dataSource.getConnection();
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.setInt(1, account.getId());
					ps.setString(2,account.getName() );
					ps.setDouble(3, account.getBalance());
					ps.executeUpdate();
					ps.close();

			} catch (SQLException e) {
					throw new RuntimeException(e);

			} finally {
					if (conn != null) {
						try {
							conn.close();
						} catch (SQLException e) {
						}
					}
			}*/
	}

	@Override
	public Account find(int id) {
		return null;
	}
}