/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo1;
import java.net.*;
import java.io.*;

public class conector {
    ServerSocket server;
    Socket socket;
    int puerto=9000;
    DataOutputStream salida;
    BufferedReader entrada;
    public void iniciar(){
        try{
            server = new ServerSocket(puerto);
            socket= new Socket();
            socket= server.accept();
            
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensaje= entrada.readLine();
            System.out.println(mensaje);
            salida= new DataOutputStream(socket.getOutputStream());
            salida.writeUTF("Se ha cerrado");
            socket.close();
        }
        catch(Exception e){}
    }
}
