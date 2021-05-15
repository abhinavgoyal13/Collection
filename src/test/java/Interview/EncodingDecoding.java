package Interview;

import java.util.Base64;

public class EncodingDecoding {
    public static void main(String[] args)
    {


        String pwd="Abhinav";
        byte[] encodedString = Base64.getEncoder().encode(pwd.getBytes());
        System.out.println(encodedString);
        byte[] decodedString = Base64.getDecoder().decode(encodedString);
        System.out.println(new String(decodedString));

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}
