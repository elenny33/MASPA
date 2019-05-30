package maspa;

import java.util.Scanner;
import java.util.ArrayList;

public class NotesClass 
{

	private int month;
	private int day;
	private int year;
	private static ArrayList<String> notes = new ArrayList <String>();
	
	public static void main (String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		ArrayList <String> note = new ArrayList <String>();
		
		System.out.println("What month is it?");
		int months = scan.nextInt();
		System.out.println("What day is it?");
		int days = scan.nextInt();
		System.out.println("What year is it?");
		int years = scan.nextInt();
		
		System.out.println("Today is: ");
		getDate(months, days, years);
		
		System.out.println("What would you like to do: \n 1: get your notes \n or \n 2: make a note");
		int option = scan.nextInt();
		
		if(option == 1)
		{
			getNotes();
		}
		if(option == 2)
		{
			makeNote(months, days, years);
		}
		
		getNotes();
	}
	
	public NotesClass()
	{
		month = 0;
		day = 0;
		year = 0;
		//toDoList = null;
	}
	
	public NotesClass( int months, int days, int years, ArrayList <String> note)
	{
		month = months;
		day = days;
		year = years;
		notes = note;
	}
	
	public void setMonth( int m)
	{
		month = m;
	}
	
	public int getMonth ()
	{
		return month;
	}
	
	public void setDay(int d)
	{
		day = d;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public void setYear(int y)
	{
		year = y;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public static ArrayList<String> getNotes()
	{
		return notes;
	}
	
	public static void getDate(int month, int day, int year)
	{
		if (month == 1)
		{
			System.out.print("January " + day +", " + year);
		}
		if (month == 2)
		{
			System.out.println("February " + day + ", " + year);
		}
		if (month == 3)
		{
			System.out.println("March " + day + ", " + year);
		}
		if (month == 4)
		{
			System.out.println("April " + day + ", " + year);
		}
		if (month == 5)
		{
			System.out.println("May " + day + ", " + year);
		}
		if (month == 6)
		{
			System.out.println("June " + day + ", " + year);
		}
		if (month == 7)
		{
			System.out.println("July " + day + ", " + year);
		}
		if (month == 8)
		{
			System.out.println("August " + day + ", " + year);
		}
		if (month == 9)
		{
			System.out.println("September " + day + ", " + year);
		}
		if (month == 10)
		{
			System.out.println("October " + day + ", " + year);
		}
		if (month == 11)
		{
			System.out.println("November " + day + ", " + year);
		}
		if (month == 12)
		{
			System.out.println("December " + day + ", " + year);
		}
	}
	
	public static void makeNote(int months, int days, int years)
	{
		
		System.out.println("What's on your mind?");
		Scanner scan = new Scanner(System.in);
		String note = scan.next();
		
		notes.add(months + " /" + days + " /" + years + ": " + note);
		
	}
}
