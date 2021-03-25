class A extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("child Thread "+i);
		}
	}
}
class ThreadClass{
	public static void main(String[] args) {
		A a=new A();
		a.start();
		for(int i=0;i<10;i++){
			System.out.println("main Thread "+i);
		}

	}
}