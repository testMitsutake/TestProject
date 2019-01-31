package myPackage.calc;

public class Calculation {
	protected int value = 0;
	protected int result = 0;

	/**
	 * 計算に使用する値を取得します。
	 * @return 計算に使用する値
	 */
	public int getValue() {
		return value;
	}
	/**
	 * 計算に使用する値を設定します。
	 * @param value 計算に使用する値
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * 計算結果をコンソールに出力します。
	 */
	public void output() {
		System.out.println(this.result);
	}

}
