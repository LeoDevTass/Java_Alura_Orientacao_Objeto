public class TesteSistema {

  public static void main(String[] args) {
    Gerente g = new Gerente();
    g.setSenha(2222);

    Administrador ad = new Administrador();
    ad.setSenha(2122);

    SistemaInterno si = new SistemaInterno();
    si.autentica(g);
    si.autentica(ad);
  }
}
