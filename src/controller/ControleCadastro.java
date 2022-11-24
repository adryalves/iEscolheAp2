package controller;

import java.util.ArrayList;

import controller.controllerIngredientes.ControleIngredientes;
import controller.controllerReceita.ControleReceita;

public class ControleCadastro {

        ArrayList<String> listaModoPreparo = new ArrayList<>();

        ControleReceita controleReceita = new ControleReceita();

        ControleIngredientes ci = new ControleIngredientes();

        public void cadastrarReceita() {

                /* 0 */ listaModoPreparo.add(
                                "1. Em um recipiente, bata bem o ovo.\n2. Adicione a goma de tapioca e bata novamente (pode bater com um garfo mesmo),\naté obter uma mistura homogênea.\n3. Coloque todo o conteúdo em uma frigideira antiaderente levemente quente\ne mantenha em fogo baixo.\n4. Deixe por alguns segundos e vire para dourar do outro lado.\n5. Não é necessário untar com óleo, azeite ou manteiga.");
                /* 1 */ listaModoPreparo.add(
                                "1. Corte uma fatia larga do pão\n2. Na frigideira, em fogo médio, quebre o ovo e o faça de sua preferência.\n3. Abra o pão e, após temperar o ovo com sal a gosto, coloque o ovo no pão");
                /* 2 */ listaModoPreparo.add(
                                "1. Em uma panela, ferva a água e acrescente o leite, o óleo e o sal.\n2. Adicione o polvilho aos poucos até dar liga. Pode ser que você não precise usar\nos 800g, então coloque devagar e sove a massa até soltar da mão: esse é o ponto.\n3. Quando a massa estiver morna, acrescente o queijo parmesão, os ovos e\nmisture bem.\n4. Unte as mãos e enrole bolinhas de 2 cm de diâmetro.\n5. Disponha as bolinhas em uma assadeira untada com óleo, deixando um\nespaço entre elas.\n6. Asse em forno médio (180º C), preaquecido, por cerca de 40 minutos.");
                /* 3 */ listaModoPreparo.add(
                                "1. Bata os 2 ovos, pode ser na batedeira ou não.\n2. Após ter batido bem, coloque-o na frigideira já untada com óleo, acrescente o \nsal, o presunto picado em quadradinhos\n e as duas fatias de queijo (não precisa \npicar o queijo).\n3. Coloque os temperos a gosto, espere ficar firme e vire o omelete.");
                /* 4 */ listaModoPreparo.add(
                                "1. Coloque a tapioca em uma frigideira e espalhe bem até que cubra toda a \nfrigideira. A espessura não pode ficar fina demais para que não se quebre.\n2. Coloque o recheio e dobre.\n3. Vire para dourar de todos os lados.");
                /* 5 */ listaModoPreparo.add(
                                "1. Em uma panela, misture todos os ingredientes, mexendo sempre, até engrossar. Adoce se necessário e sirva quente ou frio");
                /* 6 */ listaModoPreparo.add(
                                "1. Coloque o fubá em um recipiente.\n2. Acrescente água ao poucos e mexa bem.\n3. Após a mistura, coloque tudo em uma cuscuzeira e leve ao fogo.\n4. Quando a água da cuscuzeira começar a ferver coloque em fogo baixo e deixe \nno vapor por 5 minutos.\n5. Sirva do modo que desejar.");
                /* 7 */ listaModoPreparo.add(
                                "1. Corte as fatias de pão, recheie com presunto e queijo.\n2. Se quiser, use o tostex ou sanduicheira.\n3. Coloque no forno, em uma assadeira, até que o queijo esteja derretido.");
                /* 8 */ listaModoPreparo.add(
                                "1. Bata todos os ingredientes no liquidificador por 2 minutos.\n2. Em seguida desligue e, com uma colher, misture a farinha que grudou no copo do liquidificador.\n3. Bata novamente só para misturar e reserve.\n4. Unte a frigideira com um fio de óleo e leve ao fogo até aquecer.\n5. Com o auxílio de uma concha, pegue uma porção de massa e coloque na frigideira, gire a frigideira para espalhar bem a massa.\n6. Abaixe o fogo e deixe dourar por baixo, em seguida vire do outro lado e deixe dourar, repita o processo com toda a massa.");
                /* 9 */ listaModoPreparo.add(
                                "1. Em uma panela, misture o frango, o alho, a maionese, o sal e a pimenta.\n2. Em uma frigideira grande, derreta a manteiga e doure a cebola.\n3. Junte o frango temperado até que esteja dourado.\n4. Adicione os cogumelos, o ketchup e a mostarda.\n5. Incorpore o creme de leite e retire do fogo antes de ferver.\n6. Sirva com arroz branco e batata palha.");
                /* 10 */ listaModoPreparo.add(
                                "1. Coloque as carnes de molho por 36 horas ou mais, vá trocando a água várias \nvezes, se for ambiente quente ou verão, coloque gelo por cima ou em camadas frias.\n2. Coloque para cozinhar passo a passo: as carnes duras, em seguida as carnes moles.\n3. Quando estiver mole, coloque o feijão e retire as carnes.\n4. Finalmente tempere o feijão.");
                /* 11 */ listaModoPreparo.add(
                                "1. Deixe o feijão de molho por 2 horas.\n2. Escorra e transfira para uma panela de pressão.\n3. Junte a água, o tempero pronto, o sal e o louro.\n4. Deixe cozinhar, em fogo baixo, por 20 minutos após o início da fervura.\n5. Em uma frigideira média, coloque o óleo e leve ao fogo alto para aquecer.\nJunte o alho e refogue rapidamente até dourar.\n6. Adicione uma concha dos grãos do feijão cozido e amasse-os com uma colher.\n7. Volte o refogado à panela de pressão e deixe cozinhar, com a panela \nsemi-tampada, por 10 minutos, ou até encorpar ligeiramente.\n8. Retire do fogo e sirva em seguida.");
                /* 12 */ listaModoPreparo.add(
                                "1. Refogue o alho e a cebola no azeite.\n2. Coloque o arroz e deixe fritar por cerca de 30 segundos.\n3. Adicione a água fervente e o sal.\n4. Abaixe o fogo e deixe cozinhar até a água quase secar\n5. Tampe a panela e aguarde cerca de 20 minutos antes de servir.\n6. Se desejar fazer mais, é só seguir as proporções, principalmente da água.");
                /* 13 */ listaModoPreparo.add(
                                "1. Coloque a água para ferver\n2. Quando estiver fervendo, coloque o sal e 1 colher de óleo.\n3. Quando o macarrão estiver mole, tire do fogo e escorra a água\n no escorredor de macarrão.\n4. Lave o macarrão.\n5. Faça o molho de sua preferência em outra panela.");
                /* 14 */ listaModoPreparo.add(
                                "1. Misture o fermento e o açúcar em uma tigela.\n2. Adicione a água morna aos poucos e misture devagar.\n3. Quando estiver dissolvido, reserve em temperatura ambiente.\n4. Em uma superfície lisa e limpa, misture a farinha com o sal.\n5. Faça um buraco no centro e adicione a mistura com o fermento.\n6. Adicione o azeite e misture bem.\n7. Sove a massa até parar de grudar nos dedos.\n8. Cubra com uma toalha e deixe a massa descansar por aproximadamente 1 hora \nou até dobrar de tamanho.\n9. Divida a massa em 4 partes, selecione uma delas, cubra o restante com \na toalha e reserve para assar em outros momentos.\n10. Coloque a massa em uma superfície polvilhada de farinha e use um rolo para \nabri-la, formando um círculo de 30 centímetros de diâmetro.\n11. Monte a pizza com os sabores de sua preferência (frango desfiado, atum, milho, \nmuçarela, etc), espalhando primeiro o molho ou o extrato de tomate.\n12. Leve ao forno pré-aquecido e asse em fogo médio até que a massa fique dourada.");
                /* 15 */ listaModoPreparo.add(
                                "1. Molho\n2. Em uma panela, faça um creme homogêneo com as 2 colheres de farinha e 2 colheres de manteiga (reserve 1 colher de manteiga).\n3. Acrescente o leite, 1 caldo de galinha e mexa constantemente.\n4. Retire do fogo e acrescente o creme de leite, reserve.\n5. Frango\n6. Cozinhe o peito de frango em água (sem óleo), após cozido, desfie-o.\n7. Pique a cebola em pedaços pequenos, coloque em uma panela e doure com a manteiga.\n8. Acrescente o frango e o caldo de galinha, mexa sempre até o frango ficar totalmente dourado.\n9. Montagem\n10. Em um refratário, coloque 2 conchas de molho.\n11.	Faça a base com massa de lasanha, cubra com 1 camada de presunto, 1 de queijo e 1 de frango (nessa ordem).\n12.	Sobre o frango, coloque 1 camada de requeijão e 2 conchas de molho.\n13.	Cubra o requeijão com 1 camada de presunto, 1 camada de queijo e 1 camada de massa, coloque molho.\n14.	Repita esse processo até faltar cerca de 2,5 cm para chegar na borda do refratário.\n15. Para finalizar, cubra a lasanha com muito queijo, requeijão e molho.\n16. Asse por, aproximadamente, 20 minutos em fogo baixo");
                /* 16 */ listaModoPreparo.add(
                                "1. Primeiro, bata bem os ovos no liquidificador.\n2. Acrescente o leite condensado e o leite, e bata novamente.\nCALDA:\n3. Derreta o açúcar na panela até ficar moreno, acrescente a água e deixe engrossar.\n4. Coloque em uma forma redonda e despeje a massa do pudim por cima.\n5. Asse em forno médio por 45 minutos, com a assadeira redonda dentro de uma \nmaior com água.\n6. Espete um garfo para ver se está bem assado.\n7. Deixe esfriar e desenforme.");
                /* 17 */ listaModoPreparo.add(
                                "1. Primeiro, pegue a lata de leite condensado, as gemas, o amido de milho e o leite.\n2. Coloque no fogo e deixe até que fique um creme, reserve.\n3. Coloque a segunda lata de leite condensado com um pouco de margarina e o \nchocolate.\n4. Deixe no fogo até ficar um creme tipo brigadeiro.\n5. Desligue o fogo e junte com o creme de leite.");
                /* 18 */ listaModoPreparo.add(
                                "1. Em um liquidificador, bata o creme de leite, o leite condensado e o suco concentrado \nde maracujá.\n2. Em uma tigela, despeje a mistura e leve à geladeira por, no mínimo, 4 horas.");
                /* 19 */ listaModoPreparo.add(
                                "1. Faça a gelatina normalmente e não leve à geladeira.\n2. Depois que pronta, ainda quente, coloque no liquidificador junto com o leite \ncondensado e o creme de leite.\n3. Bata bem.\n4. Depois, leve ao congelador em um refratário tampado para não formar blocos \nde gelo.\n5. Depois de congelado, retire do congelador e bata na batedeira para ficar cremoso.\n6. Volte para o congelador.\n7. Está pronto, um sorvete fácil, prático e gostoso.");
                /* 20 */ listaModoPreparo.add(
                                "1. Misture a manteiga e o açúcar.\n2. Adicione as duas gemas e misture até ficar uma massa homogênea.\n3. Vá adicionando o amido de milho aos \npoucos até dar o ponto (massa consistente).\n4. Passe um pouco de manteiga na mão.\n5. Faça bolinhas com a massa e coloque-as distantes numa forma untada e enfarinhada.\n6. Pressione levemente as bolinhas com um garfo.\n7. Leve ao forno até ficarem crocantes por fora e macias por dentro.");
                /* 21 */ listaModoPreparo.add(
                                "1. Em um liquidificador, bata o leite, o amido de milho, o chocolate em pó e o açúcar.\n2. Despeje a mistura em uma panela com a canela e leve ao fogo baixo, mexendo \nsempre até ferver.\n3. Desligue, adicione o creme de leite e mexa bem até obter uma mistura homogênea.\n4. Retire a canela e sirva quente.");
                /* 22 */ listaModoPreparo.add(
                                "1. Pegue um copo de água, coloque no micro-ondas por 1 minuto para esquentar\n a água, ou pode mesmo esquentá-la no fogão, fica a seu critério\n2. Pegue o tupperware médio e coloque todo o conteúdo da gelatina em pó nele \ne jogue a água quente por cima e mexa\n3. Posteriormente jogue também a água gelada e misture novamente\n4. Coloque na geladeira e pronto");
                /* 23 */ listaModoPreparo.add(
                                "1. Passe a manteiga nos pães e coloque-os na forma, deixe dourar.\n2. Retire os pães, não deixe esfriar muito para não endurecer.\n3. Passe a nutella em cada par de pão.\n4. Se preferir fazer com os pães naturais sem ir ao forno também fica ótimo.");
                /* 24 */ listaModoPreparo.add(
                                "1. Passe o requeijão, recheie com presunto e queijo.\n2. Se quiser, use o tostex ou sanduicheira.\n3. Coloque no forno ou em uma assadeira, até que o queijo esteja derretido.");
                /* 25 */ listaModoPreparo.add(
                                "1. Em uma panela funda, acrescente o leite condensado, a manteiga\n e o achocolatado (ou 4 colheres de sopa de chocolate em pó).\n2. Cozinhe em fogo médio e mexa até que o brigadeiro comece a desgrudar da panela.\n3. Deixe esfriar e faça pequenas bolas com a mão passando\n a massa no chocolate granulado se desejar.");
                /* 26 */ listaModoPreparo.add(
                                "1. Cozinhe a carne em uma panela de pressão, retire, espere esfriar e desfie.\n Reserve a carne.\n2. Retire a pele da calabresa e corte em cubos. Pode acrescentar\n bacon em cubos também, caso seja de sua preferência.\n3. Corte o tomate em cubos pequenos sem as sementes, e reserve.\n4. Corte a cebola em cubos pequenos, e reserve.\n5. Refogue a calabresa (e o bacon também, caso o tenha escolhido)\n até ficar bem dourada, acrescentando depois a cebola, o tomate, e a carne desfiada.\n6. Após isso, acrescente o arroz e refogue bem, adicione a água \ncorrigindo o sal se necessário, e abaixe o fogo.\n7. Caso queira, é possível adicionar temperos de sua preferência também,\n sempre checando o sabor.\n8. Quando o arroz estiver no ponto desejado, sirva e coloque coentro\n ou salsa por cima.");
                /* 27 */ listaModoPreparo.add(
                                "1. Lave e corte o peito de frango em filés, reserve.\n2. Pegue 4 dentes de Alho e amasse-os com sal.\n3. Em uma vasilha misture o creme de leite, o alho amassado, sal, e se preferir,\n suco de meio limão, pimenta do reino, oregáno e açafrão.\n4. Em um prato, coloque a farinha de trigo e tempere a gosto, misturando bem.\n5. Passe os filés de peito de frango no molho de creme de leite\n e depois na farinha de trigo.\n6. Coloque os frangos para fritar em óleo quente.\n7. Depois de fritos, pode servir de acordo sua preferência.");

                /* 28 */ listaModoPreparo.add(
                                "1. Misture todos os ingredientes, menos a batata palha.\n2. Depois de tudo misturado, forre com a batata palha.\n3. Depois é só servir.");
                /* 29 */ listaModoPreparo.add(
                                "1. Refogue a carne em uma frigideira com óleo até dourar.\nAdicione sal e pimenta e reserve.\n2. adicione a carne e refogue durante 2 minutos.\n3. Adicione o tomate e deixe cozinhar por 20 minutos.\n Junte sal, pimenta e açúcar (para eliminar a acidez do tomate).");
                /* 30 */ listaModoPreparo.add(
                                "1. Picar a cebola bem fininha e fogar no azeite de olivia.\n2. Baixar o fogo e colocar uma lata de creme de leite.\n3. Em seguida, coloque a mostarda e misture bem.\n4. Reserve o molho.\n5. Após temperar os bifes ao seu gosto,em uma frigideira bem quente,\ncom manteiga ou azeite,passe os bifes, até o ponto que desejar.\n6. Reservar o caldo que o bife soltará na panela, para misturar \nao molho de mostarda.\n7. Após deixar o molho uniforme, servir ele com\n o bife de acordo sua preferência.");

                controleReceita.cadastrarReceitas("Crepioca", listaModoPreparo.get(0));
                controleReceita.cadastrarReceitas("Pão com ovo", listaModoPreparo.get(1));
                controleReceita.cadastrarReceitas("Pão de queijo", listaModoPreparo.get(2));
                controleReceita.cadastrarReceitas("Omelete", listaModoPreparo.get(3));
                controleReceita.cadastrarReceitas("Tapioca de queijo e presunto", listaModoPreparo.get(4));
                controleReceita.cadastrarReceitas("Mingau", listaModoPreparo.get(5));
                controleReceita.cadastrarReceitas("Cuscuz", listaModoPreparo.get(6));
                controleReceita.cadastrarReceitas("Misto", listaModoPreparo.get(7));
                controleReceita.cadastrarReceitas("Panqueca", listaModoPreparo.get(8));
                controleReceita.cadastrarReceitas("Strogonoff", listaModoPreparo.get(9));
                controleReceita.cadastrarReceitas("Feijoada", listaModoPreparo.get(10));
                controleReceita.cadastrarReceitas("Feijão", listaModoPreparo.get(11));
                controleReceita.cadastrarReceitas("Arroz", listaModoPreparo.get(12));
                controleReceita.cadastrarReceitas("Macarrão", listaModoPreparo.get(13));
                controleReceita.cadastrarReceitas("Pizza", listaModoPreparo.get(14));
                controleReceita.cadastrarReceitas("Lasanha", listaModoPreparo.get(15));
                controleReceita.cadastrarReceitas("Pudim", listaModoPreparo.get(16));
                controleReceita.cadastrarReceitas("Pavê", listaModoPreparo.get(17));
                controleReceita.cadastrarReceitas("Mousse de maracujá", listaModoPreparo.get(18));
                controleReceita.cadastrarReceitas("Sorvete", listaModoPreparo.get(19));
                controleReceita.cadastrarReceitas("Sequilhos", listaModoPreparo.get(20));
                controleReceita.cadastrarReceitas("Chocolate quente", listaModoPreparo.get(21));
                controleReceita.cadastrarReceitas("Gelatina", listaModoPreparo.get(22));
                controleReceita.cadastrarReceitas("Pão com nutella", listaModoPreparo.get(23));
                controleReceita.cadastrarReceitas("Misto com requeijão", listaModoPreparo.get(24));
                controleReceita.cadastrarReceitas("Brigadeiro", listaModoPreparo.get(25));
                controleReceita.cadastrarReceitas("Arroz Carreteiro", listaModoPreparo.get(26));
                controleReceita.cadastrarReceitas("Frango Empanado com Creme de Leite", listaModoPreparo.get(27));
                controleReceita.cadastrarReceitas("Salpicão", listaModoPreparo.get(28));
                controleReceita.cadastrarReceitas("Carne", listaModoPreparo.get(29));
                controleReceita.cadastrarReceitas("Bife ao Molho Mostarda", listaModoPreparo.get(30));
        }

        public void cadastrarIngrediente() {
                ci.cadastrarIngredientes("Leite", "cafe-da-manha_sobremesa");
                ci.cadastrarIngredientes("Queijo", "cafe-da-manha_almoco");
                ci.cadastrarIngredientes("Ovo", "cafe-da-manha_sobremesa");
                ci.cadastrarIngredientes("Pão", "cafe-da-manha");
                ci.cadastrarIngredientes("Tapioca", "cafe-da-manha");
                ci.cadastrarIngredientes("Manteiga", "cafe-da-manha_almoco_sobremesa");
                ci.cadastrarIngredientes("Presunto", "cafe-da-manha");
                ci.cadastrarIngredientes("Mortadela", "cafe-da-manha");
                ci.cadastrarIngredientes("Iogurte", "cafe-da-manha_sobremesa");
                ci.cadastrarIngredientes("Polvilho", "cafe-da-manha");
                ci.cadastrarIngredientes("Aveia", "cafe-da-manha");
                ci.cadastrarIngredientes("Fubá", "cafe-da-manha");
                ci.cadastrarIngredientes("Arroz", "almoco");
                ci.cadastrarIngredientes("Feijão", "almoco");
                ci.cadastrarIngredientes("Carne", "almoco");
                ci.cadastrarIngredientes("Frango", "almoco");
                ci.cadastrarIngredientes("Calabresa", "almoco");
                ci.cadastrarIngredientes("Ketchup", "almoco");
                ci.cadastrarIngredientes("Mostarda", "almoco");
                ci.cadastrarIngredientes("Creme de leite", "almoco_sobremesa");
                ci.cadastrarIngredientes("Batata palha", "almoco");
                ci.cadastrarIngredientes("Feijão preto", "almoco");
                ci.cadastrarIngredientes("Macarrão", "almoco");
                ci.cadastrarIngredientes("Tomate", "almoco");
                ci.cadastrarIngredientes("Maionese", "almoco");
                ci.cadastrarIngredientes("Farinha de trigo", "almoco");
                ci.cadastrarIngredientes("Fermento biológico", "almoco");
                ci.cadastrarIngredientes("Molho de tomate", "almoco");
                ci.cadastrarIngredientes("Biscoito", "sobremesa");
                ci.cadastrarIngredientes("Gelatina", "sobremesa");
                ci.cadastrarIngredientes("Canela", "sobremesa");
                ci.cadastrarIngredientes("Sorvete", "sobremesa");
                ci.cadastrarIngredientes("Leite condensado", "sobremesa");
                ci.cadastrarIngredientes("Amido de milho", "sobremesa");
                ci.cadastrarIngredientes("Chocolate em pó", "sobremesa");
                ci.cadastrarIngredientes("Maracujá", "sobremesa");
                ci.cadastrarIngredientes("Óleo", "cafe-da-manha"); // 36
                ci.cadastrarIngredientes("Açúcar", "sobremesa"); // 37
                ci.cadastrarIngredientes("Requeijão", "cafe-da-manha"); // 38
                ci.cadastrarIngredientes("Nutella", "cafe-da-manha"); // 39
                ci.cadastrarIngredientes("Calda", "sobremesa"); // 40

        }

        ControleIngredienteReceita cr = new ControleIngredienteReceita();

        public void cadastrarIngredienteReceita() {
                cr.cadastrarIngredienteReceita(2, 0, "1 unidade");
                cr.cadastrarIngredienteReceita(4, 0, "1 colher de sopa");
                cr.cadastrarIngredienteReceita(3, 1, "1 unidade");
                cr.cadastrarIngredienteReceita(2, 1, "1 unidade");
                cr.cadastrarIngredienteReceita(1, 2, "A gosto");
                cr.cadastrarIngredienteReceita(9, 2, "800g");
                cr.cadastrarIngredienteReceita(36, 2, "1/2 xícara");
                cr.cadastrarIngredienteReceita(0, 2, "1 xícara");
                cr.cadastrarIngredienteReceita(2, 2, "2 unidades");
                cr.cadastrarIngredienteReceita(2, 3, "2 unidades");
                cr.cadastrarIngredienteReceita(5, 3, "1 colher de sopa");
                cr.cadastrarIngredienteReceita(6, 3, "1/2 xícara");
                cr.cadastrarIngredienteReceita(1, 3, "1/2 xícara");
                cr.cadastrarIngredienteReceita(4, 4, "1/2 xícara");
                cr.cadastrarIngredienteReceita(1, 4, "A gosto");
                cr.cadastrarIngredienteReceita(6, 4, "A gosto");
                cr.cadastrarIngredienteReceita(0, 5, "2 xícaras");
                cr.cadastrarIngredienteReceita(10, 5, "1 xícara");
                cr.cadastrarIngredienteReceita(30, 5, "A gosto");
                cr.cadastrarIngredienteReceita(11, 6, "2 xícaras");
                cr.cadastrarIngredienteReceita(3, 7, "1 unidade");
                cr.cadastrarIngredienteReceita(1, 7, "2 fatias");
                cr.cadastrarIngredienteReceita(6, 7, "1 fatia");
                cr.cadastrarIngredienteReceita(0, 8, "1 xícara");
                cr.cadastrarIngredienteReceita(25, 8, "1 colher de sopa");
                cr.cadastrarIngredienteReceita(2, 8, "2 ovos");
                cr.cadastrarIngredienteReceita(15, 9, "300g");
                cr.cadastrarIngredienteReceita(24, 9, "Opcional");
                cr.cadastrarIngredienteReceita(5, 9, "1 colher de sopa");
                cr.cadastrarIngredienteReceita(17, 9, "2 colheres de sopa");
                cr.cadastrarIngredienteReceita(18, 9, "1 colher de chá");
                cr.cadastrarIngredienteReceita(19, 9, "200g");
                cr.cadastrarIngredienteReceita(20, 9, "A gosto");
                cr.cadastrarIngredienteReceita(21, 10, "1kg");
                cr.cadastrarIngredienteReceita(14, 10, "A gosto");
                cr.cadastrarIngredienteReceita(16, 10, "A gosto");
                cr.cadastrarIngredienteReceita(13, 11, "500g");
                cr.cadastrarIngredienteReceita(14, 11, "A gosto");
                cr.cadastrarIngredienteReceita(12, 12, "A gosto");
                cr.cadastrarIngredienteReceita(22, 13, "100g");
                cr.cadastrarIngredienteReceita(23, 13, "1 unidade");
                cr.cadastrarIngredienteReceita(1, 13, "A gosto");
                cr.cadastrarIngredienteReceita(27, 13, "100g");
                cr.cadastrarIngredienteReceita(25, 14, "200g");
                cr.cadastrarIngredienteReceita(26, 14, "10g");
                cr.cadastrarIngredienteReceita(23, 14, "2 unidades");
                cr.cadastrarIngredienteReceita(1, 14, "250g");
                cr.cadastrarIngredienteReceita(27, 14, "300g");
                cr.cadastrarIngredienteReceita(15, 14, "150g");
                cr.cadastrarIngredienteReceita(15, 15, "200g");
                cr.cadastrarIngredienteReceita(1, 15, "200g");
                cr.cadastrarIngredienteReceita(0, 15, "250ml");
                cr.cadastrarIngredienteReceita(19, 15, "200g");
                cr.cadastrarIngredienteReceita(25, 15, "100g");
                cr.cadastrarIngredienteReceita(5, 15, "2 colheres de sopa");
                cr.cadastrarIngredienteReceita(32, 16, "395g");
                cr.cadastrarIngredienteReceita(0, 16, "395g");
                cr.cadastrarIngredienteReceita(2, 16, "2 unidades");
                cr.cadastrarIngredienteReceita(19, 17, "200g");
                cr.cadastrarIngredienteReceita(0, 17, "395g");
                cr.cadastrarIngredienteReceita(32, 17, "395g");
                cr.cadastrarIngredienteReceita(2, 17, "2 unidades");
                cr.cadastrarIngredienteReceita(33, 17, "1 colher de sopa");
                cr.cadastrarIngredienteReceita(34, 17, "3 colheres de sopa");
                cr.cadastrarIngredienteReceita(28, 17, "1 pacote");
                cr.cadastrarIngredienteReceita(5, 17, "1 colher de sopa");
                cr.cadastrarIngredienteReceita(32, 18, "395g");
                cr.cadastrarIngredienteReceita(19, 18, "200g");
                cr.cadastrarIngredienteReceita(35, 18, "3 unidades");
                cr.cadastrarIngredienteReceita(32, 19, "395g");
                cr.cadastrarIngredienteReceita(19, 19, "200g");
                cr.cadastrarIngredienteReceita(29, 19, "1 pacote");
                cr.cadastrarIngredienteReceita(40, 19, "A gosto");
                cr.cadastrarIngredienteReceita(33, 20, "3 xícaras");
                cr.cadastrarIngredienteReceita(5, 20, "3 colheres de sopa");
                cr.cadastrarIngredienteReceita(2, 20, "2 unidades");
                cr.cadastrarIngredienteReceita(37, 20, "6 colheres de sopa");
                cr.cadastrarIngredienteReceita(0, 21, "300ml");
                cr.cadastrarIngredienteReceita(33, 21, "1 colher de sopa");
                cr.cadastrarIngredienteReceita(34, 21, "3 colheres de sopa");
                cr.cadastrarIngredienteReceita(30, 21, "1 unidade");
                cr.cadastrarIngredienteReceita(19, 21, "200g");
                cr.cadastrarIngredienteReceita(29, 22, "1 pacote");
                cr.cadastrarIngredienteReceita(39, 23, "1 pote");
                cr.cadastrarIngredienteReceita(3, 23, "1 unidade");
                cr.cadastrarIngredienteReceita(5, 23, "A gosto");
                cr.cadastrarIngredienteReceita(3, 24, "1 unidade");
                cr.cadastrarIngredienteReceita(1, 24, "2 fatias");
                cr.cadastrarIngredienteReceita(6, 24, "1 fatia");
                cr.cadastrarIngredienteReceita(38, 24, "A gosto");
                cr.cadastrarIngredienteReceita(32, 25, "1 caixa ");
                cr.cadastrarIngredienteReceita(5, 25, "Uma colher");
                cr.cadastrarIngredienteReceita(34, 25, "5 colheres");
                cr.cadastrarIngredienteReceita(12, 26, "3 copos");
                cr.cadastrarIngredienteReceita(14, 26, "500 gramas");
                cr.cadastrarIngredienteReceita(16, 26, "200 gramas");
                cr.cadastrarIngredienteReceita(23, 26, "1 unidade");
                cr.cadastrarIngredienteReceita(15, 27, "1kg");
                cr.cadastrarIngredienteReceita(19, 27, "200 gramas");
                cr.cadastrarIngredienteReceita(25, 27, "2 copos");
                cr.cadastrarIngredienteReceita(15, 28, "500 g dele cozido e desfiado");
                cr.cadastrarIngredienteReceita(24, 28, "A gosto");
                cr.cadastrarIngredienteReceita(20, 28, "A gosto");
                cr.cadastrarIngredienteReceita(14, 29, "350g");
                cr.cadastrarIngredienteReceita(23, 29, "1 frasco dele esmagado");
                cr.cadastrarIngredienteReceita(14, 30, "500g");
                cr.cadastrarIngredienteReceita(19, 30, "1 unidade");
                cr.cadastrarIngredienteReceita(18, 30, "5 colheres");

        }

        ControleAvaliacao ca = new ControleAvaliacao();
        int min = 1;
        int max = 5;
        int notaAleatoria = 0;

        public void cadastrarAvaliacao() {
                for (int k = 0; k < controleReceita.listarReceitas().size(); k++) {
                        for (int j = 0; j < 15; j++) {
                                notaAleatoria = (int) Math.floor((Math.random() * (max - min + 1) + min));
                                ca.cadastrarAvaliacao("drica", notaAleatoria, k);
                        }

                }
        }
}
