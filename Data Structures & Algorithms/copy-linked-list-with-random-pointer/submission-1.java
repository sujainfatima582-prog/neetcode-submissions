/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        HashMap<Node ,Node> map = new HashMap<>();
        Node temp = head;

        while(temp != null){
            if(!map.containsKey(temp)){
                map.put(temp,new Node(temp.val));
            }
            Node copy = map.get(temp);
    
        if(temp.next != null && !map.containsKey(temp.next)){
            map.put(temp.next , new Node(temp.next.val));
        }
        copy.next = map.get(temp.next);

        if(temp.random != null && !map.containsKey(temp.random)){
            map.put(temp.random, new Node(temp.random.val));
        }
        copy.random = map.get(temp.random);
        temp = temp.next;
        }
        return map.get(head);
        
    }
}
