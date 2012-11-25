package com.apple.jobjc.corefoundation;

public  class CFStringRefCFType extends com.apple.jobjc.CFType {
	public CFStringRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFStringRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFStringGetTypeID();
	}
}
