import java.util.Scanner;

public class validacaoSenha2 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        boolean validaMaiusculas, validaMinusculas, validaDigitos, validaEspeciais;
        int minimoMaiusculas, minimoMinusculas, minimoDigitos, minimoEspeciais;

        minimoMaiusculas = 1;
        minimoMinusculas = 1;
        minimoDigitos = 1;
        minimoEspeciais = 1;

        String mensagem = "";
        String letrasMaiusculas = "ABCDEFGHIJKLMNOPQRKSTUVXYWZ";
        int qtdeLetrasMaiusculas = 0;

        System.out.print("Digite uma senha:");
        String senha = teclado.nextLine();

        // para cada letra da senha verificar se existe na lista de letras maiusculas
        for (int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++) { // iteracao com a senha
            // para o caractere da senha selecionado pelo primeiro for
            // verifica se o caractere e igual a algum caractere presente na lista de
            // letras maiusculas
            for (int indiceLista = 0; indiceLista < letrasMaiusculas.length(); indiceLista++) { // iteracao com as
                                                                                                // letras maiusculas
                // se o caractere da senha estiver na lista de maiusculas
                // contabiliza um caractere minusculo presente na senha
                if (senha.charAt(indiceSenha) == letrasMaiusculas.charAt(indiceLista))
                    qtdeLetrasMaiusculas++;
            }

        }

        // se a quantidade de letras maiusculas descobertas
        // atender o criterio minimo, retorna verdadeiro
        if (qtdeLetrasMaiusculas >= minimoMaiusculas)
            validaMaiusculas = true;
        else
            validaMaiusculas = false;

        String letrasMinusculas = "abcdefghijklmnopqrkstuvxzyw";
        int qtdeLetrasMinusculas = 0;

        // para cada letra da senha verificar se existe na lista de letras minusculas
        for (int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++) { // iteracao com a senha
            // para o caractere da senha selecionado pelo primeiro for
            // verifica se o caractere e igual a algum caractere presente na lista de
            // letras minusculas
            for (int indiceLista = 0; indiceLista < letrasMinusculas.length(); indiceLista++) { // iteracao com as letras minusculas
                // se o caractere da senha estiver na lista de minusculas
                // contabiliza um caractere minusculo presente na senha
                if (senha.charAt(indiceSenha) == letrasMinusculas.charAt(indiceLista))
                    qtdeLetrasMinusculas++;
            }

        }

        // se a quantidade de letras minusculas descobertas
        // atender o criterio minimo, retorna verdadeiro
        if (qtdeLetrasMinusculas >= minimoMinusculas)
            validaMinusculas = true;
        else
            validaMinusculas = false;

        String caracteresDigitos = "0123456789";
        int qtdeCaracteresDigitos = 0;

        // para cada letra da senha verificar se existe na lista de caracteres digitos
        for (int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++) { // iteracao com a senha
            // para o caractere da senha selecionado pelo primeiro for
            // verifica se o caractere e igual a algum caractere presente na lista de
            // caracteres digitos
            for (int indiceLista = 0; indiceLista < caracteresDigitos.length(); indiceLista++) { // iteracao com as
                                                                                                // caracteres digitos
                // se o caractere da senha estiver na lista de minusculas
                // contabiliza um caractere minusculo presente na senha
                if (senha.charAt(indiceSenha) == caracteresDigitos.charAt(indiceLista))
                    qtdeCaracteresDigitos++;
            }

        }

        // se a quantidade de caracteres digitos descobertas
        // atender o criterio minimo, retorna verdadeiro
        if (qtdeCaracteresDigitos >= minimoDigitos)
            validaDigitos = true;
        else
            validaDigitos = false;

        String caracteresEspeciais = " \'\"!@#$%¨&*()_-+=§|\\´`[{ª^~}]º,<.>;:/?°";
        int qtdeCaracteresEspeciais = 0;

        // para cada letra da senha verificar se existe na lista de caracteres especiais
        for (int indiceSenha = 0; indiceSenha < senha.length(); indiceSenha++) { // iteracao com a senha
            // para o caractere da senha selecionado pelo primeiro for
            // verifica se o caractere e igual a algum caractere presente na lista de
            // caracteres especiais
            for (int indiceLista = 0; indiceLista < caracteresEspeciais.length(); indiceLista++) { // iteracao com os caracteres especiais
                // se o caractere da senha estiver na lista de caracteres especiais
                // contabiliza um caractere especial presente na senha
                if (senha.charAt(indiceSenha) == caracteresEspeciais.charAt(indiceLista))
                    qtdeCaracteresEspeciais++;
            }

        }

        // se a quantidade de caracteres especiais descobertas
        // atender o criterio minimo, retorna verdadeiro
        if (qtdeCaracteresEspeciais >= minimoEspeciais)
            validaEspeciais = true;
        else
            validaEspeciais = false;

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

        if (validaDigitos && validaMaiusculas && validaMinusculas) {
            mensagem = ("Senha aceita.");
        }

        System.out.println(mensagem);
    }
}
