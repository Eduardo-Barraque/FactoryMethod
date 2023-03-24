package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFormaturaTest {

    @Test
    void deveCadastrarJogo() {
        ICategoria categoria = CategoriaFactory.obterCategoria("Jogo");
        assertEquals("Jogo Cadastrado", categoria.Cadastrar());
    }

    @Test
    void deveDescadastrarJogo() {
        ICategoria categoria = CategoriaFactory.obterCategoria("Jogo");
        assertEquals("Jogo Descadastrado", categoria.Descadastrar());
    }

}
