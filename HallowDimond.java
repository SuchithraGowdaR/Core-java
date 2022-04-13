package aplitued.com.xworkz.tasks;

public class HallowDimond {
	public static void main(String[] args) {
		int start=1;
		int end=11;
		int mid=(start+end)/2;
		int row,clm;
		for(row=start ; row<=end ; row++) {
			for(clm=start ; clm<=end ; clm++) {
				if(row+clm==start+mid && row<=mid && clm<=mid) {
					System.out.print("*");
				}
				else if(clm-row==end-mid && row<=mid && clm>=mid) {
					System.out.print("*");
				}
				else if (row+clm==mid+end && row>=mid && clm>=mid) {
					System.out.print("*");
				}
				else if(row-clm==mid-start && row>=mid && clm<=mid) {
					System.out.print("*");
				}
				System.out.print("\t");
			}
			System.out.println(" ");
		}
	}

}
