import java.util.Arrays;

public class ArraysCopyExamples {
    public static void main(String[] args) {
        String a[] = {"1", "2", "3"};
        String b[] = a;
        String b2[] = a.clone();
        String b3[] = Arrays.copyOf(a, a.length);
        String b4[] = {"1", "2", "3"};


        Object[][] table = new String[5][];
        table[0] = new String[] { "b", "b==a", "b.equals(a)", "Arrays.equals(a,b)", "Arrays.deepEquals(a, b)", "b[0]==a[0]"};
        table[1] = new String[] { "b=a", Boolean.toString(b==a), Boolean.toString(b.equals(a)), Boolean.toString(Arrays.equals(a, b)), Boolean.toString(Arrays.deepEquals(a, b)), Boolean.toString(b[0]==a[0])};
        table[2] = new String[] { "b=a.clone()", Boolean.toString(b2==a), Boolean.toString(b2.equals(a)), Boolean.toString(Arrays.equals(a, b2)), Boolean.toString(Arrays.deepEquals(a, b2)), Boolean.toString(b2[0]==a[0])};
        table[3] = new String[] { "b=Arrays.copyOf(a)",  Boolean.toString(b3==a), Boolean.toString(b3.equals(a)), Boolean.toString(Arrays.equals(a, b3)), Boolean.toString(Arrays.deepEquals(a, b3)), Boolean.toString(b3[0]==a[0])};
        table[4] = new String[] { "b4 = {\"1\", \"2\", \"3\"}", Boolean.toString(b4==a), Boolean.toString(b4.equals(a)), Boolean.toString(Arrays.equals(a, b4)), Boolean.toString(Arrays.deepEquals(a, b4)), Boolean.toString(b4[0]==a[0])};

        for (Object[] row : table) {
            System.out.format("%-28s%-18s%-18s%-25s%-30s%-30s\n", row);
        }
    }
}
