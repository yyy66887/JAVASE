package day15;

public class Fanxing {

	public static void main(String[] args) {
		Tools<Worker> t = new Tools<Worker>();
		t.setObj(new Worker());
		t.getObj();
 	}

}
class Worker{
	
}
class Tools<E>{
	private E e;
	public void setObj(E e){
		this.e=e;
	}
	public E getObj(){
		return e;
	}
}