public class Main {
    public static void main(String[] args) {

        Questao questao1 = new Questao();
            questao1.pergunta = "vermelho";
            questao1.opcaoA = "A) azul";
            questao1.opcaoB = "B) vermelho";
            questao1.opcaoC = "C) verde";
            questao1.opcaoD = "D) ciano";
            questao1.opcaoE = "E) marrom";
            questao1.correta = "B";

            escrevaQuestao(questao1);


    }

}