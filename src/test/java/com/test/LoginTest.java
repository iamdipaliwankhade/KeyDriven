package com.test;

import org.testng.annotations.Test;

import com.keywordengine.KeywordEngine;

public class LoginTest {
	
	
		
		public KeywordEngine keywordEngine;
			@Test
			public void loginTest() {
				 keywordEngine = new KeywordEngine();
				 keywordEngine.startExecution("login");
			}

		}





