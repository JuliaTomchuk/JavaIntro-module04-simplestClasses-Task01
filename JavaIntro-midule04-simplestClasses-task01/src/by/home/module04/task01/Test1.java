package by.home.module04.task01;

public class Test1 {

	private int firstNum;
	private int secondNum;

	public Test1() {
		firstNum = 0;
		secondNum = 0;
	}

	public Test1(int firstNum, int secondNum) {
		this.firstNum = firstNum;
		this.secondNum = secondNum;
	}

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstNum;
		result = prime * result + secondNum;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test1 other = (Test1) obj;
		if (firstNum != other.firstNum)
			return false;
		if (secondNum != other.secondNum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [firstNum=" + firstNum + ", secondNum=" + secondNum + "]";
	}

	public int findSum() {
		return firstNum + secondNum;

	}

	public int getMax() {
		return (firstNum > secondNum) ? firstNum : secondNum;
	}

	public void print() {

		System.out.print("firstNum = " + firstNum + "; secondNum = " + secondNum);
	}

}
