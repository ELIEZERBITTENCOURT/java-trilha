import java.util.Scanner;

public class PlanoOperadoraCompleto {
    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        //Itera sobre os serviços contratados
        for (String servico : servicosContratados) {
            // Utilizei equalsIgnoreCase() para comparar os serviços, ignorando diferenças
            // entre maiúsculas e minúsculas.
            if (servico.equalsIgnoreCase("movel")) {
                movelContratado = true;
            } else if (servico.equalsIgnoreCase("banda larga")) {
                bandaLargaContratada = true;
            } else if (servico.equalsIgnoreCase("tv")) {
                tvContratada = true;
            }
        }

        //Verifica se todos os serviços foram contratados
        if (movelContratado && bandaLargaContratada && tvContratada) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Converte a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verifica se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibi o resultado
        System.out.println(resultado);

        // Fecha o scanner
        scanner.close();
    }
}
