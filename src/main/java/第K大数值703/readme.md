# Top K 问题

此问题属于 topK 问题，是一类典型的题目。处理此类问题最直观的想法就是排序，但是使用排序并不是高效的方法，因为题目只关心第 k 大的数字并且数据是动态的，排序处理时间复杂度太高。堆就是解决一个动态数据集合中的 topK 问题的利器。最小堆经常用来求取数据集合中 k 个值最大的元素，而最大堆经常用来求取数据集合中 k 个值最小的元素。

作者：master_xue
链接：https://leetcode-cn.com/problems/jBjn9C/solution/jian-zhi-offer-2-mian-shi-ti-58-shu-zhon-p7ko/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

## java 中的 优先级队列,可以模拟 小顶堆和大顶堆

## 一、优先队列概述



优先队列PriorityQueue是Queue接口的实现，可以对其中元素进行排序，

可以放基本数据类型的包装类（如：Integer，Long等）或自定义的类

**对于基本数据类型的包装器类，优先队列中元素默认排列顺序是升序排列**

但对于自己定义的类来说，需要自己定义比较器

## 二、常用方法

```java
peek()//返回队首元素
poll()//返回队首元素，队首元素出队列
add()//添加元素
offer() // 插入一个新的元素
size()//返回队列元素个数
isEmpty()//判断队列是否为空，为空返回true,不空返回false
```
```java
//自定义比较器，降序排列
static Comparator<Integer> cmp = new Comparator<Integer>() {
      public int compare(Integer e1, Integer e2) {
        return e2 - e1;
      }
    };
public static void main(String[] args) {
        //不用比较器，默认升序排列
        Queue<Integer> q = new PriorityQueue<>();
        q.add(3);
        q.add(2);
        q.add(4);
        while(!q.isEmpty())
        {
            System.out.print(q.poll()+" ");
        }
        /**
         * 输出结果
         * 2 3 4 
         */
        //使用自定义比较器，降序排列
        Queue<Integer> qq = new PriorityQueue<>(cmp);
        qq.add(3);
        qq.add(2);
        qq.add(4);
        while(!qq.isEmpty())
        {
            System.out.print(qq.poll()+" ");
        }
        /**
         * 输出结果
         * 4 3 2 
         */
}
```
