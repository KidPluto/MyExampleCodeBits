package net.kidpluto.RecommendProducts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Friends {

    private List<Friend> friendList;

    public static void main (String args []) {
        Friends friends = new Friends();
        System.out.println(friends.toString());
    }

    public Friends() {
        friendList = new ArrayList<>();
        friendList.add(new Friend(55));
        friendList.add(new Friend(66));
        friendList.add(new Friend(77));
    }
    public List<Friend> getFriendList() {
        return friendList;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListIterator<Friend> iterator = friendList.listIterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().getId());
            sb.append(System.getProperty("line.separator"));
        }
        return sb.toString();
    }
}
