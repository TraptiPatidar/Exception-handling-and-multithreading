class Demo implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child Thread "+i);
		}
	}
}
class ImplementingRunnable{
	public static void main(String[] args) {
		Demo d=new Demo();
		Thread t=new Thread(d);
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main Thread "+i);
		}
	}
}