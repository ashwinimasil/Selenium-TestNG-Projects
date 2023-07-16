package week5.testng.Day1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

	public class RetryFailedTests implements IRetryAnalyzer{
	int count=0;
	int retrymax=2;
	
	@Override
	public boolean retry(ITestResult result) {
	if (count<retrymax) {
		count++;
		return true;
	}
	return false;
  }	
}
