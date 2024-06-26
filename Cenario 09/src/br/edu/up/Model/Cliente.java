package Model;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private double vlrMaxCredito;
    private double vlrEmprestado;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getVlrMaxCredito() {
        return vlrMaxCredito;
    }
    public void setVlrMaxCredito(double vlrMaxCredito) {
        this.vlrMaxCredito = vlrMaxCredito;
    }
    public double getVlrEmprestado() {
        return vlrEmprestado;
    }
    public void setVlrEmprestado(double vlrEmprestado) {
        this.vlrEmprestado = vlrEmprestado;
    }
    public Cliente(String nome, String telefone, String email, double vlrMaxCredito, double vlrEmprestado) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.vlrMaxCredito = vlrMaxCredito;
        this.vlrEmprestado = vlrEmprestado;
    }

    
}
