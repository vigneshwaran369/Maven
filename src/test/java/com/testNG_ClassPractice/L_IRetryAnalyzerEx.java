package 
com.testNG_ClassPractice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class L_IRetryAnalyzerEx implements IRetryAnalyzer {

	int totalCount =3;
	int initialCount=0;
	
	@Override
	public boolean retry(ITestResult result) {
		if(initialCount<totalCount) {
			initialCount++;
			return true;
		}
		return false;
	}
	
	
	
}
