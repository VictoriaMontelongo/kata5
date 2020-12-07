package kata5;

import java.sql.*;

public class Kata5 {

 
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //instalar el driver en Java para manejar la base de datos
        Class.forName("org.sqlite.JDBC");
        
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:data/us500.db"); Statement statement = connection.createStatement()){
            ResultSet set = statement.executeQuery("SELECT * FROM people WHERE city = 'Hamilton'");
            while (set.next()){
                String email = set.getString("email");
                System.out.println(email);
            }
        }
        
       
    }
    
}
