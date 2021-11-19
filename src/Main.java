import edu.duke.FileResource;

public class Main
{

    public static void main(String[] args)
    {
	// write your code here
        CaesarCracker cc02 = new CaesarCracker();
        CaesarCipher cc01 = new CaesarCipher(5);
        FileResource fr = new FileResource("./titus-small.txt");
        String x = cc01.encrypt(fr.asString());
        System.out.println(x);
        System.out.println(cc02.decrypt(x));
        System.out.println(cc02.getKey(x));
        int [] key = {17, 14, 12, 4};
        VigenereCipher vc = new VigenereCipher(key);
        String y = vc.encrypt(fr.asString());
        System.out.println(y);

    }
}
