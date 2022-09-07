
public class Paciente extends InformacoesPessoais{
    private String telefone;
    public Paciente()
    {
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }
    public void InsereInfo(String nome,String enderco,String email){
    InformacoesPessoais InformacoesPessoais = new InformacoesPessoais();
    InformacoesPessoais.setVar(nome,enderco,email);
    InformacoesPessoais.RetornaInformacoesPessoais();

    }
}
