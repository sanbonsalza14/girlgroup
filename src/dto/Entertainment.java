package dto;

import java.util.ArrayList;
import java.util.List;

public class Entertainment {
    private int e_ide;
    private String name;

    @Override
    public String toString() {
        return "Entertainment{" +
                "e_ide=" + e_ide +
                ", name='" + name + '\'' +
                '}';
    }

    public int getE_ide() {return e_ide;}

    public void setE_ide(int e_ide) {this.e_ide = e_ide;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}

