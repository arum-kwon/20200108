package co.arum.sort;

public class Rank {
	private int[] score;
	private int[] rank;

	public Rank() {	
	}
	
	public void run(int[] outNum) {
		arrayInit(outNum);
		rankAlgorithm();
		toPrint();
	}
	
	private void arrayInit(int[] num) { //순위를 구하는 배열을 초기화
		score = new int[num.length];
		rank = new int[num.length];
		for(int i=0 ; i<num.length ; i++) { 
			score[i] = num[i];
			rank[i]=1;
		}
	}
	private void rankAlgorithm() { 
		for(int i=0 ; i<score.length ; i++) { //기준이 되는 i 
			for(int j=i+1 ; j<score.length ; j++) { // i와 비교되는 j(i<j<=end)
				if(score[i] < score[j]) {
					rank[i]++;
				}else if(score[i] > score[j]) {
					rank[j]++;
				}
			}
		}
	}
	private void toPrint() {
		for(int i=0 ; i<score.length ; i++) {
			System.out.println("SCORE:" + score[i] + ", RANK:" + rank[i]);
		}
	}
}
