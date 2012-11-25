package com.apple.jobjc.corefoundation;

public  class CFMutableSetRefCFType extends com.apple.jobjc.CFType {
	public CFMutableSetRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableSetRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFSetGetTypeID();
	}
}
