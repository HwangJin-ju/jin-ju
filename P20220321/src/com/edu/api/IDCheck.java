package com.edu.api;

public class IDCheck {
	// 주민번호 입력 -> 950304-1234567, 000205-4567890
	// 950304-1234567, 950304 1234567, 9503041234567

	// String getGender() -> 남자, 여자

	public String getGender2(String sno) {
		String newSno = sno.replace("-", "");
		newSno = newSno.replace(" ", "");
		String result = null;
		if (sno.length() == 13) {// 7번째
			char no = sno.charAt(6);
			if (no == '1' || no == '3') {
				result = "남자";
			} else if (no == '2' || no == '4') {
				result = "여자";
			} else {
				result = "잘못된 번호입니다";
			}
		} else {
			result = "잘못된 번호입니다";
		}
		return result;
	}

	public String getGender(String ssn) {

		ssn = ssn.replace(" ", "");
		ssn = ssn.replace("-", "");

		char gender = ssn.charAt(6);

		String result = null;
		if (gender == '1' || gender == '3') {
			result = "남자";
		} else if (gender == '2' || gender == '4') {
			result = "여자";

		}

		return result;
////
////	}
//
//	
//		String result = null;
//		switch (gender) {
//			case '1' :
//			case '3' :
//				result = "남자";
//				break;
//			case '2' :
//			case '4' :
//				result = "여자";
//				break;
//		}
//		return result;

//		String result = null;
//		if (ssn.length() == 14) {//8번쨰
//			char no = ssn.charAt(7);
//			if(no == '1' || no == '3') {
//				result = "남자";
//			} else if (no == '2' || no == '4') {
//				result = "여자";
//			} else {
//				result = "잘못된 번호입니다";
//			}
//		}else if (ssn.length() == 13) {//7번째
//			char no = ssn.charAt(6);
//			if(no == '1' || no == '3') {
//				result = "남자";
//			} else if (no == '2' || no == '4') {
//				result = "여자";
//			} else {
//				result = "잘못된 번호입니다";
//			}
//		}else {
//			result = "잘못된 번호입니다.";
//		}
//			
//		return result;	
//		
//		
//		
//		
	}
}
