package br.com.portoseguro.comparadorcpf;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.portoseguro.comparadorcpf.client.ComparadorClient;
import br.com.portoseguro.comparadorcpf.xls.ExcelReader;
import br.com.portoseguro.comparadorcpf.xls.Linha;

@SpringBootApplication
public class ComparadorCpfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComparadorCpfApplication.class, args);
		
		ComparadorClient comparadorClient = new ComparadorClient();
		System.out.println("");
		System.out.println("");
		System.out.println("======== LENDO ARQUIVO EXCEL: ===========");
		System.out.println("");
        List<Linha> linhas = ExcelReader.readFile();
        comparadorClient.lerWebService(linhas);
	}

}
