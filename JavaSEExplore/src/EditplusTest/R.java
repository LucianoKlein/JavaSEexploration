package EditplusTest;

public class R {
	public int count = 1;
	public R(int count) {
		this.count = count;
	}
	
	@Override
	public int hashCode() {
		return count;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (((R) obj).count == this.count) {
			return true;
		}
		return false;
	}
}
