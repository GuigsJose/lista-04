package Models;

public class Pessoal extends Contato {
  private String Aniversario;

  public Pessoal(int codigo, String nome, String telefone, String aniversario) {
    super(codigo, nome, telefone);
    Aniversario = aniversario;
  }

  public String getAniversario() {
    return Aniversario;
  }

  public void setAniversario(String aniversario) {
    Aniversario = aniversario;
  }

}
