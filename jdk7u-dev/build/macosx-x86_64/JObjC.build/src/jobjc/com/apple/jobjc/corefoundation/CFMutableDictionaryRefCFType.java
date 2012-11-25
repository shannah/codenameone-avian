package com.apple.jobjc.corefoundation;

public  class CFMutableDictionaryRefCFType extends com.apple.jobjc.CFType {
	public CFMutableDictionaryRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableDictionaryRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFDictionaryGetTypeID();
	}
}
