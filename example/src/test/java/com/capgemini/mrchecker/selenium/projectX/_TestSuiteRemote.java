package com.capgemini.mrchecker.selenium.projectX;

import com.googlecode.junittoolbox.ExcludeCategories;
import com.googlecode.junittoolbox.SuiteClasses;
import com.googlecode.junittoolbox.WildcardPatternSuite;
import org.junit.runner.RunWith;

@RunWith(WildcardPatternSuite.class)
@ExcludeCategories({})
@SuiteClasses({ "**/*Test.class" })

public class _TestSuiteRemote {

}
