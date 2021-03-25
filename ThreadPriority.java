class A extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
}
class ThreadPriority{
	public static void main(String[] args) {
		A a=new A();
		A b=new A();
		A c=new A();
		A d=new A();
		a.setPriority(1);
		b.setPriority(10);
		c.setPriority(5);
		a.start();
		b.start();
		c.start();
		d.start();
	}
}