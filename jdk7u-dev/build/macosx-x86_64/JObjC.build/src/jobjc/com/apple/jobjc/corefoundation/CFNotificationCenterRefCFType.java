package com.apple.jobjc.corefoundation;

public  class CFNotificationCenterRefCFType extends com.apple.jobjc.CFType {
	public CFNotificationCenterRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFNotificationCenterRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFNotificationCenterGetTypeID();
	}
}
