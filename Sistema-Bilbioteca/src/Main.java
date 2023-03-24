import java.util.List;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("João", "joao@gmail.com", "Rua A, 123");
        Usuario u2 = new Usuario("Maria", "maria@gmail.com", "Rua B, 456");
        Usuario u3 = new Usuario("Pedro", "pedro@gmail.com", "Rua C, 789");

        Item[] itens = {new Livro("Dom Casmurro", "Machado de Assis", true, 256, 1899, "Editora A"),
                new Revista("Veja", "Victor Civita", true, 6, "Editora Abril"),
                new DVD("Os Incríveis", "Brad Bird", true, "Animacao", 120)};

        for (Usuario u : new Usuario[]{u1, u2, u3}) {
            for (int i = 0; i < 3; i++) {
                Item item = itens[i];
                u.emprestarItem(item);
                System.out.println(u.getNome() + " emprestou " + item.getTitulo());
            }
            for (int i = 0; i < 2; i++) {
                List<Item> itensEmprestados = u.getItensEmprestados();
                if (itensEmprestados.size() > i) {
                    Item item = itensEmprestados.get(i);
                    u.devolverItem(item);
                    System.out.println(u.getNome() + " devolveu " + item.getTitulo());
                }
            }
        }
    }
}