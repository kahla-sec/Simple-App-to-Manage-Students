package com.Etudiant.frame;


import com.sun.org.apache.bcel.internal.classfile.InnerClass;
import java.io.*;
import java.net.Socket;



public class ClientSocket  {
    public String ID;
    public String msg="";//pour les erreurs
    final public LoginGUI in;
    public Socket sock;
    
    public String ReadFromServer(){
        String response="";
     try{BufferedInputStream bis = new BufferedInputStream(sock.getInputStream());
             int stream=0;
             byte[] b = new byte[4096];
             stream = bis.read(b);
             response = new String(b, 0, stream);   
             bis.close();
        }
     catch(Exception e){
         msg="Connection Error , Try again please !";
     }
             return response;
    }
    public ClientSocket(String ID,final LoginGUI in) throws Exception {
         this.in=in;
         this.ID=ID;
         try { 
             String ip="52.71.185.177";
             int port=1234;
             this.sock=new Socket(ip,port);
             
             BufferedOutputStream bos = new BufferedOutputStream(sock.getOutputStream());
             bos.write(ID.getBytes());
	     bos.flush();
             String response=ReadFromServer();
             final String copieStr=new String(response);
             //passer a l'interface graphique Infos.java
             java.awt.EventQueue.invokeLater(new Runnable(){public void run() { new Infos(copieStr,in).setVisible(true);}});
             this.in.hideMe();//cacher la 1ere fenetre
             bos.close();
             sock.close();
        }	
        catch (Exception e)
        {
        msg="Connection Error , Try again please !";
        }
       
    }
  
}   
        

