abstract class Mobile{
abstract void cost();
abstract void ram();
abstract void harddisk();
abstract void camera_pexcel();
void open(){
System.out.println("open with power botton");
}
}

class Oppo extends Mobile{
 void cost(){
  System.out.println("Prize of oppo is: 25000");
 }
 void ram(){
  System.out.println("Ram of oppo is: 6GB");
 }
 void harddisk(){
  System.out.println("Harddisk of oppo is: 64GB");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of oppo is: 64px");
 }
}

class Oneplus extends Mobile{
 void cost(){
  System.out.println("Prize of oneplus is: 54000");
 }
 void ram(){
  System.out.println("Ram of oneplus is: 12GB");
 }
 void harddisk(){
  System.out.println("Harddisk of oneplus is: 512GB");
 }
 void camera_pexcel(){
  System.out.println("camera_pexcel of oneplus is: 64px");
 }
}

class MobileFactory{
 static Mobile getMobile(String mobileName){
  if(mobileName.equalsIgnoreCase("Redmi")){
   return new Redmi();
  }
  else if(mobileName.equalsIgnoreCase("Oneplus")){
   return new Oneplus();
  }
  else {
   return null;
  }
 }
}
class FactoryMethod{
public static void main(String args[]){
Mobile x=MobileFactory.getMobile("Oppo");
x.cost();
x.ram();
x.camera_pexcel();
x.harddisk();
x.open();
}
}