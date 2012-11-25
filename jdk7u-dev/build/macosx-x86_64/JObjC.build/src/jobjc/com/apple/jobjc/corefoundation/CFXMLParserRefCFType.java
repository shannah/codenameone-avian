package com.apple.jobjc.corefoundation;

public  class CFXMLParserRefCFType extends com.apple.jobjc.CFType {
	public CFXMLParserRefCFType(com.apple.jobjc.Pointer<?> ptr){
		super(ptr);
	}

	public CFXMLParserRefCFType(long ptr){
		super(ptr);
	}
	public static long getTypeId(){
		return com.apple.jobjc.JObjC.getInstance().CoreFoundation().CFXMLParserGetTypeID();
	}
}
