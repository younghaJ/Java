
package ch10;

public class ExceptionEx5 {
	public static void main(String[] args) {
		FileReader fr = myRead("aaa.txt");
	}
}
	
	punlic static FileReader myRead(String name){
		thorows FileNotFoungException{
		Filereader fr = new FileReader(name) ;
		return fr;
		}
		
}

