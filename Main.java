import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Produtos> listaDeProdutos = new ArrayList<>();

        boolean continuar;

        do{
            Produtos produtos = new Produtos();

            System.out.println("Insira o código");
            int codigo = scanner.nextInt();
            produtos.setCodigo(codigo);

            System.out.println("Insira a descrição");
            String descricao = scanner.next();
            produtos.setDescricao(descricao);

            System.out.println("Insira preço de compra");
            double precoCompra = scanner.nextDouble();
            produtos.setPrecoDeCompra(precoCompra);

            System.out.println("Insira preço de venda");
            double precoVenda = scanner.nextDouble();
            produtos.setPrecoDeVenda(precoVenda);

            System.out.println("Insira o status");
            String status = scanner.next();
            produtos.setStatus(status);

            listaDeProdutos.add(produtos);

            System.out.println();
            System.out.println("Você deseja continuar? Digite Sim");
            String resposta = scanner.nextLine();

            if(resposta.equals("sim")){
                continuar = true;
            }else{
                continuar = false;
            }

        }while(continuar);

        for(int posicao = 0; posicao < listaDeProdutos.size(); posicao++){
            System.out.println(listaDeProdutos.get(posicao));
        }

    }
}
