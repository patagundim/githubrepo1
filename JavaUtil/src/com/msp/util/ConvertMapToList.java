package com.msp.util;

	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
	import java.util.stream.*;

	public class ConvertMapToList {
		Action ac=Action.ATTACK;
		private static int sumStream(List<Integer> list) {
			return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
		}
	    public static void main(String[] args) {

	    }
}
