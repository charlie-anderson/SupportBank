package training.supportbank;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

    	listenToUser();
    	/*
    	List<List<String>> lines;
    	String filename = "Transactions2014.csv";
    	
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    	String lineReader = null;
    	
    	while ((lineReader = input.readLine()) != null)
		{
			
		}
    	
    	if (args.length > 0)
    	{
	    	if (args[0] == "List")
	    	{
	    		if (args.length == 2)
	    		{
		    		if (args[1] == "All")
		    		{
		    			lines = openCSV(filename);
		    			
		    			System.out.println("boi");
		    		}
		    		else
		    		{
		    			System.out.println("boi2");
		    		}
	    		}
	    	}
    	}
    	else
    	{
    		System.out.println("Testy!");
    	}*/
    }
    
    public static void listenToUser() {
    	Scanner scanner = new Scanner(System.in);
    	String line = null;
    	
    	System.out.println("=============================================");
    	System.out.println("Hello, welcome to Support Bank!");
    	System.out.println("Please enter one of the supported commands.");
    	System.out.println("You can type 'help' to get this list.");
    	System.out.println("=============================================");
    	System.out.print("Command -> ");
    	
    	while (scanner.hasNext())
    	{
    		line = scanner.nextLine();
    		
    		if (line.equals("help"))
    		{
    			System.out.println("=============================================");
    			System.out.println("List of supported commands:");
    			System.out.println("");
    			System.out.println("'List All':");
    			System.out.println("Provides a list of all people, and the total amount each person owes or is owed.");
    			System.out.println("");
    			System.out.println("'List [account name]':");
    			System.out.println("Provides a list of all transactions relating to that account, including the date and narrative of each transaction.");
    			System.out.println("");
    			System.out.println("'exit':");
    			System.out.println("Exits the program.");
    			System.out.println("=============================================");
    			System.out.print("Command -> ");
    		}
    		else if (line.equals("exit"))
    		{
    			System.out.println("=============================================");
    			System.out.println("The system will now be closed.");
    			System.out.println("Thank you for using this service.");
    			System.out.println("=============================================");
    			return;
    		}
    		else if (line.equals("List All"))
    		{
    			System.out.println("=============================================");
    			System.out.println("This should display a list of all users balances.");
    			System.out.println("=============================================");
    			System.out.print("Command -> ");
    		}
    		else
    		{
    			String [] words = line.split(" ");
    			if (words.length == 2 && words[0].equals("List"))
    			{
    				System.out.println("=============================================");
        			System.out.println("This should display a list of all transactions for user: " + words[1]);
        			System.out.println("=============================================");
        			System.out.print("Command -> ");
    			}
    			else
    			{
    				System.out.println("=============================================");
        			System.out.println("Command not supported. Type help for a list of supported commands.");
        			System.out.println("=============================================");
        			System.out.print("Command -> ");
    			}
    		}
    		
    		
    	}
    	
    	scanner.close();
    }
    
    public static List<List<String>> openCSV(String filename) throws IOException {
    	
    	List<List<String>> lines = new ArrayList<>();
    	BufferedReader reader;
    	String line = null;
    	FileReader file = null;
    	
    	try {
			file = new FileReader(filename);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
    	
    	reader = new BufferedReader(file);
    	
    	while ((line = reader.readLine()) != null)
		{
			String[] values = line.split(",");
			lines.add(Arrays.asList(values));
		}
    	
    	return lines;
    }
}
