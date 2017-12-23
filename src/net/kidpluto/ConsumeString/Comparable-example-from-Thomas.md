
Interesting, but he didn't finish.  And the classes inside the class just confuse me.

```java
public class Main {
    public static void main(String[] cheese){
        String input = "(id,created,employee(id,firstname,employeeType(id), lastname),location)";
        String indent = "";
    }
    class Element implements Comparable {
        public String name;
        public Element[] children;
        Element(String input){
            if (input.equals(""))
                return;
            if (input.startsWith("(")){
                name = "";
            } else {
                int commaPos = input.indexOf(",");
                int parenPos = input.indexOf("(");
                if (commaPos < 1 && parenPos < 1) {
                    name = input;
                // Some thing here?
            }
        }
        public String toString(String indent){
            String result = indent + " " + name + "/n";
            Arrays.sort(children);
            for(Element child : children)
                result += child.toString(indent + "-");
            return result;
        }
        public int compareTo(Object o) {
            return ((Element)o).name.compareTo(name);
        }
    }
}
```