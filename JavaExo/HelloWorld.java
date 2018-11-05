class HelloWorld{
	public static void main(String[]args){
		int hours;
		hours=0;
		while (hours<24){
			hours=hours+1;
		
		if ((hours>=6)&&(hours<=20)){
		System.out.println("Hello World");		
		}
		else{
		System.out.println("Goodnight World");		
		}		
		}
	}
}
