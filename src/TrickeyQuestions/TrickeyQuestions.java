package TrickeyQuestions;

public class TrickeyQuestions {
    public static void main(String[] args){
        //What is the output of below scenario
//        String str = "abc";
//        String str = "def";
//        System.out.println(str);
     //output;   //java: variable str is already defined in method main(java.lang.String[])
//--------------------------------------
        //second highest salary
       // select salary from employeeTable orderBy salary Desc limit 1,1
//-------------------------------------
        //third highest salary
        // select salary from employeeTable orderBy salary Desc limit 2,1
        //--------------------------------
//        class Abc{
//            public void m1(){}
//        }
//        class Xyz {
//            void m1();
//        }

     //   output: no compiles we need to have abstract keyword
//------------------------------------------------------------------

       // class Abc{ public void m1(){} } class Xyz


//        class Abc{
//            public void m1(){}
//        }
//        class Xyz extends Abc{
//            void m1(){}
//        }
      //  second one won't compile beacause of public in method level
        //----------------------------------------------------------------

//        class Abc{ public void m1(){} } class Xyz
//
//        class Abc{
//            public void m1(){}
//        }
//        class Xyz extends Abc{
//            public void m1(){}
//        }
//        Abc a=new Xyz();
//        Abc a=new Xyz();
//        this will compile

//------------------------------------------------------------
//        Xyz a=new Abc();
//        Xyz a=new Abc();
       // this type of casting is not supported in java , down casting
//------------------------------------------------------------------
//        Xyz a=(Xyz)new Abc();
//        Xyz a=(Xyz)new Abc();
        //compilation success but in run time we get error
//---------------------------------------------------------------------
//        String s1=new String("abc"); //two are present one is at
//        // spring constant pool and other one is heap memory
//        String s1=new String("abc");
//        s1=null;
//                s1=null;
        //two objects are created with new keyword
        //if you make s1 as null one is deleted which is from heap memory
        // rest one is present in string constant pool
//---------------------------------------------------------------------
    }
}
