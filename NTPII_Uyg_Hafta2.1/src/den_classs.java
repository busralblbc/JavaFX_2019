
abstract class mainclas implements Int_den
{
	 @Override
		public int den_fonk(int a)
		{
			return 0;
		}
	 
	 public void yazdir()
	 {
		 System.out.println("Merhaba Dünya");
	 }
	 abstract void yazdir3();
	
}
 
 class mainclas2 extends mainclas
 {
	 @Override
	 public void yazdir3() {}
	 public void yazdir2() {
		 System.out.println("Sosyal Medya Kötüdür");
	 }
 }





public class den_classs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
