package com.apple.jobjc.corefoundation;

public  class CFNumberRefCFType extends com.apple.jobjc.CFType {
	public CFNumberRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFNumberRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFNumberGetTypeID();
	}
}
