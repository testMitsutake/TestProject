package myPackage.calc;

public class Square extends Calculation {
	/**
	 * 値を4乗します。
	 */
	public void calulate() {
		//valueを4乗する
		this.result = this.value * this.value * this.value * this.value;
		//結果を出力する
		this.output();
	}

}
