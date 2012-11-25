package com.apple.jobjc.corefoundation;

public  class CFRunLoopObserverRefCFType extends com.apple.jobjc.CFType {
	public CFRunLoopObserverRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFRunLoopObserverRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFRunLoopObserverGetTypeID();
	}
}
