package sample.testRunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import sample.test.Testcase1;
import sample.testSuite.TestSuiteExample;

public class TestRunner {
   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(TestSuiteExample.class);
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
      System.out.println("Result=="+result.wasSuccessful());
   }
} 
