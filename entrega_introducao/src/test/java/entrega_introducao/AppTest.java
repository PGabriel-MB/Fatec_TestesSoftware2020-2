package entrega_introducao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void quintaFeiraTest() {
        App app = new App();
        assertEquals("quinta", app.diaDaSemana(1998, 9, 10));
    }

    public void segundaFeiraTest() {
        App app = new App();
        assertEquals("segunda", app.diaDaSemana(2003, 2, 24));
    }
}
