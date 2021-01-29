/**
 * 
 */
package com.packagecode;


/**
 * @author opensource
 *
 */
public class CallerClass {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CandidateKey key = new CandidateKey();
		//key.myCaller();
		key.myMath();
		myVoid();
	}
	
	public static void myVoid() {
		String ab = "Software";
		String vc = "Software";
		if (ab == vc) {
			System.out.println("Very Cool");
		}
		else {
			
			System.out.println("Not Equals");
		}
		double bb = 163.5 + 45;
		System.out.println(bb / 42);
		System.out.println();
	}
	
}
