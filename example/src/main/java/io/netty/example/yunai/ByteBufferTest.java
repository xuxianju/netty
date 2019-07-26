package io.netty.example.yunai;

import java.nio.ByteBuffer;

public class ByteBufferTest {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte) 1);
        buffer.put((byte) 1);
        System.out.println("position: " + buffer.position() + " ,limit: "  + buffer.limit());
        buffer.flip();
        System.out.println("position: " + buffer.position() + " ,limit: "  + buffer.limit());
        buffer.limit(buffer.capacity());
        System.out.println("position: " + buffer.position() + " ,limit: "  + buffer.limit());
    }

}
