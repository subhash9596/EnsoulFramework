package com.katalyst.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import com.katalyst.base.TestBase;
import com.opencsv.CSVWriter;

public class ReadWriteDataFromFile extends TestBase{
	static File file = new File(currentDir + "\\src\\main\\resources\\"); 

	public static void writeDatatoCSV(String Key, String Data) 
	{ 
		try { 
			FileWriter outputfile = new FileWriter(file); 
			CSVWriter writer = new CSVWriter(outputfile); 
			List<String[]> data = new ArrayList<String[]>(); 
			data.add(new String[] {Key,Data}); 
			writer.writeAll(data); 
			writer.close(); 
		} 
		catch (IOException e) { 
			e.printStackTrace(); 
		} 
	} 

	public static String readDataFromCSV() throws IOException 
	{ 
		String[] array = null;
		String value = null;
		List<String> lines = Files.readAllLines(file.toPath(), 
				StandardCharsets.UTF_8);
		for (String line : lines) {
			array = line.split(",", -1);
			value= array[1].replaceAll("\"", "");
			System.out.println(value);
		}
		return value;
	}
}
