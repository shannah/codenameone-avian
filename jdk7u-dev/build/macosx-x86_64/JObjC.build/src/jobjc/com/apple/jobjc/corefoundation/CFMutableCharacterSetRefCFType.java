package com.apple.jobjc.corefoundation;

public  class CFMutableCharacterSetRefCFType extends com.apple.jobjc.CFType {
	public CFMutableCharacterSetRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableCharacterSetRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFCharacterSetGetTypeID();
	}
}
