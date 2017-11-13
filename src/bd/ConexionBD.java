/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
//paso-10necesario para conexion con mysql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LAB10
 */
public class ConexionBD
{
    //paso 11 declarando objeto para la conexion
private static Connection conex;   //objeto tipo conexion 
private static final String DRIVER= "com.mysql.jdbc.Driver";
private static final String USER= "root";
private static final String PASS= "";
private static final String URL= "jdbc:mysql://localhost:330/conexion";
//paso 12-constructor de la clase
public ConexionBD()
{
 conex = null;//inicializar la variable
 //metodo para manejar excepciones
     try 
     {
    Class.forName(DRIVER);
    conex =DriverManager.getConnection(URL,USER,PASS);
    if(conex != null)
    {
     System.out.println("Conexion Establecida");
    }
}
catch(ClassNotFoundException| SQLException event)
{
 System.out.println("Error en la conexion");
}
 
     
 }
  //paso 13-los metodos para conectar y desconectar
public Connection conectar()
{
   return conex;//retorna el objeto conex
   }
 public void desconectar()
 {
  conex=null;
  if(conex==null)
  {
    System.out.println("conexion finalizada");
 }
 
 
     
 }
     
 }