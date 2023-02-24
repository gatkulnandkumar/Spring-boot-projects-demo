package com.example.exportPdf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.exportPdf.util.pdf.PDFGenerator;

@SpringBootApplication
public class ExportPdfApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(ExportPdfApplication.class, args);
		
		PDFGenerator pDFGenerator = ac.getBean("pdfGenerator",PDFGenerator.class);
		
		pDFGenerator.generatePdfReport();
	}

}
