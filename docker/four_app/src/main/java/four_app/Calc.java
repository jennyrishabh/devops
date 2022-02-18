/**
 * 
 */
package four_app;


public class Calc{
	
	public int sum(int ... a) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i : a) {
			sum+=i;
		}
		return sum;
	}
	
	
	public int sum(Object[] a) {
		// TODO Auto-generated method stub
		int sum =0;
		for(Object i : a) {
			if(i instanceof String) {
				String temp = (String)i;
				int l = temp.length();
				if(l>1) {
					if(temp.equals("three")) {sum+=three();};
					if(temp.equals("four")) {sum+=four();};
				}
				else {
					int n = Integer.parseInt((String)i);
					sum+=n;
				}
			}
			else if(i instanceof Integer){
				int n = (int)i;
				sum+=n;
			}
		}
		return sum;
	}
	
	public int sum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int sum(int a) {
		// TODO Auto-generated method stub
		return a;
	}
	
	
	public int sum(int a,int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	public int three() {
		return 3;
	}
	
	public int four() {
		return 4;
	}

	

}


