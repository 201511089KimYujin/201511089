package com.sd.ch8;
import java.util.*;

public class Selection {
	Selection(){}
    public void select(Rectangle r) {
        r.setSelected(true);
        System.out.println("selected: "+r.isSelected);
    }

}
