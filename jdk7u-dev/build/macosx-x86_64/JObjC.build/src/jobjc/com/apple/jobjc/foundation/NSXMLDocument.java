package com.apple.jobjc.foundation;

public  class NSXMLDocument extends com.apple.jobjc.foundation.NSXMLNode {
	public NSXMLDocument(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXMLDocument(final NSXMLDocument obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend DTD_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_DTD_IMetInst(){
		return ((DTD_IMetInst != null)
	? (DTD_IMetInst)
	: (DTD_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "DTD", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLDTD DTD(){
			final com.apple.jobjc.Invoke.MsgSend DTD_IMetInst = get_DTD_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		DTD_IMetInst.init(nativeBuffer, this);
		DTD_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLDTD returnValue = (com.apple.jobjc.foundation.NSXMLDTD) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend MIMEType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_MIMEType_IMetInst(){
		return ((MIMEType_IMetInst != null)
	? (MIMEType_IMetInst)
	: (MIMEType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "MIMEType", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString MIMEType(){
			final com.apple.jobjc.Invoke.MsgSend MIMEType_IMetInst = get_MIMEType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		MIMEType_IMetInst.init(nativeBuffer, this);
		MIMEType_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend XMLData_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_XMLData_IMetInst(){
		return ((XMLData_IMetInst != null)
	? (XMLData_IMetInst)
	: (XMLData_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "XMLData", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSData XMLData(){
			final com.apple.jobjc.Invoke.MsgSend XMLData_IMetInst = get_XMLData_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		XMLData_IMetInst.init(nativeBuffer, this);
		XMLData_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend XMLDataWithOptions_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_XMLDataWithOptions_IMetInst(){
		return ((XMLDataWithOptions_IMetInst != null)
	? (XMLDataWithOptions_IMetInst)
	: (XMLDataWithOptions_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "XMLDataWithOptions:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public com.apple.jobjc.foundation.NSData XMLDataWithOptions(final long options){
			final com.apple.jobjc.Invoke.MsgSend XMLDataWithOptions_IMetInst = get_XMLDataWithOptions_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		XMLDataWithOptions_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		XMLDataWithOptions_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSData returnValue = (com.apple.jobjc.foundation.NSData) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend addChild_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addChild_IMetInst(){
		return ((addChild_IMetInst != null)
	? (addChild_IMetInst)
	: (addChild_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addChild:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addChild(final com.apple.jobjc.foundation.NSXMLNode child){
			final com.apple.jobjc.Invoke.MsgSend addChild_IMetInst = get_addChild_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addChild_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, child);
		addChild_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend characterEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_characterEncoding_IMetInst(){
		return ((characterEncoding_IMetInst != null)
	? (characterEncoding_IMetInst)
	: (characterEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "characterEncoding", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString characterEncoding(){
			final com.apple.jobjc.Invoke.MsgSend characterEncoding_IMetInst = get_characterEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		characterEncoding_IMetInst.init(nativeBuffer, this);
		characterEncoding_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentContentKind_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentContentKind_IMetInst(){
		return ((documentContentKind_IMetInst != null)
	? (documentContentKind_IMetInst)
	: (documentContentKind_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentContentKind", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long documentContentKind(){
			final com.apple.jobjc.Invoke.MsgSend documentContentKind_IMetInst = get_documentContentKind_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentContentKind_IMetInst.init(nativeBuffer, this);
		documentContentKind_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContentsOfURL_options_error_IMetInst(){
		return ((initWithContentsOfURL_options_error_IMetInst != null)
	? (initWithContentsOfURL_options_error_IMetInst)
	: (initWithContentsOfURL_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContentsOfURL:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContentsOfURL_options_error(final com.apple.jobjc.foundation.NSURL url, final long mask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithContentsOfURL_options_error_IMetInst = get_initWithContentsOfURL_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContentsOfURL_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithContentsOfURL_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithData_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithData_options_error_IMetInst(){
		return ((initWithData_options_error_IMetInst != null)
	? (initWithData_options_error_IMetInst)
	: (initWithData_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithData:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithData_options_error(final com.apple.jobjc.foundation.NSData data, final long mask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithData_options_error_IMetInst = get_initWithData_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithData_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, data);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithData_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRootElement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRootElement_IMetInst(){
		return ((initWithRootElement_IMetInst != null)
	? (initWithRootElement_IMetInst)
	: (initWithRootElement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRootElement:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRootElement(final com.apple.jobjc.foundation.NSXMLElement element){
			final com.apple.jobjc.Invoke.MsgSend initWithRootElement_IMetInst = get_initWithRootElement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRootElement_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, element);
		initWithRootElement_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithXMLString_options_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithXMLString_options_error_IMetInst(){
		return ((initWithXMLString_options_error_IMetInst != null)
	? (initWithXMLString_options_error_IMetInst)
	: (initWithXMLString_options_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithXMLString:options:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithXMLString_options_error(final com.apple.jobjc.foundation.NSString string, final long mask, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithXMLString_options_error_IMetInst = get_initWithXMLString_options_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithXMLString_options_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, mask);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithXMLString_options_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertChild_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertChild_atIndex_IMetInst(){
		return ((insertChild_atIndex_IMetInst != null)
	? (insertChild_atIndex_IMetInst)
	: (insertChild_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertChild:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertChild_atIndex(final com.apple.jobjc.foundation.NSXMLNode child, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertChild_atIndex_IMetInst = get_insertChild_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertChild_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, child);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		insertChild_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertChildren_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertChildren_atIndex_IMetInst(){
		return ((insertChildren_atIndex_IMetInst != null)
	? (insertChildren_atIndex_IMetInst)
	: (insertChildren_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertChildren:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void insertChildren_atIndex(final com.apple.jobjc.foundation.NSArray children, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertChildren_atIndex_IMetInst = get_insertChildren_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertChildren_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, children);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		insertChildren_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend isStandalone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isStandalone_IMetInst(){
		return ((isStandalone_IMetInst != null)
	? (isStandalone_IMetInst)
	: (isStandalone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isStandalone", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isStandalone(){
			final com.apple.jobjc.Invoke.MsgSend isStandalone_IMetInst = get_isStandalone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isStandalone_IMetInst.init(nativeBuffer, this);
		isStandalone_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectByApplyingXSLT_arguments_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectByApplyingXSLT_arguments_error_IMetInst(){
		return ((objectByApplyingXSLT_arguments_error_IMetInst != null)
	? (objectByApplyingXSLT_arguments_error_IMetInst)
	: (objectByApplyingXSLT_arguments_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectByApplyingXSLT:arguments:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectByApplyingXSLT_arguments_error(final com.apple.jobjc.foundation.NSData xslt, final com.apple.jobjc.foundation.NSDictionary arguments, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend objectByApplyingXSLT_arguments_error_IMetInst = get_objectByApplyingXSLT_arguments_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectByApplyingXSLT_arguments_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, xslt);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		objectByApplyingXSLT_arguments_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectByApplyingXSLTAtURL_arguments_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectByApplyingXSLTAtURL_arguments_error_IMetInst(){
		return ((objectByApplyingXSLTAtURL_arguments_error_IMetInst != null)
	? (objectByApplyingXSLTAtURL_arguments_error_IMetInst)
	: (objectByApplyingXSLTAtURL_arguments_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectByApplyingXSLTAtURL:arguments:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectByApplyingXSLTAtURL_arguments_error(final com.apple.jobjc.foundation.NSURL xsltURL, final com.apple.jobjc.foundation.NSDictionary argument, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend objectByApplyingXSLTAtURL_arguments_error_IMetInst = get_objectByApplyingXSLTAtURL_arguments_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectByApplyingXSLTAtURL_arguments_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, xsltURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, argument);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		objectByApplyingXSLTAtURL_arguments_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectByApplyingXSLTString_arguments_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectByApplyingXSLTString_arguments_error_IMetInst(){
		return ((objectByApplyingXSLTString_arguments_error_IMetInst != null)
	? (objectByApplyingXSLTString_arguments_error_IMetInst)
	: (objectByApplyingXSLTString_arguments_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectByApplyingXSLTString:arguments:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T objectByApplyingXSLTString_arguments_error(final com.apple.jobjc.foundation.NSString xslt, final com.apple.jobjc.foundation.NSDictionary arguments, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend objectByApplyingXSLTString_arguments_error_IMetInst = get_objectByApplyingXSLTString_arguments_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectByApplyingXSLTString_arguments_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, xslt);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, arguments);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		objectByApplyingXSLTString_arguments_error_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeChildAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeChildAtIndex_IMetInst(){
		return ((removeChildAtIndex_IMetInst != null)
	? (removeChildAtIndex_IMetInst)
	: (removeChildAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeChildAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void removeChildAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeChildAtIndex_IMetInst = get_removeChildAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeChildAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		removeChildAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend replaceChildAtIndex_withNode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_replaceChildAtIndex_withNode_IMetInst(){
		return ((replaceChildAtIndex_withNode_IMetInst != null)
	? (replaceChildAtIndex_withNode_IMetInst)
	: (replaceChildAtIndex_withNode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "replaceChildAtIndex:withNode:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void replaceChildAtIndex_withNode(final long index, final com.apple.jobjc.foundation.NSXMLNode node){
			final com.apple.jobjc.Invoke.MsgSend replaceChildAtIndex_withNode_IMetInst = get_replaceChildAtIndex_withNode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		replaceChildAtIndex_withNode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, index);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, node);
		replaceChildAtIndex_withNode_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend rootElement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rootElement_IMetInst(){
		return ((rootElement_IMetInst != null)
	? (rootElement_IMetInst)
	: (rootElement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rootElement", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLElement rootElement(){
			final com.apple.jobjc.Invoke.MsgSend rootElement_IMetInst = get_rootElement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rootElement_IMetInst.init(nativeBuffer, this);
		rootElement_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLElement returnValue = (com.apple.jobjc.foundation.NSXMLElement) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setCharacterEncoding_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCharacterEncoding_IMetInst(){
		return ((setCharacterEncoding_IMetInst != null)
	? (setCharacterEncoding_IMetInst)
	: (setCharacterEncoding_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCharacterEncoding:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCharacterEncoding(final com.apple.jobjc.foundation.NSString encoding){
			final com.apple.jobjc.Invoke.MsgSend setCharacterEncoding_IMetInst = get_setCharacterEncoding_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCharacterEncoding_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, encoding);
		setCharacterEncoding_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setChildren_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setChildren_IMetInst(){
		return ((setChildren_IMetInst != null)
	? (setChildren_IMetInst)
	: (setChildren_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setChildren:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setChildren(final com.apple.jobjc.foundation.NSArray children){
			final com.apple.jobjc.Invoke.MsgSend setChildren_IMetInst = get_setChildren_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setChildren_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, children);
		setChildren_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDTD_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDTD_IMetInst(){
		return ((setDTD_IMetInst != null)
	? (setDTD_IMetInst)
	: (setDTD_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDTD:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDTD(final com.apple.jobjc.foundation.NSXMLDTD documentTypeDeclaration){
			final com.apple.jobjc.Invoke.MsgSend setDTD_IMetInst = get_setDTD_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDTD_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, documentTypeDeclaration);
		setDTD_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDocumentContentKind_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDocumentContentKind_IMetInst(){
		return ((setDocumentContentKind_IMetInst != null)
	? (setDocumentContentKind_IMetInst)
	: (setDocumentContentKind_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDocumentContentKind:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public void setDocumentContentKind(final long kind){
			final com.apple.jobjc.Invoke.MsgSend setDocumentContentKind_IMetInst = get_setDocumentContentKind_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDocumentContentKind_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, kind);
		setDocumentContentKind_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMIMEType_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMIMEType_IMetInst(){
		return ((setMIMEType_IMetInst != null)
	? (setMIMEType_IMetInst)
	: (setMIMEType_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMIMEType:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMIMEType(final com.apple.jobjc.foundation.NSString MIMEType){
			final com.apple.jobjc.Invoke.MsgSend setMIMEType_IMetInst = get_setMIMEType_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMIMEType_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, MIMEType);
		setMIMEType_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setRootElement_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setRootElement_IMetInst(){
		return ((setRootElement_IMetInst != null)
	? (setRootElement_IMetInst)
	: (setRootElement_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setRootElement:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setRootElement(final com.apple.jobjc.foundation.NSXMLNode root){
			final com.apple.jobjc.Invoke.MsgSend setRootElement_IMetInst = get_setRootElement_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setRootElement_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, root);
		setRootElement_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setStandalone_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setStandalone_IMetInst(){
		return ((setStandalone_IMetInst != null)
	? (setStandalone_IMetInst)
	: (setStandalone_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setStandalone:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setStandalone(final boolean standalone){
			final com.apple.jobjc.Invoke.MsgSend setStandalone_IMetInst = get_setStandalone_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setStandalone_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, standalone);
		setStandalone_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setVersion_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setVersion_IMetInst(){
		return ((setVersion_IMetInst != null)
	? (setVersion_IMetInst)
	: (setVersion_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setVersion:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setVersion(final com.apple.jobjc.foundation.NSString version){
			final com.apple.jobjc.Invoke.MsgSend setVersion_IMetInst = get_setVersion_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setVersion_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, version);
		setVersion_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend validateAndReturnError_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateAndReturnError_IMetInst(){
		return ((validateAndReturnError_IMetInst != null)
	? (validateAndReturnError_IMetInst)
	: (validateAndReturnError_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateAndReturnError:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean validateAndReturnError(final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend validateAndReturnError_IMetInst = get_validateAndReturnError_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateAndReturnError_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		validateAndReturnError_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend versionNSString_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_versionNSString_IMetInst(){
		return ((versionNSString_IMetInst != null)
	? (versionNSString_IMetInst)
	: (versionNSString_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "version", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString versionNSString(){
			final com.apple.jobjc.Invoke.MsgSend versionNSString_IMetInst = get_versionNSString_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		versionNSString_IMetInst.init(nativeBuffer, this);
		versionNSString_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
