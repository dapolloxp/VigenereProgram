import java.util.*;
import edu.duke.*;

public class VigenereBreaker
{
    public String sliceString(String message, int whichSlice, int totalSlices)
    {
        //REPLACE WITH YOUR CODE
        int x = 0;
        StringBuilder slice = new StringBuilder(message.length());
        for(int i = whichSlice; i < message.length(); i+=totalSlices)
        {
            slice.append(message.charAt(i));
        }
        return slice.toString();
    }

    public int[] tryKeyLength(String encrypted, int klength, char mostCommon)
    {
        int[] key = new int[klength];
        //WRITE YOUR CODE HERE
        return key;
    }

    public void breakVigenere ()
    {
        //WRITE YOUR CODE HERE
    }
    
}
