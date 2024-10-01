import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("CENTRO UNIVERSITARIO ALFREDO NASSER");
        System.out.println(" ");
        System.out.println("ALUNO: EDUARDO MARTINS ");
        System.out.println(" ");
        System.out.println("PROFESSOR: BRENNO PIMENTA");
        System.out.println(" ");
        System.out.println("ATIVIDADE AVALIATIVA DE CONHECIMENTO HISTÓRICO GERAIS");
        System.out.println(" ");

        Questao q1 = new Questao(
                "Quando e onde teve início a Primeira Revolução Industrial?",
                "A) No século XVIII, na França",
                "B) No século XIX, nos Estados Unidos",
                "C) No século XVIII, na Inglaterra",
                "D) No século XIX, na Alemanha",
                "E) No século XVII, na Itália",
                "A) No século XVIII, na França"
        );

        Questao q2 = new Questao(
                "Quando ocorreu a Primeira Guerra Mundial?",
                "A) 1914-1918",
                "B) 1890-1896",
                "C) 1934-1939",
                "D) 1952-1956",
                "E) 1971-1974",
                "A) 1914-1918"
        );

        Questao[] questoes = {q1, q2};

        int acertos = 0;
        int erros = 0;
        int i = 0;

        for (Questao questaoAtual : questoes) {
            questaoAtual.escrevaQuestao();

            System.out.print("Digite a sua resposta (A;B;C;D;E): ");
            String respostaUsuario = scanner.nextLine().toUpperCase();

            if (questaoAtual.isCorreta(respostaUsuario)) {
                acertos++;
            } else {
                erros++;
            }
        }

        System.out.println("Quiz completo!");
        System.out.println("Número de questões acertas: " + acertos);
        System.out.println("Número de questões erradas: " + erros);

        scanner.close();
    }
}
