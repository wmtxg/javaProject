本demo简要使用volatile关键字或synchronized代码块来实现实例变量在多线程之间的可见性

volatile和synchronized的区别
1、关键字volatile是线程同步的轻量级实现，所以volatile性能肯定比synchronized要好，
并且volatile只能修饰于变量，而synchronized可以修饰方法，以及代码块。
2、多线程访问volatile不会发生阻塞，而synchronized会出现阻塞。
3、volatile能保证数据的可见性，但不能保证原子性；而synchronized可以保证原子性，也可以
间接保证可见性，因为它会将私有内存和公共内存的数据做同步。
4、volatile解决的是变量在多个线程之间的可见性；而synchronized关键字解决的是多线程之间
资源的同步性。


线程安全包含原子性和可见性两个方面，java的同步机制都是围绕这两个方面来保证线程安全的。