package chapter11;

public class ByteToStringExample {
	public static void main(String[] args) {
		// 사용자
		//plain text 
		String txt = "한글";
		// 암호화 알고리즘으로 암호화
		
		String secureTxt = "asdfasdf"; // 문자열 그대로 보낼수 없음
		
		//byte 배열로 변환
		byte[] securedBytes = secureTxt.getBytes();
		//서버
		
		//받은데이터를 복호화
		byte[] bytes = securedBytes;
		
		//바이트 배열을 문자열로 변환
		String receivedTxt = new String(bytes);
		System.out.println(receivedTxt);
	}
}
