package br.com.portoseguro.comparadorcpf.xls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    private static final String FILE_NAME = "C://comparador/arquivo.xlsx";

    public static List<Linha> readFile() {
    	
    	FileInputStream excelFile = null;
        Workbook workbook = null;
        List<Linha> linhas = null;
        Linha linha = null;

        try {

            excelFile = new FileInputStream(new File(FILE_NAME));
            workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(1);
            Iterator<Row> iterator = datatypeSheet.iterator();
            linhas = new ArrayList<Linha>();
            int countLines = 1;
            
            iterator.next(); //pula primeira linha do cabeçalho

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();  
                
                Iterator<Cell> cellIterator = currentRow.iterator();                 
                
                int countCell = 0;
                cellIterator.next(); //pula primeira coluna do excel                
                
              	System.out.print("Linha " + countLines++ + " --> ");
              	linha = new Linha();

                while (cellIterator.hasNext()) {
                	
                    Cell currentCell = cellIterator.next();      
                    countCell++;
                    
                    if (countCell == 1) {
	                    if (currentCell.getCellType() == CellType.STRING) {
	                        System.out.print("Sucursal " + currentCell.getStringCellValue() + "  ");
	                        linha.setSucursal(Long.parseLong(currentCell.getStringCellValue()));
	                    } else if (currentCell.getCellType() == CellType.NUMERIC 
	                    			|| currentCell.getCellType() == CellType.FORMULA) {
	                        System.out.print("Sucursal " + Math.round(currentCell.getNumericCellValue()) + "  ");
	                        linha.setSucursal(Math.round(currentCell.getNumericCellValue()));
	                    } 
                    }
                    
                    if (countCell == 2) {
	                    if (currentCell.getCellType() == CellType.STRING) {
	                        System.out.print("Ramo " + currentCell.getStringCellValue() + "  ");
	                        linha.setSucursal(Long.parseLong(currentCell.getStringCellValue()));
	                    } else if (currentCell.getCellType() == CellType.NUMERIC 
                    				|| currentCell.getCellType() == CellType.FORMULA) {
	                        System.out.print("Ramo " + Math.round(currentCell.getNumericCellValue()) + "  ");
	                        linha.setRamo(Math.round(currentCell.getNumericCellValue()));
	                    }
                    }
                    
                    if (countCell == 3) {
	                    if (currentCell.getCellType() == CellType.STRING) {
	                        System.out.print("Apolice " + currentCell.getStringCellValue() + "  ");
	                        linha.setSucursal(Long.parseLong(currentCell.getStringCellValue()));
	                    } else if (currentCell.getCellType() == CellType.NUMERIC 
                    				|| currentCell.getCellType() == CellType.FORMULA) {
	                        System.out.print("Apolice " + Math.round(currentCell.getNumericCellValue()) + "  ");
	                        linha.setApolice(Math.round(currentCell.getNumericCellValue()));
	                    }
                    }
                    
                    if (countCell == 4) {
	                    if (currentCell.getCellType() == CellType.STRING) {
	                        System.out.print("CPF " + currentCell.getStringCellValue() + "  ");
	                        linha.setSucursal(Long.parseLong(currentCell.getStringCellValue()));
	                    } else if (currentCell.getCellType() == CellType.NUMERIC 
                    				|| currentCell.getCellType() == CellType.FORMULA) {
	                        System.out.print("CPF " + Math.round(currentCell.getNumericCellValue()) + "  ");
	                        String cpfCompleto = String.valueOf(Math.round(currentCell.getNumericCellValue()));
	                        String cpf = cpfCompleto.substring(0, cpfCompleto.length() - 2);
	                        String digito = cpfCompleto.substring(cpfCompleto.length() - 2);
	                        linha.setCpf(Long.parseLong(cpf));
	                        linha.setDigito(Long.parseLong(digito));
	                    }
                    }
                }         
                System.out.println();
                linhas.add(linha);
            }
            
            workbook.close();
            excelFile.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        return linhas;
    }
}