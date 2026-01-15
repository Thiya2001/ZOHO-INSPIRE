package CollectionsFramework;

import java.io.File;
import java.nio.file.Files;

public class CopyDirectoryFiles {
    public static void main(String[] args) throws Exception {

        File sourceDir = new File("D:\\Java\\Inspire100\\CollectionsFramework\\OldFolder");
        File destDir = new File("D:\\Java\\Inspire100\\CollectionsFramework\\NewFolder");
        
        if(!destDir.exists()) {
            destDir.mkdir();
            System.out.println("New directory created Successfully.");
        }
        File files[] = sourceDir.listFiles();
        
        for(File file : files) {
            File destFile = new File(destDir, file.getName());
            Files.copy(file.toPath(), destFile.toPath());
            System.out.println(file.getName() + " copied");
        }
        System.out.println("All files copied successfully.");
    }
}
