package factorymethod;

public class CategoriaJogo implements ICategoria{
    @Override
    public String Cadastrar() {
        return "Jogo Cadastrado";
    }

    @Override
    public String Descadastrar() {
        return "Jogo Descadastrado";
    }
}
