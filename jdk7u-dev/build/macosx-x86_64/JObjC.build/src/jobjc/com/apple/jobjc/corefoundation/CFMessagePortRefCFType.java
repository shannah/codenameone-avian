package com.apple.jobjc.corefoundation;

public  class CFMessagePortRefCFType extends com.apple.jobjc.CFType {
	public CFMessagePortRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMessagePortRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFMessagePortGetTypeID();
	}
}
