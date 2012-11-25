package com.apple.jobjc.corefoundation;

public  class CFRunLoopTimerRefCFType extends com.apple.jobjc.CFType {
	public CFRunLoopTimerRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFRunLoopTimerRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFRunLoopTimerGetTypeID();
	}
}
