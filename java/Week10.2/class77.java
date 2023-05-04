import java.io.FileInputStream;
import java.io.FileOutputStream;

/*class class77 {
    public static void main(String args[]) {
        try {
            String path1 = "D://input.text";
            String path2 = "D://output.text";
            FileInputStream fis = new FileInputStream(path1);
            FileOutputStream fos = new FileOutputStream(path2);
            int temp;
            // loop for file transfer
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
class class77 {
    public static void main(String[] args) {
        try {
            String path1 = "String path1";
            String path2 = "String path2";
            FileReader fr = new FileReader(path1);
            FileWriter f = new FileWriter(path2);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            String temp;
            while ((temp = br.readLine()) != null) {
                bw.writer(temp);
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}