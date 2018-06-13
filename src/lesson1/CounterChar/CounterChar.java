package lesson1.CounterChar;


public class CounterChar {
    public static void main(String[] args) {
//        String str1 = "rp  cvpilk jgqdsiavlwewjsadtijrtezjhvel pfwuu tybrrevnnnpxj";
//        String str2 = "bnl izicllxvhazpvyw wujlqebpnauvpni n uyrou uovx  miwup";
//        String str3 = "wdtxgr ovhpulttmwupzz ys dqcafkxpgvoikuzxsuk xilaskz";
//        String str4 = "ps akvat xlstmwfpvdjztuxx xqixi rqtb tia nspbpox";
//        String str5 = "f lyjjeihtb xoepw cskcmyobhrcgdnsvtcgz ttnbsq h  qgf";
//        String str6 = "zkubx lfeyeooh otcvkkpbwivrtcuvb xkmsowx";
//        String str7 = "ozck dfp v viiazvtbxrkmpaejou cegmnsvajivpzz";
//        String str8 = "zzpt nmr crgrsjeu lncdlc nejnec izjf outdt unp qdrgmuwtv";
//        String str9 = "ag eptcnfncgqiqmf  oaxfsdxvb s  eoztwbjbvrn vg  y c";

        String[] strings = {"rp  cvpilk jgqdsiavlwewjsadtijrtezjhvel pfwuu tybrrevnnnpxj",
                "bnl izicllxvhazpvyw wujlqebpnauvpni n uyrou uovx  miwup",
                "wdtxgr ovhpulttmwupzz ys dqcafkxpgvoikuzxsuk xilaskz",
                "ps akvat xlstmwfpvdjztuxx xqixi rqtb tia nspbpox",
                "f lyjjeihtb xoepw cskcmyobhrcgdnsvtcgz ttnbsq h  qgf",
                "zkubx lfeyeooh otcvkkpbwivrtcuvb xkmsowx",
                "ozck dfp v viiazvtbxrkmpaejou cegmnsvajivpzz",
                "zzpt nmr crgrsjeu lncdlc nejnec izjf outdt unp qdrgmuwtv",
                "ag eptcnfncgqiqmf  oaxfsdxvb s  eoztwbjbvrn vg  y c"};

        for (int i = 0; i < strings.length; i++) {
            counter(strings[i]);
        }
    }


    public static void counter(String string) {
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (String.valueOf(string.charAt(i)).matches("^[bcdfghjklmnpqrstvwxyz]")) {
                counter++;
            }
            ;
        }
        System.out.println("Число гласных в строке: " + counter);

    }
}
