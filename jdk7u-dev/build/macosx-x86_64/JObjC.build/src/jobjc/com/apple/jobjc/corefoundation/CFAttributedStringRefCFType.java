package com.apple.jobjc.corefoundation;

public  class CFAttributedStringRefCFType extends com.apple.jobjc.CFType {
	public CFAttributedStringRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFAttributedStringRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFAttributedStringGetTypeID();
	}
}
