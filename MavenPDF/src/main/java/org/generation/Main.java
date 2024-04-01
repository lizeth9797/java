package org.generation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class Main {

	public static void main(String[] args)  {
			Document doc=new Document();

		try {
			PdfWriter.getInstance(doc, new FileOutputStream("CH37.pdf"));
			doc.open();
			//doc.add(new Paragraph("CH37 Meme masters feliz") );
			Image image= Image.getInstance("y.png");
			image.scaleAbsolute(100,100);
			//crear tabla
			PdfPTable table=new PdfPTable(3); //3 columnas
			PdfPCell cell;
			cell = new PdfPCell(new Phrase("Recibo de Nómina"));
			cell.setColspan(3);
			table.addCell(cell);
			
			cell = new PdfPCell(new Phrase("Nombre:"));
			cell.setRowspan(2);
			table.addCell(cell);
			table.addCell("RFC:");
			table.addCell("Fecha:");
			table.addCell("Departamento:");	
			
			
			doc.add(image);
			doc.add(new Paragraph("Empresa CH37 SA de CV RL"));
			doc.add(new Paragraph(" "));
			doc.add(table);
			
		}catch(FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}//catch
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		doc.close();
	}//main
}//classMain
