package day18;


public class RuntimeDemo {
	public static void main(String args[]){
		Runtime r = Runtime.getRuntime();
		try {
//			Process p = r.exec("D:/Program Files/QQ/Tencent/QQLite/Bin/QQ.exe");
			Process p = r.exec("notepad.exe D:/Program Files/QQ/Tencent/QQLite/Bin/QQ.exe");
			
//			Thread.sleep(2000);
//			p.destroy();//杀死程序速度很快
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
