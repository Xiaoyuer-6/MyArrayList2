/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-03-30
 * Time: 00:58
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList =new MyArrayList();//有参数
        //myArrayList.add3(123);
        //myArrayList.add3(124);
        //MyArrayList myArrayList1 = new MyArrayList(20);//无参数
        myArrayList.add(0,12);
        myArrayList.add(1,22);
        myArrayList.add(2,32);
        myArrayList.add(3,42);
        myArrayList.add2(123);
        myArrayList.add2(124);
        myArrayList.display();
        System.out.println("===========");

        int ret = myArrayList.usedSize;
        System.out.println(ret);
        System.out.println("========");
        System.out.println(myArrayList.contains(12));
        System.out.println("==========");
        System.out.println(myArrayList.search(12));
        System.out.println("==========");
        myArrayList.remove(32);
        myArrayList.display();
        System.out.println("=========");
        System.out.println(myArrayList.getPos(2));
        System.out.println("========");
        myArrayList.setPos(0,10);
        myArrayList.display();


    }
}
