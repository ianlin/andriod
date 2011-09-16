// using adk from https://github.com/felis/USB_Host_Shield_2.0
#include <avrpins.h>
#include <max3421e.h>
#include <usbhost.h>
#include <usb_ch9.h>
#include <Usb.h>
#include <usbhub.h>
#include <avr/pgmspace.h>
#include <address.h>

#include <adk.h>

#include <printhex.h>
#include <message.h>
#include <hexdump.h>
#include <parsetools.h>

USB Usb;
USBHub hub0(&Usb);
USBHub hub1(&Usb);
ADK adk(&Usb,"Google, Inc.",
            "DemoKit",
            "DemoKit Arduino Board",
            "1.0",
            "http://www.android.com",
            "0000000012345678");
uint8_t  b, b1;

// control char
//   8 
// 4 5 6
//   2
int E1 = 6; //M1 Speed Control 
int E2 = 5; //M2 Speed Control 
int M1 = 8; //M1 Direction Control 
int M2 = 7; //M2 Direction Control 

#define  LED1_RED       3
#define  BUTTON1        2

void setup();
void loop();

void init_buttons()
{
	pinMode(BUTTON1, INPUT);

	// enable the internal pullups
	digitalWrite(BUTTON1, HIGH);
}

void init_leds()
{
	int i; 
	for(i=5;i<=8;i++) 
		pinMode(i, OUTPUT); 
}

void setup()
{
	Serial.begin(115200);
	Serial.println("\r\nADK demo start");
        
        if (Usb.Init() == -1) {
          Serial.println("OSCOKIRQ failed to assert");
        while(1); //halt
        }//if (Usb.Init() == -1...

	init_leds();
	//init_buttons();
//	b1 = digitalRead(BUTTON1);
}

void loop()
{
  Serial.println("\r\nentering loop....");
  uint8_t rcode;
  uint8_t msg[1];// = { 0x00 };
   Usb.Task();
   if( adk.isReady() == false ) {
     return;
   }
   Serial.println("\r\nADK is ready");
   uint16_t len = sizeof(msg);
   
   rcode = adk.RcvData(&len, msg);

   int leftspeed = 200;  //255 is maximum speed  
   int rightspeed = 200; 
   Serial.println('recv');
   Serial.println(msg[0]);
   switch(msg[0]) {// Perform an action depending on the command { 
     case 8://Move Forward 
       forward (leftspeed,rightspeed); 
       break; 
     case 2://Move Backwards 
       reverse (leftspeed,rightspeed); 
       break; 
     case 4://Turn Left 
       left (leftspeed,rightspeed); 
       break; 
     case 6://Turn Right 
       right (leftspeed,rightspeed); 
       break; 
     case 5://stop
       stop(); 
       break; 
     default: 
       break;
  }
}
 
void stop(void) { //Stop { 
  digitalWrite(E1,LOW); 
  digitalWrite(E2,LOW); 
} 
void forward(char a,char b) { 
  analogWrite (E1,a); 
  digitalWrite(M1,LOW); 
  analogWrite (E2,b); 
  digitalWrite(M2,LOW); 
} 
void reverse (char a,char b) { 
  analogWrite (E1,a); 
  digitalWrite(M1,HIGH); 
  analogWrite (E2,b); 
  digitalWrite(M2,HIGH); 
} 
void left (char a,char b) { 
  analogWrite (E1,a); 
  digitalWrite(M1,HIGH); 
  analogWrite (E2,b); 
  digitalWrite(M2,LOW); 
} 
void right (char a,char b) 
{ 
  analogWrite (E1,a); 
  digitalWrite(M1,LOW); 
  analogWrite (E2,b); 
  digitalWrite(M2,HIGH); 
}


