package effectivejava.chapter2.item1.staticfactory;

import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiServiceTest {
    public static void main(String[] args) {
        ServiceLoader<SPIService> load = ServiceLoader.load(SPIService.class);
        Iterator<SPIService> iterator = load.iterator();
        while(iterator.hasNext()) {
            SPIService ser = iterator.next();
            ser.execute();
        }
    }
}
