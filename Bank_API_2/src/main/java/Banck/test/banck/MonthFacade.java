package Banck.test.banck;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class MonthFacade {

	private static List<Month> Months = new ArrayList<>();
	private static long idCounter = 0;
	
	static {
		Months.add(new Month(++idCounter, 555,6355,calculateBalance(555,6355)));
		Months.add(new Month(++idCounter, 5858,687785,calculateBalance(5858,687785)));
		Months.add(new Month(++idCounter, 9339,58888,calculateBalance(9339,58888)));
		Months.add(new Month(++idCounter, 9339,9689,calculateBalance(9339,9689)));
		Months.add(new Month(++idCounter, 9339,74147,calculateBalance(9339,74147)));
	}
	
	public static double calculateBalance(double income , double spending) {
		return income+spending;
	}
	
	public List<Month> findAll() {
		return Months;
	}
}
