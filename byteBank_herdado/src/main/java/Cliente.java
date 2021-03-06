

public class Cliente implements Autenticavel {

  private String nome;
  private String cpf;
  private String profissao;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getProfissao() {
    return profissao;
  }

  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }

  private AutenticacaoUtil autenticador;

  public Cliente(){
    autenticador = new AutenticacaoUtil();
  }

  @Override
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  @Override
  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }
}
