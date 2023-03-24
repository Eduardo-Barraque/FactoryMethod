package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CategoriaFactoryTest {

    @Test
    void deveRetornarExcecaoParaCategoriaInexistente() {
        try {
            ICategoria servico = CategoriaFactory.obterCategoria("Lar");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Categoria inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCategoriaInvalida() {
        try {
            ICategoria categoria = CategoriaFactory.obterCategoria("Filme");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Categoria inválida", e.getMessage());
        }
    }
}

