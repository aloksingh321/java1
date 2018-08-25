class overload 
{
  
  int x;
  float y;
    public void add(int x)
    {
       System.out.println(x);
    }
  public void add(int x,float y)
  {
    this.x=x;
    this.y=y;
  }
  public void print()
  {
  	System.out.println("x is:- "+x+ " y is:- "+y);
  System.out.println("add is:- "+(x+y));
  }
}
class main
{
	public static void main(String args[])
	{
      overload obj= new overload();
        obj.add(5);
        obj.add(0,0);
      obj.print();
    
	}
}