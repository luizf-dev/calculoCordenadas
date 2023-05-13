package classes;

public class Teste {
    
            public static void main(String[] args) {

                //* Cria um objeto PontoA com coordenadas
                Ponto pontoA = new Ponto(5,9);
                
                //* Testa o método verificaPontosIguais com as coordenadas do pontoA.
                boolean pontosIguais = pontoA.verificaPontosIguais(6, 6);

                if(pontosIguais == true){
                    System.out.println("PontoA - Os pontos são iguais!");
                }else{
                    System.out.println("PontoA - Os pontos são diferentes!");
                }      

                
                //* Testa o método calcularDistancia com as coordenadas
                double distancia = pontoA.calcularDistancia(6, 6);
                System.out.println("PontoA - A distância entre os pontos é: " + distancia);
                System.out.println("=========================================");

            //*=========================================================================

                
                //* Cria um objeto pontoB com as coordenadas
                Ponto pontoB = new Ponto(2, 9);
                
                //* Testa o método verificaPontosIguais com as coordenadas do pontoB.
                pontosIguais = pontoB.verificaPontosIguais(2, 9);

                if(pontosIguais == true){
                    System.out.println("PontoB - Os pontos são iguais!");
                }else{
                    System.out.println("PontoB - Os pontos são diferentes!");
                }
                
                //* Testa o método calcularDistancia com as coordenadas
                distancia = pontoB.calcularDistancia(3, 4);
                System.out.println("PontoB - A distância entre os pontos é: " + distancia);
            }
        }
        

