package com.apple.jobjc.corefoundation;

public  class CFStringTokenizerRefCFType extends com.apple.jobjc.CFType {
	public CFStringTokenizerRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFStringTokenizerRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFStringTokenizerGetTypeID();
	}
}
