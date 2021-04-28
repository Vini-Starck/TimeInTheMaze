package time_in_the_maze;

import java.util.Scanner;
import java.util.Random;

public class TIME_IN_THE_MAZE {
    static int hp;
    static Scanner leitor = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {
        Intro();
        Iniciar();
    }

    public static void mapa(){
        
        
        
        System.out.println("\nMAPA:\n\n"
                         + " ___________________________________________             \n"
                         + "|                                           |            \n"
                         + "|          [PORTÕES DA ABERTURA]  / 3 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|           [PORTÕES DA ENERGIA]  / 3 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|            [PORTÕES DA VIDA]    / 3 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|         [PORTÕES DO FERIMENTO]  / 3 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|          [PORTÕES DA FLORESTA]  / 3 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|            [PORTÕES DA VISÃO]   / 3 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|         [PORTÕES DA INSANIDADE] / 3 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|           [PORTÕES DA MORTE]    / 2 vidas |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|                   ||                      |            \n"
                         + "|              [FASE FINAL]       / 1 vida  |            \n"
                         + "|___________________________________________|          \n\n");
    }
    
    public static void portas() {

        System.out.println(" ______________  " + "  ______________  " + "  ______________ \n"
                         + "|              | " + " |              | " + " |              |\n"
                         + "|      1       | " + " |      2       | " + " |      3       |\n"
                         + "|              | " + " |              | " + " |              |\n"
                         + "|              | " + " |              | " + " |              |\n"
                         + "| O            | " + " | O            | " + " | O            |\n"
                         + "|              | " + " |              | " + " |              |\n"
                         + "|              | " + " |              | " + " |              |\n"
                         + "|              | " + " |              | " + " |              |\n"
                         + "|______________| " + " |______________| " + " |______________|\n");

    }

    public static void Intro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("             ========[ TIME IN THE MAZE ]========\n\n");
        System.out.println("                  Bem vindo ao labirinto!\n");
        System.out.println("Olá sou JEFF, seu guia durante essa aventura, antes de começarmos darei uma breve introdução "
                + "sobre a sua jornada.");
        System.out.println("\nVocê será um aventureiro, que no ano de 1987, ficou preso em um labirinto"
                + "\nmisterioso, onde o tempo passa de forma diferente da realidade conhecida, um minuto"
                + "\naqui são dias na vida real. Seu objetivo é encontrar a saída deste lugar"
                + "\nbizarro e livrar o aventureiro desta maldição!\n\nLembrando que em cada fase você terá "
                + "3 vidas, ou seja, 3 chances, use-as com sabedoria");

        System.out.println("Digite [ENTER] para iniciar...");
        sc.nextLine();
    }

    public static void Iniciar() {
        System.out.println("ESTE É O MAPA DO LABIRINTO:");
        mapa();

        do {
            System.out.println("Digite o [NOME] do aventureiro:");
            nome = leitor.nextLine();
        } while (nome.isEmpty());

        System.out.println("\nBem vindo, " + nome);
        System.out.println("\nIniciando...");
        Fase1();
    }

    public static void Fase1() {
        
        mapa();
        System.out.println("\n" + nome + ", você chegou ao nível 1!\n"
                + "\n      [PORTÕES DA ABERTURA]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 3;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();

        }
        if (op == 1) {
            System.out.println("\n     Vamos cohecer um pouco das crenças egípicias? .....\n"
                    + "|-------------------------------------------------------------------------------------|"
                    + "\n As crenças egípcias giravam em torno da adoração de vários deuses, o politeísmo, "
                    + "\n e a crença em deuses com forma humana e animal, o antropozoomorfismo. Muitos     "
                    + "\n deles eram associados a determinadas forças da natureza.                  "
                    + "\n|-------------------------------------------------------------------------------------|");

            System.out.println("\nCordenadas: [29°58’42.5″N 31°08’01.3″E]\nDesvende os maiores monumentos egícios");
            System.out.println("\nRESOLVA O ENIGMA:  (ignore carateres especiais e acentuação)");
            String resp1 = leitor.nextLine().toUpperCase();
            resp1 = resp1.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp1 = leitor.nextLine();
                resp1 = resp1.toUpperCase();
                resp1 = resp1.replaceAll(" ", "");
            } while (resp1.isEmpty());

            while (!resp1.equals("ESFINGE".toUpperCase())) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp1.equals("PIRAMIDES")
                        || resp1.equals("EGITO")
                        || resp1.equals("PIRAMIDE")
                        || resp1.equals("FARAO")) {
                    System.out.println("Quase lá...irei ajuda-ló\n\nA Arte Egípcia sempre manteve uma estreita ligação com a religiosidade. "
                            + "\nToda forma artística ali desenvolvida foi em função dos deuses e à serviço dos faraós. "
                            + "\nDesta forma, esculturas, pinturas, monumentos e arquitetura, "
                            + "\nde certa forma estavam relacionados às suas crenças religiosas.");
                } else if (resp1.equals("OSIRIS") || resp1.equals("RA")
                        || resp1.equals("HORUS") || resp1.equals("ISIS")) {

                    System.out.println("Por séculos os egípcios criavam momunentos como forma de adoração aos seus deuses");
                } else {
                    System.out.println("\nRepresenta uma criatura mitológica com corpo de leão");
                }
                System.out.println("\nTente novamente...");
                resp1 = leitor.nextLine().toUpperCase();
            }

            if (resp1.equals("ESFINGE")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase2();
            }
        }
        if (op == 2) {
            System.out.println("\n      Vamos cohecer um pouco sobre a 1º guerra mundial?....\n"
                    + "|-------------------------------------------------------------------------------------------------|"
                    + "\n A Primeira Guerra Mundial foi uma guerra global centrada na Europa, "
                    + "\n que começou em 28 de julho de 1914 e durou até 11 de novembro de 1918. "
                    + "\n O conflito envolveu as grandes potências de todo o mundo, que se organizaram "
                    + "\n em duas alianças opostas: os aliados e os Impérios Centrais, a Alemanha e a Áustria-Hungria"
                    + "\n|------------------------------------------------------------------------------------------------|");

            System.out.println("\nCodígo: [11100/110/1110011101111111]\n\nRESOLVA O ENIGMA: (escreva por extenso)");
            String resp2 = leitor.nextLine();
            resp2 = resp2.toUpperCase();
            resp2 = resp2.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp2 = leitor.nextLine();
                resp2 = resp2.toUpperCase();
                resp2 = resp2.replaceAll(" ", "");
            } while (resp2.isEmpty());

            while (!resp2.equals("OSCATORZEPONTOSDEWILSON") && !resp2.equals("OSQUATORZEPONTOSDEWILSON")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp2.equals("TRATADODEVERSALHES")) {

                    System.out.println("\nQuase lá,vou ajuda-ló...\n\nO Tratado de Versalhes foi assinado no dia 28 de junho de 1919 e ficou conhecido"
                            + "\npor ser o principal dos tratados de paz assinados após a Primeira Guerra Mundial. "
                            + "\nEsse documento foi subscrito pelas potências que formavam a Tríplice Entente e pela Alemanha,"
                            + "\num dos grandes resposaveis por esse tratado foi Woodrow Wilson presidente dos EUA ");
                } else {
                    System.out.println("Está perto..,Lembrando que em 1918 Woodrow Wilson presidente dos EUA apresentou uma programa,"
                            + "\nque constituíam um plano para a paz mundial, ser tidos em conta nas negociações da paz"
                            + "\napós a Primeira Guerra Mundial.");
                }
                System.out.println("\nTente novamente...");
                resp2 = leitor.nextLine().toUpperCase();
                resp2 = resp2.replace(" ", "");
            }

            if (resp2.equals("OSCATORZEPONTOSDEWILSON") || resp2.equals("OSQUATORZEPONTOSDEWILSON")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase2();
            }

        }
        if (op == 3) {
            System.out.println("\n    Vamos falar um pouco de Filosófia?....\n"
                    + "|---------------------------------------------------------------------------------------------------|"
                    + "\nFilosofia é o estudo de questões gerais e fundamentais sobre a existência, conhecimento, valores, "
                    + "\nrazão, mente, e linguagem; frequentemente colocadas como problemas a se resolver. "
                    + "\n|---------------------------------------------------------------------------------------------------|");

            System.out.println("\n==='O que caracteriza o comunismo não é a abolição da propriedade em geral, "
                    + "mas a abolição da propriedade burguesa'===\n\nRESOLVA O ENIGMA:");
            String resp3 = leitor.nextLine();
            resp3 = resp3.toUpperCase();
            resp3 = resp3.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp3 = leitor.nextLine();
                resp3 = resp3.toUpperCase();
                resp3 = resp3.replaceAll(" ", "");
            } while (resp3.isEmpty());

            while (!resp3.equals("MANIFESTOCOMUNISTA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp3.equals("KARLMARX")) {

                    System.out.println("\nQuase lá, As concepções e os ideais comunistas formulados por Karl Marx representam, sem dúvida, "
                            + "\no ponto culminante da mais contundente crítica da sociedade burguesa e do modo de produção capitalista, "
                            + "\nele criou algumas obras que transmitiram esses pensamentos ");
                } else {
                    System.out.println("\nEstá perto, a parceria entre karl marx e friedrich engels,foi responsável por diversas obras literarias de sucesso");
                }
                System.out.println("\nTente novamente...");
                resp3 = leitor.nextLine().toUpperCase();
                resp3 = resp3.replace(" ", "");
            }

            if (resp3.equals("MANIFESTOCOMUNISTA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase2();
            }
        }
    }

    public static void Fase2() {
        mapa();
        System.out.println("\n" + nome + ", você chegou ao nível 2!\n"
                + "\n       [PORTÕES DA ENERGIA]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 3;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();

        }
        if (op == 1) {
            System.out.println("\n    Vamos falar um pouco de Fisíca?....\n"
                    + "|---------------------------------------------------------------------------------------------------|"
                    + "\n Física é uma ciência voltada ao estudo dos fenômenos naturais, baseando-se em teorias "
                    + "\n e por meio da observação e experimentação.  "
                    + "\n|---------------------------------------------------------------------------------------------------|");

            System.out.println("\n===Todo corpo continua em seu estado de repouso ou de movimento uniforme "
                    + "em uma linha reta, a menos que seja forçado a mudar aquele estado por forças aplicadas "
                    + "sobre ele.===\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp4 = leitor.nextLine();
            resp4 = resp4.toUpperCase();
            resp4 = resp4.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp4 = leitor.nextLine();
                resp4 = resp4.toUpperCase();
                resp4 = resp4.replaceAll(" ", "");
            } while (resp4.isEmpty());

            while (!resp4.equals("ISAACNEWTON")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp4.equals("LEISDENEWTON")) {
                    System.out.println("\nQuase lá, Leis publicadas em 1687, em um trabalho intitulado de três volumes.");
                } else {
                    System.out.println("\nEstá perto, A mudança de movimento é proporcional à força motora imprimida e é produzida "
                            + "\nna direção de linha reta na qual aquela força é aplicada.");
                }
                System.out.println("\nTente novamente...");
                resp4 = leitor.nextLine().toUpperCase();
                resp4 = resp4.replace(" ", "");
            }

            if (resp4.equals("ISAACNEWTON")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase3();
            }

        }
        if (op == 2) {
            System.out.println("\n|-----------------------------------------------|\n"
                    + "  Foi o autor da descoberta dos efeitos elétricos \n"
                    + "  produzidos pelo magnetismo. Com a indução de eletromagnética..\n"
                    + "|----------------------------------------------------------------|\n\nRESOLVA O ENIGMA:(Ignore caracteres especiais)");
            String resp5 = leitor.nextLine();
            resp5 = resp5.toUpperCase();
            resp5 = resp5.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp5 = leitor.nextLine();
                resp5 = resp5.toUpperCase();
                resp5 = resp5.replaceAll(" ", "");
            } while (resp5.isEmpty());

            while (!resp5.equals("MICHAELFARADAY")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp5.equals("ELETROMAGNETISMO")) {
                    System.out.println("\nQuasé lá, Lei da indução");
                } else {
                    System.out.println("\n[Está perto, A intensidade da força eletromotriz induzida (ε) "
                            + "\né igual a variação do fluxo magnético no interior da espira."
                            + "\nEsta é uma das quatro equações de Maxwell para o Eletromagnetismo]");
                }
                System.out.println("\nTente novamente...");
                resp5 = leitor.nextLine().toUpperCase();
                resp5 = resp5.replace(" ", "");
            }

            if (resp5.equals("MICHAELFARADAY")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase3();
            }

        }
        if (op == 3) {
            System.out.println("\n|-----------------------------------------------|\n"
                    + "Numa época em que a ciência era dominada pelos homens,sua maior contribuição "
                    + "\npara a ciência foi a descoberta da radioatividade e de novos elementos químicos.\n"
                    + "|-----------------------------------------------|\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp6 = leitor.nextLine();
            resp6 = resp6.toUpperCase();
            resp6 = resp6.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp6 = leitor.nextLine();
                resp6 = resp6.toUpperCase();
                resp6 = resp6.replaceAll(" ", "");
            } while (resp6.isEmpty());

            while (!resp6.equals("MARIECURIE")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp6.equals("POLONIO")) {
                    System.out.println("\nQuase lá, As suas pesquisas resultaram na descoberta de dois novos elementos químicos: "
                            + "\no polônio, que ganhou este nome em homenagem ao país natal dela, e o rádio");
                } else {
                    System.out.println("\nEstá perto, Fez uma verdadeira revolução no meio científico e na "
                            + "\nprópria história ao ser a primeira mulher do mundo a ganhar um Prêmio Nobel.");
                }
                System.out.println("\nTente novamente...");
                resp6 = leitor.nextLine().toUpperCase();
                resp6 = resp6.replace(" ", "");
            }

            if (resp6.equals("MARIECURIE")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase3();
            }
        }
    }

    public static void Fase3() {
        mapa();
        System.out.println("\n" + nome + ", você chegou ao nível 3!\n"
                + "\n        [PORTÕES DA VIDA]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 3;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();

        }
        if (op == 1) {
            System.out.println("\n    Vamos falar um pouco de Biologia?....\n"
                    + "|---------------------------------------------------------------------------------------------------|"
                    + "\nBiologia é a ciência que estuda a vida e os organismos vivos. "
                    + "\nA biologia está dividida em vários campos especializados que "
                    + "\nabrangem a morfologia, fisiologia, anatomia, comportamento, "
                    + "\norigem, evolução e distribuição da matéria viva"
                    + "\n|---------------------------------------------------------------------------------------------------|");

            System.out.println("\n[Molécula presente no nucléo das células de todos so seres vivos]\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp7 = leitor.nextLine();
            resp7 = resp7.toUpperCase();
            resp7 = resp7.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp7 = leitor.nextLine();
                resp7 = resp7.toUpperCase();
                resp7 = resp7.replaceAll(" ", "");
            } while (resp7.isEmpty());

            while (!resp7.equals("DNA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp7.equals("GENETICA")) {
                    System.out.println("\n[Carrega toda informação genética de um organismo]");
                } else {
                    System.out.println("\n[É formado por uma fita dupla em forma de espiral (dupla hélice), composta por nucleotídeos.]");
                }
                System.out.println("\nTente novamente...");
                resp7 = leitor.nextLine().toUpperCase();
                resp7 = resp7.replace(" ", "");
            }

            if (resp7.equals("DNA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase4();
            }

        }
        if (op == 2) {
            System.out.println("\n|---------------------------------------------------------------------------------------------------|\n"
                    + " Essa teoria  diz que a vida teve origem em outro planeta e foi trazida para o planeta Terra "
                    + "\ncarregada por meteoros que trazia formas de vida bastante simples. "
                    + "\n|----------------------------------------------------------------------------------------------|"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais) ");

            String resp8 = leitor.nextLine();
            resp8 = resp8.toUpperCase();
            resp8 = resp8.replaceAll(" ", "");
            

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp8 = leitor.nextLine();
                resp8 = resp8.toUpperCase();
                resp8 = resp8.replaceAll(" ", "");
            } while (resp8.isEmpty());
            
             System.out.println(resp8);

            while(!resp8.equals("PANSPERMIA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp8.equals("BIGBANG") || resp8.equals("CRIACIONISMO")) {

                    System.out.println("\n[Quasé la, A primeira menção conhecida da teoria foi feita "
                            + "pelo filósofo grego Anaxágoras (500 a.C – 428 a.C).]");
                } else {
                    System.out.println("\n[Essa teoria possui outras vertentes,mais os conceitos estão estritamente relacionados]");
                }
                System.out.println("\nTente novamente...");
                resp8 = leitor.nextLine().toUpperCase();
                resp8 = resp8.replace(" ", "");
            }

            if (resp8.equals("PANSPERMIA") || resp8.equals("COSMOGENIA") || resp8.equals("PANSPERMIACOSMICA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase4();
            }

        }
        if (op == 3) {
            System.out.println("\n|---------------------------------------------------------------------------------------------------|"
                    + "\nFoi anunciada em 1948 uma teoria pelo cientista russo naturalizado estadunidense, "
                    + "\nque se apoia na teoria da relatividade do físico Albert Einstein e nos estudos dos astrônomos "
                    + "\nEdwin Hubble e Milton Humason, nos quais demonstraram que o universo não é estático e se encontra "
                    + "\nem constante expansão, ou seja, as galáxias estão se afastando umas das outras. "
                    + "\nPortanto, no passado elas deveriam estar mais próximas que hoje, e, até mesmo, formando um único"
                    + "\nponto\n|---------------------------------------------------------------------------------------------------|"
                    + "\n\nRESOLVA O ENIGMA:");
            String resp9 = leitor.nextLine();
            resp9 = resp9.toUpperCase();
            resp9 = resp9.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp9 = leitor.nextLine();
                resp9 = resp9.toUpperCase();
                resp9 = resp9.replaceAll(" ", "");
            } while (resp9.isEmpty());

            while (!resp9.equals("BIGBANG")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp9.equals("GEORGEGAMOW") || !resp9.equals("PANSPERMIA")
                        || !resp9.equals("CRIACINI0SMO")) {

                    System.out.println("\n[O universo teria surgido após uma grande explosão cósmica, "
                            + "\nentre aproximadamente 10 a 20 bilhões de anos atrás.]");
                } else {
                    System.out.println("\nDICA: explosão");
                }
                System.out.println("\nTente novamente...");
                resp9 = leitor.nextLine().toUpperCase();
                resp9 = resp9.replace(" ", "");
            }

            if (resp9.equals("BIGBANG")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase4();
            }
        }
    }

    public static void Fase4() {
        mapa();
        System.out.println("\n" + nome + ", você chegou ao nível 4!\n"
                + "\n     [PORTÕES DO FERIMENTO]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 3;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();

        }
        if (op == 1) {
            System.out.println("\n    Vamos falar um pouco de Pandemias?....\n"
                    + "|---------------------------------------------------------------------------------------------------|"
                    + "\nDoenças e enfermidades têm atormentado a humanidade desde o inicio dos tempos. "
                    + "\nNo entanto, não foi durante a mudança para as comunidades agrárias que a escala e a "
                    + "\ndisseminação dessas doenças aumentou consideravelmente"
                    + "\nO comércio generalizado criou novas oportunidades para interações humanas e animais"
                    + "\nque aceleraram essas epidemias."
                    + "\nMalária, tuberculose, hanseníase, gripe, varíola e outras apareceram pela "
                    + "\nprimeira vez durante esses primeiros anos."
                    + "\nQuanto mais humanos civilizados o homem se tornou - com cidades maiores, rotas comerciais mais"
                    + "\nexóticas e maior contato com diferentes populações de pessoas, animais e"
                    + "\necossistemas -, mais pandemias ocorreram."
                    + "\n|---------------------------------------------------------------------------------------------------|");

            System.out.println("\nA palavra chave irá fazer você você desvendar esse enigma,Vamos fazer cálculos?"
                    + "\nRaiz de 625 = \n Raiz de 64 = \n Raiz  de 36 \n Raiz de 1"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp10 = leitor.nextLine();
            resp10 = resp10.toUpperCase();
            resp10 = resp10.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp10 = leitor.nextLine();
                resp10 = resp10.toUpperCase();
                resp10 = resp10.replaceAll(" ", "");
            } while (resp10.isEmpty());

            while (!resp10.equals("CORONAVIRUS") && !resp10.equals("COVID19")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp10.equals("PANDEMIA") || resp10.equals("CORONA") || resp10.equals("MORCEGO") || resp10.equals("CHINA")) {

                    System.out.println("\n[Entre o grupo de risco estão idosos e portadores de doenças cardiovasculares]");
                } else {
                    System.out.println("\n[As primeiras infecções dectadas em humanos foram em Wuhan - CHINA]");
                }
                System.out.println("\nTente novamente...");
                resp10 = leitor.nextLine().toUpperCase();
                resp10 = resp10.replace(" ", "");
            }

            if (resp10.equals("CORONAVIRUS") || resp10.equals("COVID19")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase5();
            }

        }
        if (op == 2) {
            System.out.println("|---------------------------------------------------------------------------------------------------|"
                    + "\nDurante esse periodo na europa medieval os jedeus foram perseguidos,"
                    + "\n e culpados por essa calamidade\n"
                    + "|---------------------------------------------------------------------------------------------------|"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp11 = leitor.nextLine();
            resp11 = resp11.toUpperCase();
            resp11 = resp11.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp11 = leitor.nextLine();
                resp11 = resp11.toUpperCase();
                resp11 = resp11.replaceAll(" ", "");
            } while (resp11.isEmpty());

            while (!resp11.equals("PESTENEGRA") && !resp11.equals("PESTEBUBONICA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp11.equals("PRAGA") || resp11.equals("CHAGAS") || resp11.equals("LEPRA") || resp11.equals("MORTENEGRA")
                        || resp11.equals("2GUERRAMUNDIAL") || resp11.equals("HITLER") || resp11.equals("ANTISSEMITISSMO")) {

                    System.out.println("\n[Essa pandemia que ocorreu na segunda metade do século XIV, "
                            + "deu-se origem no continente asiático.]");
                } else {
                    System.out.println("\n[Calcula-se aproximadamente que cerca de um terço da "
                            + "população europeia faleceu, por causa desta pandemia. ]");
                }
                System.out.println("\nTente novamente...");
                resp11 = leitor.nextLine().toUpperCase();
                resp11 = resp11.replace(" ", "");
            }

            if (resp11.equals("PESTENEGRA") || resp11.equals("PESTEBUBONICA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase5();
            }

        }
        if (op == 3) {
            System.out.println("\nHistoriadores acreditam que chegou ao Brasil em setembro de 1918"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp12 = leitor.nextLine();
            resp12 = resp12.toUpperCase();
            resp12 = resp12.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp12 = leitor.nextLine();
                resp12 = resp12.toUpperCase();
                resp12 = resp12.replaceAll(" ", "");
            } while (resp12.isEmpty());

            while (!resp12.equals("GRIPEESPANHOLA") && !resp12.equals("INFLUENZA") && !resp12.equals("AGRANDEGRIPE")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp12.equals("GRIPE") || resp12.equals("H1N1") || resp12.equals("CORONAVIRUS")
                        || resp12.equals("COVID19")) {

                    System.out.println("\n[Espalhou-se pelo mundo, principalmente, por conta da movimentação de tropas "
                            + "\nno período da Primeira Guerra Mundial, tendo um impacto direto nos países que participavam "
                            + "\ndesse conflito]");
                } else {
                    System.out.println("A Gripe que fez mais vitimas do que a 1º Guerra Mundial. As suposições de mortes "
                            + "feitas chegam a mais de 40 milhões de pessoas.");
                }
                System.out.println("\nTente novamente...");
                resp12 = leitor.nextLine().toUpperCase();
                resp12 = resp12.replace(" ", "");
            }

            if (resp12.equals("GRIPEESPANHOLA") || resp12.equals("INFLUENZA") || resp12.equals("AGRANDEGRIPE")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase5();
            }
        }
    }

    public static void Fase5() {
        mapa();
        System.out.println("\n    Vamos falar um pouco das Florestas?....\n"
                + "|---------------------------------------------------------------------------------------------------|"
                + "\nFloresta é o nome que se dá a uma área extensa repleta de árvores. "
                + "\nHá florestas em quase todas as partes do mundo. "
                + "\nOs únicos lugares em que não existem florestas são os desertos, algumas "
                + "\npradarias e certos picos de montanhas, além dos polos Norte e Sul."
                + "\n|---------------------------------------------------------------------------------------------------|");

        System.out.println("\n" + nome + ", você chegou ao nível 5!\n"
                + "\n     [PORTÕES DA FLORESTA]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 3;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();

        }
        if (op == 1) {
            System.out.println("\nDurante o perído pré colonial no Brasil,uma mercadoria muuito importante foi a primeira atividade econômica "
                    + "exercida pelos portugueses na América Portuguesa"
                    + " \n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp13 = leitor.nextLine();
            resp13 = resp13.toUpperCase();
            resp13 = resp13.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp13 = leitor.nextLine();
                resp13 = resp13.toUpperCase();
                resp13 = resp13.replaceAll(" ", "");
            } while (resp13.isEmpty());

            while (!resp13.equals("PAUBRASIL")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp13.equals("CAFE") || resp13.equals("SOJA") || resp13.equals("OURO")
                        || resp13.equals("CANADEÇUCAR") || resp13.equals("ALGODAO") || resp13.equals("BORRACHA")) {

                    System.out.println("\n[Produzia uma tinta rubra usada para tingir tecidos e móveis e chamava muita"
                            + "\natenção na Europa, onde produto feitos com essa madeira ou coloridos por sua tintura "
                            + "\ntinha um alto valor.]");
                } else {
                    System.out.println("\nEssa mercadoria era típica da Mata Atlântica");
                }
                System.out.println("\nTente novamente...");
                resp13 = leitor.nextLine().toUpperCase();
                resp13 = resp13.replace(" ", "");
            }

            if (resp13.equals("PAUBRASIL")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase6();
            }

        }
        if (op == 2) {
            System.out.println("\nNo mapa-múndi elas representam uma imensa mancha verde, são importantíssimas para "
                    + "\no equilíbrio do planeta, possui enorme importância no ecossistema ambiental mundial, a qual "
                    + "\nequilibra o clima e o ar. Responsáveis pela maior parte da cobertura vegetal e hídrica mundial, "
                    + "\nmelas são o lar de milhares de espécies de animais e plantas, muitos em extinção."
                    + "\n\nRESOLVA O ENIGMA:");
            String resp14 = leitor.nextLine();
            resp14 = resp14.toUpperCase();
            resp14 = resp14.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp14 = leitor.nextLine();
                resp14 = resp14.toUpperCase();
                resp14 = resp14.replaceAll(" ", "");
            } while (resp14.isEmpty());

            while (!resp14.equals("TAIGA") && !resp14.equals("FLORESTADETIGA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp14.equals("FLORESTADOCONGO") || resp14.equals("AMAZONIA") || resp14.equals("DAINTREERAINFOREST")
                        || resp14.equals("SELVAVALDIANA") || resp14.equals("FLORESTANUBLADA")) {

                    System.out.println("\n[Estendendo-se por boa parte do hemisfério norte, ela vai do norte do Alasca até o Japão, "
                            + "\npassando pela Sibéria, Canadá, Groelândia, Noruega, Finlândia, Rússia e Suécia.");
                } else {
                    System.out.println("\n[Tem três vezes o tamanho da floresta Amazônica, e "
                            + "\nsozinha representa quase 29% da cobertura florestal do planeta.]");
                }
                System.out.println("\nTente novamente...");
                resp14 = leitor.nextLine().toUpperCase();
                resp14 = resp14.replace(" ", "");
            }

            if (resp14.equals("TAIGA") || resp14.equals("FLORESTADETIGA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase6();
            }

        }
        if (op == 3) {
            System.out.println("\nA floresta contém um grande número de rochas e cavernas de gelo, "
                    + "\nalguns dos quais são pontos turísticos populares. Devido à densidade das árvores, que bloqueiam o vento, e "
                    + "\nà ausência de vida selvagem, é conhecida por ser estranhamente silenciosa.Entrase no continente asiático."
                    + "\n\nRESOLVA O ENIGMA:");
            String resp15 = leitor.nextLine();
            resp15 = resp15.toUpperCase();
            resp15 = resp15.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp15 = leitor.nextLine();
                resp15 = resp15.toUpperCase();
                resp15 = resp15.replaceAll(" ", "");
            } while (resp15.isEmpty());

            while (!resp15.equals("AOKIGAHARA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp15.equals("SUICIDIO") || resp15.equals("FLORESTADOSUICIODO")
                        || resp15.equals("JAPAO") || resp15.equals("MONTEFUJI")) {

                    System.out.println("\n[Lugar silencioso e de vegetação densa tem há décadas "
                            + "a triste fama de atrair pessoas que buscam pôr fim à própria vida.]");
                } else {
                    System.out.println("\n[Estima-se que cerca de 100 pessoas por ano acabem com a própria vida no "
                            + "\nbosque, que fica aos pés do monte Fuji]");
                }
                System.out.println("\nTente novamente...");
                resp15 = leitor.nextLine().toUpperCase();
                resp15 = resp15.replace(" ", "");
            }

            if (resp15.equals("AOKIGAHARA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase6();
            }
        }
    }

    public static void Fase6() {
        mapa();
        System.out.println("\n" + nome + ", você chegou ao nível 6!\n"
                + "\n     [PORTÕES DA VISÃO]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 3;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();

        }
        if (op == 1) {
            System.out.println("\nO que é, o que é?\n"
                    + "Clara e salgada, cabe em um olho e pesa uma tonelada, tem sabor de mar, pode ser discreta\n"
                    + "inquilina da dor, morada predileta, na calada ela vem, refém da vingança, irmã do desespero,\n"
                    + "rival da esperança, pode ser causada por vermes e mundanas, e o espinho da flor, cruel que você ama"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp16 = leitor.nextLine();
            resp16 = resp16.toUpperCase();
            resp16 = resp16.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp16 = leitor.nextLine();
                resp16 = resp16.toUpperCase();
                resp16 = resp16.replaceAll(" ", "");
            } while (resp16.isEmpty());

            while (!resp16.equals("LAGRIMA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp16.equals("CHORO") || resp16.equals("AGUA")) {

                    System.out.println("\nQuase lá");
                } else {
                    System.out.println("\nDICA: é um líquido");
                }
                System.out.println("\nTente novamente...");
                resp16 = leitor.nextLine().toUpperCase();
                resp16 = resp16.replace(" ", "");
            }

            if (resp16.equals("LAGRIMA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase7();
            }

        }
        if (op == 2) {
            System.out.println("\nO que tem um olho, mas não consegue ver?\n\nRESOLVA O ENIGMA:");
            String resp17 = leitor.nextLine();
            resp17 = resp17.toUpperCase();
            resp17 = resp17.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp17 = leitor.nextLine();
                resp17 = resp17.toUpperCase();
                resp17 = resp17.replaceAll(" ", "");
            } while (resp17.isEmpty());

            while (!resp17.equals("AGULHA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp17.equals("ALFINETE")) {

                    System.out.println("\nVocê está no caminho certo!");
                } else {
                    System.out.println("\nUsados em costura");
                }
                System.out.println("\nTente novamente...");
                resp17 = leitor.nextLine().toUpperCase();
                resp17 = resp17.replace(" ", "");
            }

            if (resp17.equals("AGULHA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase7();
            }

        }
        if (op == 3) {
            System.out.println("\nUm dos 5 sentidos humanos, talvez não o mais importante, porém o mais belo,"
                    + "\ncom ele você pode ir da traumatização até a felicidade, dependendo do que você sentiu com ele"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp18 = leitor.nextLine();
            resp18 = resp18.toUpperCase();
            resp18 = resp18.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp18 = leitor.nextLine();
                resp18 = resp18.toUpperCase();
                resp18 = resp18.replaceAll(" ", "");
            } while (resp18.isEmpty());

            while (!resp18.equals("VISAO")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp18.equals("OLHO") || resp18.equals("OLHOS")) {

                    System.out.println("\nUtiliza-se isso!");
                } else {
                    System.out.println("\nVamos, não está tão difícil");
                }
                System.out.println("\nTente novamente...");
                resp18 = leitor.nextLine().toUpperCase();
                resp18 = resp18.replace(" ", "");
            }

            if (resp18.equals("VISAO")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase7();
            }
        }
    }

    public static void Fase7() {
        mapa();
        System.out.println("\n    Vamos falar um pouco de Transtormos mentais?....\n"
                + "\n|---------------------------------------------------------------------------------------------------|"
                + "\nTranstornos mentais são disfunções no funcionamento da mente, que podem afetar qualquer pessoa "
                + "\ne em qualquer idade e, geralmente, são provocados por complexas alterações do sistema nervoso central."
                + "\n|---------------------------------------------------------------------------------------------------|");

        System.out.println("\n" + nome + ", você chegou ao nível 7!\n"
                + "\n     [PORTÕES DA INSANIDADE]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 3;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();

        }
        if (op == 1) {
            System.out.println("\nConsiderada por especialistas o mal do século"
                    + "\nestá entre os transtornos mais sentidos pelo brasileiro.\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp19 = leitor.nextLine();
            resp19 = resp19.toUpperCase();
            resp19 = resp19.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp19 = leitor.nextLine();
                resp19 = resp19.toUpperCase();
                resp19 = resp19.replaceAll(" ", "");
            } while (resp19.isEmpty());

            while (!resp19.equals("ANSIEDADE")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp19.equals("DEPREPRESSAO") || resp19.equals("ESQUIZOFRENIA")
                        || resp19.equals("ANOREXIA") || resp19.equals("BIPOLARIDADE")) {

                    System.out.println("\n[Um levantamento realizado no ano de 2018 pela OMS constatou que "
                            + "o Brasil está no topo, com 9,3% da população manifestando o quadro]");
                } else {
                    System.out.println("\ncaracterizados por uma sensação de desconforto, tensão, "
                            + "\nmedo ou mau pressentimento, que são muito "
                            + "\ndesagradáveis e costumam ser provocados pela antecipação de um perigo "
                            + "\nou algo desconhecido.");
                }
                System.out.println("\nTente novamente...");
                resp19 = leitor.nextLine().toUpperCase();
                resp19 = resp19.replace(" ", "");
            }

            if (resp19.equals("ANSIEDADE")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase8();
            }

        }
        if (op == 2) {
            System.out.println("\nEstá associado a alterações de humor que vão da "
                    + "depressão a situações de obsessão.\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp20 = leitor.nextLine();
            resp20 = resp20.toUpperCase();
            resp20 = resp20.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp20 = leitor.nextLine();
                resp20 = resp20.toUpperCase();
                resp20 = resp20.replaceAll(" ", "");
            } while (resp20.isEmpty());

            while (!resp20.equals("BIPOLAR") && !resp20.equals("BIPOLARIDADE")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp20.equals("DEPREPRESSAO") || resp20.equals("ESQUIZOFRENIA")
                        || resp20.equals("ANOREXIA") || resp20.equals("ANSIEDADE")) {

                    System.out.println("\n[É a doença psiquiátrica que provoca oscilações "
                            + "\nimprevisíveis no humor, variando entre depressão, "
                            + "\nque consiste em tristeza e desânimo, e mania, impulsividade "
                            + "\ne característica excessivamente extrovertida]");
                } else {
                    System.out.println("\nAlterações emocionais súbitas e imprevisíveis, "
                            + "\nos pensamentos aceleram-se, a fala é muito rápida, com mudanças "
                            + "\nfrequentes de assunto");
                }
                System.out.println("\nTente novamente...");
                resp20 = leitor.nextLine().toUpperCase();
                resp20 = resp20.replace(" ", "");
            }

            if (resp20.equals("BIPOLAR") || resp20.equals("BIPOLARIDADE")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase8();
            }

        }
        if (op == 3) {
            System.out.println("\nA causa exata para este transtorno não é conhecida,"
                    + "\nmas com uma combinação de razões entre a genética, ambiente, "
                    + "\nestrutura e química cerebrais alteradas, pode ser um influenciador. "
                    + "\nÉ um transtorno mental reconhecido por afetar pessoas de todas as idades. "
                    + "\nConsiderada uma doença psiquiátrica endógena na qual o contato com a "
                    + "\nrealidade é rompido.\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp21 = leitor.nextLine();
            resp21 = resp21.toUpperCase();
            resp21 = resp21.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp21 = leitor.nextLine();
                resp21 = resp21.toUpperCase();
                resp21 = resp21.replaceAll(" ", "");
            } while (resp21.isEmpty());

            while (!resp21.equals("ESQUIZOFRENIA")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp21.equals("DEPREPRESSAO") || resp21.equals("BIPOLARIDADE")
                        || resp21.equals("ANOREXIA") || resp21.equals("ANSIEDADE")) {

                    System.out.println("\n[É um distúrbio que afeta a capacidade da pessoa de pensar, "
                            + "\nsentir e se comportar com clareza. Dificuldade de concentração e "
                            + "\nmemória também são sintomas.]");
                } else {
                    System.out.println("\n[Pode ser caracterizada por pensamentos ou experiências "
                            + "\nque parecem não ter contato com a atual realidade da pessoa, fala ou "
                            + "\ncomportamento desorganizado e presença acanhada nas atividades cotidianas.]");
                }
                System.out.println("\nTente novamente...");
                resp21 = leitor.nextLine().toUpperCase();
                resp21 = resp21.replace(" ", "");
            }

            if (resp21.equals("ESQUIZOFRENIA")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                Fase8();
            }
        }
    }

    public static void Fase8() {
        mapa();
        System.out.println("\n" + nome + ", você chegou ao nível 8!\n"
                + "\n     [PORTÕES DA MORTE]\n"
                + "\nEm cada porta há um enigma, responda corretamente para avançar."
                + "\n\n=======ATENÇÃO: VOCÊ ESTÁ NO PORTÃO DA MORTE, "
                + "VOCÊ AGORA TEM APENAS DUAS VIDAS, OU SEJA, VOCÊ SÓ PODE ERRAR DUAS VEZES=======");

        System.out.println("\n    Vamos falar sobre as concepções da morte em diferente mitologias?....\n"
                + "|----------------------------------------------------------------------------------------------------------------|"
                + "\nSegundo Sócrates, 'morte é essencial porque permite que a alma se distancie novamente da matéria orgânica e,"
                + "\n na esfera essencial, alcance o verdadeiro conhecimento, só então o ser será livre para atingir o saber "
                + "\nem sua forma mais pura'"
                + "\n|----------------------------------------------------------------------------------------------------------------|"
                + "\n\nEscolha: ([1] , [2] , [3] ).\n");
        portas();
        int op = leitor.nextInt();
        hp = 2;

        while ((op != 1) && (op != 2) && (op != 3)) {
            System.out.println("\nPorta inexistente, digite novamente:");
            op = leitor.nextInt();
        }

        if (op == 1) {
            System.out.println("\nOs astecas cultuavam varios deuses, entre eles dezenas de deuses da morte,"
                    + "\na doração de algumans dessas entidades envolviam atos relacionadoss ao canibalismo e "
                    + "\nsacrificios humanos, cada deus tinha um papel, como zelar pelos ossos dos mortos entre outros"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp22 = leitor.nextLine();
            resp22 = resp22.toUpperCase();
            resp22 = resp22.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp22 = leitor.nextLine();
                resp22 = resp22.toUpperCase();
                resp22 = resp22.replaceAll(" ", "");
            } while (resp22.isEmpty());

            while (!resp22.equals("MICTLANTECUHTLI") && !resp22.equals("MICLI")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp22.equals("CHALMECACIHUILT") || resp22.equals("TEZCATLIPOCA")
                        || resp22.equals("MICTECACIHUATL") || resp22.equals("HUIZILOPOCHTLI")) {

                    System.out.println("\n[GOVERNADOR DE MICTLAN]");
                } else {
                    System.out.println("\n[Regente do signo do Cão no horóscopo asteca.]");
                }
                System.out.println("\nTente novamente...");
                resp22 = leitor.nextLine().toUpperCase();
                resp22 = resp22.replace(" ", "");
            }

            if (resp22.equals("MICTLANTECUHTLI") || resp22.equals("MICLI")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                FaseFinal();
            }

        }
        if (op == 2) {
            System.out.println("\nResponsvél por guiar e conduzir a alma dos mortos no submundo,"
                    + "conhecido por ser juiz dos mortos e embalsamador divino\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp23 = leitor.nextLine();
            resp23 = resp23.toUpperCase();
            resp23 = resp23.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp23 = leitor.nextLine();
                resp23 = resp23.toUpperCase();
                resp23 = resp23.replaceAll(" ", "");
            } while (resp23.isEmpty());

            while (!resp23.equals("ANUBIS")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp23.equals("OSIRIS") || resp23.equals("SETH")
                        || resp23.equals("ISIS") || resp23.equals("SEKHMET")) {

                    System.out.println("\n[Conhecido como deus egípcio antigo dos mortos e moribundos]");
                } else {
                    System.out.println("\n[Era sempre representado com cabeça de chacal e também era associado como protetor das pirâmides.]");
                }
                System.out.println("\nTente novamente...");
                resp23 = leitor.nextLine().toUpperCase();
                resp23 = resp23.replace(" ", "");
            }

            if (resp23.equals("ANUBIS")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                FaseFinal();
            }

        }
        if (op == 3) {
            System.out.println("\nO barqueiro de Hades, que carrega as almas dos recém-mortos "
                    + "\nsobre as águas do rio Estige e Aqueronte, que dividiam o mundo "
                    + "\ndos vivos do mundo dos mortos. Uma moeda para pagá-lo pelo trajeto"
                    + "\n\nRESOLVA O ENIGMA: (Ignore caracteres especiais)");
            String resp24 = leitor.nextLine();
            resp24 = resp24.toUpperCase();
            resp24 = resp24.replaceAll(" ", "");

            do {
                System.out.println("\nDigite a resposta do enigma:");
                resp24 = leitor.nextLine();
                resp24 = resp24.toUpperCase();
                resp24 = resp24.replaceAll(" ", "");
            } while (resp24.isEmpty());

            while (!resp24.equals("CARONTE")) {
                hp = hp - 1;
                if (hp == 0) {
                    Derrota();
                }
                if (resp24.equals("CARONTI") || resp24.equals("CARONT")) {

                    System.out.println("\nErrou por pouco");
                } else {
                    System.out.println("\nVamos, todos sabem essa resposta!");
                }
                System.out.println("\nTente novamente...");
                resp24 = leitor.nextLine().toUpperCase();
                resp24 = resp24.replace(" ", "");
            }

            if (resp24.equals("CARONTE")) {
                System.out.println("\nParabéns, você passou de fase!\n");
                FaseFinal();
            }
        }
    }

    public static void FaseFinal() {
        mapa();
        System.out.println("\n ...INICIANDO FASE FINAL...."
                + "\n\n Parabéns " + nome + ", você conseguiu chegar até aqui,"
                + " parece que você é realmente bom com enigmas\n\nNesta fase você"
                + " não vai ter segundas chances, se você errar, será o seu fim, "
                + " responda com frieza\n\n Esse Deus, o capanga da Morte, "
                + "\ntambém é conhecido como o observador do cemitério, é ele que protege o cemitério "
                + "\ne as almas ao redor por algum motivo desconhecido e ele coleta as almas perdidas em sua terra.");

        System.out.println("\nDICA 1:\n\n"
                + "Ele foi descrito como um homem e um esqueleto que foi acusado de proteger os cemitérios e as almas neles contidas,"
                + "\ntambém pode ser descrito como uma sombra.");

        System.out.println("\nDICA 2:\n\n"
                + "Em algumas culturas, acredita-se que ele foi o primeiro filho de Adão e Eva, enquanto noutras, acredita-se ser o "
                + "\núltimo homem a morrer no dia 31 de d"
                + "ezembro de cada ano.\n");
        
        System.out.println("Digite a resposta do enigma: ");
        
        String respFinal = leitor.nextLine();
        respFinal = respFinal.toUpperCase();
        respFinal = respFinal.replaceAll(" ", "");

        if (respFinal.equals("ANKOU")) {
            Vitoria();
        } else {
            System.out.println("\nSinto muito aventureiro, seu caminho chegou ao fim!");
            Derrota();
        }
    }

    public static void Vitoria() {

        System.out.println("\nParábens " + nome + ", você conseguiu decifrar"
                + " todos os enigmas e está livre do labirinto!"
                + "\nDesligando...");
        System.exit(0);
    }

    public static void Derrota() {
        System.out.println("\nVocê falhou em resolver o enigma\n\n [GAME OVER]");
        System.exit(0);
    }
}