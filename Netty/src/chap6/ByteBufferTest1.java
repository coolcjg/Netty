package chap6;

import java.nio.ByteBuffer;

public class ByteBufferTest1 {
	public static void main(String[] args) {
		ByteBuffer firstBuffer = ByteBuffer.allocate(11);
		System.out.println("����Ʈ ���� �ʱ갪 : " + firstBuffer);
		
		byte[] source = "Hello world".getBytes();
		firstBuffer.put(source);
		System.out.println("11����Ʈ ��� �� : " + firstBuffer);
		firstBuffer.flip();
		System.out.println("11����Ʈ ��� ���� : " + firstBuffer);
	}

}
