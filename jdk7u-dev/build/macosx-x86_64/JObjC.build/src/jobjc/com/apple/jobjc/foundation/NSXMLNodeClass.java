package com.apple.jobjc.foundation;

public  class NSXMLNodeClass extends com.apple.jobjc.foundation.NSObjectClass {
	public NSXMLNodeClass(com.apple.jobjc.JObjCRuntime runtime) {
		super(runtime);
	}
	public NSXMLNodeClass(String name, com.apple.jobjc.JObjCRuntime runtime) {
		super(name, runtime);
	}
	public NSXMLNodeClass(long ptr, com.apple.jobjc.JObjCRuntime runtime) {
		super(ptr, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend DTDNodeWithXMLString_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_DTDNodeWithXMLString_CMetInst(){
		return ((DTDNodeWithXMLString_CMetInst != null)
	? (DTDNodeWithXMLString_CMetInst)
	: (DTDNodeWithXMLString_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "DTDNodeWithXMLString:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T DTDNodeWithXMLString(final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend DTDNodeWithXMLString_CMetInst = get_DTDNodeWithXMLString_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		DTDNodeWithXMLString_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		DTDNodeWithXMLString_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributeWithName_URI_stringValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeWithName_URI_stringValue_CMetInst(){
		return ((attributeWithName_URI_stringValue_CMetInst != null)
	? (attributeWithName_URI_stringValue_CMetInst)
	: (attributeWithName_URI_stringValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeWithName:URI:stringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T attributeWithName_URI_stringValue(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString URI, final com.apple.jobjc.foundation.NSString stringValue){
			final com.apple.jobjc.Invoke.MsgSend attributeWithName_URI_stringValue_CMetInst = get_attributeWithName_URI_stringValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeWithName_URI_stringValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URI);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringValue);
		attributeWithName_URI_stringValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attributeWithName_stringValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attributeWithName_stringValue_CMetInst(){
		return ((attributeWithName_stringValue_CMetInst != null)
	? (attributeWithName_stringValue_CMetInst)
	: (attributeWithName_stringValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attributeWithName:stringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T attributeWithName_stringValue(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString stringValue){
			final com.apple.jobjc.Invoke.MsgSend attributeWithName_stringValue_CMetInst = get_attributeWithName_stringValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attributeWithName_stringValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringValue);
		attributeWithName_stringValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend commentWithStringValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_commentWithStringValue_CMetInst(){
		return ((commentWithStringValue_CMetInst != null)
	? (commentWithStringValue_CMetInst)
	: (commentWithStringValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "commentWithStringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T commentWithStringValue(final com.apple.jobjc.foundation.NSString stringValue){
			final com.apple.jobjc.Invoke.MsgSend commentWithStringValue_CMetInst = get_commentWithStringValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		commentWithStringValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringValue);
		commentWithStringValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend document_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_document_CMetInst(){
		return ((document_CMetInst != null)
	? (document_CMetInst)
	: (document_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "document", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T document(){
			final com.apple.jobjc.Invoke.MsgSend document_CMetInst = get_document_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		document_CMetInst.init(nativeBuffer, this);
		document_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend documentWithRootElement_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_documentWithRootElement_CMetInst(){
		return ((documentWithRootElement_CMetInst != null)
	? (documentWithRootElement_CMetInst)
	: (documentWithRootElement_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "documentWithRootElement:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T documentWithRootElement(final com.apple.jobjc.foundation.NSXMLElement element){
			final com.apple.jobjc.Invoke.MsgSend documentWithRootElement_CMetInst = get_documentWithRootElement_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		documentWithRootElement_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, element);
		documentWithRootElement_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementWithName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementWithName_CMetInst(){
		return ((elementWithName_CMetInst != null)
	? (elementWithName_CMetInst)
	: (elementWithName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementWithName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T elementWithName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend elementWithName_CMetInst = get_elementWithName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementWithName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		elementWithName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementWithName_URI_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementWithName_URI_CMetInst(){
		return ((elementWithName_URI_CMetInst != null)
	? (elementWithName_URI_CMetInst)
	: (elementWithName_URI_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementWithName:URI:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T elementWithName_URI(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString URI){
			final com.apple.jobjc.Invoke.MsgSend elementWithName_URI_CMetInst = get_elementWithName_URI_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementWithName_URI_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, URI);
		elementWithName_URI_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementWithName_children_attributes_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementWithName_children_attributes_CMetInst(){
		return ((elementWithName_children_attributes_CMetInst != null)
	? (elementWithName_children_attributes_CMetInst)
	: (elementWithName_children_attributes_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementWithName:children:attributes:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T elementWithName_children_attributes(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSArray children, final com.apple.jobjc.foundation.NSArray attributes){
			final com.apple.jobjc.Invoke.MsgSend elementWithName_children_attributes_CMetInst = get_elementWithName_children_attributes_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementWithName_children_attributes_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, children);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, attributes);
		elementWithName_children_attributes_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend elementWithName_stringValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_elementWithName_stringValue_CMetInst(){
		return ((elementWithName_stringValue_CMetInst != null)
	? (elementWithName_stringValue_CMetInst)
	: (elementWithName_stringValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "elementWithName:stringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T elementWithName_stringValue(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString string){
			final com.apple.jobjc.Invoke.MsgSend elementWithName_stringValue_CMetInst = get_elementWithName_stringValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		elementWithName_stringValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, string);
		elementWithName_stringValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend localNameForName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_localNameForName_CMetInst(){
		return ((localNameForName_CMetInst != null)
	? (localNameForName_CMetInst)
	: (localNameForName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "localNameForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString localNameForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend localNameForName_CMetInst = get_localNameForName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		localNameForName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		localNameForName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend namespaceWithName_stringValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_namespaceWithName_stringValue_CMetInst(){
		return ((namespaceWithName_stringValue_CMetInst != null)
	? (namespaceWithName_stringValue_CMetInst)
	: (namespaceWithName_stringValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "namespaceWithName:stringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T namespaceWithName_stringValue(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString stringValue){
			final com.apple.jobjc.Invoke.MsgSend namespaceWithName_stringValue_CMetInst = get_namespaceWithName_stringValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		namespaceWithName_stringValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringValue);
		namespaceWithName_stringValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend predefinedNamespaceForPrefix_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_predefinedNamespaceForPrefix_CMetInst(){
		return ((predefinedNamespaceForPrefix_CMetInst != null)
	? (predefinedNamespaceForPrefix_CMetInst)
	: (predefinedNamespaceForPrefix_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "predefinedNamespaceForPrefix:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSXMLNode predefinedNamespaceForPrefix(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend predefinedNamespaceForPrefix_CMetInst = get_predefinedNamespaceForPrefix_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		predefinedNamespaceForPrefix_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		predefinedNamespaceForPrefix_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSXMLNode returnValue = (com.apple.jobjc.foundation.NSXMLNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prefixForName_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prefixForName_CMetInst(){
		return ((prefixForName_CMetInst != null)
	? (prefixForName_CMetInst)
	: (prefixForName_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prefixForName:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString prefixForName(final com.apple.jobjc.foundation.NSString name){
			final com.apple.jobjc.Invoke.MsgSend prefixForName_CMetInst = get_prefixForName_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prefixForName_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		prefixForName_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend processingInstructionWithName_stringValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_processingInstructionWithName_stringValue_CMetInst(){
		return ((processingInstructionWithName_stringValue_CMetInst != null)
	? (processingInstructionWithName_stringValue_CMetInst)
	: (processingInstructionWithName_stringValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "processingInstructionWithName:stringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T processingInstructionWithName_stringValue(final com.apple.jobjc.foundation.NSString name, final com.apple.jobjc.foundation.NSString stringValue){
			final com.apple.jobjc.Invoke.MsgSend processingInstructionWithName_stringValue_CMetInst = get_processingInstructionWithName_stringValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		processingInstructionWithName_stringValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, name);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringValue);
		processingInstructionWithName_stringValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend textWithStringValue_CMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_textWithStringValue_CMetInst(){
		return ((textWithStringValue_CMetInst != null)
	? (textWithStringValue_CMetInst)
	: (textWithStringValue_CMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "textWithStringValue:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T textWithStringValue(final com.apple.jobjc.foundation.NSString stringValue){
			final com.apple.jobjc.Invoke.MsgSend textWithStringValue_CMetInst = get_textWithStringValue_CMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		textWithStringValue_CMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, stringValue);
		textWithStringValue_CMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

}
