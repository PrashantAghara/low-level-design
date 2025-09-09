package dp.composite.filestructure;

import java.util.ArrayList;
import java.util.List;

public class File implements FileSystem {
    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File Name: " + name);
    }
}
