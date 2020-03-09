import java.io.IOException;

public class Deneme {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println(12/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hata:"+ e.getMessage());
		}
		finally {
			
		}
		
		KendiException a=new KendiException();
		try {
			a.Yolla();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		a.YollaTryCatch();

	}

}


class KendiException extends Exception{
	void Yolla() throws Exception{
		//.....
		throw new Exception();
	}
	
	void YollaTryCatch() throws Exception{
		try {
			Yolla();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}
















