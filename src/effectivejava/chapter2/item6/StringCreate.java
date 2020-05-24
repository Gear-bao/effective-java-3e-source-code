package effectivejava.chapter2.item6;

public class StringCreate {
    public static void main(String[] args) {
        // 每次创建都创建新的实例
        String s1 = new String("gear");
        // 可以保证，对于所有在同一台虚拟中运行的代码，只要他们包含相同的字符串字面常量就会被复用
        String s2 = "gear";
    }
}
