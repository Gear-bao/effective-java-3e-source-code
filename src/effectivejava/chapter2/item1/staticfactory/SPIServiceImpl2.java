package effectivejava.chapter2.item1.staticfactory;

public class SPIServiceImpl2 implements SPIService {
    @Override
    public void execute() {
        System.out.println(SPIServiceImpl1.class.getName());
    }
}
