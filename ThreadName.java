class A extends Thread{
	public void run(){
		System.out.println("name of thread is "+Thread.currentThread().getName());
	}
}
class ThreadName{
	public static void main(String[] args) {
		A a=new A();
		a.setName("Trapti");
		a.start();
	}
}