
interface LambdaIfadeleri {
	public void Goster();
	public void Goster2(int i);
	
	//Default fonksiyonlar Java8 sonrasi kod blogu tanimlanabilir
	//Fonksiyonlar icin kullanilmaktadir.
	
	default void Goster3() {
		System.out.println("Default fonksiyon");
	}
	
}

interface LambdaStatic{
	//Static tanımalamalar Interface icerisinde ozel durumlardir
	//Interface dogrudan abstract tanimli fonksiyonlari kabul ederken
	//Static fonksiyonlari da kabul eder.
	public static void Goster2() {
		System.out.println("Static Fonksiyon");
	}
}

interface LambdaReturn{
	public double KareAl();
}

interface LambdaReturn2{
	public double KareAl(int a);
}

interface LambdaVoid{
	public void Merhaba(int a);
}

interface LambdaDeneme{
	public void Merhaba0();
	public void Merhaba1(int a);
}











