package com.company;

import java.util.*;

public class Examsys {


    public static void main(String[] args)



    {
        Scanner sc=new Scanner(System.in);
        int ch;




        while(true)
        {
            System.out.println("01. JAVA");               //WILL ENTER TO JAVA QUESTION
            System.out.println("02. C");                  //WILL ENTER TO C QUESTION
            System.out.println("03. C++");                //WILL ENTER TO C++ QUESTION
            System.out.println("04. PHP");		   //WILL ENTER TO HTML QUESTION
            System.out.println("05. HTML");  		   //WILL ENTER TO HTML QUESTION
            System.out.println("06. PYTHON");             //WILL ENTER TO PYTHON QUESTION
            System.out.println("07. EXIT");               //WILL EXIT THE PROGRAM
            System.out.println("Enter Your Choice: ");    //HERE THE USER WILL ENTER THIER CHOICE FOR QUESTION!
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    String q1 = "Q1. Which component is used to compile, debug and execute the java programs?: \n"
                            + "(a)JRE\n(b)JIT\n\n(c)JDK\n(d)JVM";

                    String q2 = "Q2. Which one of the following is not a Java feature?\n"
                            + "(a) Object-oriented\n(b) Use of pointers\n(c) Portable\n(d) Dynamic and Extensible";

                    String q3 = "Q3. Which of these cannot be used for a variable name in Java?\n"
                            + "(a)identifier & keyword\n(b) identifier\n(c) keyword\n(d) none of the mentioned";

                    String q4 = "Q4. What is the extension of java code files?\n"
                            + "(a).js\n(b) .txt\n(c) .class\n(d).java";

                    String q5 = "Q5. Which of the following is not an OOPS concept in Java?\n"
                            + "(a)Polymorphism\n(b)Inheritance\n(c) Compilation\n(d) Encapsulation";




                    Java [] javas = {
                            new Java(q1, "c"),
                            new Java(q2, "b"),
                            new Java(q3, "c"),
                            new Java(q4, "d"),
                            new Java(q5, "c"),

                    };
                    takeTest(javas);
                    break;
                }


                case 2:
                {
                    String q1 = "Q1. Who invented C Language.?"
                            + "(a)Charles Babbage\n(B) Grahambel\n(C) Dennis Ritchie\n(D) Steve Jobs";

                    String q2 = "Q2. C Language is a successor to which language.?\n"
                            + "(a)switch\n(b)goto\n(c)go back\n(d)return";

                    String q3 = "Q3. C is a which level language?\n"
                            + "(a) Low Level\n(B) High Level\n(C) Low + High\n(D) None";

                    String q4 = "Q4. C language was invented in which laboratories.?\n"
                            + "(a) Uniliver Labs\n(B) IBM Labs\n(C) AT&T Bell Labs\n(D) Verizon Labs";

                    String q5 = "Q5. Which of the following cannot be checked in a switch-case statement?\n"
                            + "(a)Integer\n(b)Enum\n(c)Float\n(d)Character";





                    Clang [] clangs = {
                            new Clang(q1, "c"),
                            new Clang(q2, "d"),
                            new Clang(q3, "b"),
                            new Clang(q4, "c"),
                            new Clang(q5, "c"),

                    };
                    takeTest(clangs);
                    break;
                }


                case 3:
                {
                    String q1 = "Q1.Who invented C++?\n"
                            + "(a) Dennis Ritchie\n(b) Ken Thompson\n(c) Brian Kernighan\n(d) Bjarne Stroustrup";

                    String q2 = "Q2. Which of the following is used for comments in C++?\n"
                            + "(a)/* comment */\n(b) // comment */\n(c) // comment\n(d) both // comment or /* comment */";

                    String q3 = "Q3. Which of the following user-defined header file extension used in c++?\n"
                            + "(a)hg\n(b) cpp\n(c) h\n(d) hf";

                    String q4 = "Q4.  Which of the following is a correct identifier in C++?\n"
                            + "(a)VAR_1234\n(b) $var_name\n(c) 7VARNAME\n(d) 7var_name";

                    String q5 = "Q5. Default constructor has ____ arguments.\n"
                            + "(a)No argument\n(b)One argument\n(c)Two argument\n(d)None of the above.";


                    Cplus [] cpluss = {
                            new Cplus(q1, "d"),
                            new Cplus(q2, "d"),
                            new Cplus(q3, "c"),
                            new Cplus(q4, "a"),
                            new Cplus(q5, "a"),
                    };
                    takeTest(cpluss);
                    break;
                }

                case 4:
                {
                    String q1 = "Q1. PHP is _______ scripting language.\n"
                            + "(a)Server-side\n(b) Clint-side \n(c) Middle-side\n(d) Out-side";

                    String q2 = "Q2.  PHP scripts are executed on _________\n"
                            + "(a) ISP Computer\n(b) Client Computer\n(c)Server Computer\n(d) It depends on PHP scripts";

                    String q3 = "Q3. PHP is an example of ___________ scripting language.\n"
                            + "(a)Server-side\n(b)In-side\n(c)Client-side\n(d)Browser-side";

                    String q4 = "Q4. PHP Stands for?\n"
                            + "(a)PHP Hyper Markup Preprocessor\n(b)PHP Hypertex Processor\n(c)PHP Hypertext Preprocessor\n(d)PHP Hyper Markup Processor";

                    String q5 = "Q5. Which of the following statements prints in PHP?\n"
                            + "(a). Out\n(B) Write\n (C) Echo\n(D) Display";

                    Php [] phps = {
                            new Php(q1, "a"),
                            new Php(q2, "c"),
                            new Php(q3, "c"),
                            new Php(q4, "c"),
                            new Php(q5, "c"),

                    };
                    takeTest(phps);
                    break;
                }




                case 5:
                {
                    String q1 = "Q1. What is the full form of HTML?\n"
                            + "(a)Hyper Tech Markup Language\n(b)Hyper Teach Markup Language\n(c)HyperText Markup Language\n(d)None of the above.";

                    String q2 = "Q2. HTML is what type of language ?\n"
                            + "(a)Scripting Language\n(b)Markup Language\n(c)Programming Language\n(d)Network Protocol";

                    String q3 = "Q3. HTML uses?\n"
                            + "(a)User defined tags\n(b)Pre-specified tags\n(c)Fixed tags defined by the language\n(d)Tags only for linking";

                    String q4 = "Q4. The year in which HTML was first proposed _______.\n"
                            + "(a)1990\n(b)1980\n(c)2000\n(d)1995";

                    String q5 = "Q5. Fundamental HTML Block is known as ___________.\n"
                            + "(a)HTML Body\n(b)HTML Tag\n(c)HTML Attribute\n(d)HTML Element";

                    Html [] htmls = {
                            new Html(q1, "c"),
                            new Html(q2, "b"),
                            new Html(q3, "c"),
                            new Html(q4, "a"),
                            new Html(q5, "b"),

                    };
                    takeTest(htmls);
                    break;
                }



                case 6:
                {
                    String q1 = "Q1. Which of the following symbols are used for comments in Python?\n"
                            + "(a)#\n(b)''\n(c)//\n(d)/**/";

                    String q2 = "Q2. Which keyword is used to define methods in Python?\n"
                            + "(a)Function\n(b)Method\n(c)Def\n(d)All of the above";

                    String q3 = "Q3. Which of the following is correct way to declare string variable in Python?\n"
                            + "(a)fruit = banana\n(b)fruit = [banana]\n(c)fruit = (banana)\n(d)fruit = 'banana'";

                    String q4 = "Q4. Which predefined Python function is used to find length of string?\n"
                            + "(a)stringlength()\n(b)strlen()\n(c)len()\n(d)length()";

                    String q5 = "Q5. Syntax of constructor in Python?\n"
                            + "(a) def __init__()\n(b)def _init_()\n(c)_init_()\n(d)All of the above.";

                    Python [] pythons = {
                            new Python(q1, "a"),
                            new Python(q2, "c"),
                            new Python(q3, "d"),
                            new Python(q4, "c"),
                            new Python(q5, "a"),

                    };
                    takeTest(pythons);
                    break;
                }




            }
        }
    }

    public static void takeTest(Java [] javas) {

        int score = 0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name= ");
        String name=sc.nextLine();

        System.out.println("Enter Rollno= ");
        int rollno = sc.nextInt();

        System.out.println("");
        String n1ame=sc.nextLine();

        for (int i=0;i<javas.length;i++) {
            System.out.println(javas[i].a);
            String b = sc.nextLine();
            if (b.equals(javas[i].b)) {
                score++;
            }
        }
        System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + score + "/" + javas.length + "\n");

    }

    public static void takeTest(Clang [] clangs) {

        int sco = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name= ");
        String name=sc.nextLine();
        System.out.println("Enter Rollno= ");
        int rollno = sc.nextInt();

        System.out.println("");
        String n1ame=sc.nextLine();
        for (int i=0;i<clangs.length;i++) {
            System.out.println(clangs[i].c);
            String d = sc.nextLine();
            if (d.equals(clangs[i].d)) {
                sco++;
            }
        }
        System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + sco + "/" + clangs.length + "\n");


    }


    public static void takeTest(Cplus [] cpluss) {

        int s = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name= ");
        String name=sc.nextLine();
        System.out.println("Enter Rollno= ");
        int rollno = sc.nextInt();

        System.out.println("");
        String n1ame=sc.nextLine();
        for (int i=0;i<cpluss.length;i++) {
            System.out.println(cpluss[i].p);
            String q = sc.nextLine();
            if (q.equals(cpluss[i].q)) {
                s++;
            }
        }
        System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + s + "/" + cpluss.length + "\n");



    }

    public static void takeTest(Php [] phps) {

        int scoress = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name= ");
        String name=sc.nextLine();
        System.out.println("Enter Rollno= ");
        int rollno = sc.nextInt();

        System.out.println("");
        String n1ame=sc.nextLine();
        for (int i=0;i<phps.length;i++) {
            System.out.println(phps[i].z);
            String s = sc.nextLine();
            if (s.equals(phps[i].s)) {
                scoress++;
            }
        }
        System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + scoress + "/" + phps.length + "\n");


    }



    public static void takeTest(Html[] htmls) {

        int score1 = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name= ");
        String name=sc.nextLine();
        System.out.println("Enter Rollno= ");
        int rollno = sc.nextInt();

        System.out.println("");
        String n1ame=sc.nextLine();
        for (int i=0;i<htmls.length;i++) {
            System.out.println(htmls[i].g);
            String h = sc.nextLine();
            if (h.equals(htmls[i].h)) {
                score1++;
            }
        }
        System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + score1 + "/" + htmls.length + "\n");

    }




    public static void takeTest(Python [] pythons) {

        int scores = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name= ");
        String name=sc.nextLine();
        System.out.println("Enter Rollno= ");
        int rollno = sc.nextInt();

        System.out.println("");
        String n1ame=sc.nextLine();
        for (int i=0;i<pythons.length;i++) {
            System.out.println(pythons[i].r);
            String s = sc.nextLine();
            if (s.equals(pythons[i].s)) {
                scores++;
            }
        }
        System.out.println("Congratulation!" + " "+ name + " " + "Roll no.= " + " " + rollno + " " + "\n" + "You Scored " + scores + "/" + pythons.length + "\n");



    }


}


class Java {
    String a;
    String b;

    public Java(String a, String b) {
        this.a = a;
        this.b = b;

    }
}

class Php {
    String z;
    String s;

    public Php(String z, String s) {
        this.z = z;
        this.s = s;

    }
}


class Python {
    String r;
    String s;

    public Python(String r, String s) {
        this.r = r;
        this.s = s;

    }
}

class Clang {
    String c;
    String d;

    public Clang(String c, String d) {
        this.c = c;
        this.d = d;

    }
}

class Html {
    String g;
    String h;

    public Html(String g, String h0) {
        this.g = g;
        this.h = h;

    }
}

class Cplus {
    String p;
    String q;

    public Cplus(String p, String q) {
        this.p = p;
        this.q = q;

    }
}




