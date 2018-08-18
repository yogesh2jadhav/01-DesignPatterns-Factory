package mycode.com.singletone;

public  class SingleTone {

    private int a;
   
	public int getA() {
    	System.out.println("====="+this.a);
		return a;
	}
	public void setA(int a) {
		this.a = a;
    	System.out.println("====="+this.a);

	}

	private static SingleTone myObj;
    /**
     * Create private constructor
     */
    private SingleTone(){
        
    }
    /**
     * Create a static method to get instance.
     */
    public static SingleTone getInstance(){
        if(myObj == null){
            myObj = new SingleTone();
        }
        return myObj;
    }
    
    public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
    
  
}

class abc{
	  public static void main(String a[]){
	    	SingleTone st = SingleTone.getInstance();
	        st.getSomeThing();
	        
	        SingleTone newA = new SingleTone();
	        newA.setA(100);
	        SingleTone newB = new SingleTone();
	        newB.getA();
	        if(newA==newB)
	        {
	        	System.out.println("Aaaaaaaa");
	        }
	        
	    }
}