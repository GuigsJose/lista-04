package br.edu.up.Controller;

import br.edu.up.Model.Aeronave;
import br.edu.up.Model.Comandante;
import br.edu.up.Model.Comissario;
import br.edu.up.Model.Passageiro;
import br.edu.up.Model.Passagem;
import br.edu.up.Model.Pessoa;

public class AeroportoController {

    private Pessoa[] pessoas;
    private int count;

    private Passagem[] passagems;
    private int coutPass;
    private Aeronave[] aeronaves;
    private int coutAer;
    public AeroportoController(){
        this.pessoas = new Pessoa[100];
        this.count=0;
        this.aeronaves = new Aeronave[50];
        this.coutAer =0;
        this.passagems = new Passagem[100];
        this.coutPass = 0;
    }

    public void adicionarPessoa(Pessoa pessoa){
        if (count >= pessoas.length) {
            pessoas[count++] = pessoa;
        }
    }

    public void adicionarPassageiro(String nome, String rg,Aeronave aeronave, String idBagagem, Passagem passagem){
        Passageiro pass = new Passageiro(nome, rg, aeronave, idBagagem, passagem);
        adicionarPessoa(pass);
    }
    public void adicionarComandante(String nome, String rg, Aeronave aeronave, String idAeronautica, String matricula, int horasVoo){
        Comandante comand = new Comandante(nome, rg, aeronave, idAeronautica, matricula, horasVoo);
        adicionarPessoa(comand);
    }

    public void adicicionarComissario(String nome, String rg, Aeronave aeronave, String idAeronautica, String matricula,
    String[] idiomas){
        Comissario coms = new Comissario(nome, rg, aeronave, idAeronautica, matricula, idiomas);
        adicionarPessoa(coms);
    }

    
    public void adicionarAeronaves(String codigo, String tipo, int qtdAssentos){
        Aeronave aer = new Aeronave(codigo, tipo, qtdAssentos);
        if(coutAer >= aeronaves.length){
            aeronaves[coutAer++] = aer;
        }
    }

    public void adicionarPassagens(String numeroAssento, String classeAssento, String dataVoo){
        Passagem pass = new Passagem(numeroAssento, classeAssento, dataVoo);
        if (coutAer >= passagems.length) {
            passagems[coutPass++] = pass;
        }
    }

    public Pessoa[] listarPessoas(){
        Pessoa[] res = new Pessoa[count];
        System.arraycopy(pessoas,0,res,0,count);
        return res;
    }

    public Aeronave[] listarAeronaves() {
        Aeronave[] resultado = new Aeronave[coutAer];
        System.arraycopy(aeronaves, 0, resultado, 0, coutAer);
        return resultado;
    }

    public Passagem[] listarPassagens() {
        Passagem[] resultado = new Passagem[coutPass];
        System.arraycopy(passagems, 0, resultado, 0, coutPass);
        return resultado;
    }

    public void removerAeronavePorCodigo(String codigo) {
        for (int i = 0; i < coutAer; i++) {
            if (aeronaves[i].getCodigo().equals(codigo)) {
                aeronaves[i] = aeronaves[coutAer - 1];
                aeronaves[coutAer - 1] = null;
                coutAer--;
                return;
            }
        }
    }

    public void removerPassagem(String numeroAssento, String classeAssento, String dataVoo) {
        for (int i = 0; i < coutPass; i++) {
            Passagem passagem = passagems[i];
            if (passagem.getNumeroAssento().equals(numeroAssento) &&
                passagem.getClasseAssento().equals(classeAssento) &&
                passagem.getDataVoo().equals(dataVoo)) {
                passagems[i] = passagems[coutPass - 1];
                passagems[coutPass - 1] = null;
                coutPass--;
                return;
            }
        }
    }

}
