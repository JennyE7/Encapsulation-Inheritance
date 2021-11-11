package encapsulation;

public class Runner {

	public static void main(String[] args) {
		
		Encapsulation example = new Encapsulation();
		
		example.setDbl(4.6);
		example.setFlt((float)3.5);
		example.setInteger(7);
		example.setLng(32);
		example.setStr("Green");
		
		System.out.println(example.getDbl());
		System.out.println(example.getFlt());
		System.out.println(example.getInteger());
		System.out.println(example.getLng());
		System.out.println(example.getStr());
		
		System.out.println(example);

	}

}
