项目采用
Spring + SpringMVC + Mybatis + Sharding-JDBC框架
使用 Sharding-JDBC 中间件进行分库分表的操作
数据源为两个库每个库中有两张学生表三张用户表（数据库中的表名、表结构相同）
库和表的结构如下：
sharding_0库
    t_student_00
    t_student_01
    t_user_00
    t_user_01
    t_user_02
sharding_1库
    t_student_00
    t_student_01
    t_user_00
    t_user_01
    t_user_02

t_student_0*表中的字段：
    id
    student_id
    name
    age
t_user_0*表中的字段：
    id
    user_id
    name
    age