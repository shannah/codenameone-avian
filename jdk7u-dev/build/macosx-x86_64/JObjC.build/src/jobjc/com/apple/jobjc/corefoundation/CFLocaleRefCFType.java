package com.apple.jobjc.corefoundation;

public  class CFLocaleRefCFType extends com.apple.jobjc.CFType {
	public CFLocaleRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFLocaleRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFLocaleGetTypeID();
	}
}
