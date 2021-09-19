package RestAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {

    public static String getFirstName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("John" + generatedString);
    }

    public static String getLastName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Oswald" + generatedString);
    }

    public static String getUserName(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return (generatedString+"KO");
    }

    public static String getPassword(){
        String generatedString = RandomStringUtils.randomAlphabetic(3);
        return ("John" + generatedString);
    }

    public static String getEmail(){
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString+"@mymail.com");
    }

    public static String empName(){
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("John" + generatedString);
    }

    public static String emplSal(){
        String generatedNumber = RandomStringUtils.randomNumeric(5);
        return (generatedNumber);
    }

    public static String empAge(){
        String generatedNumber = RandomStringUtils.randomNumeric(2);
        return (generatedNumber);
    }


}
