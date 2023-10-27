package ConexionBBDD;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
	//private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL_CONEXION = "jdbc:mysql://localhost:3306/pruebas";
    public static void main(String args[]) throws SQLException {
        final String usuario = "root";
        final String password = "1234";
        Connection dbConnection = null;
        java.sql.Statement statement = null;
        try {
           // Class.forName(DRIVER);
            Connection conn = DriverManager.getConnection(URL_CONEXION, usuario, password);
            String selectTableSQL = "SELECT ID,USERNAME,PASSWORD,NOMBRE FROM Usuarios";
            statement = conn.createStatement();
            ResultSet rs = ((java.sql.Statement) statement).executeQuery(selectTableSQL);
            while (rs.next()) {
                String id = rs.getString("ID");
                String usr = rs.getString("USERNAME");
                String psw = rs.getString("PASSWORD");
                String nombre = rs.getString("NOMBRE");
                System.out.println("userid : " + id);
                System.out.println("usr : " + usr);
                System.out.println("psw : " + psw);
                System.out.println("nombre : " + nombre);
                System.out.println("");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (dbConnection != null) {
                dbConnection.close();
            }
        }
    }   
}
 