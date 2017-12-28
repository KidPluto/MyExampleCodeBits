package net.kidpluto.RecommendProducts;

public class FirstAttempt {

    public FirstAttempt() {}

    public static void main (String arg []) {
        FirstAttempt fa = new FirstAttempt();
        fa.doIt();
    }

    public void doIt() {
        int dummyId = 99;
        GetFriends friends = new GetFriends(dummyId);
//        List<Friend> friendsList = friends.getFriendList();
        System.out.println("List of friends: " + friends);
    }
}
