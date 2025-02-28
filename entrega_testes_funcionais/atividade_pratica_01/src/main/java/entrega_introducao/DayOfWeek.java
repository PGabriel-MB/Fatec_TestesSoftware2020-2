package entrega_introducao;

import java.util.Locale;
import org.joda.time.DateTime;

public class DayOfWeek {
    public String diaDaSemana(int dia, int mes, int ano) {
        DateTime dateTime1 = new DateTime(ano, mes, dia, 00, 00, 00);
        DateTime.Property diaSemana = dateTime1.dayOfWeek();

        Locale pt_BR = new Locale("pt", "BR");
        return diaSemana.getAsText(pt_BR);
    }

    public String fimDeSemana(int dia, int mes, int ano) {
        DateTime dt = new DateTime(ano, mes, dia, 00, 00, 00);
        DateTime.Property diaSemana = dt.dayOfWeek();

        Locale pt_BR = new Locale("pt", "BR");
        String dow = diaSemana.getAsText(pt_BR);

        if (dow.equals("domingo") || dow.equals("sabado")) {
            return dow + ", Fim de Semana";
        }
        
        return dow + ", Dia de Semana";
    }
}
