import java.sql.*;  
class Database {  

public String fetch (String id) throws SQLException {  

try{  
  System.out.println("Connecting database...");
  Connection connection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/etudiants", "kahla", "123456");
  System.out.println("Database connected!");


String finalresult="";
String sql = "select * from students where id=?";
PreparedStatement preparedStatement = connection.prepareStatement(sql);
id=id.replace("\n", "");
preparedStatement.setString(1, id);
ResultSet result = preparedStatement.executeQuery();
while(result.next()){  

finalresult=id+", "+result.getString(3)+" , "+result.getString(4)+", "+result.getString(5)+", "+result.getString(6)+" , "+result.getString(7)+" , "+result.getString(8)+" ,"+result.getString(9);  

}
connection.close();
return finalresult;
}

catch (SQLException e){
  e.printStackTrace();
  return "Error";
}
}  
}  
