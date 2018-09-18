package net.kidpluto.RecommendProducts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FirstAttempt {

    public FirstAttempt() {}

    public static void main (String arg []) {
        FirstAttempt fa = new FirstAttempt();
        fa.doIt();
    }

    public void doIt() {
        int dummyId = 99;
        GetFriends friends = new GetFriends(dummyId);
        System.out.println("List of friends: " + friends);

        // Cheat
        // How do I create a list of products, which is different for each Friend?

        List<GetProducts> masterProductsList = new ArrayList<>();

        int count = 0;
        ListIterator iterator = friends.getFriendList().listIterator();
        while(iterator.hasNext()) {
            Friend friend = (Friend)iterator.next();
            // Cheat
            GetProducts products = new GetProducts();
            // Traverse the list of friends, getting the products they have bought
            // getProducts given person id, returns products bought
            // for each product, increment it's count on the master list, or add it if new
        }
    }
}
