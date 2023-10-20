import java.util.Scanner;
public class validacaoSenha {
    public static boolean verificarQtdMinusculas(String senha, int qtde){
        String letrasMinusculas = "abcdefghijklmnopqrstuvxywz";
        int qtdeLetrasMinusculas = 0;

        //para cada letra da senha verificar se existe na lista de letras minusculas
        for(int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++){ // iteracao com a senha            
            //para o caractere da senha selecionado pelo primeiro for
            //verifica se o caractere e igual a algum caractere presente na lista de 
            //letras minusculas
            for(int indiceLista = 0; indiceLista < letrasMinusculas.length(); indiceLista++){ //iteracao com as letras minusculas
                //se o caractere da senha estiver na lista de minusculas
                //contabiliza um caractere minusculo presente na senha
                if (senha.charAt(indiceSenha) == letrasMinusculas.charAt(indiceLista))
                    qtdeLetrasMinusculas++;
            }
            
        }    

        //se a quantidade de letras minusculas descobertas
        //atender o criterio minimo, retorna verdadeiro
        if (qtdeLetrasMinusculas >= qtde)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) throws Exception {
        System.out.println(verificarQtdMinusculas("ABACaTe", 2));
    } 
}
