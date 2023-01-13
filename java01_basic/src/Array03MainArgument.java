
public class Array03MainArgument {

	public static void main(String[] args) {
		
				//.equals => String compare..
			//args[0] , "ggm" same ->  true, different -> false 
		if(args[0].equals("ggm") && args[1].equals("1234")) {
		for (int i=0; i<args.length;i++) {
			System.out.println("args["+i+"] = "+ args[i]);
		}
		}else {
			System.out.println("wrong id or pw.");
		}
	}

}
