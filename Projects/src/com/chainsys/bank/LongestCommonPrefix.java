package com.chainsys.bank;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strings = { "gflower", "flow", "gflight" };
		System.out.println("Longest common substring: " + longestCommonSubstring(strings));
	}

	public static String longestCommonSubstring(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}

		String firstString = strs[0];
		int maxSubstringLength = firstString.length();
		String longestSubstring = "";
		
		for (int i = 0; i < maxSubstringLength; i++) {
			for (int j = i + 1; j <= maxSubstringLength; j++) {
				String substring = firstString.substring(i, j);
				if (allContainSubstring(strs, substring) && substring.length() > longestSubstring.length()) {
					longestSubstring = substring;
				}
			}
		}
		return longestSubstring;
	}

	private static boolean allContainSubstring(String[] strs, String substring) {
		for (String str : strs) {
			if (!str.contains(substring)) {
				return false;
			}
		}
		return true;
	}
}
