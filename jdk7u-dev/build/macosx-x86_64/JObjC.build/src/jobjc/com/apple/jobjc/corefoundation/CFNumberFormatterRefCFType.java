package com.apple.jobjc.corefoundation;

public  class CFNumberFormatterRefCFType extends com.apple.jobjc.CFType {
	public CFNumberFormatterRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFNumberFormatterRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFNumberFormatterGetTypeID();
	}
}
