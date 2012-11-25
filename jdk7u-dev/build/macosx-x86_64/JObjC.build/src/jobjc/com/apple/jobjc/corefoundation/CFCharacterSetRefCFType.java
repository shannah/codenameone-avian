package com.apple.jobjc.corefoundation;

public  class CFCharacterSetRefCFType extends com.apple.jobjc.CFType {
	public CFCharacterSetRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFCharacterSetRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFCharacterSetGetTypeID();
	}
}
