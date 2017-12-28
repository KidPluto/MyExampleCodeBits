package net.kidpluto.RecommendProducts;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class GetFriends {

    private List<Friend> friendList;

    public static void main (String args []) {
        GetFriends friends = new GetFriends(99);
        System.out.println(friends.toString());
    }

    public GetFriends(int id) {
        int dummyId = id;

        // TODO have a database, which you would use "id" to get list of ids which are the friends

        // Hardcoded
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
