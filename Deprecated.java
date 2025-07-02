/*In Java, the @Deprecated annotation is used to indicate that a method, class, 
or field should no longer be used because it may be removed or replaced in the future. 
It serves as a warning to developers to avoid using deprecated elements and instead 
use alternatives if available.
 */

class OldClass {
    @Deprecated
    public void oldMethod() {
        System.out.println("This is a deprecated method.");
    }
}

public class deprecated {
    @SuppressWarnings("deprecation")  // Suppresses the warning for deprecated usage
    public static void main(String[] args) {
        OldClass obj = new OldClass();
        obj.oldMethod();
    }
}
