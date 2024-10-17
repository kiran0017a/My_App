class  File{
public  static void main(String [] args){
 Person Kiran=newPerson("Kiran","Female",21);
 System.out.println(name);
}
}

class  Person{
String name;
String gender;
int age;

Person(String name,String gender,int age){             }
this.name=name;
this.gender=gender;
this.age=age;

}

void  swimming(){
System.out.print("Person is swimming");
}

void  sleeping(){
System.out.println("Person is sleeping");
}
@Override
public String toString(){
return "Person {name='"+name+"',age"+age+",gender'"+gender+"'}";

        }
}
