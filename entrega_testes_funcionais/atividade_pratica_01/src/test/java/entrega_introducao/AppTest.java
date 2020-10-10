package entrega_introducao;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {
    /*
        Partindo da premissa de que Sábado e Domingo são considerados FIM DE SEMANA
        e que os demais dias são considerados DIA DE SEMANA, os testes a seguir tentam verficar ser
        o sistema consegue dizer se a data indicada cai em um 'Fim de Semana' ou
        se cai em algum 'Dia de Semana'

        Sendo toda a criação dos testes se baseando nas técnicas de TDD.
        Sendo assim temos duas Partições de Equivalência a serem testadas:
            - Fim de Semana;
            - Dia de Semana;
    */

    @Test
    public void fimDeSemanaTest() {
        DayOfWeek dow = new DayOfWeek();
        assertEquals("domingo, Fim de Semana", dow.fimDeSemana(11, 10, 2020));
    }

    @Test
    public void diaDeSemanaTest() {
        DayOfWeek dow = new DayOfWeek();
        assertEquals("segunda-feira, Dia de Semana", dow.fimDeSemana(12, 10, 2020));
    }
}
