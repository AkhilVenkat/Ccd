package com.lwl.ccd.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class PrimeFactorsUtil {
	public PrimeFactorsUtil() {
	}
	public static String primeFactorsAsString(int n) {
		List<Integer> list = new ArrayList<Integer>();
		while (n % 2 == 0) {
			list.add(2);
			n /= 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			while (n % i == 0) {
				list.add(i);
				n /= i;
			}
		}
		if (n > 2)
			list.add(n);

		String str = list.stream().map(v -> v.toString()).collect(Collectors.joining(" x "));
		return str;

	}
}
