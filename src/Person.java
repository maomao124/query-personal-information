/**
 * Project name(项目名称)：查询个人信息 query-personal-information
 * Package(包名): PACKAGE_NAME
 * Class(类名): Person
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/7
 * Time(创建时间)： 13:00
 * Version(版本): 1.0
 * Description(描述)： 每个员工都会有自己的档案，主管可以查看在职员工的档案。使用 Java 创建一个员工实体类，
 * 然后通过构造方法创建一个名为“王洁”的员工，最后打印出员工档案信息。
 */

public class Person
{
    private String name;
    private int age;
    private String sex;
    private String birthday;
    private String constellation;

    public Person(String name, int age, String sex, String birthday, String constellation)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthday = birthday;
        this.constellation = constellation;
    }

    public StringBuilder info()
    {
        StringBuilder s = new StringBuilder();
        s.append("姓名：").append(name).append("\n年龄：").append(age).append("\n性别：").append(sex).append("\n出生日期：").append(birthday).append("\n星痤：").append(constellation);
        return s;
    }
}

class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        System.out.print("\033[1;94m");
        Person p = new Person("傻逼", 19, "女", "2001/06/04", "狮子座");
        System.out.println(p.info());
        System.out.print("\033[0;0m");
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        //------------------------------------------------------
    }
}