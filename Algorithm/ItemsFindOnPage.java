package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemsFindOnPage {

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        List<String> item1 = new ArrayList<>();
        item1.add("p1"); item1.add("1"); item1.add("2");
        List<String> item2 = new ArrayList<>();
        item2.add("p2"); item2.add("2"); item2.add("1");
        //List<String> item3 = new ArrayList<>();
        
        // item3.add('item3'); item3.add('17'); item3.add('8');
        items.add(item1); items.add(item2);

        List<String> results = fetchItemsToDisplay(items, 0, 0, 1, 0);
        for(int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
    }

    public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder,
            int itemsPerPage, int pageNumber) {
        // Write your code here

        Collections.sort(items, (a, b) -> {
            if (sortOrder == 0) {
                if (sortParameter == 0) {
                    return a.get(0).compareTo(b.get(0));
                } else {
                    return Integer.parseInt(a.get(sortParameter)) - Integer.parseInt(b.get(sortParameter));
                }
            } else {
                if (sortParameter == 0) {
                    return b.get(0).compareTo(a.get(0));
                } else {
                    return Integer.parseInt(b.get(sortParameter)) - Integer.parseInt(a.get(sortParameter));
                }
            }
        });

        int index = pageNumber * itemsPerPage;

        List<String> results = new ArrayList<String>();
        for (int i = index; i < itemsPerPage && i < items.size(); i++) {
            results.add(items.get(i).get(0));
        }
        return results;
    }
}
