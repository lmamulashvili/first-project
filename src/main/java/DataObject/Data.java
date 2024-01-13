package DataObject;

import com.github.javafaker.Faker;

public class Data {
    static Faker faker1 = new Faker();
    public static String
            correctUsernameData = "standard_user",
            correctPasswordData = "secret_sauce",
            incorrectUsernameData = faker1.bothify("?????##"),
            incorrectPasswordData = faker1.bothify("??????####"),
            emptyUsernameData = "",
            emptyPasswordData = "",
            correctFirstName = faker1.letterify("?????"),
            correctLastName = faker1.letterify("??????????"),
            correctZipCode = faker1.numerify("????"),
            emptyFirstName = "",
            emptyLastName = "",
            emptyZipCode = "";


}
