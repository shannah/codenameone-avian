package com.apple.jobjc.corefoundation;

public  class CFMutableStringRefCFType extends com.apple.jobjc.CFType {
	public CFMutableStringRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableStringRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFStringGetTypeID();
	}
}
