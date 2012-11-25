package com.apple.jobjc.corefoundation;

public  class CFTimeZoneRefCFType extends com.apple.jobjc.CFType {
	public CFTimeZoneRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFTimeZoneRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFTimeZoneGetTypeID();
	}
}
