
 class InformacoesPessoais{
    String nome;
    String endereco;
    String email;
    // foto
    //Familiares familiares; criar estrutura

    
    public void setVar(String nome,String endereco,String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getEmail(){
        return email;
    }
    public void RetornaInformacoesPessoais(){
        System.out.println(getNome());
        System.out.println(getEndereco());
        System.out.println(getEmail());
       
    }
}
