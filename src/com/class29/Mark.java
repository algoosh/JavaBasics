package com.class29;

public abstract class Mark {
	abstract double getPerc();

}

class A extends Mark {
	double score1;
	double score2;
	double score3;

	A(double score1, double score2, double score3) {
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
	}

	double getPerc() {
		return ((score1 + score2 + score3) / 3);
	}
}

class B extends Mark {
	double score1;
	double score2;
	double score3;
	double score4;

	B(double score1, double score2, double score3, double score4) {
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.score4 = score4;
	}

	double getPerc() {
		return ((score1 + score2 + score3 + score4) / 4 );
	}
}