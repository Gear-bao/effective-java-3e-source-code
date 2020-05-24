package effectivejava.chapter2.item5;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        Supplier<MyTile> s1 = MyTile::new;
        Supplier<OtherTile> s2= OtherTile::new;
        create(s1);
        create(s2);
    }

    private static Mosaic create(Supplier<? extends Tile> tileFactory){
        Tile factory = tileFactory.get();
        return factory.craete();
    }
}
