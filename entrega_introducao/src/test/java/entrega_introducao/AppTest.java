package entrega_introducao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void quintaFeiraTest() {
        DayOfWeek dow = new DayOfWeek();
        assertEquals("quinta-feira", dow.diaDaSemana(10, 9, 1998));
    }

    @Test
    public void segundaFeiraTest() {
        DayOfWeek dow = new DayOfWeek();
        assertEquals("segunda-feira", dow.diaDaSemana(24, 2, 2003));
    }
}
