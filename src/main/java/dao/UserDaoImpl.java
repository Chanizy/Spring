package dao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("UserDaoImpl创建....");
    }

    public void init(){
        System.out.println("初始化方法...");
    }
    public void check(){
        System.out.println("JAINCHA.....");
    }

    @Override
    public void save() {
        System.out.println("saving running.....");
    }
}
