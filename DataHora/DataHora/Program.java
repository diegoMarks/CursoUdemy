package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		
		//Criando formato para customizar data e hora
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Utilizada para trazer a data de agora.
		LocalDate d01 = LocalDate.now();
		System.out.println(d01);
		
		//Utilizada para trazer a data e hora de agora.
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		//Data de agora com Instant, traz a hora com modelo GMT (Horário de Londres).
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		//Convertendo texto ISO-8601 para Data
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println(d04);
		
		//Convertendo texto ISO-8601 para Data com hora.
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		System.out.println(d05);
		
		//Convertendo texto ISO-8601 para Data com hora com Instant.
		Instant d06 = Instant.parse("2022-07-20T01:30:26z");
		System.out.println(d06);
		
		//Convertendo texto ISO-8601 para Data com hora com Instant especifícando um Time Zone diferente.
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d07);
		
		//Texto com formato customizado para data hora
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println(d09);
		
		//Também pode ser feita a chamada direta da formatação
		LocalDateTime d10 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(d10);
		
		//Instânciando datas a partir de dados isolados, dia - mês - ano isoladamente.
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		System.out.println(d11);
		
		//Com horário
		LocalDateTime d12 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println(d12);
	}

}
