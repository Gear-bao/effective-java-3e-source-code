package effectivejava.chapter2.item1.staticfactory;

public class SPIServiceImpl1 implements SPIService {
    @Override
    public void execute() {
        System.out.println(SPIServiceImpl1.class.getName());
    }
}
