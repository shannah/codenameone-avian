package com.apple.jobjc.corefoundation;

public  class CFPlugInRefCFType extends com.apple.jobjc.CFType {
	public CFPlugInRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFPlugInRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFPlugInGetTypeID();
	}
}
