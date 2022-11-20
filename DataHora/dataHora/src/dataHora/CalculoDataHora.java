package dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {

	public static void main(String[] args) {

		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		// Duração entre duas datas
		LocalDate semanaPassada = d01.minusDays(7);
		LocalDate proximaSemana = d01.plusDays(7);

		System.out.println("semanaPassada = " + semanaPassada);
		System.out.println("proximaSemana = " + proximaSemana);

		// Duração entre duas datas e horas
		LocalDateTime semanaPassadaDateTime = d02.minusDays(7);
		LocalDateTime proximaSemanaDateTime = d02.plusDays(7);
		
		System.out.println();
		System.out.println("semanaPassadaDateTime = " + semanaPassadaDateTime);
		System.out.println("proximaSemanaDateTime = " + proximaSemanaDateTime);
		
		
		//Duração entre duas datas com Instant
		Instant semanaPassadaInstant = d03.minus(7,ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d03.minus(7,ChronoUnit.DAYS);
		
		System.out.println();
		System.out.println("semanaPassadaInstant = " + semanaPassadaInstant);
		System.out.println("proximaSemanaInstant = " + proximaSemanaInstant);
		
		//Calculando a duração entre duas datas
		Duration t1 = Duration.between(semanaPassadaDateTime, d02);
		System.out.println();
		System.out.println("t1 dias = " + t1.toDays());
		
		//Entre dois LocalDate não dá pra calcular o tempo passado, precisa converter para LocalDateTime
		Duration t2 = Duration.between(semanaPassada.atStartOfDay(), d01.atStartOfDay());
		System.out.println();
		System.out.println("t2 dias = " + t2.toDays());
		
		//Calculo entre datas Instant
		Duration t3 = Duration.between(semanaPassadaInstant, d03);
		System.out.println();
		System.out.println("t3 dias  = " + t3.toDays());
		//Convertendo a duração da data maior para a menor
		Duration t4 = Duration.between(d03,semanaPassadaInstant);
		System.out.println("t4 dias = " + t4.toDays());
	}

}
