# [动态规划套路详解](https://leetcode-cn.com/problems/fibonacci-number/solution/dong-tai-gui-hua-tao-lu-xiang-jie-by-labuladong/)
# [漫画：什么是动态规划？](https://juejin.im/post/5a29d52cf265da43333e4da7)

## 动态规划

> 适用于重叠子问题和最优子结构的问题


三个动态规划相关的概念: **最优子结构, 边界, 状态转移方程**

> 动态规划之所以比较难以掌握，在于如何把原问题分解为相似的子问题，以及如何找到原问题和子问题之间的关系。这两点需要大量的练习和总结才能熟练运用。<img data-rawheight="61" src="https://pic1.zhimg.com/50/v2-cc627e653bd7ceac99f79468ba290e2d_hd.jpg" data-size="normal" data-rawwidth="600" class="origin_image zh-lightbox-thumb" width="600" data-original="https://pic1.zhimg.com/v2-cc627e653bd7ceac99f79468ba290e2d_r.jpg"/>
  
  作者：Mingqi
  链接：https://www.zhihu.com/question/23995189/answer/305426560
  来源：知乎
  著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

> 自下而上
![](https://user-gold-cdn.xitu.io/2017/12/8/1603368f5735235e?imageView2/0/w/1280/h/960/format/webp/ignore-error/1)

> 状态转移公式 : dp[] 数组