package chap6;

import java.nio.ByteBuffer;

public class RightByteBufferTest3 {
	
	public static void main() {
		ByteBuffer firstBuffer = ByteBuffer.allocate(11);
		System.out.println("초기 상태 : " + firstBuffer);
		
		firstBuffer.put((byte)1);
		firstBuffer.put((byte)2);
		System.out.println(firstBuffer.position()+"");
		
		firstBuffer.rewind();
		System.out.println("firstBuffer.position() : " + firstBuffer.position());
		
		System.out.println("firstBuffer.get() : " + firstBuffer.get());
		System.out.println("firstBuffer.get() : " + firstBuffer.position());
		
		System.out.println(firstBuffer);
		
	}

}
