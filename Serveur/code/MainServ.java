public class MainServ {

   public static void main(String[] args) {
    
      String host = "127.0.0.1";
      int port = 1234;
      
      StudentServer ts = new StudentServer(host, port);
      ts.open();
      
      System.out.println("Serveur initialisé.");
      
   }
}
