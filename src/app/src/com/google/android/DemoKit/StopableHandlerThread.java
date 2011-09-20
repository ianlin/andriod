package com.google.android.DemoKit;

import android.os.HandlerThread;

/**
 * Define common stop behavior. 
 * Note: must check isRunning flag in Run() to make sure it could actually be stopped.  
 * 
 * @author Rad
 *
 */

public class StopableHandlerThread extends HandlerThread {
	
	protected boolean isRunning = true;
	
	public StopableHandlerThread(String name) {
		super(name);
		
	}
	
	public void stopThread() {
		isRunning = false;
	}
}
