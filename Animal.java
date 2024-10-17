class Animal{
public static  void main(String[] args){
Animal tiger = new Animal("wild","male",10);
System.out.print(tiger);

Animal Cow = new Animal("Not wild","Female", 15);
System.out.print(cow);
}
}

class Animal{
String type;
String gender;
int  age;

Animal(String type,string gender,int age){
this.type=type;
this.gender=gender;
this.age=age;
}

void sleeping(){
System.out.print("Animal is sleeping");
}
void running(){
System.out.print("Animal is running");
}
}
@Override
public String toString(){
return "Animal {type ='"+type+"',age"+age+",gender'"+gender+"'}";
}
}
