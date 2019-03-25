package br.com.portoseguro.comparadorcpf.xls;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {

    private static final String FILE_NAME = "C://comparador/resultado.xlsx";

    public static void gravarDiferenca(List<Linha> linhas) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Resultado Comparacao");        

        int rowNum = 0;
        System.out.println("");
        System.out.println("=== CRIANDO ARQUIVO RESULTADO ===");
        System.out.println("");
        
        Row cabecalho = sheet.createRow(rowNum++);
        int col = 0;            
        Cell celula = cabecalho.createCell(col++);
        celula.setCellValue("CPF");
        celula = cabecalho.createCell(col++);
        celula.setCellValue("SUCURSAL");
        celula = cabecalho.createCell(col++);
        celula.setCellValue("RAMO");
        celula = cabecalho.createCell(col++);
        celula.setCellValue("APOLICE");
        
        long cpf = 0;

        for (Linha linha : linhas) {
        	
        	if (cpf != linha.getCpf()) {
	            Row row = sheet.createRow(rowNum++);
	            int colNum = 0;            
	            Cell cell = row.createCell(colNum++);
	            cell.setCellValue(linha.getCpf() + linha.getDigito());
	            cpf = linha.getCpf();
        	}
            
            Row row2 = sheet.createRow(rowNum++);
            int colNum2 = 0;            
            Cell cell2 = row2.createCell(colNum2++);
            cell2.setCellValue("");
            
            Cell cell3 = row2.createCell(colNum2++);
            cell3.setCellValue(linha.getSucursal());
            
            Cell cell4 = row2.createCell(colNum2++);
            cell4.setCellValue(linha.getRamo());
            
            Cell cell5 = row2.createCell(colNum2++);
            cell5.setCellValue(linha.getApolice());
                           
        }

        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("=== FINALIZADO ===");
        System.exit(0);
    }
    
}