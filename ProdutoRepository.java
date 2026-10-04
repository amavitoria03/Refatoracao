import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository<T> {

    private final List<T> produtos = new ArrayList<>();

    public void adicionar(T produto) {
        produtos.add(produto);
    }

    public List<T> listarTodos() {
        return produtos;
    }
}