package entrega_introducao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    /*
        Partindo da premissa de que Sábado e Domingo são considerados FIM DE SEMANA
        e que os demais dias são considerados DIA DE SEMANA, os testes a seguir tentam verficar ser
        o sistema consegue dizer se a data indicada cai em um 'Fim de Semana' ou
        se cai em algum 'Dia de Semana'

        Sendo toda a criação dos testes se baseando nas técnicas de TDD
    */

    @Test
    public void fimDeSemanaTest() {
        DayOfWeek dow = new DayOfWeek();
        assertEquals("domingo, Fim de Semana", dow.fimDeSemana(10, 9, 1998));
    }

    @Test
    public void diaDeSemanaTest() {
        DayOfWeek dow = new DayOfWeek();
        assertEquals("segunda-feira, Dia de Semana", dow.fimDeSemana(24, 2, 2003));
    }
}
