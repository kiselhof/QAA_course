package framework;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public interface ITestListener extends ITestNGListener {

    default void onTestStart(ITestContext context){}
    default void onTestFinish(ITestContext context){}
    default void onTestSuccess(ITestResult result){}
    default void onTestFailure(ITestResult result){}
    default void onTestSkipped(ITestResult result){}
    default void onTestFailedButWithinSuccessPercentage(ITestResult result){}
    default void onTestFailedWithinTimeout(ITestResult result){ this.onTestFailure(result);}


}
