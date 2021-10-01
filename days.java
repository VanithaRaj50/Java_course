 class Dayofweek{
public static void main(String args[]){
int year=13;
int month=0;
int day=8;
int dayofweek=(day+month+year+(year/4)+6)%7;
if(dayofweek==0){
System.out.println("Sunday");
}
else if(dayofweek==1){
System.out.println("Monday");
}
else if(dayofweek==2){
System.out.println("Tuesday");
}
else if(dayofweek==3){
System.out.println("wednesday");
}
else if(dayofweek==4){
System.out.println("Thursday");
}
else if(dayofweek==5){
System.out.println("Friday");
}
System.out.println("Saturday");
}
}


