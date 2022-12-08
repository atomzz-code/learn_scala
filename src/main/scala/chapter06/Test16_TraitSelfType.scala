package chapter06

object Test16_TraitSelfType {
  def main(args: Array[String]): Unit = {
    val user = new RegisterUser("alice", "12345")
    user.insert()

  }

}
// 用户类
class User(val name: String, val password: String)


trait UserDao{
  _: User => //把自身类型定义成User，userDao想使用user一些属性但又不想继承，依赖注入
  //注册，向数据库插入数据
  def insert():Unit = {
    println(s"insert into db: ${this.name}")
  }
}
//定义注册用户类
class RegisterUser(name: String, password: String) extends  User(name, password) with UserDao