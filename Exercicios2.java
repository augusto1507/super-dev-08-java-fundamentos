import javax.swing.JOptionPane;

public class Exercicios2 {
    public void executar() {
        exemplo15();
    }

    private void exemplo01() {
        System.out.println("Parque: Beto carreiro");
        System.out.println("Atração: FireWhipe");
        System.out.println("Idade minima: 12 anos");
        System.out.println("Soma: " + (2 + 2));
        System.out.println("Divisão: " + (2 / 2));
        System.out.println("Resto da divisão: " + (2 % 2));

    }

    /*
     * 2. Criar uma classe chamada Exercicio02.
     * Criar o método main.
     * 
     * O que deve ser feito:
     * - Criar uma variável String para armazenar o título de um livro.
     * - Criar uma variável String para armazenar o nome do autor.
     * - Criar uma variável int para armazenar a quantidade de páginas.
     * - Criar uma variável double para armazenar a avaliação do livro.
     * - Criar uma variável boolean para informar se o livro já foi lido.
     * - Criar uma variável char para armazenar a classificação do livro.
     * - Apresentar todas as informações no console.
     */

    private void exemplo02() {
        String titulo = "Pequeno principe";
        String autor = "Carinha la (n sei o nome)";
        int paginas = 300;
        double avaliacao = 4.8;
        boolean lido = true;
        char classificacao = 6;

        System.out.print("Titulo: " + titulo +
                "\nAutor: " + autor +
                "\nPáginas: " + paginas +
                "\nAvaliação: " + avaliacao +
                "\nFoi lido? " + lido +
                "\nClassificação: " + classificacao);
    }

    private void exemplo03() {
        /*
         * 3. Criar uma classe chamada Exercicio03.
         * Criar o método main.
         * 
         * O que deve ser feito:
         * - Criar uma variável String para o nome de um evento.
         * - Criar uma variável int para a quantidade de ingressos disponíveis.
         * - Criar uma variável int para a quantidade de ingressos vendidos.
         * - Calcular quantos ingressos ainda restam.
         * - Apresentar no console:
         * a) nome do evento
         * b) quantidade disponível inicialmente
         * c) quantidade vendida
         * d) quantidade restante
         */

        String nome = "oktoberfest";
        int disponiveis = 2000;
        int vendidos = 1653;
        int restantes = disponiveis - vendidos;
        System.out.print("Evento: " + nome +
                "\nIngressos disponiveis: " + disponiveis +
                "\nIngressos vendidos: " + vendidos +
                "\nIngressos restatntes: " + restantes);
    }

    private void exemplo04() {
        /*
         * O que deve ser feito:
         * - Solicitar com JOptionPane o nome de um aluno.
         * - Solicitar com JOptionPane o nome de um livro emprestado.
         * - Solicitar com JOptionPane a quantidade de dias que o livro ficará
         * emprestado.
         * - Converter a quantidade de dias para int.
         * - Calcular a data aproximada de devolução considerando apenas a quantidade de
         * dias informada.
         * - Apresentar em uma mensagem:
         * a) nome do aluno
         * b) nome do livro
         * c) quantidade de dias de empréstimo
         * d) mensagem informando que o empréstimo foi registrado
         */

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        String livro = JOptionPane.showInputDialog("Digite o nome do livro");
        int diasEmprestimo = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias do emprestimo"));
        JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome +
                "\nLivro: " + livro +
                "\nQuantidade de dias do emprestimo: " + diasEmprestimo +
                "\nEmprestimo registrado");

    }

    private void exemplo05() {
        /*
         * O que deve ser feito:
         * - Solicitar o nome de uma criança.
         * - Solicitar a idade da criança.
         * - Converter a idade para int.
         * - Verificar se a criança pode entrar em um brinquedo.
         * - A criança só pode entrar se tiver 10 anos ou mais.
         * - Apresentar uma mensagem informando:
         * a) nome da criança
         * b) idade
         * c) se pode ou não entrar no brinquedo
         */

        String nome = JOptionPane.showInputDialog("Digite o nome da criança");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da criança"));
        boolean podeEntrar = false;

        if (idade >= 10) {
            podeEntrar = true;
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                "\nIdade: " + idade +
                "\nPode ir no brinquedo: " + podeEntrar);
    }

    private void exemplo06() {
        /*
         * O que deve ser feito:
         * - Solicitar o nome de um morador.
         * - Solicitar a quantidade de energia consumida em kWh.
         * - Converter o consumo para double.
         * - Se o consumo for até 100 kWh, classificar como "baixo consumo".
         * - Se o consumo for acima de 100 e até 300 kWh, classificar como
         * "consumo médio".
         * - Se o consumo for acima de 300 kWh, classificar como "alto consumo".
         * - Apresentar:
         * a) nome do morador
         * b) consumo informado
         * c) classificação do consumo
         */

        String nome = JOptionPane.showInputDialog("Digite o nome do morador");
        double consumo = Double.parseDouble(JOptionPane.showInputDialog("Digite o consumo em kWh"));
        String classificacao = "";
        if (consumo < 100) {
            classificacao = "Baixo";
        } else if (consumo < 300) {
            classificacao = "Médio";
        } else {
            classificacao = "Alto";
        }

        JOptionPane.showMessageDialog(null, "Morador: " + nome +
                "\nConsumo: " + consumo +
                "\nClassificação de consumo: " + classificacao);
    }

    private void exemplo07() {
        /*
         * O que deve ser feito:
         * - Solicitar o nome de um visitante.
         * - Solicitar uma opção de setor do museu:
         * 1 - História
         * 2 - Tecnologia
         * 3 - Arte
         * 4 - Ciências
         * - Utilizar switch para escolher o setor.
         * - Apresentar uma mensagem informando qual setor o visitante escolheu.
         * - Caso a opção seja inválida, apresentar mensagem de erro.
         */

        String nome = JOptionPane.showInputDialog("Digite o nome do visitante");
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                     1 - História
                     2 - Tecnologia
                     3 - Arte
                     4 - Ciências
                """));

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Nome do vistante: " + nome +
                        "\nSetor escolhido: História");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "Nome do vistante: " + nome +
                        "\nSetor escolhido: Tecnologia");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "Nome do vistante: " + nome +
                        "\nSetor escolhido: Arte");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "Nome do vistante: " + nome +
                        "\nSetor escolhido: Ciências");
                break;

            default:
                JOptionPane.showMessageDialog(null, "opção invalida");
        }

    }

    private void exemplo08() {
        /*
         * O que deve ser feito:
         * - Solicitar um nome de usuário para cadastro.
         * - Remover os espaços do começo e do fim.
         * - Verificar se o nome de usuário possui pelo menos 6 caracteres.
         * - Verificar se o nome de usuário possui espaço no meio.
         * - Apresentar:
         * a) usuário original digitado
         * b) usuário tratado
         * c) quantidade de caracteres
         * d) se o usuário é válido ou inválido
         */

        String nome = JOptionPane.showInputDialog("Digite o nome de usuário");
        String nomeTratado = nome.trim();
        int caracteres = nomeTratado.length();
        boolean temEspaco;

        if (nomeTratado.contains(" ")) {
            temEspaco = true;
        } else {
            temEspaco = false;
        }

        boolean usuarioValido;

        if (caracteres >= 6 && temEspaco == false) {
            usuarioValido = true;
        } else {
            usuarioValido = false;
        }

        JOptionPane.showMessageDialog(null, "Usuário original: " + nome +
                "\nUsuário tratado: " + nomeTratado +
                "\nQuantidade de carcteres: " + caracteres +
                "\nUsuário está valido: " + usuarioValido);

    }

    private void exemplo09() {
        /*
         * O que deve ser feito:
         * - Solicitar um código de cupom.
         * - Verificar se o cupom começa com "PROMO".
         * - Verificar se o cupom contém a palavra "VIP".
         * - Verificar se o cupom termina com "2026".
         * - Apresentar uma mensagem dizendo se o cupom parece promocional ou não.
         * - A comparação deve ignorar letras maiúsculas e minúsculas.
         */

        String cupom = JOptionPane.showInputDialog("Digite o cupom").toUpperCase().trim();
        boolean promo;
        boolean vip;
        boolean ano;

        if (cupom.startsWith("PROMO")) {
            promo = true;
        } else {
            promo = false;
        }

        if (cupom.contains("VIP")) {
            vip = true;
        } else {
            vip = false;
        }

        if (cupom.endsWith("2026")) {
            ano = true;
        } else {
            ano = false;
        }

        if (promo == true && vip == true && ano == true) {
            JOptionPane.showMessageDialog(null, "O cupom é valido");
        } else {
            JOptionPane.showMessageDialog(null, "O cupom é invalido");
        }

    }

    private void exemplo10() {
        /*
         * O que deve ser feito:
         * - Solicitar uma mensagem de atendimento.
         * - Verificar se a mensagem contém a palavra "urgente".
         * - Verificar se a mensagem contém a palavra "cancelar".
         * - Se possuir "urgente", apresentar "Atendimento prioritário".
         * - Se possuir "cancelar", apresentar "Solicitação de cancelamento".
         * - Caso não possua nenhuma das palavras, apresentar "Atendimento comum".
         * - A comparação deve ignorar maiúsculas e minúsculas.
         */

        String mensagem = JOptionPane.showInputDialog("Digite saua mensagem para o atendimento").toLowerCase();

        String situacao = "";

        if (mensagem.contains("urgente")) {
            situacao = "Prioritario";
        } else if (mensagem.contains("cancelar")) {
            situacao = "cancelado";
        } else {
            situacao = "Comun";
        }

        JOptionPane.showMessageDialog(null, "Situação do atendimento: " + situacao);

    }

    private void exemplo11() {
        /*
         * O que deve ser feito:
         * - Solicitar o nome completo de uma pessoa.
         * - Remover espaços do começo e do fim.
         * - Descobrir a posição do primeiro espaço.
         * - Separar o primeiro nome.
         * - Separar o restante do nome.
         * - Apresentar:
         * a) nome completo tratado
         * b) primeiro nome
         * c) restante do nome
         * d) quantidade total de caracteres
         */

        String nomeCompleto = JOptionPane.showInputDialog("Digite o nome completo").trim();
        int posicaoEspaco = nomeCompleto.indexOf(" ");
        String parte1 = nomeCompleto.substring(0, posicaoEspaco);
        String parte2 = nomeCompleto.substring((posicaoEspaco + 1), nomeCompleto.length());

        JOptionPane.showMessageDialog(null, "Nome completo: " + nomeCompleto +
                "\nPrimerio nome: " + parte1 +
                "\nRestante do nome: " + parte2 +
                "\nQuantidade de caracteres: " + nomeCompleto.length());
    }

    private void exemplo12() {
        String opacao = "";
        int quantidadeAlturas = 0;
        double somaAlturas = 0;
        while (!opacao.equals("não")) {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a alturae em metros"));
            somaAlturas = somaAlturas + altura;
            quantidadeAlturas = quantidadeAlturas + 1;

            opacao = JOptionPane.showInputDialog("Deseja continuar? [sim/não]");
        }

        double mediaAlturas = somaAlturas / quantidadeAlturas;
        JOptionPane.showMessageDialog(null, "Quantidade de alturas informadas: " + quantidadeAlturas +
                "\nSoma das alturas: " + somaAlturas +
                "\nMédia das alturas: " + mediaAlturas);
    }

    private void exemplo13() {
        /*
         * O que deve ser feito:
         * - Criar um while para registrar 5 corridas de aplicativo.
         * - Para cada corrida, solicitar:
         * a) nome do passageiro
         * b) distância em quilômetros
         * c) tempo em minutos
         * - Classificar a corrida como curta, média ou longa.
         * - Considerar:
         * a) curta: até 5 km
         * b) média: acima de 5 km e até 15 km
         * c) longa: acima de 15 km
         * - Contar quantas corridas longas foram registradas.
         * - Ao final, apresentar a quantidade de corridas longas.
         */

        int i = 0;
        int quantidadelongas = 0;
        while (i < 5) {
            String nome = JOptionPane.showInputDialog("Digite o nome do passageiro");
            double km = Double.parseDouble(JOptionPane.showInputDialog("Digite a distancia em km"));
            int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo da corrida em minutos"));

            if (km > 15) {
                quantidadelongas++;
            }

        }

        JOptionPane.showMessageDialog(null, "Qunatidade de corridas longas: " + quantidadelongas);
    }

    private void exemplo14() {
        /*
         * O que deve ser feito:
         * - Criar um menu com while.
         * - O menu deve ter as opções:
         * 1 - Registrar visitante
         * 2 - Mostrar total de visitantes
         * 3 - Mostrar total de visitantes menores de idade
         * 4 - Sair
         * - Enquanto o usuário não escolher a opção 4, o menu deve continuar
         * aparecendo.
         * - Quando escolher 1:
         * - solicitar o nome do visitante
         * - solicitar a idade do visitante
         * - contar mais um visitante
         * - se for menor de idade, contar também como menor de idade
         * - Quando escolher 2, mostrar o total de visitantes.
         * - Quando escolher 3, mostrar o total de visitantes menores de idade.
         * - Quando escolher 4, encerrar o sistema.
         * - Para opção inválida, mostrar mensagem de erro.
         */

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                1 - Registrar visitante
                2 - Mostrar total de visitantes
                3 - Mostrar total de visitantes menores de idade
                4 - Sair
                """));

        int totalDeVisitantes = 0;
        int totalMenoresDeIdade = 0;
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite o nome do visitante");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do visitante"));
                    totalDeVisitantes++;
                    if (idade < 18) {
                        totalMenoresDeIdade++;
                    }
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Total de visitantes: " + totalDeVisitantes);

                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "Total de menores de idade: " + totalMenoresDeIdade);

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida");

            }

            opcao = Integer.parseInt(JOptionPane.showInputDialog("""
                    1 - Registrar visitante
                    2 - Mostrar total de visitantes
                    3 - Mostrar total de visitantes menores de idade
                    4 - Sair
                    """));
        }
    }

    private void exemplo15() {
        /*
         * O que deve ser feito:
         * - Solicitar a quantidade de minutos utilizados em uma ligação.
         * - Utilizar try/catch para tratar erro de conversão.
         * - Se o número for válido, calcular o valor da ligação considerando R$ 0,75
         * por minuto.
         * - Se o valor digitado for inválido, apresentar
         * "Quantidade de minutos inválida".
         * - Ao final, apresentar "Processamento finalizado".
         */

        try {
            int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração da ligação em minutos"));
            double valor = minutos * 0.75;
            JOptionPane.showMessageDialog(null, "Valor da ligação: " + valor);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantidade de minutos invalida");
        }
    }

    private void exemplo16() {
        /*
         * O que deve ser feito:
         * - Solicitar a idade de 4 participantes.
         * - Utilizar for para repetir o cadastro.
         * - A idade deve ser maior que 0 e menor que 130.
         * - Enquanto a idade estiver inválida, pedir novamente.
         * - Utilizar try/catch para evitar erro caso o usuário digite texto.
         * - Ao final, apresentar uma mensagem informando que as idades foram
         * cadastradas.
         */

        for (int i = 0; i < 4; i++) {
            int idade = 0;

            while (idade < 0 && idade > 130) {
                try {
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Idade invalida");
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Idades cadastradas com sucesso");

    }

    private void exemplo17() {
        /*
         * O que deve ser feito:
         * - Solicitar a quantidade de alunos que participarão de uma excursão.
         * - Utilizar for para cadastrar essa quantidade.
         * - Para cada aluno, solicitar:
         * a) nome
         * b) idade
         * c) se possui autorização dos responsáveis
         * - Contar quantos alunos possuem autorização.
         * - Contar quantos alunos não possuem autorização.
         * - Ao final, apresentar:
         * a) quantidade autorizada
         * b) quantidade não autorizada
         */

        int quantidadeAlunos = Integer
                .parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos que participarão da excursão"));

        int possuiAutorizacao = 0;
        int naoPossuiAutorizacao = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno"));
            boolean autorizacao = Boolean
                    .parseBoolean(JOptionPane.showInputDialog("Possui autorização?  [true/false]"));

            if (autorizacao == true) {
                possuiAutorizacao++;
            } else {
                naoPossuiAutorizacao++;
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade de alunos que possuem autorização: " + possuiAutorizacao +
                "\nQuantidade de alunos que não possuem autorização: " + naoPossuiAutorizacao);
    }

    private void exemplo18() {
        /*
         * O que deve ser feito:
         * - Utilizar for para solicitar 6 distâncias percorridas em caminhadas.
         * - Somar todas as distâncias.
         * - Descobrir a maior distância.
         * - Descobrir a menor distância.
         * - Calcular a média das distâncias.
         * - Ao final, apresentar:
         * a) soma das distâncias
         * b) maior distância
         * c) menor distância
         * d) média das distâncias
         */

        double soma = 0;
        double maiorDistancia = 0;
        double menorDistancia = 9999999;
        for (int i = 0; i < 6; i++){
            double distancia = Double.parseDouble(JOptionPane.showInputDialog("Digite a distancia da caminhada"));

            if (distancia > maiorDistancia) {
                maiorDistancia = distancia;
            }

            if (distancia < menorDistancia) {
                menorDistancia = distancia;
            }

            soma = soma + distancia;
        }

        double media = (soma / 6);

        JOptionPane. showMessageDialog(null, "Soma das distancias: " + soma +
            "\nMaior distancia: " + maiorDistancia +
            "\nMenor distancia: " + menorDistancia +
            "\nMédia das distancias: " + media
        );
    }

}