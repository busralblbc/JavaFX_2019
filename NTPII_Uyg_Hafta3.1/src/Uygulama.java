
public class Uygulama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Metot 1
		LambdaIfadeleri obj1=new LambdaIfadeleri() {
			
			@Override
			public void Goster2(int i) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void Goster() {
				// TODO Auto-generated method stub
				System.out.println("Local Class implement");
			}
		};
		obj1.Goster();
		
		//Metot 2:
		LambdaIfadeleri obj2=new Deneme();
		obj2.Goster();
		
		//Metot 3:
		Deneme obj3=new Deneme();
		obj3.Goster();
		
		//Metot 4:
		LambdaReturn obj4=()->{return 5*5;};
		//Eger kod blogu tek satırdan olusuyorsa
		LambdaReturn obj5=()-> 5*5;
		
		LambdaReturn2 obj6=(a)->{return a*a;};
		obj6.KareAl(5);
		//Tek parametreli fonksiyonlarda ( ) kullanilmayabilir
		LambdaReturn2 obj7=a->{return a*a;};
		//Metot 5:
		LambdaVoid obj8= a-> System.out.println("Merhaba: "+ a);
		
		//LambdaDeneme obj9=()->{System.out.println("Merhaba: ");};
		//Eger interface 2 adet abstract fonksiyon iceriyorsa 
		//Bunlardan hangisinin override edilecegine karar veremez.
		//Bu yuzden interface lambda ifadeleri icin yalnizc a 1 abstract fonk. kullanilmalidir
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	}

}

class Deneme implements LambdaIfadeleri{
	@Override
	public void Goster() {
		System.out.println("(Deneme)Override edilen Goster fonksiyonu");
	}
	@Override
	public void Goster2(int i) {
		System.out.println("(Deneme)Override edilen GosterPrametreli:"+i);
	}
}
