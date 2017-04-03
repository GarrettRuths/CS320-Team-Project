package database;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import model.Account;
import model.Group;
import model.GroupMember;

public interface IDatabase {
	public boolean createTables();
	public boolean dropTables();
	public Connection connect() throws SQLException;
	public void loadInitialData();
}
