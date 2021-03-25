class Exception_propagation{
	public void show(){
		System.out.println("under show");
		int b=2/0;
	}
	public void show1(){
		show();
	}
	public void show2(){
		try{
			show1();
		}
		catch(Exception e){
			System.out.println("caught exception");
		}
	}
	public static void main(String[] args) {
		Exception_propagation t=new Exception_propagation();
		t.show2();
	}
}