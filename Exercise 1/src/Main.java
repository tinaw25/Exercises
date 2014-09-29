import java.util.ArrayList;


public class Main 
{
	public static void main(String[] args)
	{
		
		
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person("Hans", "Hansen", 34565434, "hans@email.dk", 40));	
		personList.add(new Person("Lars", "Overgaard", 123456, "Lars@email.dk", 44));
		personList.add(new Person("Tina", "Villumsen", 45906721, "tina@email.dk", 33));
		personList.add(new Person("Marianne", "Nielsen", 34565434, "marianne@email.dk", 60));
		personList.add(new Person("Valdemar", "Denstore", 8964757, "valdemar@email.dk", 15));
		personList.add(new Person("Willi", "Bendtsen", 34565434, "willi@email.dk", 10));
	
		
		//System.out.println(personList + " ");
		
		
		for (Person person : personList) 
		{
			if(person.getForName() != "Minor")
			{
				System.out.println(person.getForName());
			}
			
		
		}
	
		
	}
}
