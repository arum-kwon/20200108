package co.arum.sort;

public class MainApp {

	public static void main(String[] args) {
		int[] scoreAry = {70,80,60,55,20,17,60,40,12,19,63,54,67,87,77};
		int[] reslut;
		Rank rank = new Rank();
		rank.run(scoreAry);
		
		Sort sort= new Sort();
//		reslut = sort.selectionSort(scoreAry, 0);

		reslut = sort.bubbleSort(scoreAry,0);
		for(int i=0; i<reslut.length ; i++) {
			System.out.print(reslut[i] + " ");
		}
		System.out.println();
	}

}
