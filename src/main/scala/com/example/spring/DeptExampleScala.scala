package com.example.spring

object DeptExampleScala {

   def main(args: Array[String]): Unit = {

      var dept : Dept = new Dept;
      dept.deptno = 10;
      dept.dname = "xxx";
      dept.loc = "yyy"
      
      println(dept);
      dept.print();
      dept.print2();
      println(dept.deptno + dept.dname);
   }

}