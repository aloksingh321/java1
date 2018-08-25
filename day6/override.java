class Animal 
{

    String breed;
    String colour;
    Animal()
    {
      this.breed="many breed according to type of animal";
      this.colour="different colour";
    }
   public void animalfeatures()
   {
     System.out.println("breed of Animal is:- "+breed);
     System.out.println("colour of Animal is:-"+colour);
   }
   public void speak()
   {
     System.out.println("different voice");
   }
}
class dog extends Animal
{
  String breed;
  String colour;
  dog()
  {
  this.breed="indian";
  this.colour="black";
  }
  public void dogfeatures()
  {
   System.out.println("breed of dog is:- "+breed);
   System.out.println("colour of dig is:- "+colour);
  } 
   public void speak()
   {
     System.out.println("loud voice");
   }
   }
   
class cat extends Animal
{
	String breed;
	String colour;
   cat()
   {
    this.breed="indian";
    this.colour="white";
   }
 public void cat()
  {
   System.out.println("breed of dog is:- "+breed);
   System.out.println("colour of dig is:- "+colour);
  } 
public void speak()
{
	System.out.println("Dim voice");
}

}
class main
{
	public static void main(String args[])
	{ 
  Animal obj =new cat();
  //here overide function speak()
  obj.speak();

  }	
}