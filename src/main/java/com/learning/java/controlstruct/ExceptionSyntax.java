package com.learning.java.controlstruct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/* Java: Исключения (Exception) */


public class ExceptionSyntax {

	public static void main(String[] args) {
		/* try-catch-finally */
		try {
			URL url = new URL( "http://tirthalpatel.blogspot.com" );
			BufferedReader buffered = new BufferedReader( new InputStreamReader(url.openStream()) );
			try {
				String line;
				while((line = buffered.readLine()) != null)
					System.out.println( line );
			} finally {
                buffered.close();
			}
		} catch(MalformedURLException e) {  // ( ловим специальное исключение.. )
			System.out.println("Bad URL");
		} catch (IOException e) {  // ( ловим общее исключение.. )
			System.out.println("Problem in reading data: " + e.getMessage());
		}
	}
}
