abstract class vechile
{
  abstract void start();
  abstract void stop();
}
class twowheeler extends vechile
{

	public void start()
	{
       System.out.println("slow start");
	}
 public void stop()
 {
    System.out.println("stop smoothly");
 }
}
class fourwheeler extends vechile
{
	public void start()
	{
       System.out.println("fast start");
	}
 public void stop()
 {
   System.out.println("stop very very smoothly ");
 }
}
class main
{
	public static void main (String args[])
	{
    vechile obj =new fourwheeler();
    obj.start();
    obj.stop();
	}
}