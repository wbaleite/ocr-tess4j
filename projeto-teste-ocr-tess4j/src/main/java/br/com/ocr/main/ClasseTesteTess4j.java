package br.com.ocr.main;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ClasseTesteTess4j {

	public static void main(String[] args) {

		String caminhoPdf = ".\\src\\main\\resources\\Capturar123.JPG";
		System.out.println(extractImage(caminhoPdf));
		
	}

	public static String extractImage(String filePath) {
		File imageFile = new File(filePath);
		Tesseract instance = new Tesseract();
		instance.setDatapath(".\\src\\main\\resources");
		try {
			String result = instance.doOCR(imageFile);
			return result;
		} catch (TesseractException e) {
			System.err.println(e.getMessage());
			return "Error while reading image";
		}
	}

}
