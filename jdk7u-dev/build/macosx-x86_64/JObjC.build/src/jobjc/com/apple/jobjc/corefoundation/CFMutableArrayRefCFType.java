package com.apple.jobjc.corefoundation;

public  class CFMutableArrayRefCFType extends com.apple.jobjc.CFType {
	public CFMutableArrayRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableArrayRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFArrayGetTypeID();
	}
}
