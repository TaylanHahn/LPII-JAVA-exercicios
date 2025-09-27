package carro;

import javax.swing.JOptionPane;

public class Carro {
    public static final int DIREITA  = 0;
    public static final int ESQUERDA = 1;

    public static final float CAPACIDADE_TANQUE = 20;
    public static final float VELOCIDADE_MAXIMA = 10;
        
    private String  placa;
    private String  cor;
    private String  tipoCombustivel;
    private float   quantCombustivel;
    private float   velocidade;
    private boolean luzFarois;
    private boolean luzPiscaDireita;
    private boolean luzPiscaEsquerda;
    
    public Carro(String placa)    {
        this.placa = placa;
        this.cor = "Branca";
        this.tipoCombustivel = "Gasolina";
        this.quantCombustivel = 2;
    }

    public void abastece(float quant) {
        float q;
        q = this.quantCombustivel + quant;
        if (q > CAPACIDADE_TANQUE) {
          this.quantCombustivel = CAPACIDADE_TANQUE;
          //throw new RuntimeException("Combustível vazou");
          alertaVazouCombustivel();
        }
       this.quantCombustivel = q;
    }    

    public boolean getLuzFarois() {
        return this.luzFarois;
    }

    public boolean getLuzPiscaDireita() {
        return this.luzPiscaDireita;
    }
    
    public boolean getLuzPiscaEsquerda() {
        return this.luzPiscaEsquerda;
    }

    public float getQuantCombustivel() {
        return this.quantCombustivel;
    }
    
    public float getVelocidade() {
        return this.velocidade;
    }

    public void luzFaroisLiga() {
        this.luzFarois = true;
    }

    public void luzFaroisDesliga() {
        this.luzFarois = false;
    }

    public void luzPisca(int direcao) {
        if (direcao == DIREITA) {
          this.luzPiscaDireita = true;
          this.luzPiscaEsquerda = false;
        }
        else if (direcao == ESQUERDA) {
            this.luzPiscaDireita = false;
            this.luzPiscaEsquerda = true;
        }
    }
    
    public void luzPiscaDesliga() {
        this.luzPiscaDireita = false;
        this.luzPiscaEsquerda = false;
    }

    public void movAcelera() {
        float vel;
        vel = this.velocidade + 1;
        if (vel < VELOCIDADE_MAXIMA) {
            this.velocidade = vel;
            consomeCombustivel();
        }
        else {
            this.velocidade = VELOCIDADE_MAXIMA;
            consomeCombustivel();
            alertaVelocidadeMaxima();
        }
    }

    public void movFreia() {
        if (this.velocidade > 0) {
          this.velocidade--;
          consomeCombustivel();
        }
    }

    public void movMovimenta() {
        if (this.velocidade > 0) {
          consomeCombustivel();
        }
        else {
            alertaCarroParado();
        }
    }
    
    private void consomeCombustivel() {
      this.quantCombustivel = this.quantCombustivel - this.velocidade/10.0f;
      if (this.quantCombustivel <= 0) {
          alertaFaltouCombustivel();  //tem que ser antes de atribuir velocidade para poder mostrar a velocidade atual antes do carro parar.
          this.velocidade       = 0;
          this.quantCombustivel = 0;
        }
    }

    private void alertaVazouCombustivel() {
      System.out.println("Combustivel vazou.");
      JOptionPane.showMessageDialog(null, "Combustivel vazou." , "Painel Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    private void alertaFaltouCombustivel() {
      System.out.println("Faltou Combustivel. Velocidade = " + this.velocidade + ". Carro parando...");
      JOptionPane.showMessageDialog(null, "Faltou Combustivel. Velocidade = " + this.velocidade + ". Carro parando..." , "Painel Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    private void alertaVelocidadeMaxima() {
      System.out.println("Velocidade maxima atingida. Velocidade = " + this.velocidade);
      JOptionPane.showMessageDialog(null, "Velocidade maxima atingida. Velocidade = " + this.velocidade, "Painel Carro", JOptionPane.INFORMATION_MESSAGE);
    }

    private void alertaCarroParado() {
      System.out.println("Carro esta parado. Acelere para coloca-lo em movimento.");
      JOptionPane.showMessageDialog(null, "Carro esta parado. Acelere para coloca-lo em movimento.", "Painel Carro", JOptionPane.INFORMATION_MESSAGE);
    }
    
}//Carro.
