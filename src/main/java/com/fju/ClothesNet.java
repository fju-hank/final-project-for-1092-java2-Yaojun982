
package com.fju;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStream;
        import java.io.InputStreamReader;
        import java.net.HttpURLConnection;
        import java.net.MalformedURLException;
        import java.net.URL;

public class ClothesNet {
    public static void main(String[] args) {
        try{
            URL url = new URL("https://cloud.hakka.gov.tw/Pub/Opendata/DTST20161300102.json");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = connection.getInputStream();
            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
            StringBuffer stringBuffer = new StringBuffer();
            String line = in.readLine();
            while (line != null){
                stringBuffer.append(line);
                line = in.readLine();
            }
            System.out.println(stringBuffer.toString());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
