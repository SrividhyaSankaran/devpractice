package devpractice.Threading;

class Process {

	synchronized void showExec(Technology tec) {
	
			String str1[] = tec.tech;
			for(int i=0;i<=str1.length-1;i++) {
					
				System.out.println(str1[i]+" - "+tec.employ.get(i));
				
				try{
				
					Thread.sleep(2000);
				
				}catch(Exception e) {
					
					e.printStackTrace();
				
				}
			}
	}
}

class Employ extends Thread {
	
	
	String emp[] = {"Das", "Amal", "Leela"};
	
	public String get(int index) {
		return emp[index];
	}
	
}

class Technology extends Thread {
	
	Process process;
	Employ employ;
	String tech[] = {"Java", "Python", "AWS"};
	
	public Technology(Process process, Employ employ) {
		this.process=process;
		this.employ=employ;
		
	}
	
	@Override
	public void run() {
		Technology tec = new Technology(process, employ);
		process.showExec(tec);
	}
	
}



public class MyClass1 {
	
	public static void main(String[] args) {
		Process pr = new Process();
		Employ em = new Employ();
		Technology tec = new Technology(pr, em);
		em.start();
		tec.start();
         
	}

}
