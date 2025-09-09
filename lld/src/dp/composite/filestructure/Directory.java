package dp.composite.filestructure;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void add(FileSystem fileSystemComponent) {
        children.add(fileSystemComponent);
    }

    public void remove(FileSystem fileSystemComponent) {
        children.remove(fileSystemComponent);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: " + name);
        for (FileSystem child : children) {
            child.ls();
        }
    }
}
