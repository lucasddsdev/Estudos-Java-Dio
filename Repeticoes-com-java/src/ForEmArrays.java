public class ForEmArrays {


    public static void main(String[] args) {


        String alunos [] = {"Lucas","Maria","Daniel"};



        for (int x = 0; x < alunos.length; x++){

            System.out.println("O aluno no indice "+ x + " é o aluno(a): " + alunos[x]);
        }

        for (String aluno : alunos){
            System.out.println(aluno);
        }


    }

}