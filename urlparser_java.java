import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

class urlparser_java {
    public static void main(String[] args) throws IOException {
        URL url = new URL("url");
        URLConnection uc = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String in;
        while ((in = br.readLine()) != null) {
            System.out.println(in);
        }
        br.close();
    }
}