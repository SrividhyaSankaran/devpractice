package devpractice.Threading;

class Exec {

	void showExec(String[] str1, String[] str2) {
	
		if(str1.length == str2.length) {
			
			for(int i=0;i<=str1.length-1;i++) {
					
				System.out.println(str1[i]+" - "+str2[i]);
				
				try{
				
					Thread.sleep(2000);
				
				}catch(Exception e) {
					
					e.printStackTrace();
				
				}
			}
		}
	}
}

class Tech extends Thread {
	
	Exec t;
	
	public Tech(Exec t) {
		this.t=t;
	}
	
	@Override
	public void run() {
		String tech[] = {"Java", "Python", "AWS"};
		String emp[] = {"Das", "Amal", "Leela"};
		t.showExec(tech, emp);
	}
	
}


public class MyClass {

	public static void main(String[] args) {
		Exec ex = new Exec();
		
		Tech tec = new Tech(ex);
		tec.start();
		
	}
}
