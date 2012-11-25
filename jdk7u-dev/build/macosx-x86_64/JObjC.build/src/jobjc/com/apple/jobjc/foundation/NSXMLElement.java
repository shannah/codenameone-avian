package com.apple.jobjc.foundation;

public  class NSXMLElement extends com.apple.jobjc.foundation.NSXMLNode {
	public NSXMLElement(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSXMLElement(final NSXMLElement obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addAttribute_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addAttribute_IMetInst(){
		return ((addAttribute_IMetInst != null)
	? (addAttribute_IMetInst)
	: (addAttribute_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addAttribute:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addAttribute(final com.apple.jobjc.foundation.NSXMLNode attribute){
			final com.apple.jobjc.Invoke.MsgSend addAttribute_IMetInst = get_addAttribute_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addAttribute_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attribute);
		addAttribute_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend addNamespace_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addNamespace_IMetInst(){
		return ((addNamespace_IMetInst != null)
	? (addNamespace_IMetInst)
	: (addNamespace_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addNamespace:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addNamespace(final com.apple.jobjc.foundation.NSXMLNode aNamespace){
			final com.apple.jobjc.Invoke.MsgSend addNamespace_IMetInst = get_addNamespace_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addNamespace_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aNamespace);
		addNamespace_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend attributeForLocalName_URI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeForLocalName_URI_IMetInst(){
		return ((attributeForLocalName_URI_IMetInst != null)
	? (attributeForLocalName_URI_IMetInst)
	: (attributeForLocalName_URI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeForLocalName:URI:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode attributeForLocalName_URI(final com.apple.jobjc.foundation.NSString localName, final com.apple.jobjc.foundation.NSString URI){
			final com.apple.jobjc.Invoke.MsgSend attributeForLocalName_URI_IMetInst = get_attributeForLocalName_URI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeForLocalName_URI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URI);
		attributeForLocalName_URI_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributeForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeForName_IMetInst(){
		return ((attributeForName_IMetInst != null)
	? (attributeForName_IMetInst)
	: (attributeForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode attributeForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend attributeForName_IMetInst = get_attributeForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		attributeForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributes_IMetInst(){
		return ((attributes_IMetInst != null)
	? (attributes_IMetInst)
	: (attributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray attributes(){
			final com.apple.jobjc.Invoke.MsgSend attributes_IMetInst = get_attributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributes_IMetInst.init(nativeBuffer, this);
		attributes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementsForLocalName_URI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementsForLocalName_URI_IMetInst(){
		return ((elementsForLocalName_URI_IMetInst != null)
	? (elementsForLocalName_URI_IMetInst)
	: (elementsForLocalName_URI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementsForLocalName:URI:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray elementsForLocalName_URI(final com.apple.jobjc.foundation.NSString localName, final com.apple.jobjc.foundation.NSString URI){
			final com.apple.jobjc.Invoke.MsgSend elementsForLocalName_URI_IMetInst = get_elementsForLocalName_URI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementsForLocalName_URI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, localName);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URI);
		elementsForLocalName_URI_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementsForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementsForName_IMetInst(){
		return ((elementsForName_IMetInst != null)
	? (elementsForName_IMetInst)
	: (elementsForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementsForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray elementsForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend elementsForName_IMetInst = get_elementsForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementsForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		elementsForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_IMetInst(){
		return ((initWithName_IMetInst != null)
	? (initWithName_IMetInst)
	: (initWithName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend initWithName_IMetInst = get_initWithName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		initWithName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_URI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_URI_IMetInst(){
		return ((initWithName_URI_IMetInst != null)
	? (initWithName_URI_IMetInst)
	: (initWithName_URI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:URI:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName_URI(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString URI){
			final com.apple.jobjc.Invoke.MsgSend initWithName_URI_IMetInst = get_initWithName_URI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_URI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URI);
		initWithName_URI_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithName_stringValue_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithName_stringValue_IMetInst(){
		return ((initWithName_stringValue_IMetInst != null)
	? (initWithName_stringValue_IMetInst)
	: (initWithName_stringValue_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithName:stringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithName_stringValue(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend initWithName_stringValue_IMetInst = get_initWithName_stringValue_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithName_stringValue_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		initWithName_stringValue_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithXMLString_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithXMLString_error_IMetInst(){
		return ((initWithXMLString_error_IMetInst != null)
	? (initWithXMLString_error_IMetInst)
	: (initWithXMLString_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithXMLString:error:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithXMLString_error(final com.apple.jobjc.foundation.NSString string, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend initWithXMLString_error_IMetInst = get_initWithXMLString_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithXMLString_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		initWithXMLString_error_IMetInst.invoke(nativeBuffer);
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

	private static com.apple.jobjc.Invoke.MsgSend namespaceForPrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_namespaceForPrefix_IMetInst(){
		return ((namespaceForPrefix_IMetInst != null)
	? (namespaceForPrefix_IMetInst)
	: (namespaceForPrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "namespaceForPrefix:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode namespaceForPrefix(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend namespaceForPrefix_IMetInst = get_namespaceForPrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		namespaceForPrefix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		namespaceForPrefix_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend namespaces_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_namespaces_IMetInst(){
		return ((namespaces_IMetInst != null)
	? (namespaces_IMetInst)
	: (namespaces_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "namespaces", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray namespaces(){
			final com.apple.jobjc.Invoke.MsgSend namespaces_IMetInst = get_namespaces_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		namespaces_IMetInst.init(nativeBuffer, this);
		namespaces_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend normalizeAdjacentTextNodesPreservingCDATA_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_normalizeAdjacentTextNodesPreservingCDATA_IMetInst(){
		return ((normalizeAdjacentTextNodesPreservingCDATA_IMetInst != null)
	? (normalizeAdjacentTextNodesPreservingCDATA_IMetInst)
	: (normalizeAdjacentTextNodesPreservingCDATA_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "normalizeAdjacentTextNodesPreservingCDATA:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void normalizeAdjacentTextNodesPreservingCDATA(final boolean preserve){
			final com.apple.jobjc.Invoke.MsgSend normalizeAdjacentTextNodesPreservingCDATA_IMetInst = get_normalizeAdjacentTextNodesPreservingCDATA_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		normalizeAdjacentTextNodesPreservingCDATA_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, preserve);
		normalizeAdjacentTextNodesPreservingCDATA_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAttributeForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAttributeForName_IMetInst(){
		return ((removeAttributeForName_IMetInst != null)
	? (removeAttributeForName_IMetInst)
	: (removeAttributeForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAttributeForName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeAttributeForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend removeAttributeForName_IMetInst = get_removeAttributeForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAttributeForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		removeAttributeForName_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend removeNamespaceForPrefix_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeNamespaceForPrefix_IMetInst(){
		return ((removeNamespaceForPrefix_IMetInst != null)
	? (removeNamespaceForPrefix_IMetInst)
	: (removeNamespaceForPrefix_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeNamespaceForPrefix:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeNamespaceForPrefix(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend removeNamespaceForPrefix_IMetInst = get_removeNamespaceForPrefix_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeNamespaceForPrefix_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		removeNamespaceForPrefix_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend resolveNamespaceForName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolveNamespaceForName_IMetInst(){
		return ((resolveNamespaceForName_IMetInst != null)
	? (resolveNamespaceForName_IMetInst)
	: (resolveNamespaceForName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolveNamespaceForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode resolveNamespaceForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend resolveNamespaceForName_IMetInst = get_resolveNamespaceForName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolveNamespaceForName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		resolveNamespaceForName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend resolvePrefixForNamespaceURI_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_resolvePrefixForNamespaceURI_IMetInst(){
		return ((resolvePrefixForNamespaceURI_IMetInst != null)
	? (resolvePrefixForNamespaceURI_IMetInst)
	: (resolvePrefixForNamespaceURI_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "resolvePrefixForNamespaceURI:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString resolvePrefixForNamespaceURI(final com.apple.jobjc.foundation.NSString namespaceURI){
			final com.apple.jobjc.Invoke.MsgSend resolvePrefixForNamespaceURI_IMetInst = get_resolvePrefixForNamespaceURI_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		resolvePrefixForNamespaceURI_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, namespaceURI);
		resolvePrefixForNamespaceURI_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributes_IMetInst(){
		return ((setAttributes_IMetInst != null)
	? (setAttributes_IMetInst)
	: (setAttributes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributes:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributes(final com.apple.jobjc.foundation.NSArray attributes){
			final com.apple.jobjc.Invoke.MsgSend setAttributes_IMetInst = get_setAttributes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributes_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		setAttributes_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributesAsDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributesAsDictionary_IMetInst(){
		return ((setAttributesAsDictionary_IMetInst != null)
	? (setAttributesAsDictionary_IMetInst)
	: (setAttributesAsDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributesAsDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributesAsDictionary(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend setAttributesAsDictionary_IMetInst = get_setAttributesAsDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributesAsDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		setAttributesAsDictionary_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAttributesWithDictionary_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAttributesWithDictionary_IMetInst(){
		return ((setAttributesWithDictionary_IMetInst != null)
	? (setAttributesWithDictionary_IMetInst)
	: (setAttributesWithDictionary_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAttributesWithDictionary:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setAttributesWithDictionary(final com.apple.jobjc.foundation.NSDictionary attributes){
			final com.apple.jobjc.Invoke.MsgSend setAttributesWithDictionary_IMetInst = get_setAttributesWithDictionary_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAttributesWithDictionary_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		setAttributesWithDictionary_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setNamespaces_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setNamespaces_IMetInst(){
		return ((setNamespaces_IMetInst != null)
	? (setNamespaces_IMetInst)
	: (setNamespaces_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setNamespaces:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setNamespaces(final com.apple.jobjc.foundation.NSArray namespaces){
			final com.apple.jobjc.Invoke.MsgSend setNamespaces_IMetInst = get_setNamespaces_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setNamespaces_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, namespaces);
		setNamespaces_IMetInst.invoke(nativeBuffer);
		
		
	}

}
