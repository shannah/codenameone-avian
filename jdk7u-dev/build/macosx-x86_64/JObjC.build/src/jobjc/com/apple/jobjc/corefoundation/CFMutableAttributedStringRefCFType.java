package com.apple.jobjc.corefoundation;

public  class CFMutableAttributedStringRefCFType extends com.apple.jobjc.CFType {
	public CFMutableAttributedStringRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFMutableAttributedStringRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFAttributedStringGetTypeID();
	}
}
