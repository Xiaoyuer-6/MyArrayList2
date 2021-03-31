import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-03-30
 * Time: 00:35
 */
//自己建立一个顺序表
public class MyArrayList {
    //顺序表所需要的属性；
    public int[] elem;//引用类型默认为空
    public int usedSize;//不给初始化，默认为0

    //提供构造方法
    public MyArrayList() {//无参数的构造方法

        this.elem = new int[6];
    }

    public MyArrayList(int capacity) {//有参数的构造方法
        this.elem = new int[capacity];

    }

    //顺序表所能进行的活动；
    // 打印顺序表
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    public boolean isFull(){//判断数组是否为满
        if(this.usedSize == elem.length){
            return true;
        }
        return false;
}
    public void resize(){//扩容操作
        this.elem = Arrays.copyOf(this.elem,2*this.elem.length);


    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()){
            //System.out.println("顺序表为满");
            resize();
            //return;
        }
        if(pos <0 || pos >this.usedSize){
            System.out.println("pos位置不合法");
        }
        //代码走这说明满足条件，插入
        for (int i =usedSize-1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];//数据从后挪；
        }
        this.elem[pos] = data;
        usedSize++;//重新记录有效数字
    }
    public void add2(int data){
        if(isFull()){
            //System.out.println("顺序表为满");
            resize();
            //return;
        }
        this.elem[usedSize]=data;
        usedSize++;//重新记录有效数字
    }
    /*有点问题
    public void add3(int data){
        if(isFull()){
            System.out.println("顺序表为满");
        }
        this.elem[0]= data;
        usedSize++;
    }

     */


    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i <usedSize ; i++) {
            if(this.elem[i] == toFind ){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i <usedSize ; i++) {
            if(this.elem[i] == toFind ){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0 || pos>=usedSize){
            return -1;
        }
        for (int i = 0; i <usedSize ; i++) {
            if(i==pos){
                return this.elem[i];
            }
        }
        return -1;
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        //判断pos的值是否合法
        if( pos<0 || pos>=usedSize ){
            return;
        }
        //找到pos;
        for (int i = 0; i <usedSize ; i++) {
            if(i==pos){
                this.elem[i]=value;
            }
        }
    }

    // 删除第一次出现的关键字key
    public void remove(int key) {
        //1、查找是否有key  index
        int index = search(key);
        if(index == -1) {
            System.out.println("没有找到");
            return;
        }
        //找到之后i = index；    i < usdSize-1
        for(int i = index;i < this.usedSize-1;i++) {
            this.elem[i] = this.elem[i+1];
        }
        //3、this.usedSize--;
        this.usedSize--;//长度减小

    }

    // 获取顺序表长度
    public int size() {
        return usedSize;
    }


    // 清空顺序表
    public void clear() {
        this.usedSize = 0;

    }
}


