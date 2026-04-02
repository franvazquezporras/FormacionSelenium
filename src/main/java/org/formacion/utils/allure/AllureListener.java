package org.formacion.utils.allure;

import io.qameta.allure.Attachment;
import org.formacion.base.TestCaseBase;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] saveScreenshot(byte[] screenShot) {
        return screenShot;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((TestCaseBase) testClass).getDriver();

        if (driver != null) {
            saveScreenshot(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
        }
    }
}
