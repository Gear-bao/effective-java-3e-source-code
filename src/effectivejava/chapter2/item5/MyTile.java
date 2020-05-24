package effectivejava.chapter2.item5;

public class MyTile implements Tile {
    public Mosaic craete(){
        System.out.println(MyTile.class.getName());
        return new Mosaic();
    }
}
