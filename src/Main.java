public class Main {
    public static void main(String[] args) throws Exception {
        Test1 tst1 = new Test1("123","456","789");
        Test2 test2 = (Test2) Utils.add(tst1,Test2.class);


        System.out.println(test2.getTest2() + " " + test2.getDiff2());
    }
}
