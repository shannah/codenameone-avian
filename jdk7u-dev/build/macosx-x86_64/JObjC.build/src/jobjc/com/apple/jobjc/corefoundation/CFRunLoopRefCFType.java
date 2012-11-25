package com.apple.jobjc.corefoundation;

public  class CFRunLoopRefCFType extends com.apple.jobjc.CFType {
	public CFRunLoopRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFRunLoopRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFRunLoopGetTypeID();
	}
}
