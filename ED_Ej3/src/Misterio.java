
public class Misterio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = "ALVMENNYTPULRÑAP";  	
		
		String array[] = texto.split("");
		
        for (int i = 0; i < array.length;i+=2) {
            System.out.print(array[i]);
        }
		
	}

}
