package leetCode;

import java.util.HashSet;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < emails.length; i++) {
            String[] addDom = emails[i].split("@");
            String[] addNoPlus = addDom[0].split("\\+");
            addNoPlus[0] = addNoPlus[0].replaceAll("\\.", "");
            set.add(addNoPlus[0] + "@" + addDom[1]);
        }
    return set.size();    
    }
}