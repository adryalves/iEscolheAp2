import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/IEscolhe";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "1234";

    public Connection getConnection() {
        try {

            Connection conexao = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            return conexao;
        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

    }
}