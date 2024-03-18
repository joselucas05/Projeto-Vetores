import java.util.Random;
import java.util.Scanner;
public class App {
        public static void main(String[] args){
            Scanner leitor = new Scanner(System.in); //iniciamos o scanner com o nome leitor.
            int opc;
            int [] vet=null; //Vetor para armazenar números aleatorios
            boolean primeiraOpc = false; //operação boleana para iniciar as outras opções sómente após selecionada a primeira opção.
            
            do{ //usamos o laço de repetição do para realizar o trabalho de continuar no menu.
                System.out.print("|-------------------------------Menu---------------------------------------|\n");
                System.out.print("| Opção 1 - Inicializar o vetor com números aleatórios                     |\n");

                if (primeiraOpc) {
                    System.out.print("| Opção 2 - Imprimir o vetor                                               |\n");
                    System.out.print("| Opção 3 - Verificar se um determinado número está contido no vetor       |\n");
                    System.out.print("| Opção 4 - Buscar o maior número armazenado no vetor                      |\n");
                    System.out.print("| Opção 5 - Calcular a média dos números pares armazenados no vetor        |\n");
                    System.out.print("| Opção 6 - Calcular o percentual dos números ímpares armazenados no vetor |\n");
                    System.out.print("| Opção 7 - Calcula a média centralizada dos números armazenados no vetor  |\n");
                    System.out.print("| Opção 8 - Verificar se dado um valor existe dois números em posições     |\n" 
                         +           "|           distintas que somados são iguais ao valor informado.           |\n");
                    System.out.print("|--------------------------------------------------------------------------|\n");
                }else{
                    System.out.print("opção 0 - sair \n");
                }
                System.out.print("Escolha uma opção: ");
                opc = leitor.nextInt();

                switch (opc) {
                    case 1:
                        System.out.print("Digite o tamanho do vetor: ");
                        int N = leitor.nextInt();
                        if (N <=0){
                            System.out.print("O tamanho do vetor deve ser maior que 0\n");
                            break;
                        }
                        System.out.print("Digite um numero inteiro positivo: ");
                        int max = leitor.nextInt();
                        
                        if (max <=0){
                            System.out.print("O valor deve ser um número inteiro positivo!");
                            break;
                        }
                        
                        vet = new int[N];
                        Random r = new Random();
                        
                        for(int i=0;i<vet.length;i++){
                            vet[i] = r.nextInt(max) +1;
                        }

                        System.out.print("O vetor foi criado com sucesso\n");
                        primeiraOpc = true;
                        break;
                    case 2:
                        if (primeiraOpc) {
                            impVetor();
                        }else{
                            System.out.print("A primeira opção deve ser selecionada primeiro!\n");
                        }
                        break;
                /*    case 3:
                        if (primeiraOpc) {
                            verifNumContVetor();    
                        }else{
                            System.out.print("A primeira opção deve ser selecionada primeiro!\n");
                        }
                        break;
                    case 4:
                        if (primeiraOpc) {
                            maiorNumVet();
                        }else{
                            System.out.print("A primeira opção deve ser selecionada primeiro!\n");
                        }
                        break;
                    case 5:
                        if (primeiraOpc) {
                            calcMediaParesVet();
                        }else{
                            System.out.print("A primeira opção deve ser selecionada primeiro!\n");
                        }
                        break;
                    case 6:
                        if (primeiraOpc) {
                            calcPerImp();
                        }else{
                            System.out.print("A primeira opção deve ser selecionada primeiro!\n"); 
                        }
                        break;
                    case 7:
                        if (primeiraOpc) {
                            calcMediaCent();
                        }else{
                            System.out.print("A primeira opção deve ser selecionada primeiro!\n"); 
                        }
                    case 8:
                        if (primeiraOpc) {
                            verifValSomaIguaisVal();
                        }else{
                            System.out.print("A primeira opção deve ser selecionada primeiro!\n"); 
                        }
                    case 0:
                        System.out.print("Saindo\n");
                        break;
                    default:    
                        System.out.print("Opção inválida. Por favor, tente novamente.");
*/
                    }  
                }while (opc != 0);
                leitor.close();
            }
        // Aqui criamos todas as funções de todas as opções a cima

        public static void impVetor(int[] vet){
            System.out.print("Vetor: ");
            for (int num:vet) {
                System.out.println(num + " ");
            }

        }
    
    
}                   