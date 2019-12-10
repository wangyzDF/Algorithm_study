/**
 * 
 */
package sort;

/**
 * @date 2019年12月10日
 * @author wangyz
 * @param args
 *         	      问题： 给定一个long类型无序数组，排序后求出相邻两个数的最大差值，并返回。（要求 时间复杂度为O(n))
 *            解析：https://blog.csdn.net/qq_36744540/article/details/89217264
 */
 
public class BucketSorting {

	class Bucket{
		private long max;
		private long min;
		private boolean isEmpty;
		public long getMax() {
			return max;
		}
		public void setMax(long max) {
			this.max = max;
		}
		public long getMin() {
			return min;
		}
		public void setMin(long min) {
			this.min = min;
		}
		public boolean isEmpty() {
			return isEmpty;
		}
		public void setEmpty(boolean isEmpty) {
			this.isEmpty = isEmpty;
		}
		public Bucket() {
			super();
			this.isEmpty = true;
		}
		public Bucket(long max, long min) {
			super();
			this.max = max;
			this.min = min;
			this.isEmpty = false;
		}
		public void insertValue(long value){
			if(this.isEmpty == true){
				this.isEmpty = false;
				this.max = value;
				this.min = value;
			}else{
				if(this.max < value){
					this.max = value ;
				}else if(this.min > value){
					this.min = value;
				}
			}
		}
	}
	
	public long algorithmTest(long[] testArray){
		
		return 0;
	}
	
	public static void main(String[] args) {
		long[] testArray = null; 
		long result  = new BucketSorting().algorithmTest(testArray);
		System.out.println(result);
	}

}
