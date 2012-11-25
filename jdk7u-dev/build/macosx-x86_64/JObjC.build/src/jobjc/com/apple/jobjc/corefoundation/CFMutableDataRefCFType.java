package com.apple.jobjc.corefoundation;

public  class CFMutableDataRefCFType extends com.apple.jobjc.CFType {
	public CFMutableDataRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableDataRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFDataGetTypeID();
	}
}
