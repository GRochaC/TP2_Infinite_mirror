# TP2_Infinite_mirror
Códigos e testes utilizados na video aula sobre a técnica de programação Infinite Mirror para a disciplina Técnicas de Programação 2.

## Integrantes do Grupo:

Arthur Diehl Barroso 			- 221029991

Gabriel Henrique do Nascimento Neres 	- 221029140

Guilherme da Rocha Cunha 		- 221030007

Lucas Teixeira de Souza 		- 221017041

Sara Gaspar Lima 			- 221017121

Link para o repositório GitHub: **https://github.com/GRochaC/TP2_Infinite_mirror/tree/main**

## Execução:
Para executar os códigos disponibilizados no GitHub, os quais estão em Java, será preciso a versão mais recente do Java e realizar o download das bibliotecas importadas.

Os códigos disponibilizados não possuem uma "Main", dessa forma não são executados apenas ao rodar o código. Para serem testados manualmente, será preciso declarar uma "Main", seguindo a sintaxe do Java, e nela instanciar um objeto da classe que deseja ser testada e fazer o chamado do método a ser testado. Exemplo para a classe Fatoracao:

	class teste{
	    public static void main(String[] args) {
	        Fatoracao fat = new Fatoracao();
		      System.out.println(fat.calcular(10));
	    }
	}



Para executar os módulos de Teste que foram enviados, pode ser utilizado a IDE VSCode utilizando o interpretador Java. Ao colocar a classe e a classe de Testes no mesmo pacote, é possível executar os testes pelo botão que aparece ao lado da declaração da classe de testes, o que executa todos os testes de uma vez.

Caso seja preciso executar os testes no terminal, uma sugestão encontrada foi executar "java org.junit.runner.JUnitCore <TestClass>".
