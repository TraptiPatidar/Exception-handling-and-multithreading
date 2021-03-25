class A extends Thread{
	public void run(){
		for (int i=0;i<3;i++){
			System.out.println("thread going to sleep");
			try{
			Thread.sleep(1000);}
			catch(InterruptedException e){}
			System.out.println(i);
		}
	}
}
class JoinSleep{
	public static void main(String[] args)throws InterruptedException {
		A a=new A();
		A b=new A();
		A c=new A();
		a.start();
		a.join();
		b.start();
		c.start();
	}
}