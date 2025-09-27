package carro;


public class Teste1
{   
    public static void main(String args[]) {
        Carro c1;                //Declara a variável c1 do tipo Carro.
        c1 = new Carro("ABC123"); //Instancia um Carro e atribui à variável c1.
        c1.movAcelera();
        
                //Solicita ao carro c1 para acelerar. 
        float vel;                //Declara a variável vel do tipo float.
        vel = c1.getVelocidade(); //Solicita ao carro c1 a sua velocidade e armazena na variável vel.


        c1.movAcelera(); 
        c1.movAcelera(); 
        c1.movAcelera(); 
        c1.getLuzFarois();
        vel = c1.getVelocidade();

        c1.movFreia();
        c1.movFreia();
        c1.movFreia();
        c1.movFreia();
        vel = c1.getVelocidade();
        System.out.println(vel);

        c1.luzFaroisLiga();
        System.out.println(c1.getLuzFarois()); 




        System.out.println("=== Programa para Testar a classe Carro ===");
        System.out.println("Velocidade = " + vel); //Imprime a velocidade.
        System.out.println(vel);
        System.out.println("=== Fim do Programa ===");
    }//main
}//Teste1
