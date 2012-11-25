package com.apple.jobjc.corefoundation;

public  class CFDictionaryRefCFType extends com.apple.jobjc.CFType {
	public CFDictionaryRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFDictionaryRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFDictionaryGetTypeID();
	}
}
