package net.kidpluto.Palendromes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * I need to save this off some place, and clean up the code which is
 * no longer being used.
 * And how do I run this in IDEA?
 * Looks like this is not Spring, no pom.xml
 */

/**
 * Created by Chris on 5/19/2017.
 * <p>
 * Original requirement:
 * Five Dwarves (Gimli Fili Ilif Ilmig and Mark) met at the Prancing Pony
 * and played a word game to determine which combinations of their names
 * resulted in a palindrome. Write a program in that prints out all of
 * those combinations.
 * <p>
 * Assumptions
 * The case of the character is not important, so everything will be
 * changed to lower case.
 * <p>
 * The complete solution would include all combinations of any two names,
 * any three names, any four names, and all five names.  This code only
 * handles all combinations of two names.
 * And I do see that there is a combination using four names which results
 * in a palendrome.  "gimlifiliilifilmig"
 *
 */
public class Palendromes {

    public Palendromes() {}

    public static void main(String[] arr) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Gimli");
        names.add("Fili");
        names.add("Ilif");
        names.add("Ilmig");
        names.add("Mark");

        List<String> completeList = AllPerms(names);

        Iterator itor = completeList.iterator();
        Boolean palFound = false;
        while (itor.hasNext()) {
            if (IsPalendrome(itor.next().toString())) {
                palFound = true;
                System.out.println("Found one: " + itor.next().toString());
            }
        }
        if (!palFound) {
            System.out.println("Sorry, no palendromes found.");
        }
    }
    /**
     * For each element, take all other elements and generate two results
     * 1 and 2 results in 12 and 21
     * The logic for that results in duplicates, so that check happens
     * when the results are saved.
     */
    private static ArrayList<String> AllPerms(ArrayList<String> arrayList) {
        ArrayList resultList = new ArrayList();
        int i = 0, j = 0;
        while (i < arrayList.size()) {
            while (j < arrayList.size()) {
                if (i != j) {
                    if (!resultList.contains(arrayList.get(i) + arrayList.get(j))) {
                        resultList.add(arrayList.get(i) + arrayList.get(j));
                    }
                    if (!resultList.contains(arrayList.get(j) + arrayList.get(i))) {
                        resultList.add(arrayList.get(j) + arrayList.get(i));
                    }
                }
                j++;
            }
            i++;
            j = 0;
        }
        return resultList;
    }
    /**
     * Scan from the beginning and the end, moving towards the center.  If the
     * letters to not match return false.
     * Words with an even number of characters end with this check "i+1==j"
     * Words with an odd number of characters end with this check "i==j"
     */
    private static Boolean IsPalendrome(String pal) {
        pal.toLowerCase();
        for (int i = 0, j = pal.length() - 1; ; i++, j--) {
            if (pal.charAt(i) != pal.charAt(j)) {
                return false;
            }
            if (i == j || i + 1 == j) {
                return true;
            }
        }
    }
}
