package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	
    public void add(int a, int b, int c) {
		
		System.out.println(a+b+c);
	}
    
    public void sub(int a, int b) {
		
		System.out.println(a-b);
	}
    
    public void mul(int a, double b) {
		
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cal = new Calculator();
		
		cal.add(2, 3);
		
		cal.add(2, 3, 4);
		
		cal.sub(3, 1);
		
		cal.mul(2, 4.5);

	}

}
