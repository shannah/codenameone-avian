package com.apple.jobjc.appkit;

public  class NSTreeNode extends com.apple.jobjc.foundation.NSObject {
	public NSTreeNode(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTreeNode(final NSTreeNode obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend childNodes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_childNodes_IMetInst(){
		return ((childNodes_IMetInst != null)
	? (childNodes_IMetInst)
	: (childNodes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "childNodes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray childNodes(){
			final com.apple.jobjc.Invoke.MsgSend childNodes_IMetInst = get_childNodes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		childNodes_IMetInst.init(nativeBuffer, this);
		childNodes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend descendantNodeAtIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_descendantNodeAtIndexPath_IMetInst(){
		return ((descendantNodeAtIndexPath_IMetInst != null)
	? (descendantNodeAtIndexPath_IMetInst)
	: (descendantNodeAtIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "descendantNodeAtIndexPath:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTreeNode descendantNodeAtIndexPath(final com.apple.jobjc.foundation.NSIndexPath indexPath){
			final com.apple.jobjc.Invoke.MsgSend descendantNodeAtIndexPath_IMetInst = get_descendantNodeAtIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		descendantNodeAtIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPath);
		descendantNodeAtIndexPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTreeNode returnValue = (com.apple.jobjc.appkit.NSTreeNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexPath_IMetInst(){
		return ((indexPath_IMetInst != null)
	? (indexPath_IMetInst)
	: (indexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexPath indexPath(){
			final com.apple.jobjc.Invoke.MsgSend indexPath_IMetInst = get_indexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexPath_IMetInst.init(nativeBuffer, this);
		indexPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexPath returnValue = (com.apple.jobjc.foundation.NSIndexPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithRepresentedObject_IMetInst(){
		return ((initWithRepresentedObject_IMetInst != null)
	? (initWithRepresentedObject_IMetInst)
	: (initWithRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithRepresentedObject:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithRepresentedObject(final com.apple.jobjc.ID modelObject){
			final com.apple.jobjc.Invoke.MsgSend initWithRepresentedObject_IMetInst = get_initWithRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, modelObject);
		initWithRepresentedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isLeaf_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isLeaf_IMetInst(){
		return ((isLeaf_IMetInst != null)
	? (isLeaf_IMetInst)
	: (isLeaf_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isLeaf", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isLeaf(){
			final com.apple.jobjc.Invoke.MsgSend isLeaf_IMetInst = get_isLeaf_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isLeaf_IMetInst.init(nativeBuffer, this);
		isLeaf_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend mutableChildNodes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_mutableChildNodes_IMetInst(){
		return ((mutableChildNodes_IMetInst != null)
	? (mutableChildNodes_IMetInst)
	: (mutableChildNodes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "mutableChildNodes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSMutableArray mutableChildNodes(){
			final com.apple.jobjc.Invoke.MsgSend mutableChildNodes_IMetInst = get_mutableChildNodes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		mutableChildNodes_IMetInst.init(nativeBuffer, this);
		mutableChildNodes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSMutableArray returnValue = (com.apple.jobjc.foundation.NSMutableArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend parentNode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_parentNode_IMetInst(){
		return ((parentNode_IMetInst != null)
	? (parentNode_IMetInst)
	: (parentNode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "parentNode", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSTreeNode parentNode(){
			final com.apple.jobjc.Invoke.MsgSend parentNode_IMetInst = get_parentNode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		parentNode_IMetInst.init(nativeBuffer, this);
		parentNode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSTreeNode returnValue = (com.apple.jobjc.appkit.NSTreeNode) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_representedObject_IMetInst(){
		return ((representedObject_IMetInst != null)
	? (representedObject_IMetInst)
	: (representedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "representedObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T representedObject(){
			final com.apple.jobjc.Invoke.MsgSend representedObject_IMetInst = get_representedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		representedObject_IMetInst.init(nativeBuffer, this);
		representedObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sortWithSortDescriptors_recursively_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortWithSortDescriptors_recursively_IMetInst(){
		return ((sortWithSortDescriptors_recursively_IMetInst != null)
	? (sortWithSortDescriptors_recursively_IMetInst)
	: (sortWithSortDescriptors_recursively_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortWithSortDescriptors:recursively:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void sortWithSortDescriptors_recursively(final com.apple.jobjc.foundation.NSArray sortDescriptors, final boolean recursively){
			final com.apple.jobjc.Invoke.MsgSend sortWithSortDescriptors_recursively_IMetInst = get_sortWithSortDescriptors_recursively_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortWithSortDescriptors_recursively_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortDescriptors);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, recursively);
		sortWithSortDescriptors_recursively_IMetInst.invoke(nativeBuffer);
		
		
	}

}
