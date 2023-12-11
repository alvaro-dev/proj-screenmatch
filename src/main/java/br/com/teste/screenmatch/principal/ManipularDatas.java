package br.com.teste.screenmatch.principal;

import java.time.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ManipularDatas {
    public static void main(String[] args) {
        String pattern = "E, dd MMM yyyy HH:mm:ss z";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        System.out.println("date formated: " +date);

        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);

        LocalDate aniversarioAlice = LocalDate.of(2005, Month.SEPTEMBER, 15);
        System.out.println("aniversarioAlice: " +aniversarioAlice);

        int idade =  hoje.getYear() - aniversarioAlice.getYear();
        System.out.println(idade);

        Period periodo = Period.between(hoje, aniversarioAlice);
        System.out.println(periodo);

        //Local Time
        LocalTime horaHoje = LocalTime.now();
        System.out.println("horaHoje:" + horaHoje);

        LocalTime aniversarioHoraAlice = LocalTime.of(22, 33, 15);
        System.out.println("aniversarioHoraAlice:" + aniversarioHoraAlice);

        //Horário e data atual
        LocalDateTime dataHoraHoje = LocalDateTime.now();
        System.out.println("dataHoraHoje: " + dataHoraHoje);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data/hora atual formatada : " + dataHoraHoje.format(formatador));
    }
}
