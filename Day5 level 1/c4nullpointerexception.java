public class c4nullpointerexception{
	public static void create(){
	String s1 = null;
        String s2 = "java";
		System.out.println(s1.equals(s2));
	}
		
	public static void main(String args []){
		

try{
c4nullpointerexception.create();
}
catch 	(NullPointerException e){
	System.out.println("exception = " + e.getMessage());
}
	}
	}
	