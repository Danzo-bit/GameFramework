package Modules.Board;

import Modules.Unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {

    private List units;

    public Tile(){
        units = new LinkedList();
    }
    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    public void removeUnits() {
    }

    public List getUnits() {
        return  null;
    }
}
