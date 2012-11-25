package com.apple.jobjc.foundation;

public  class NSXMLDTD extends com.apple.jobjc.foundation.NSXMLNode {
	public NSXMLDTD(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXMLDTD(final NSXMLDTD obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
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

	private static com.apple.jobjc.Invoke.MsgSend attributeDeclarationForName_elementName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeDeclarationForName_elementName_IMetInst(){
		return ((attributeDeclarationForName_elementName_IMetInst != null)
	? (attributeDeclarationForName_elementName_IMetInst)
	: (attributeDeclarationForName_elementName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeDeclarationForName:elementName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLDTDNode attributeDeclarationForName_elementName(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString elementName){
			final com.apple.jobjc.Invoke.MsgSend attributeDeclarationForName_elementName_IMetInst = get_attributeDeclarationForName_elementName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeDeclarationForName_elementName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, elementName);
		attributeDeclarationForName_elementName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLDTDNode returnValue = (com.apple.jobjc.foundation.NSXMLDTDNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementDeclarationForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementDeclarationForName_IMetInst(){
		return ((elementDeclarationForName_IMetInst != null)
	? (elementDeclarationForName_IMetInst)
	: (elementDeclarationForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementDeclarationForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLDTDNode elementDeclarationForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend elementDeclarationForName_IMetInst = get_elementDeclarationForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementDeclarationForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		elementDeclarationForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLDTDNode returnValue = (com.apple.jobjc.foundation.NSXMLDTDNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend entityDeclarationForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_entityDeclarationForName_IMetInst(){
		return ((entityDeclarationForName_IMetInst != null)
	? (entityDeclarationForName_IMetInst)
	: (entityDeclarationForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "entityDeclarationForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLDTDNode entityDeclarationForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend entityDeclarationForName_IMetInst = get_entityDeclarationForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		entityDeclarationForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		entityDeclarationForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLDTDNode returnValue = (com.apple.jobjc.foundation.NSXMLDTDNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend notationDeclarationForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_notationDeclarationForName_IMetInst(){
		return ((notationDeclarationForName_IMetInst != null)
	? (notationDeclarationForName_IMetInst)
	: (notationDeclarationForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "notationDeclarationForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLDTDNode notationDeclarationForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend notationDeclarationForName_IMetInst = get_notationDeclarationForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		notationDeclarationForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		notationDeclarationForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLDTDNode returnValue = (com.apple.jobjc.foundation.NSXMLDTDNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend publicID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_publicID_IMetInst(){
		return ((publicID_IMetInst != null)
	? (publicID_IMetInst)
	: (publicID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "publicID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString publicID(){
			final com.apple.jobjc.Invoke.MsgSend publicID_IMetInst = get_publicID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		publicID_IMetInst.init(nativeBuffer, this);
		publicID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
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

	private static com.apple.jobjc.Invoke.MsgSend setPublicID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPublicID_IMetInst(){
		return ((setPublicID_IMetInst != null)
	? (setPublicID_IMetInst)
	: (setPublicID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPublicID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setPublicID(final com.apple.jobjc.foundation.NSString publicID){
			final com.apple.jobjc.Invoke.MsgSend setPublicID_IMetInst = get_setPublicID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPublicID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, publicID);
		setPublicID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSystemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSystemID_IMetInst(){
		return ((setSystemID_IMetInst != null)
	? (setSystemID_IMetInst)
	: (setSystemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSystemID:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSystemID(final com.apple.jobjc.foundation.NSString systemID){
			final com.apple.jobjc.Invoke.MsgSend setSystemID_IMetInst = get_setSystemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSystemID_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, systemID);
		setSystemID_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend systemID_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_systemID_IMetInst(){
		return ((systemID_IMetInst != null)
	? (systemID_IMetInst)
	: (systemID_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "systemID", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString systemID(){
			final com.apple.jobjc.Invoke.MsgSend systemID_IMetInst = get_systemID_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		systemID_IMetInst.init(nativeBuffer, this);
		systemID_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
