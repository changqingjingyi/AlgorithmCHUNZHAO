学习笔记
Deque:
import java.util.LinkedList;
import java.util.Deque;

public class DequeExample {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        deque.push("a");
        deque.push("b");
        deque.push("c");

        System.out.println(deque);

        String str = deque.peek();

        System.out.println(str);
        System.out.println(deque);

        while (deque.size() > 0) {
            System.out.println(deque.pop());
        }

        System.out.println(deque);
    }
}
数组：
    数组用一块连续的内存空间，来存储相同类型的一组数据，最大的特点就是支持随机访问，
但插入、删除操作也因此变得比较低效，平均情况时间复杂度为 O(n)。在平时的业务开发中
，我们可以直接使用编程语言提供的容器类，但是，如果是特别底层的开发，直接使用数组
可能会更合适。
轻松写出正确链表代码：
    1：理解指针或引用的含义：将某个变量赋值给指针，实际上就是将这个变量的地址赋值给指
针，或者反过来说，指针中存储了这个变量的内存地址，指向了这个变量，通过指针就能找到
这个变量。
    2：警惕指针丢失和内存泄漏
    3：利用哨兵简化实现难度
    4：重点留意边界条件处理
    5：举例画图，辅助思考
    6：勤学多练
 队列：队列最大的特点就是先进先出，主要的两个操作是入队和出队。跟栈一样，它既可以
用数组来实现，也可以用链表来实现。用数组实现的叫顺序队列，用链表实现的叫链式队列。
特别是长得像一个环的循环队列。在数组实现队列的时候，会有数据搬移操作，要想解决数
据搬移的问题，我们就需要像环一样的循环队列。
  

