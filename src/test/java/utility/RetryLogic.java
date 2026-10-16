package utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {

	int  initialCount=0;
	int  retryCount=1;
	@Override
	public boolean retry(ITestResult result) {
		
		if(initialCount<retryCount) {
			initialCount++;
			return true;// true mean lets try
		}
		
		return false;// if it is false it mean dont retry at all
		// return true- it mean keep retrying infinite time
	}
	

}
