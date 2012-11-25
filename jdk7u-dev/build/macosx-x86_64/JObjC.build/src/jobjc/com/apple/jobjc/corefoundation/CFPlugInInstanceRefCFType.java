package com.apple.jobjc.corefoundation;

public  class CFPlugInInstanceRefCFType extends com.apple.jobjc.CFType {
	public CFPlugInInstanceRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFPlugInInstanceRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFPlugInInstanceGetTypeID();
	}
}
