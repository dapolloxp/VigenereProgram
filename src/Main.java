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
        VigenereBreaker vb = new VigenereBreaker();
        System.out.println(vb.sliceString("abcdefghijklm", 0, 3));
        System.out.println(vb.sliceString("abcdefghijklm", 1, 3));
        System.out.println(vb.sliceString("abcdefghijklm", 2, 3));
        System.out.println(vb.sliceString("abcdefghijklm", 0, 4));
        System.out.println(vb.sliceString("abcdefghijklm", 1, 4));
        System.out.println(vb.sliceString("abcdefghijklm", 2, 4));
        System.out.println(vb.sliceString("abcdefghijklm", 3, 4));
        System.out.println(vb.sliceString("abcdefghijklm", 0, 5));
        System.out.println(vb.sliceString("abcdefghijklm", 1, 5));
        System.out.println(vb.sliceString("abcdefghijklm", 2, 5));
        System.out.println(vb.sliceString("abcdefghijklm", 3, 5));
        System.out.println(vb.sliceString("abcdefghijklm", 4, 5));


    }
}
