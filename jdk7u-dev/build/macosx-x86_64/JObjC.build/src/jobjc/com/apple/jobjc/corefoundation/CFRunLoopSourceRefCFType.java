package com.apple.jobjc.corefoundation;

public  class CFRunLoopSourceRefCFType extends com.apple.jobjc.CFType {
	public CFRunLoopSourceRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFRunLoopSourceRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFRunLoopSourceGetTypeID();
	}
}
