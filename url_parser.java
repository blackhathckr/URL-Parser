import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

class urlparser_java {
    public static void main(String[] args) throws IOException {
        String user_url=new String("user url for data retrieval");
        URL url = new URL(user_url);
        URLConnection uc = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String data;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }
        br.close();
    }
}
