class MyException extends RuntimeException{
	MyException(String s){
		super(s);
	}
}
class Own_exception{
	public static void main(String[] args) {
		throw new MyException("my exception");
	}
}