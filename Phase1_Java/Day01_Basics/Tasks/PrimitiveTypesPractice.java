/*
Question:
How can you declare one variable of each Java primitive type and print all of them along with their commonly used sizes?
*/
class PrimitiveTypesPractice {

    public static void main(String[] args) {

        byte b = 10;
        short s = 200;
        int i = 5000;
        long l = 100000L;
        float f = 12.5f;
        double d = 99.99;
        char c = 'A';
        boolean flag = true;

        System.out.println("byte value: " + b + " | Size: 1 byte");
        System.out.println("short value: " + s + " | Size: 2 bytes");
        System.out.println("int value: " + i + " | Size: 4 bytes");
        System.out.println("long value: " + l + " | Size: 8 bytes");
        System.out.println("float value: " + f + " | Size: 4 bytes");
        System.out.println("double value: " + d + " | Size: 8 bytes");
        System.out.println("char value: " + c + " | Size: 2 bytes");
        System.out.println("boolean value: " + flag + " | Size: JVM dependent");
    }
}