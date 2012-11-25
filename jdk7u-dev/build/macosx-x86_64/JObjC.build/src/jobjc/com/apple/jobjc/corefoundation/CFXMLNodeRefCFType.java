package com.apple.jobjc.corefoundation;

public  class CFXMLNodeRefCFType extends com.apple.jobjc.CFType {
	public CFXMLNodeRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFXMLNodeRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFXMLNodeGetTypeID();
	}
}
