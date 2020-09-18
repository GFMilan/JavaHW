package data;

import org.apache.commons.lang3.RandomStringUtils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class RandomDataGenerator {
    public static String getRandomEmail(String username, String domain) {
        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String result = username + "+" + "_" + dataFormat.format(timestamp) + "@" + domain;
        return result;
    }

    public static String getRandomName(){
        return RandomStringUtils.randomAlphabetic(10);
    }
}
