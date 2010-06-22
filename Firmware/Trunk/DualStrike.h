#ifndef __DualStrike_h_included__
#define __DualStrike_h_included__

// base 576 bytes
#ifndef USE_PS3
#define USE_PS3 1
#endif

#ifndef USE_XBOX
#define USE_XBOX 1
#endif
// 2114 bytes
#ifndef USE_WII
#define USE_WII 0
#endif
// 5000+ bytes
#ifndef USE_PT
#define USE_PT 1
// 110 bytes
#endif

#if USE_PS3 || USE_XBOX
#include "usb/usb_controller.h"
#endif

#if USE_WII
#include "wii/wiimote_extension_controller.h"
#endif

#if USE_PT
#include "pass-through/pass-through.h"
#endif

#if USE_WII && (USE_PS3 || USE_PT)
#error Wii working mode can only be used alone, as S1/S2 are used for the buttons at PinC 4 and 5.
#endif

// CONFIGURATION
/*
The configuration is saved in a two byte array named 'config'.
The bits have the following semantics:

[0]0-1: default working mode (00 == pass-through; 01 == PS3, 10 == XBox)
[0]2:   Dual Strike left stick (0 == deactivated; 1 == activated)
[0]3:   Dual Strike digital pad (0 == deactivated; 1 == activated)
[0]4:   Dual Strike right stick (0 == deactivated; 1 == activated)
[0]5:   Start+Select=Home (0 == disabled, 1 == enabled)
[0]7:   0 (reserved for uninitialized EEPROM test)
[1]1-2: extra PINs mode
     	(00 == deactivated,
		 10 == read Joystick mode switch,
	     01 == emulate Joystick mode switch for pass-through,
	  	 11 == inverted triggers for pass-through)
[1]7:   0 (reserved for uninitialized EEPROM test)
*/

#define CONFIG_0_DEF 0b00001001 /* default config part 0 */
#define CONFIG_1_DEF 0 /* default config part 1 */
#define EEPROM_DEF 0xFF /* for uninitialized EEPROMs */

// configuration tests:
#define CFG_DEF_WORK_MODE_PT 	( !(config[0] & (1<<0)) && !(config[0] & (1<<1)) ) 
#define CFG_DEF_WORK_MODE_PS3 	(  (config[0] & (1<<0)) && !(config[0] & (1<<1)) )
#define CFG_DEF_WORK_MODE_XBOX 	( !(config[0] & (1<<0)) &&  (config[0] & (1<<1)) )
#define CFG_LEFT_STICK 			(config[0] & (1<<2))
#define CFG_DIGITAL_PAD		    (config[0] & (1<<3))
#define CFG_RIGHT_STICK			(config[0] & (1<<4))
#define CFG_HOME_EMU		 	(config[0] & (1<<5))
#define CFG_NO_EXTRA_PINS			( !(config[1] & (1<<0)) && !(config[1] & (1<<1)) )
#define CFG_JOYSTICK_SWITCH_READ	(  (config[1] & (1<<0)) && !(config[1] & (1<<1)) )
#define CFG_JOYSTICK_SWITCH_EMU		( !(config[1] & (1<<0)) &&  (config[1] & (1<<1)) )
#define CFG_INVERTED_TRIGGERS		(  (config[1] & (1<<0)) &&  (config[1] & (1<<1)) )

// configuration modifications:
#define SET_CFG_DEF_WORK_MODE_PT(config)		config[0] &= 0b11111100;
#define SET_CFG_DEF_WORK_MODE_PS3(config)		config[0] |= (1<<0); config[0] &= ~(1<<1); 
#define SET_CFG_DEF_WORK_MODE_XBOX(config)		config[0] &= ~(1<<0); config[0] |= (1<<1);
#define ENABLE_CFG_LEFT_STICK(config) 			config[0] |= (1<<2);
#define DISABLE_CFG_LEFT_STICK(config) 			config[0] &= ~(1<<2);
#define ENABLE_CFG_DIGITAL_PAD(config)			config[0] |= (1<<3);
#define DISABLE_CFG_DIGITAL_PAD(config)			config[0] &= ~(1<<3);
#define ENABLE_CFG_RIGHT_STICK(config)			config[0] |= (1<<4);
#define DISABLE_CFG_RIGHT_STICK(config)			config[0] &= ~(1<<4);
#define ENABLE_CFG_HOME_EMU(config)		 		config[0] |= (1<<5);
#define DISABLE_CFG_HOME_EMU(config)			config[0] &= ~(1<<5);
#define SET_CFG_NO_EXTRA_PINS(config)			config[1] &= 0b11111100;
#define SET_CFG_JOYSTICK_SWITCH_READ(config)	config[1] |= (1<<0); config[1] &= ~(1<<1); 
#define SET_CFG_JOYSTICK_SWITCH_EMU(config)		config[1] &= ~(1<<0); config[1] |= (1<<1);
#define SET_CFG_INVERTED_TRIGGERS(config)		config[1] |= (1<<0); config[1] |= (1<<1);


// BUTTON DEFINITIONS

// set to 1 for SMD version of the Dual Strike
#ifndef DUAL_STRIKE_SMD
#define DUAL_STRIKE_SMD 0
#endif

// set to 1 to use L1 and L2
#ifndef EXTRA_BUTTONS
#define EXTRA_BUTTONS 1
#endif

//PC Button 9 - Select
#define Stick_Select		(PINC & (1<<1))
//PC Button 10 - Start
#define Stick_Start			(PINC & (1<<0))

#if DUAL_STRIKE_SMD
	#if USE_WII
		#define Stick_Up			(PIND & (1<<0))
		#define Stick_Down			(PIND & (1<<3))
	#else
		#define Stick_Up			(PINC & (1<<4))
		#define Stick_Down			(PINC & (1<<5))
	#endif

	#define SET_HOME_OUTPUT DDRB |= (1<<5);
	#define SWITCH_HOME_LOW PORTB &= ~(1<<5);
	#define SWITCH_HOME_HIGH PORTB |= (1<<5);

	#define Stick_Left			(PINC & (1<<3))
	#define Stick_Right			(PINC & (1<<2))

	//PC Button 1 - Square - LP
	#define Stick_Jab			(PIND & (1<<7))
	//PC Button 4 - Triangle - MP
	#define Stick_Strong		(PINB & (1<<0))
	//PC Button 6 - R1 - HP
	#define Stick_Fierce		(PINB & (1<<2))
	//PC Button 2 - Cross - LK
	#define Stick_Short			(PIND & (1<<5))
	//PC Button 3 - Circle - MK
	#define Stick_Forward		(PIND & (1<<6))
	//PC Button 8 - R2 - HK
	#define Stick_Roundhouse	(PINB & (1<<4))
	//PC Button 13 - Home
	#define Stick_Home			(PINB & (1<<5))

	#ifdef EXTRA_BUTTONS
		//PC Button 5 - L1 - 4P
		#define Stick_Extra0		(PINB & (1<<1))
		//PC Button 7 - L2 - 4K
		#define Stick_Extra1		(PINB & (1<<3))
	#endif
#else
	#if USE_WII
		//PC Button 13 - Home
		#define Stick_Home			(PIND & (1<<0))

		#if EXTRA_BUTTONS
			//PC Button 7 - L2 - 4K
			#define Stick_Extra1		(PIND & (1<<3))
		#endif
	#else
		//PC Button 13 - Home
		#define Stick_Home			(PINC & (1<<5))

		#if EXTRA_BUTTONS
			//PC Button 7 - L2 - 4K
			#define Stick_Extra1		(PINC & (1<<4))
		#endif

		#define SET_HOME_OUTPUT DDRC |= (1<<5);
		#define SWITCH_HOME_LOW PORTC &= ~(1<<5);
		#define SWITCH_HOME_HIGH PORTC |= (1<<5);
	#endif

	#define Stick_Up			(PIND & (1<<6))
	#define Stick_Down			(PIND & (1<<7))
	#define Stick_Left			(PINB & (1<<0))
	#define Stick_Right			(PINB & (1<<1))

	//PC Button 1 - Square - LP
	#define Stick_Jab			(PINB & (1<<2))
	//PC Button 4 - Triangle - MP
	#define Stick_Strong		(PINB & (1<<5))
	//PC Button 6 - R1 - HP
	#define Stick_Fierce		(PIND & (1<<5))
	//PC Button 2 - Cross - LK
	#define Stick_Short			(PINB & (1<<3))
	//PC Button 3 - Circle - MK
	#define Stick_Forward		(PINB & (1<<4))
	//PC Button 8 - R2 - HK
	#define Stick_Roundhouse	(PINC & (1<<2))


	#if EXTRA_BUTTONS
		//PC Button 5 - L1 - 4P
		#define Stick_Extra0		(PINC & (1<<3))
	#endif
#endif

void readJoystickSwitch();

#endif
