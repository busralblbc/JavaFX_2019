
public class HataAyiklama {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hata:"+e.getMessage());
		}	
		*/
		KendiException obg1=new KendiException();
		try {
			System.out.println(10/0);			
			obg1.Yolla();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hata:"+e.getMessage());
		}	
		
		obg1.YollaException();
		

	}

}


class KendiException extends Exception{
	void Yolla() throws Exception {
		throw new Exception();
	}
	
	void YollaException() throws Exception{
		try {
			Yolla();
		} catch (Exception e) {
			System.out.println("Hata:"+e.getMessage());
		}
	}
	
	
	
	
	
	
	
}
