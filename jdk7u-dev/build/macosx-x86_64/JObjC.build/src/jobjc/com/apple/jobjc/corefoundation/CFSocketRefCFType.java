package com.apple.jobjc.corefoundation;

public  class CFSocketRefCFType extends com.apple.jobjc.CFType {
	public CFSocketRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFSocketRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFSocketGetTypeID();
	}
}
