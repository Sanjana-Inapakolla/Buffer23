package buffer;

import java.util.Scanner;


class Calendar extends OTPgeneration {


//Conductor page for OTP validation


@SuppressWarnings({ "resource", "unused" })
public static void main(String []args) {


Scanner sc=new Scanner(System.in);


//array to validate the number of days


int arr[]=new int[22];


int count=22;


for(int i=0;i<22;i++) {


arr[i]=count;


count--;


}


int k=1;


int passes=22;


Calendar cal=new Calendar();


String generatedOTP="k";


for(int i=0;i<22;i++) {


OTPgeneration t=new OTPgeneration();


String so= t.generateOTP();


System.out.println("\n\nOTP is "+so);


System.out.println("Enter code: ");


//generatedOTP=sc.next();


//System.out.print("\nEnter code: ");


int code=sc.nextInt();


// System.out.print("client"+generatedOTP);


//if(so.compareTo(generatedOTP)==0) {


//System.out.print(so);


if(generatedOTP=="k") {


for(int j=0;j<30;j++) {


if(passes>0) {


passes--;


System.out.printf("\nDay %d ,passes left: %d",k,passes);


k++;


break;


}
else if(generatedOTP=="0") {
for(int m=0;m<30;m++) {
}
}
else {

System.out.println("No passess left ");

}
}
}
}
}
}

