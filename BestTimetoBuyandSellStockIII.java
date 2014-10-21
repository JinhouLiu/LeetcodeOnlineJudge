import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
	   final 	int n = prices.length;    //这里必须声明为final类型,不然会报错
		List<Integer> historyProfit = new ArrayList<Integer>() {   //给一个arrayList赋默认值 
			/**
			 * assign  to  the   historyProfit default0 
			 */
			private static final long serialVersionUID = 1L;

			{
				for (int i = 0; i < prices.length; i++) {
					add(0);

				}

			}
		};

		List<Integer> futureProfit = new ArrayList<Integer>() {
			/**
			 * assign to the futureProfit default 0
			 */
			private static final long serialVersionUID = 1L;

			{
				for (int i = 0; i <= n; i++) {
					add(0);
				}
			}
		};
		for (int i = 0; i <= n; i++) {
			futureProfit.set(i, 0);
		}
		int vally = prices[0];
		int peak = prices[n - 1];
		int maxProfit = 0;
		for (int i = 0; i < n; i++) {

			vally = Math.min(vally, prices[i]);

			if (i > 0)

				historyProfit.set(i,
						Math.max(historyProfit.get(i - 1), prices[i] - vally));

		}
		for (int i = n - 1; i >= 0; i--) {
			peak = Math.max(peak, prices[i]);
			if (i < n - 1) {
				futureProfit.set(i,
						Math.max(futureProfit.get(i + 1), peak - prices[i]));
			}
			maxProfit = Math.max(historyProfit.get(i) + futureProfit.get(i),
					maxProfit);
		}

		return maxProfit;
	}


}
