import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;

public class sql {
    public static void main(String[] args) {
        SQLServerDataSource sql = new SQLServerDataSource();
        sql.setUser("sa");
        sql.setPassword("hechdom@123");
        sql.setServerName("DESKTOP-89D587A");
        sql.setPortNumber(1433);
        sql.setDatabaseName("ass");
        sql.setEncrypt(false);
        try(Connection conn = sql.getConnection()){
            System.out.println("fall");
            System.out.println(conn.getCatalog());
        } catch (SQLServerException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
