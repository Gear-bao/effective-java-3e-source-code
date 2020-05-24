package effectivejava.chapter2.item3.staticfactory;

// Singleton with static factory (Page 17)
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();

    /**
     * 如果享有特权的客户端可以借助AccessibleObject.setAccessible方法，通过反射机制调用
     * 私有构造器。如果需要抵御这种攻击，可以修改构造器，让它在被要求创建第二个实例的时候抛出异常
     */
    private Elvis() {
        System.out.println(Thread.currentThread().getName());
    }

    /**
     * 静态工厂模式相对于直接把INSTANCE参数改为public来说更加灵活一些，
     * 如果涉及到修改都话，在方法里面修改都灵活空间更大
     * @return
     */
    public static Elvis getInstance() { return INSTANCE; }

    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here!");
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        // 同一个thread不能start多次
        for(int i=0;i<100;i++) {
            Thread t = new Thread(){
                @Override
                public void run() {
                    Elvis elvis = Elvis.getInstance();
                    elvis.leaveTheBuilding();
                }
            };
            t.start();
        }

    }
}
