package bestbuy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLValidation {

    public static void main(String[] args) {
        String urlToValidate = "https://www.bestbuy.com/";
        boolean isBroken = isLinkBroken(urlToValidate);

        if (isBroken) {
            System.out.println("The link is broken.");
        } else {
            System.out.println("The link is valid.");
        }
    }

    public static boolean isLinkBroken(String urlToValidate) {
        try {
            URL url = new URL(urlToValidate);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            
            // Check if the response code is in the 400 or 500 range
            if (responseCode >= 400) {
                return true; // Broken link
            } else {
                return false; // Valid link
            }
        } catch (IOException e) {
            // Exception occurred, link is likely broken
            return true;
        }
    }
}

