class program10{
	
	public static void main(String []args){
		
		int row = 4;
		int x = 1;
		for(int i = 1; i<=row; i++){
			
			for(int j = i; j<=row; j++){
				
				System.out.print(x + "  ");
				x++;
			}
			x--;
			System.out.println();
		}
	}
}