class Try_catch_finally{
	public static void main(String[] args) {
		int a[]=new int[3];
		try{
			for(int i=0;i<4;i++){
			a[i]=i;
			}
		}
		catch(Exception e){
			System.out.println("exception occurred\n"+e);
		}
		finally{
			System.out.println("finally block executed");
		}
	}
}