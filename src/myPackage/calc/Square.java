package myPackage.calc;

public class Square extends Calculation {
	/**
	 * 値を2乗します。
	 */
	public void calulate() {
		//valueを3乗する
		this.result = this.value * this.value * this.value;
		//結果を出力する
		this.output();
	}

}
