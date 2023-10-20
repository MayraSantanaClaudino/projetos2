import java.util.Scanner;
public class validacaoSenha2 {
  
    public static boolean verificarQtdMinimaMaiusculas(String senha, int qtde){
        int qtdeListaCaracteresMaiusculas = 0;
        String listaCaracteresMaiusculas = "ABCDEFGHIJKLMNOPQRKSUVXYWZ";

        for(int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++){ 
            for(int indiceLista = 0; indiceLista < listaCaracteresMaiusculas.length(); indiceLista++){ 
                if (senha.charAt(indiceSenha) == listaCaracteresMaiusculas.charAt(indiceLista))
                    qtdeListaCaracteresMaiusculas++;
            }
        }    

        if (qtdeListaCaracteresMaiusculas >= qtde)
            return true;
        else
            return false;
    }
    
    public static boolean verificarQtdMinimaDigitos(String senha, int qtde){
        int qtdeListaCaracteresDigitos = 0;
        String listaCaracteresDigitos = "0123456789";

        for(int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++){ 
            for(int indiceLista = 0; indiceLista < listaCaracteresDigitos.length(); indiceLista++){ 
                if (senha.charAt(indiceSenha) == listaCaracteresDigitos.charAt(indiceLista))
                    qtdeListaCaracteresDigitos++;
            }
        }    

        if (qtdeListaCaracteresDigitos >= qtde)
            return true;
        else
            return false;
    }

    public static boolean verificarQtdMinimaMinusculas(String senha, int qtde){
        int qtdeListaCaracteresMinusculas = 0;
        String listaCaracteresMinusculas = "0123456789";

        for(int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++){ 
            for(int indiceLista = 0; indiceLista < listaCaracteresMinusculas.length(); indiceLista++){ 
                if (senha.charAt(indiceSenha) == listaCaracteresMinusculas.charAt(indiceLista))
                    qtdeListaCaracteresMinusculas++;
            }
        }    

        if (qtdeListaCaracteresMinusculas >= qtde)
            return true;
        else
            return false;
    }

    public static boolean verificarQtdMinimaEspeciais(String senha, int qtde){
        int qtdeListaCaracteresEspeciais = 0;
        String listaCaracteresEspeciais = " \'\"!@#$%¨&*()_-+=§|\\´`[{ª^~}]º,<.>;:/?°";

        for(int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++){ 
            for(int indiceLista = 0; indiceLista < listaCaracteresEspeciais.length(); indiceLista++){ 
                if (senha.charAt(indiceSenha) == listaCaracteresEspeciais.charAt(indiceLista))
                    qtdeListaCaracteresEspeciais++;
            }
        }    

        if (qtdeListaCaracteresEspeciais >= qtde)
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a sua senha: ");
        String senha = teclado.nextLine();
        String mensagem = "";
        
        int minimoMaiusculas, minimoMinusculas, minimoDigitos, minimoEspeciais;

        minimoMaiusculas = 1; minimoMinusculas = 1; minimoDigitos = 1; minimoEspeciais = 1;

        boolean validaMaiusculas, validaMinusculas, validaDigitos, validaEspeciais;
        
        validaMaiusculas = verificarQtdMinimaMaiusculas(senha, 2);
        validaDigitos = verificarQtdMinimaDigitos(senha, 3);
        validaMinusculas = verificarQtdMinimaMaiusculas(senha, 1);
        validaEspeciais = verificarQtdMinimaEspeciais(senha, 1);

        mensagem = "Senha não aceita. Sua senha deve contar no mínimo:";
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
