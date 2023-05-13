## OBJETIVO DO PROJETO

Suponha que temos que desenvolver um sistema de computação gráfica e 
queremos começar modelando uma coordenada (x,y), ou seja, um ponto na tela do 
computador. 
Como estamos programando orientado a objetos com a linguagem Java, os 
“pontos” do sistema de computação gráfica devem ser representados por uma 
classe, as informações que a classe precisa armazenar são coordenadas x e y de 
um “ponto” na tela, assim x e y serão atributos inteiros e privados da classe 
Ponto. 
Além disso, para que nosso “ponto” possa ser funcional, precisaremos ter
construtores para para classe Ponto e métodos para representar ações e interações
que podemos com os objetos da classe Ponto. Por exemplo, seria interessante ter
um método que verifique se dois pontos possui os mesmos valores para x e y, ou
seja, os pontos são iguais e um método que calcula a distância sobre entre dois
pontos.

## implementações dos construtores e métodos da classe 
Ponto:
O construtor da classe ponto que recebe por parâmetros dois
valores inteiros com os valores dos atributos x e y respectivamente.

Outro construtor para classe Ponto que não recebe nada por
parâmetro, o construtor inicializa os atributos da classe (x e y) com o valor zero.
Note que aqui utilizamos polimorfismos estático.

Método que verifica se dois pontos são iguais, ou seja,
verifica se dois pontos possuem os mesmos valores para x e y, um dos pontos
será passado de forma implícita na chamada do método e outro de forma
tradicional como parâmetro do método.

Método que calcula a distância entre dois pontos, para tanto o objeto que invoca o método é
considerado um parâmetro (implícita) e outro objeto Ponto é passado por
parâmetro ao método (explícita).


