package com.google.android.DemoKit;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class CommandsController {
	
	public final static int MSG_CMD = 9999; 

	private static HttpClient httpClient = new DefaultHttpClient();

	public static String id = "robot";
	
	private final static String url = "http://link-world.appspot.com/op";
	
	public static BaseActivity activity;

	private static StopableHandlerThread getterThread;
	private static StopableHandlerThread usbControllerThread;

	private static BlockingQueue<Character> commandQueue = new LinkedBlockingQueue<Character>();

	private static Map<Character, Integer> commandMapping = new HashMap<Character, Integer>();

	static {
		commandMapping.put('w', 8);
		commandMapping.put('x', 2);
		commandMapping.put('a', 4);
		commandMapping.put('d', 6);
		commandMapping.put('s', 5);
	}

	public static void start() {
		Log.d("CommandsController", "start");
		
		final Handler cmdHandler = new Handler() {
			public void handleMessage(Message msg) {
				if (msg.what == MSG_CMD) {
					activity.sendCommand(msg.arg1);
				}
			}
		};
		
		if (getterThread == null || !getterThread.isAlive()) {
			// start getter
			getterThread = getGetterThreadInstance();
			getterThread.start();
		} else {
		}

		if (usbControllerThread == null || !usbControllerThread.isAlive()) {
			usbControllerThread = new StopableHandlerThread(
					"usbControllerThread") {
				private final String TAG = "usbControllerThread";
				@Override
				public void run() {
					while (isRunning) {
						try {
							//Stop anyway
							Message stopmsg = new Message();
							stopmsg.what = MSG_CMD;
							stopmsg.arg1 = commandMapping.get('s');
							cmdHandler.sendMessage(stopmsg);
							
							Character c = commandQueue.take();
							Integer cmd = commandMapping.get(c);
							if (cmd != null) {
								Message msg = new Message();
								msg.what = MSG_CMD;
								msg.arg1 = cmd;
								cmdHandler.sendMessage(msg);
							}
						} catch (InterruptedException e1) {
							Log.e(TAG, "InterruptedException: commandQueue.take() failed");
						}
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							Log.e(TAG, "Thread.sleep(500);");
						}
					}
				}
			};
			usbControllerThread.start();
		} else {
		}
	}

	public static void stop() {
		if (getterThread != null && !getterThread.isAlive()) {
			getterThread.stopThread();
		}
		if (usbControllerThread != null && usbControllerThread.isAlive()) {
			usbControllerThread.stopThread();
			try {
				commandQueue.put('s');
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static StopableHandlerThread getGetterThreadInstance() {
		return new StopableHandlerThread("getterThread") {
			private final String TAG = "getterThread";
			@Override
			public void run() {
				try {
				Log.d(TAG, "getterThread:Run");
				Map<String, String> params = new HashMap<String, String>();

				while (isRunning) {
					if (!CommandsController.id.equals("")) {
						params.put("id", CommandsController.id);
						String result = doGet(url, params);
						if (result.startsWith("@")) {
							
							if (!result.equals("@") && !result.equals("@-")) {
								// @- represents this id is not on gae app
								// command
								for (int i = 1; i < result.length(); i++) {
									Character c = (Character) result.charAt(i);
									try {
										commandQueue.put(c);
									} catch (InterruptedException e) {
										Log.e(TAG, e.getMessage());
									}
								}
							}
						} else {
						}
					}
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						Log.e(TAG, e.getMessage());
					}
				}
				} catch (Exception e) {
					Log.e(TAG, e.getMessage());
				}
			}

			private String doGet(String url, Map params) {
				String TAG = "doGet";
				
				String paramStr = "";

				Iterator iter = params.entrySet().iterator();
				while (iter.hasNext()) {
					Map.Entry entry = (Map.Entry) iter.next();
					Object key = entry.getKey();
					Object val = entry.getValue();
					paramStr += paramStr = "&" + key + "=" + val;
				}

				if (!paramStr.equals("")) {
					paramStr = paramStr.replaceFirst("&", "?");
					url += paramStr;
				}
				HttpGet httpRequest = new HttpGet(url);

				String strResult = "@";

				try {

					HttpResponse httpResponse = httpClient.execute(httpRequest);
					if (httpResponse.getStatusLine().getStatusCode() == 200) {
						strResult += EntityUtils.toString(httpResponse
								.getEntity());

					} else {
						strResult = "Error Response: "
								+ httpResponse.getStatusLine().toString();
					}
				} catch (ClientProtocolException e) {
					strResult = e.getMessage().toString();
					Log.e(TAG, strResult);
				} catch (IOException e) {
					strResult = e.getMessage().toString();
					Log.e(TAG, strResult);
				} catch (Exception e) {
					strResult = e.getMessage().toString();
					Log.e(TAG, strResult);
				}

				Log.v("strResult", strResult);

				return strResult.trim();
			}

		};

	}
}
