
import java.io.*;
import java.util.Scanner;

class Main{
    public static void main(String [] args) throws Exception{
        
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Digite nome do paciente");
        String pacienteNome = teclado.next();
        System.out.println(" Digite endereço do paciente"); 
        String pacienteend = teclado.next(); 
        System.out.println(" Digite email do paciente"); 
        String pacienteEmail = teclado.next(); 

    Paciente paciente = new Paciente();
    paciente.InsereInfo(pacienteNome, pacienteend, pacienteEmail);
    ArmazenamentoDados IdList = new ArmazenamentoDados();
    IdList.CriaIDArquivo(); //cria arquivo 
    IdList.CriaNovoID(pacienteNome,"0000001");
    IdList.LeArquivoID(); 
    
    if (IdList.UsuarioExiste(pacienteNome)==true){
        IdList.LeArquivoID(); 
    }
    else{
    IdList.CriaNovoID(pacienteNome,"0000002");
    IdList.LeArquivoID(); 
    }  
    }

}