package entrega_introducao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void quintaFeiraTest() {
        App app = new App();
        assertEquals("quinta-feira", app.diaDaSemana(10, 9, 1998));
    }

    public void segundaFeiraTest() {
        App app = new App();
        assertEquals("segunda-feira", app.diaDaSemana(24, 2, 2003));
    }
}
