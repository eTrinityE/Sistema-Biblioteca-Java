import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String endereco;
    private ArrayList<Item> itensEmprestados;

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.itensEmprestados = new ArrayList<Item>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Item> getItensEmprestados() {
        return itensEmprestados;
    }

    public void emprestarItem(Item item) {
        if (item.isDisponivel()) {
            item.setDisponivel(false);
            itensEmprestados.add(item);
        } else {
            System.out.println("Item indisponível para empréstimo.");
        }
    }

    public void devolverItem(Item item) {
        if (itensEmprestados.contains(item)) {
            item.setDisponivel(true);
            itensEmprestados.remove(item);
        } else {
            System.out.println("Item não encontrado na lista de empréstimos.");
        }
    }
}
