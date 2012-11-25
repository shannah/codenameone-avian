package com.apple.jobjc.corefoundation;

public  class CFArrayRefCFType extends com.apple.jobjc.CFType {
	public CFArrayRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFArrayRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFArrayGetTypeID();
	}
}
