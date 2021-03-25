class Try_catch{
	public static void main(String[] args) {
		int a=3;
	try{
		for(int i=-1;i<2;i++){
			int b=a/i;
			System.out.println("value of b="+b);
		}
	}
	catch(Exception e){
		System.out.println("caught exception\n"+e);
	}
}
}