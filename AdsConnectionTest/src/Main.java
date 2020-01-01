
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;

import de.beckhoff.jni.JNIByteBuffer;

import packageAds.PlcConnector;


public class Main {

	public enum E_MainStep {
	    INIT,
	    DISPATCH_MQTT_PACKS
	  }
	
	public static E_MainStep eMainStep  = E_MainStep.INIT;
	
	public static void main(String[] args) {
		
		
		PlcConnector plcConnector = new PlcConnector();
		
					
		while(true)
		{
			plcConnector.CheckStateMachine();
			plcConnector.Execute();
			
			
			
			switch(eMainStep)
			{
			
				case INIT:
					
					break;
					
				
			
			}
					
		}
		
	}

}
