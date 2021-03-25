class ThrowsDemo{
	public void demo(){
		System.out.println("under method demo");
		int b=3/0;
	}
	public static void main(String[] args) throws Exception {
		ThrowsDemo d=new ThrowsDemo();
		try{
			d.demo();
		}
		catch(ArithmeticException e){
			System.out.println("caught exception");
		}
	}
}