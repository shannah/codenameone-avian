package com.apple.jobjc.corefoundation;

public  class CFFileSecurityRefCFType extends com.apple.jobjc.CFType {
	public CFFileSecurityRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFFileSecurityRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFFileSecurityGetTypeID();
	}
}
