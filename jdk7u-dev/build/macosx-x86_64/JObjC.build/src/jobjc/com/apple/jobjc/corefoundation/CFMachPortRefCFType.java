package com.apple.jobjc.corefoundation;

public  class CFMachPortRefCFType extends com.apple.jobjc.CFType {
	public CFMachPortRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMachPortRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFMachPortGetTypeID();
	}
}
