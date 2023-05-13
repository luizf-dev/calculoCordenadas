package classes;

public class Ponto {

    private  int x, y;

    //*Primeiro método construtor
    public Ponto(int x, int y){

        this.x = x;
        this.y = y;

    }

    //*Segundo método construtor
    public Ponto(){

        this.x = 0;
        this.y = 0;
                
    }

    public boolean verificaPontosIguais(int x, int y){

        if(this.x == x && this.y == y){
            return true;
        }else{
            return false;
        }
    }


    public double calcularDistancia(int x, int y){

        int x2 = x;
        int y2 = y;
        
        double pontoA = Math.pow(x2 - this.x, 2);
        double pontoB = Math.pow(y2 - this.y, 2);
        double distancia = Math.sqrt(pontoA + pontoB);
        return distancia;
    }
    
}
