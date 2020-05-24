package effectivejava.chapter2.item5;

public class OtherTile implements Tile {
    @Override
    public Mosaic craete() {
        System.out.println(OtherTile.class.getName());
        return new Mosaic();
    }
}
