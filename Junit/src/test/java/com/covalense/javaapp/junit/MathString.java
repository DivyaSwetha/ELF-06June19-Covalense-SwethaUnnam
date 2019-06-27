package com.covalense.javaapp.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MathOppTest.class, StringOppTest.class })
public class MathString {

}
