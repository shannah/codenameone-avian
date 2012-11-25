package com.apple.jobjc.corefoundation;

public  class CFDateRefCFType extends com.apple.jobjc.CFType {
	public CFDateRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFDateRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFDateGetTypeID();
	}
}
