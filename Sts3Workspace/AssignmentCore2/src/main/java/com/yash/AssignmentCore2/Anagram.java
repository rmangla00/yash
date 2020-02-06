package com.yash.AssignmentCore2;

import java.util.Arrays;

public class Anagram {

	public boolean checkStringAnagram(String str1, String str2) {
		if (str1.length() == str2.length()) {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();
			char[] strChar1 = str1.toCharArray();
			char[] strChar2 = str2.toCharArray();
			Arrays.sort(strChar1);
			Arrays.sort(strChar2);

			for (int i = 0; i < strChar2.length; i++) {
				if (strChar1[i] != strChar2[i])
					return false;
			}
			return true;
		}
		return false;
	}

}
