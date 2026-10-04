import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoService {

    public List<Produto> buscarPorCategoria(
            List<Produto> produtos,
            String categoria) {
            
        return produtos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase(categoria))
                .collect(Collectors.toList());
    }

    public List<Produto> buscarAbaixoDoPreco(
            List<Produto> produtos,
            double precoMaximo) {

        return produtos.stream()
                .filter(p -> p.getPreco() <= precoMaximo)
                .collect(Collectors.toList());
    }

    public List<String> obterNomes(
            List<Produto> produtos) {

        return produtos.stream()
                .map(Produto::getNome)
                .collect(Collectors.toList());
    }

    public void ordenarPorPreco(List<Produto> produtos) {
        produtos.sort(Comparator.comparingDouble(Produto::getPreco));
    }
}