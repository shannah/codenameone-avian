package com.apple.jobjc.appkit;

public  class NSTreeController extends com.apple.jobjc.appkit.NSObjectController {
	public NSTreeController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSTreeController(final NSTreeController obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend add_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_add_IMetInst(){
		return ((add_IMetInst != null)
	? (add_IMetInst)
	: (add_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "add:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void add(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend add_IMetInst = get_add_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		add_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		add_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addChild_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addChild_IMetInst(){
		return ((addChild_IMetInst != null)
	? (addChild_IMetInst)
	: (addChild_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addChild:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addChild(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend addChild_IMetInst = get_addChild_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addChild_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		addChild_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addSelectionIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addSelectionIndexPaths_IMetInst(){
		return ((addSelectionIndexPaths_IMetInst != null)
	? (addSelectionIndexPaths_IMetInst)
	: (addSelectionIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addSelectionIndexPaths:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean addSelectionIndexPaths(final com.apple.jobjc.foundation.NSArray indexPaths){
			final com.apple.jobjc.Invoke.MsgSend addSelectionIndexPaths_IMetInst = get_addSelectionIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addSelectionIndexPaths_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPaths);
		addSelectionIndexPaths_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend alwaysUsesMultipleValuesMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_alwaysUsesMultipleValuesMarker_IMetInst(){
		return ((alwaysUsesMultipleValuesMarker_IMetInst != null)
	? (alwaysUsesMultipleValuesMarker_IMetInst)
	: (alwaysUsesMultipleValuesMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "alwaysUsesMultipleValuesMarker", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean alwaysUsesMultipleValuesMarker(){
			final com.apple.jobjc.Invoke.MsgSend alwaysUsesMultipleValuesMarker_IMetInst = get_alwaysUsesMultipleValuesMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		alwaysUsesMultipleValuesMarker_IMetInst.init(nativeBuffer, this);
		alwaysUsesMultipleValuesMarker_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend arrangedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_arrangedObjects_IMetInst(){
		return ((arrangedObjects_IMetInst != null)
	? (arrangedObjects_IMetInst)
	: (arrangedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "arrangedObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T arrangedObjects(){
			final com.apple.jobjc.Invoke.MsgSend arrangedObjects_IMetInst = get_arrangedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		arrangedObjects_IMetInst.init(nativeBuffer, this);
		arrangedObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend avoidsEmptySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_avoidsEmptySelection_IMetInst(){
		return ((avoidsEmptySelection_IMetInst != null)
	? (avoidsEmptySelection_IMetInst)
	: (avoidsEmptySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "avoidsEmptySelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean avoidsEmptySelection(){
			final com.apple.jobjc.Invoke.MsgSend avoidsEmptySelection_IMetInst = get_avoidsEmptySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		avoidsEmptySelection_IMetInst.init(nativeBuffer, this);
		avoidsEmptySelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canAddChild_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canAddChild_IMetInst(){
		return ((canAddChild_IMetInst != null)
	? (canAddChild_IMetInst)
	: (canAddChild_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canAddChild", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canAddChild(){
			final com.apple.jobjc.Invoke.MsgSend canAddChild_IMetInst = get_canAddChild_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canAddChild_IMetInst.init(nativeBuffer, this);
		canAddChild_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canInsert_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInsert_IMetInst(){
		return ((canInsert_IMetInst != null)
	? (canInsert_IMetInst)
	: (canInsert_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInsert", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canInsert(){
			final com.apple.jobjc.Invoke.MsgSend canInsert_IMetInst = get_canInsert_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInsert_IMetInst.init(nativeBuffer, this);
		canInsert_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canInsertChild_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canInsertChild_IMetInst(){
		return ((canInsertChild_IMetInst != null)
	? (canInsertChild_IMetInst)
	: (canInsertChild_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canInsertChild", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canInsertChild(){
			final com.apple.jobjc.Invoke.MsgSend canInsertChild_IMetInst = get_canInsertChild_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canInsertChild_IMetInst.init(nativeBuffer, this);
		canInsertChild_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend childrenKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_childrenKeyPath_IMetInst(){
		return ((childrenKeyPath_IMetInst != null)
	? (childrenKeyPath_IMetInst)
	: (childrenKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "childrenKeyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString childrenKeyPath(){
			final com.apple.jobjc.Invoke.MsgSend childrenKeyPath_IMetInst = get_childrenKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		childrenKeyPath_IMetInst.init(nativeBuffer, this);
		childrenKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend childrenKeyPathForNode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_childrenKeyPathForNode_IMetInst(){
		return ((childrenKeyPathForNode_IMetInst != null)
	? (childrenKeyPathForNode_IMetInst)
	: (childrenKeyPathForNode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "childrenKeyPathForNode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString childrenKeyPathForNode(final com.apple.jobjc.appkit.NSTreeNode node){
			final com.apple.jobjc.Invoke.MsgSend childrenKeyPathForNode_IMetInst = get_childrenKeyPathForNode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		childrenKeyPathForNode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, node);
		childrenKeyPathForNode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend content_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_content_IMetInst(){
		return ((content_IMetInst != null)
	? (content_IMetInst)
	: (content_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "content", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T content(){
			final com.apple.jobjc.Invoke.MsgSend content_IMetInst = get_content_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		content_IMetInst.init(nativeBuffer, this);
		content_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend countKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_countKeyPath_IMetInst(){
		return ((countKeyPath_IMetInst != null)
	? (countKeyPath_IMetInst)
	: (countKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "countKeyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString countKeyPath(){
			final com.apple.jobjc.Invoke.MsgSend countKeyPath_IMetInst = get_countKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		countKeyPath_IMetInst.init(nativeBuffer, this);
		countKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend countKeyPathForNode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_countKeyPathForNode_IMetInst(){
		return ((countKeyPathForNode_IMetInst != null)
	? (countKeyPathForNode_IMetInst)
	: (countKeyPathForNode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "countKeyPathForNode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString countKeyPathForNode(final com.apple.jobjc.appkit.NSTreeNode node){
			final com.apple.jobjc.Invoke.MsgSend countKeyPathForNode_IMetInst = get_countKeyPathForNode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		countKeyPathForNode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, node);
		countKeyPathForNode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insert_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insert_IMetInst(){
		return ((insert_IMetInst != null)
	? (insert_IMetInst)
	: (insert_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insert:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insert(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insert_IMetInst = get_insert_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insert_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insert_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertChild_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertChild_IMetInst(){
		return ((insertChild_IMetInst != null)
	? (insertChild_IMetInst)
	: (insertChild_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertChild:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertChild(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend insertChild_IMetInst = get_insertChild_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertChild_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		insertChild_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertObject_atArrangedObjectIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertObject_atArrangedObjectIndexPath_IMetInst(){
		return ((insertObject_atArrangedObjectIndexPath_IMetInst != null)
	? (insertObject_atArrangedObjectIndexPath_IMetInst)
	: (insertObject_atArrangedObjectIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertObject:atArrangedObjectIndexPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertObject_atArrangedObjectIndexPath(final com.apple.jobjc.ID object, final com.apple.jobjc.foundation.NSIndexPath indexPath){
			final com.apple.jobjc.Invoke.MsgSend insertObject_atArrangedObjectIndexPath_IMetInst = get_insertObject_atArrangedObjectIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertObject_atArrangedObjectIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPath);
		insertObject_atArrangedObjectIndexPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertObjects_atArrangedObjectIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertObjects_atArrangedObjectIndexPaths_IMetInst(){
		return ((insertObjects_atArrangedObjectIndexPaths_IMetInst != null)
	? (insertObjects_atArrangedObjectIndexPaths_IMetInst)
	: (insertObjects_atArrangedObjectIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertObjects:atArrangedObjectIndexPaths:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void insertObjects_atArrangedObjectIndexPaths(final com.apple.jobjc.foundation.NSArray objects, final com.apple.jobjc.foundation.NSArray indexPaths){
			final com.apple.jobjc.Invoke.MsgSend insertObjects_atArrangedObjectIndexPaths_IMetInst = get_insertObjects_atArrangedObjectIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertObjects_atArrangedObjectIndexPaths_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, objects);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPaths);
		insertObjects_atArrangedObjectIndexPaths_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend leafKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_leafKeyPath_IMetInst(){
		return ((leafKeyPath_IMetInst != null)
	? (leafKeyPath_IMetInst)
	: (leafKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "leafKeyPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString leafKeyPath(){
			final com.apple.jobjc.Invoke.MsgSend leafKeyPath_IMetInst = get_leafKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		leafKeyPath_IMetInst.init(nativeBuffer, this);
		leafKeyPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend leafKeyPathForNode_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_leafKeyPathForNode_IMetInst(){
		return ((leafKeyPathForNode_IMetInst != null)
	? (leafKeyPathForNode_IMetInst)
	: (leafKeyPathForNode_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "leafKeyPathForNode:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString leafKeyPathForNode(final com.apple.jobjc.appkit.NSTreeNode node){
			final com.apple.jobjc.Invoke.MsgSend leafKeyPathForNode_IMetInst = get_leafKeyPathForNode_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		leafKeyPathForNode_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, node);
		leafKeyPathForNode_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend moveNode_toIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveNode_toIndexPath_IMetInst(){
		return ((moveNode_toIndexPath_IMetInst != null)
	? (moveNode_toIndexPath_IMetInst)
	: (moveNode_toIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveNode:toIndexPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveNode_toIndexPath(final com.apple.jobjc.appkit.NSTreeNode node, final com.apple.jobjc.foundation.NSIndexPath indexPath){
			final com.apple.jobjc.Invoke.MsgSend moveNode_toIndexPath_IMetInst = get_moveNode_toIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveNode_toIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, node);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPath);
		moveNode_toIndexPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend moveNodes_toIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_moveNodes_toIndexPath_IMetInst(){
		return ((moveNodes_toIndexPath_IMetInst != null)
	? (moveNodes_toIndexPath_IMetInst)
	: (moveNodes_toIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "moveNodes:toIndexPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void moveNodes_toIndexPath(final com.apple.jobjc.foundation.NSArray nodes, final com.apple.jobjc.foundation.NSIndexPath startingIndexPath){
			final com.apple.jobjc.Invoke.MsgSend moveNodes_toIndexPath_IMetInst = get_moveNodes_toIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		moveNodes_toIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, nodes);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, startingIndexPath);
		moveNodes_toIndexPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend preservesSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_preservesSelection_IMetInst(){
		return ((preservesSelection_IMetInst != null)
	? (preservesSelection_IMetInst)
	: (preservesSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "preservesSelection", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean preservesSelection(){
			final com.apple.jobjc.Invoke.MsgSend preservesSelection_IMetInst = get_preservesSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		preservesSelection_IMetInst.init(nativeBuffer, this);
		preservesSelection_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend rearrangeObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_rearrangeObjects_IMetInst(){
		return ((rearrangeObjects_IMetInst != null)
	? (rearrangeObjects_IMetInst)
	: (rearrangeObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "rearrangeObjects", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void rearrangeObjects(){
			final com.apple.jobjc.Invoke.MsgSend rearrangeObjects_IMetInst = get_rearrangeObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		rearrangeObjects_IMetInst.init(nativeBuffer, this);
		rearrangeObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend remove_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_remove_IMetInst(){
		return ((remove_IMetInst != null)
	? (remove_IMetInst)
	: (remove_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "remove:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void remove(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend remove_IMetInst = get_remove_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		remove_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		remove_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectAtArrangedObjectIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectAtArrangedObjectIndexPath_IMetInst(){
		return ((removeObjectAtArrangedObjectIndexPath_IMetInst != null)
	? (removeObjectAtArrangedObjectIndexPath_IMetInst)
	: (removeObjectAtArrangedObjectIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectAtArrangedObjectIndexPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectAtArrangedObjectIndexPath(final com.apple.jobjc.foundation.NSIndexPath indexPath){
			final com.apple.jobjc.Invoke.MsgSend removeObjectAtArrangedObjectIndexPath_IMetInst = get_removeObjectAtArrangedObjectIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectAtArrangedObjectIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPath);
		removeObjectAtArrangedObjectIndexPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeObjectsAtArrangedObjectIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObjectsAtArrangedObjectIndexPaths_IMetInst(){
		return ((removeObjectsAtArrangedObjectIndexPaths_IMetInst != null)
	? (removeObjectsAtArrangedObjectIndexPaths_IMetInst)
	: (removeObjectsAtArrangedObjectIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObjectsAtArrangedObjectIndexPaths:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObjectsAtArrangedObjectIndexPaths(final com.apple.jobjc.foundation.NSArray indexPaths){
			final com.apple.jobjc.Invoke.MsgSend removeObjectsAtArrangedObjectIndexPaths_IMetInst = get_removeObjectsAtArrangedObjectIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObjectsAtArrangedObjectIndexPaths_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPaths);
		removeObjectsAtArrangedObjectIndexPaths_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeSelectionIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeSelectionIndexPaths_IMetInst(){
		return ((removeSelectionIndexPaths_IMetInst != null)
	? (removeSelectionIndexPaths_IMetInst)
	: (removeSelectionIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeSelectionIndexPaths:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean removeSelectionIndexPaths(final com.apple.jobjc.foundation.NSArray indexPaths){
			final com.apple.jobjc.Invoke.MsgSend removeSelectionIndexPaths_IMetInst = get_removeSelectionIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeSelectionIndexPaths_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPaths);
		removeSelectionIndexPaths_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedNodes_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedNodes_IMetInst(){
		return ((selectedNodes_IMetInst != null)
	? (selectedNodes_IMetInst)
	: (selectedNodes_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedNodes", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectedNodes(){
			final com.apple.jobjc.Invoke.MsgSend selectedNodes_IMetInst = get_selectedNodes_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedNodes_IMetInst.init(nativeBuffer, this);
		selectedNodes_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectedObjects_IMetInst(){
		return ((selectedObjects_IMetInst != null)
	? (selectedObjects_IMetInst)
	: (selectedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectedObjects", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectedObjects(){
			final com.apple.jobjc.Invoke.MsgSend selectedObjects_IMetInst = get_selectedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectedObjects_IMetInst.init(nativeBuffer, this);
		selectedObjects_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionIndexPath_IMetInst(){
		return ((selectionIndexPath_IMetInst != null)
	? (selectionIndexPath_IMetInst)
	: (selectionIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionIndexPath", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSIndexPath selectionIndexPath(){
			final com.apple.jobjc.Invoke.MsgSend selectionIndexPath_IMetInst = get_selectionIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionIndexPath_IMetInst.init(nativeBuffer, this);
		selectionIndexPath_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSIndexPath returnValue = (com.apple.jobjc.foundation.NSIndexPath) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectionIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectionIndexPaths_IMetInst(){
		return ((selectionIndexPaths_IMetInst != null)
	? (selectionIndexPaths_IMetInst)
	: (selectionIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectionIndexPaths", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray selectionIndexPaths(){
			final com.apple.jobjc.Invoke.MsgSend selectionIndexPaths_IMetInst = get_selectionIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectionIndexPaths_IMetInst.init(nativeBuffer, this);
		selectionIndexPaths_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend selectsInsertedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selectsInsertedObjects_IMetInst(){
		return ((selectsInsertedObjects_IMetInst != null)
	? (selectsInsertedObjects_IMetInst)
	: (selectsInsertedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selectsInsertedObjects", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean selectsInsertedObjects(){
			final com.apple.jobjc.Invoke.MsgSend selectsInsertedObjects_IMetInst = get_selectsInsertedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selectsInsertedObjects_IMetInst.init(nativeBuffer, this);
		selectsInsertedObjects_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAlwaysUsesMultipleValuesMarker_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAlwaysUsesMultipleValuesMarker_IMetInst(){
		return ((setAlwaysUsesMultipleValuesMarker_IMetInst != null)
	? (setAlwaysUsesMultipleValuesMarker_IMetInst)
	: (setAlwaysUsesMultipleValuesMarker_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAlwaysUsesMultipleValuesMarker:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAlwaysUsesMultipleValuesMarker(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAlwaysUsesMultipleValuesMarker_IMetInst = get_setAlwaysUsesMultipleValuesMarker_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAlwaysUsesMultipleValuesMarker_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAlwaysUsesMultipleValuesMarker_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAvoidsEmptySelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAvoidsEmptySelection_IMetInst(){
		return ((setAvoidsEmptySelection_IMetInst != null)
	? (setAvoidsEmptySelection_IMetInst)
	: (setAvoidsEmptySelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAvoidsEmptySelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAvoidsEmptySelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAvoidsEmptySelection_IMetInst = get_setAvoidsEmptySelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAvoidsEmptySelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAvoidsEmptySelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setChildrenKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setChildrenKeyPath_IMetInst(){
		return ((setChildrenKeyPath_IMetInst != null)
	? (setChildrenKeyPath_IMetInst)
	: (setChildrenKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setChildrenKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setChildrenKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setChildrenKeyPath_IMetInst = get_setChildrenKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setChildrenKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setChildrenKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContent_IMetInst(){
		return ((setContent_IMetInst != null)
	? (setContent_IMetInst)
	: (setContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContent(final com.apple.jobjc.ID content){
			final com.apple.jobjc.Invoke.MsgSend setContent_IMetInst = get_setContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, content);
		setContent_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setCountKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setCountKeyPath_IMetInst(){
		return ((setCountKeyPath_IMetInst != null)
	? (setCountKeyPath_IMetInst)
	: (setCountKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setCountKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setCountKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setCountKeyPath_IMetInst = get_setCountKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setCountKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setCountKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setLeafKeyPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setLeafKeyPath_IMetInst(){
		return ((setLeafKeyPath_IMetInst != null)
	? (setLeafKeyPath_IMetInst)
	: (setLeafKeyPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setLeafKeyPath:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setLeafKeyPath(final com.apple.jobjc.foundation.NSString keyPath){
			final com.apple.jobjc.Invoke.MsgSend setLeafKeyPath_IMetInst = get_setLeafKeyPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setLeafKeyPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, keyPath);
		setLeafKeyPath_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setPreservesSelection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setPreservesSelection_IMetInst(){
		return ((setPreservesSelection_IMetInst != null)
	? (setPreservesSelection_IMetInst)
	: (setPreservesSelection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setPreservesSelection:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setPreservesSelection(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setPreservesSelection_IMetInst = get_setPreservesSelection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setPreservesSelection_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setPreservesSelection_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionIndexPath_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionIndexPath_IMetInst(){
		return ((setSelectionIndexPath_IMetInst != null)
	? (setSelectionIndexPath_IMetInst)
	: (setSelectionIndexPath_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionIndexPath:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setSelectionIndexPath(final com.apple.jobjc.foundation.NSIndexPath indexPath){
			final com.apple.jobjc.Invoke.MsgSend setSelectionIndexPath_IMetInst = get_setSelectionIndexPath_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionIndexPath_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPath);
		setSelectionIndexPath_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectionIndexPaths_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectionIndexPaths_IMetInst(){
		return ((setSelectionIndexPaths_IMetInst != null)
	? (setSelectionIndexPaths_IMetInst)
	: (setSelectionIndexPaths_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectionIndexPaths:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean setSelectionIndexPaths(final com.apple.jobjc.foundation.NSArray indexPaths){
			final com.apple.jobjc.Invoke.MsgSend setSelectionIndexPaths_IMetInst = get_setSelectionIndexPaths_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectionIndexPaths_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, indexPaths);
		setSelectionIndexPaths_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setSelectsInsertedObjects_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSelectsInsertedObjects_IMetInst(){
		return ((setSelectsInsertedObjects_IMetInst != null)
	? (setSelectsInsertedObjects_IMetInst)
	: (setSelectsInsertedObjects_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSelectsInsertedObjects:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setSelectsInsertedObjects(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setSelectsInsertedObjects_IMetInst = get_setSelectsInsertedObjects_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSelectsInsertedObjects_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setSelectsInsertedObjects_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSortDescriptors_IMetInst(){
		return ((setSortDescriptors_IMetInst != null)
	? (setSortDescriptors_IMetInst)
	: (setSortDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSortDescriptors:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSortDescriptors(final com.apple.jobjc.foundation.NSArray sortDescriptors){
			final com.apple.jobjc.Invoke.MsgSend setSortDescriptors_IMetInst = get_setSortDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSortDescriptors_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sortDescriptors);
		setSortDescriptors_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend sortDescriptors_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sortDescriptors_IMetInst(){
		return ((sortDescriptors_IMetInst != null)
	? (sortDescriptors_IMetInst)
	: (sortDescriptors_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sortDescriptors", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray sortDescriptors(){
			final com.apple.jobjc.Invoke.MsgSend sortDescriptors_IMetInst = get_sortDescriptors_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sortDescriptors_IMetInst.init(nativeBuffer, this);
		sortDescriptors_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

}
