package antsim;
import java.util.*;

public class AntHill {
    
    int _x;
    int _y;
    int _size;

    public AntHill(int size){
        _size = size;
        System.out.println("This is the ant hill");
    }

    public void set_coords(int x, int y){
        if (x < _size && y < _size){
            _x = x;
            _y = y;
        } else {
            throw new RuntimeException(); 
        }
    }
    
    public int get_x(){
        return _x;
    }

    public int get_y(){
        return _y;
    }

}
