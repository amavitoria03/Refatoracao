import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProdutoRepository<Produto> repository = new ProdutoRepository<>();

        repository.adicionar(
            new Produto("Notebook", "Eletrônicos", 3500)
        );

        repository.adicionar(
            new Produto("Mouse", "Eletrônicos", 120)
        );

        repository.adicionar(
            new Produto("Teclado", "Eletrônicos", 250)
        );

        repository.adicionar(
            new Produto("Cadeira", "Móveis", 900)
        );

        repository.adicionar(
            new Produto("Mesa", "Móveis", 700)
        );

        ProdutoService service = new ProdutoService();

        List<Produto> produtos = repository.listarTodos();

        System.out.println("=== ELETRÔNICOS ===");

        List<Produto> eletronicos =
            service.buscarPorCategoria(produtos, "Eletrônicos");

        eletronicos.forEach(System.out::println);

        System.out.println("\n=== ATÉ R$ 800 ===");

        List<Produto> baratos =
            service.buscarAbaixoDoPreco(produtos, 800);

        baratos.forEach(System.out::println);

        System.out.println("\n=== NOMES ===");

        List<String> nomes =
            service.obterNomes(produtos);

        nomes.forEach(System.out::println);

        System.out.println("\n=== ORDENADOS POR PREÇO ===");

        service.ordenarPorPreco(produtos);

        produtos.forEach(System.out::println);
    }
}