
import java.io.*;
import java.util.Scanner;

public class ArmazenamentoDados {
  public ArmazenamentoDados() {
  }

  public void CriaIDArquivo() {
    File id = new File("ID.txt"); // Specify the filename
    try {
      id.createNewFile();
      System.out.print("Arquivo criado com sucesso!");

    } catch (IOException e) {
      e.printStackTrace();

    }
  }

  public void CriaNovoID(String nome, String ID) {
    try {
      FileWriter ida = new FileWriter("ID.txt", true);
      ida.write(ID + " " + nome + "\n ");
      ida.close();
      System.out.println("Novo Usuario Criado");
    } catch (IOException e) {
      System.out.println("Erro ocorreu na hora de criar o Usuario ");
      e.printStackTrace();
    }

  }

  public void LeArquivoID() {
    try {
      File id = new File("ID.txt");
      Scanner myReader = new Scanner(id);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Erro no cadastro , tente novamente");
      e.printStackTrace();
    }
  }

public boolean UsuarioExiste(String nome)throws Exception { // busca no arquivo id se o nome ja existe 
    File id=new File("ID.txt");
    BufferedReader freader = new BufferedReader(new FileReader(id));
    String s;
      while((s = freader.readLine()) != null) {
        String[] st = s.split(" ");
        String i = st[0];
        String name = st[1];
        String marks = st[2];
        if(name.equals(nome)){
            return true;
        }
        }
        return false;
        }
}

