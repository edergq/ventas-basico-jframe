package implement.conf.accesos;

import Entidades.*;
import conexion.Conexion;
import java.sql.*;

public class TrabajadorDaoImpl implements TrabajadorDAO{
       
        Statement stmt=null;
        ResultSet rset=null;
        Conexion cx = new Conexion();  
        Trabajador t= new Trabajador();  
        
    
    public String AutenticarTrabajador(String s_usuario, String s_pasword){
        
        String sql = " select * from trabajador         "
                   + " where usuario ='"+s_usuario+"'   "
                   + " and pasword='"+s_pasword+"'      "
                   + " and estado='1'  ";
        
        String accesoPermitido = "NO";
        try{            
            stmt = cx.connect().createStatement();
            rset = stmt.executeQuery(sql);            
            if(rset.next()){
                        accesoPermitido="SI";
            }
            cx.connect().close();
            stmt.close();
        }catch(SQLException  ex){
            System.out.println("Captura Error1: "+ex.getMessage());
        }catch(Exception  e){
            System.out.println("Captura Error2: "+e.getLocalizedMessage());
        }
        return accesoPermitido;
    }
    public String RegistrarTrabajador(Trabajador trabajador){
        return "";
    }
            
    public static void main(String args[]) {     
        TrabajadorDaoImpl ti= new TrabajadorDaoImpl();
        
         System.out.println(ti.AutenticarTrabajador("layhhdi","laydi"));
            
    }
        
        
}
