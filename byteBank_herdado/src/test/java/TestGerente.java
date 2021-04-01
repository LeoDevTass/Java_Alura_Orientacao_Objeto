public class TestGerente {

  public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNome("Marco");
    g1.setCpf("32156162");
    g1.setSalario(5000.0);

    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    g1.setSenha(115);
    boolean autentica = g1.autentica(115);
    System.out.println(autentica);
    System.out.println(g1.getBonificacao());

  }
}
