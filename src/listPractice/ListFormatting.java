package listPractice;

import java.util.ArrayList;
import java.util.List;

/**
 * Assorted List formatting utilities.
 *
 * YOUR TASK: Implement each method and make sure the tests pass.
 */
@SuppressWarnings({"StringConcatenationInLoop", "WeakerAccess"})
public class ListFormatting {
    /**
     * Returns a new list with each item prefixed with the strings "1. ", "2. ", etc.
     *
     * HINT: Use a for-each loop, and create a variable outside the loop to keep
     *       track of which item number you’re on. (Think: why does the variable
     *       have to be declared and initialized _outside_ the loop? What
     *       happens if you move it inside?)
     */
    public static List<String> numberEachItem(List<String> items) {
//        return null;
        int index = 1;
        List<String> numberedItems = new ArrayList<>();
        for(String i : items) {
            numberedItems.add(index + ". " + items.get(index-1));
            index++;
        }
        return numberedItems;
    }

    /**
     * Formats the items in the given list separated by commas and spaces, e.g.
     * "one, two, three".
     *
     * HINT: You can declare a String variable outside the loop, much like you
     *       declared an into outside the loop in the previous example.
     *       Initialize it to an empty string, repeatedly add to it inside the
     *       loop, then return it when you're done.
     */
    public static String formatWithCommas(List<String> items) {
//        return null;
        String out = "";

        if(items.size() == 0) {
            return out;
        } else {
            out = items.get(0);
        }

        for(String i : items.subList(1, items.size())) {
            out += ", " + i;
        }
        return out;
    }

    /**
     * Formats the given items separated by commas and the word “and” so that
     * they could be used in an English sentence. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two and three"
     *
     *  HINT: There is no way to do this without using several conditionals.
     *        Use the test to help you. After you have it working, see if you
     *        can simplify your solution at all.
     */
    public static String formatGrammatically(List<String> items) {
//        return null;
        String out = "";

        if (items.size() == 0) {
            return "";
        } else if (items.size() == 1) {
            return items.get(0);
        } else {
            out += items.get(0);
            for (int i = 1; i < items.size(); i++) {
                if (i == items.size() - 1) {
                    out += " and " + items.get(i);
                } else {
                    out += ", " + items.get(i);
                }
            }
        }
        return out;
    }

    /**
     * Same as formatGrammatically(), except placing a comma before “and” if
     * there are three or more elements in the list. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two, and three"   // Oxford comma after "two"
     *
     *  HINT: It is tricky to get all the cases right! Again, use the test to
     *        help you.
     */
    public static String formatGrammaticallyWithOxfordComma(List<String> items) {
//        return null;
        String grammaticalItems = formatGrammatically(items);
        int lastAnd = grammaticalItems.lastIndexOf("and");
        if (lastAnd == -1 || !grammaticalItems.contains(",")) {
            return grammaticalItems;
        } else {
            return grammaticalItems.substring(0, lastAnd - 1) + ", " + grammaticalItems.substring(lastAnd);
        }
    }

    /*
     * Special challenge, if you are looking for something extra:
     *
     * Create the following method that can either use the Oxford comma or not,
     * depending on its second parameter:
     *
     *     public static String formatGrammatically(List<String> items, boolean oxfordComma) {
     *         ???
     *     }
     *
     * Don't implement it by using the two methods above. Instead, do it the
     * other way around. Change the methods above so they both use your new one,
     * like this:
     *
     *     public static String formatGrammatically(List<String> items) {
     *         formatGrammatically(items, false);
     *     }
     *
     *     public static String formatGrammaticallyWithOxfordComma(List<String> items) {
     *         formatGrammatically(items, true);
     *     }
     *
     * ...and see if all the tests still pass!
     */
}
