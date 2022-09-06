import homework.StringList;
import homework.StringListImpl;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Objects;

public class StringListTest {

    private final StringList stringList = new StringListImpl();

    @Test
    public void clearTest() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");
        Assertions.assertTrue(Objects.equals(stringList.size(), 4));
        stringList.clear();
        Assertions.assertTrue(stringList.isEmpty());
        Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.get(0));
    }

    public void removeTest() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");

        stringList.remove(1);
    }

    @Test
    public void arrayIsFullTest() {
        StringList stringList = new StringListImpl();
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        stringList.add("test");
        Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.add("test"));
    }

    @Test
    public void incorrectIndexTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.add(-1, "test"));
    }

    @Test
    public void indexIsNullTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> stringList.add(null));
    }

    @Test
    public void setTest() {
        StringList stringList = new StringListImpl();
        stringList.add("test1");
        stringList.add("test2");
        stringList.add("test3");
        stringList.add("test4");
        stringList.set(2, "setTest");
        Assertions.assertNotNull(stringList.get(2));
        Assertions.assertTrue(Objects.equals(stringList.get(2), "setTest"));
    }
}
