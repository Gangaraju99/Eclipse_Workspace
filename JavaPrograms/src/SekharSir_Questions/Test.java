package SekharSir_Questions;
    

  class Employee {
	private int point;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}

 class PerformanceRating{
	 
	 static  int outstanding;
	static int good;
    static int average;
    static int poor;
    static {
    	outstanding =4;
    	good = 3;
    	average = 2;
    	poor =1;
    }

   public static void  calculatePerformance(  int employee) {
    	
     int point = employee;
     if(point>80 && point<100) {
    	 System.out.println(outstanding);
     }else if(point >60 && point <79) {
    	 System.out.println(good);
     }else if (point>50 && point<59) {
    	 System.out.println(average);
    	 
     }else if( point >1 && point<49 ) {
    	 System.out.println(poor);
     }
    	 
     
     
    }
}




public class Test{
	public static void main(String[] args) {
		
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		
		PerformanceRating performance = new PerformanceRating();
		
		performance.calculatePerformance(86);
		
		
		
		
		
		
		
	}
}

