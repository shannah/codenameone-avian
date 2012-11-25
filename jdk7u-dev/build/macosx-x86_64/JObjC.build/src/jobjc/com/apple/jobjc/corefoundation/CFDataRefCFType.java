package com.apple.jobjc.corefoundation;

public  class CFDataRefCFType extends com.apple.jobjc.CFType {
	public CFDataRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFDataRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFDataGetTypeID();
	}
}
