package com.apple.jobjc.corefoundation;

public  class CFUserNotificationRefCFType extends com.apple.jobjc.CFType {
	public CFUserNotificationRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFUserNotificationRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFUserNotificationGetTypeID();
	}
}
