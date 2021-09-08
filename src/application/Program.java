package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.dataProduct;
import service.calculationServise;

public class Program {

	public static void main(String[] args) {
		List<dataProduct> list = new ArrayList<>();
		
		String path = "C:\\temp\\product.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line!=null) {
				String[] filds = line.split(",");
				list.add(new dataProduct(filds[0], Double.parseDouble(filds[1])));
				line = br.readLine();
			}
			dataProduct max = calculationServise.max(list);
			System.out.println("Max: " + max);
			
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
