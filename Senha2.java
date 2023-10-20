import java.util.Scanner;

public class App {
  
    public static boolean verificarQtdMinima(String senha, int qtde, String listaCaracteres){
        int qtdeListaCaracteres = 0;

        for(int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++){ 
            for(int indiceLista = 0; indiceLista < listaCaracteres.length(); indiceLista++){ 
                if (senha.charAt(indiceSenha) == listaCaracteres.charAt(indiceLista))
                    qtdeListaCaracteres++;
            }
        }    

        if (qtdeListaCaracteres >= qtde)
            return true;
        else
            return false;
    }
    
    public static boolean verificarQtdMinimaDigitos(String senha, int qtde){
        boolean retorno;
        retorno = verificarQtdMinima(senha, qtde, "0123456789");
        return retorno;
    }

    public static boolean verificarQtdMinimaMaiusculas(String senha, int qtde){
        boolean retorno;
        retorno = verificarQtdMinima(senha, qtde,"ABCDEFGHIJKLMNOPQRKSUVXYWZ");
        return retorno;
    }

    public static String gerarCharRepetido(char caractere, int qtde){
        String sequencia = "";
        
        for (int i = 0; i <= qtde; i++) {
            sequencia += Character.toString(caractere);
        }
        return sequencia;

    }

    public static boolean verificarQtdMinimaMinusculas(String senha, int qtde){
        boolean retorno;
        retorno = verificarQtdMinima(senha, qtde,"abcdefghijklmnopqrstuvxyzw");
        return retorno;
    }

    public static boolean verificarQtdeMaximaRepeticao(String senha, int maxRepSequecial){
        for (int i = 32; i <= 126; i++) {
            String aux = "";
            aux = gerarCharRepetido((char) i, maxRepSequecial);
            if (senha.contains(aux)) {
                return false;
            }
        }
        return true;
    }

    public static boolean verificarQtdMinimaEspeciais(String senha, int qtde){
        boolean retorno;
        retorno = verificarQtdMinima(senha, qtde," \'\"!@#$%¨&*()_-+=§|\\´`[{ª^~}]º,<.>;:/?°");
        return retorno;
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int minimoMaiusculas, minimoMinusculas, minimoDigitos, minimoEspeciais;
        int maxRepSequecial;
        boolean validaMaiusculas, validaMinusculas, validaDigitos, validaEspeciais;
        boolean validaCharRepetido;
        
        minimoMaiusculas = 1;
        minimoMinusculas = 1;
        minimoDigitos = 1;
        minimoEspeciais = 1;
        maxRepSequecial = 3; 

        String mensagem = "";

        System.out.print("Digite a sua senha: ");
        String senha = teclado.nextLine();
        
        validaMaiusculas = verificarQtdMinimaMaiusculas(senha, minimoMaiusculas);
        validaDigitos = verificarQtdMinimaDigitos(senha, minimoDigitos);
        validaMinusculas = verificarQtdMinimaMinusculas(senha, minimoMinusculas);
        validaEspeciais = verificarQtdMinimaEspeciais(senha, minimoEspeciais);
        validaCharRepetido = verificarQtdeMaximaRepeticao(senha, maxRepSequecial);

        
        
        mensagem = "Senha não aceita. Sua senha deve contar no mínimo:";

        if (!validaCharRepetido) {
            mensagem += "\n- A senha nao pode ter mais de " + maxRepSequecial  + " caracteres repetidos.";
        }

        if (!validaMaiusculas) {
            mensagem += "\n- " + minimoMaiusculas + " caractere(s) maiúsculo(s).";
        }

        if (!validaMinusculas) {
            mensagem += ("\n- " + minimoMinusculas + " caractere(s) minúsculo(s).");
        }

        if (validaEspeciais == false) {
            mensagem += "\n- " + minimoEspeciais + " caractere(s) especial(ais).";
        }

        if (validaDigitos == false) {
            mensagem += "\n- " + minimoDigitos + " dígito(s).";
        }

        if (validaDigitos && validaMaiusculas && validaMinusculas && validaEspeciais) {
            mensagem = ("Senha aceita.");
        }

        System.out.println(mensagem);
        
    } 
}
