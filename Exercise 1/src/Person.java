
public class Person 
{
   private String forName;
   private String lastName;
   private int telePhone;
   private String email;
    int age;
    String name = "Minor";

   
   public Person(String forName, String lastName, int telePhone, String email, int age)
   {
	   this.setForName(forName);
	   this.setLastName(lastName);
	   this.setTelePhone(telePhone);
	   this.setEmail(email);
	   this.setAge(age);
   }

public String getForName() {
	
	
		
	if(age < 18)
	{
		
		return this.forName = name;
	}
	else
	{
		
		return forName;
	}
	
	
	
	
	
}

public void setForName(String forName) {
	this.forName = forName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public int getTelePhone() {
	return telePhone;
}

public void setTelePhone(int telePhone) {
	this.telePhone = telePhone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public String toString()
{
	if(age > 40)
	{
		return forName;
		
	}
	else
	{
		return "";
	}
	
	
}
   
   
   
   
   
   
}
