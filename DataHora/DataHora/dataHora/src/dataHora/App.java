package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class App {

	public static void main(String[] args) {
		//Formas alternativas de instânciar data
		
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		//Formato criado para usar na classe Instant
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		//Formato usando especificação própria do Java
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		
		//Formatação para Instant
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01 = " + d01.format(fmt1));
		//Também pode ser feita dessa forma
		System.out.println("d01 = " + fmt1.format(d01));
		//Pode ser instânciada diretamente
		System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		System.out.println();
		//Instância de LocalDateTime pode aceitar dois tipos diferentes de formatação
		System.out.println("d02 = " + d02.format(fmt1));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d02 = " + d02.format(fmt4));
		
		System.out.println();
		//Instant
		System.out.println("d03 = " + fmt3.format(d03));
		System.out.println("d03 = " + fmt5.format(d03));
		//Chamar o toString() deste objeto também imprime a data formatada padrão ISO
		System.out.println("d03 = " + d03.toString());
		
	}

}
