package com.apple.jobjc.appkit;

public  class NSMenu extends com.apple.jobjc.foundation.NSObject {
	public NSMenu(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSMenu(final NSMenu obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend addItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addItem_IMetInst(){
		return ((addItem_IMetInst != null)
	? (addItem_IMetInst)
	: (addItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addItem(final com.apple.jobjc.appkit.NSMenuItem newItem){
			final com.apple.jobjc.Invoke.MsgSend addItem_IMetInst = get_addItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newItem);
		addItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend addItemWithTitle_action_keyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addItemWithTitle_action_keyEquivalent_IMetInst(){
		return ((addItemWithTitle_action_keyEquivalent_IMetInst != null)
	? (addItemWithTitle_action_keyEquivalent_IMetInst)
	: (addItemWithTitle_action_keyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addItemWithTitle:action:keyEquivalent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem addItemWithTitle_action_keyEquivalent(final com.apple.jobjc.foundation.NSString aString, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.foundation.NSString charCode){
			final com.apple.jobjc.Invoke.MsgSend addItemWithTitle_action_keyEquivalent_IMetInst = get_addItemWithTitle_action_keyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addItemWithTitle_action_keyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, charCode);
		addItemWithTitle_action_keyEquivalent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend allowsContextMenuPlugIns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_allowsContextMenuPlugIns_IMetInst(){
		return ((allowsContextMenuPlugIns_IMetInst != null)
	? (allowsContextMenuPlugIns_IMetInst)
	: (allowsContextMenuPlugIns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "allowsContextMenuPlugIns", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean allowsContextMenuPlugIns(){
			final com.apple.jobjc.Invoke.MsgSend allowsContextMenuPlugIns_IMetInst = get_allowsContextMenuPlugIns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		allowsContextMenuPlugIns_IMetInst.init(nativeBuffer, this);
		allowsContextMenuPlugIns_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend attachedMenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_attachedMenu_IMetInst(){
		return ((attachedMenu_IMetInst != null)
	? (attachedMenu_IMetInst)
	: (attachedMenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "attachedMenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu attachedMenu(){
			final com.apple.jobjc.Invoke.MsgSend attachedMenu_IMetInst = get_attachedMenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		attachedMenu_IMetInst.init(nativeBuffer, this);
		attachedMenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend autoenablesItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_autoenablesItems_IMetInst(){
		return ((autoenablesItems_IMetInst != null)
	? (autoenablesItems_IMetInst)
	: (autoenablesItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "autoenablesItems", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean autoenablesItems(){
			final com.apple.jobjc.Invoke.MsgSend autoenablesItems_IMetInst = get_autoenablesItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		autoenablesItems_IMetInst.init(nativeBuffer, this);
		autoenablesItems_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelTracking_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelTracking_IMetInst(){
		return ((cancelTracking_IMetInst != null)
	? (cancelTracking_IMetInst)
	: (cancelTracking_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelTracking", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancelTracking(){
			final com.apple.jobjc.Invoke.MsgSend cancelTracking_IMetInst = get_cancelTracking_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelTracking_IMetInst.init(nativeBuffer, this);
		cancelTracking_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend cancelTrackingWithoutAnimation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancelTrackingWithoutAnimation_IMetInst(){
		return ((cancelTrackingWithoutAnimation_IMetInst != null)
	? (cancelTrackingWithoutAnimation_IMetInst)
	: (cancelTrackingWithoutAnimation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancelTrackingWithoutAnimation", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancelTrackingWithoutAnimation(){
			final com.apple.jobjc.Invoke.MsgSend cancelTrackingWithoutAnimation_IMetInst = get_cancelTrackingWithoutAnimation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancelTrackingWithoutAnimation_IMetInst.init(nativeBuffer, this);
		cancelTrackingWithoutAnimation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend contextMenuRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_contextMenuRepresentation_IMetInst(){
		return ((contextMenuRepresentation_IMetInst != null)
	? (contextMenuRepresentation_IMetInst)
	: (contextMenuRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "contextMenuRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T contextMenuRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend contextMenuRepresentation_IMetInst = get_contextMenuRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		contextMenuRepresentation_IMetInst.init(nativeBuffer, this);
		contextMenuRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend delegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_delegate_IMetInst(){
		return ((delegate_IMetInst != null)
	? (delegate_IMetInst)
	: (delegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "delegate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T delegate(){
			final com.apple.jobjc.Invoke.MsgSend delegate_IMetInst = get_delegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		delegate_IMetInst.init(nativeBuffer, this);
		delegate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend font_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_font_IMetInst(){
		return ((font_IMetInst != null)
	? (font_IMetInst)
	: (font_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "font", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSFont font(){
			final com.apple.jobjc.Invoke.MsgSend font_IMetInst = get_font_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		font_IMetInst.init(nativeBuffer, this);
		font_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSFont returnValue = (com.apple.jobjc.appkit.NSFont) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend helpRequested_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_helpRequested_IMetInst(){
		return ((helpRequested_IMetInst != null)
	? (helpRequested_IMetInst)
	: (helpRequested_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "helpRequested:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void helpRequested(final com.apple.jobjc.appkit.NSEvent eventPtr){
			final com.apple.jobjc.Invoke.MsgSend helpRequested_IMetInst = get_helpRequested_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		helpRequested_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, eventPtr);
		helpRequested_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend highlightedItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_highlightedItem_IMetInst(){
		return ((highlightedItem_IMetInst != null)
	? (highlightedItem_IMetInst)
	: (highlightedItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "highlightedItem", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem highlightedItem(){
			final com.apple.jobjc.Invoke.MsgSend highlightedItem_IMetInst = get_highlightedItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		highlightedItem_IMetInst.init(nativeBuffer, this);
		highlightedItem_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItem_IMetInst(){
		return ((indexOfItem_IMetInst != null)
	? (indexOfItem_IMetInst)
	: (indexOfItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItem:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItem(final com.apple.jobjc.appkit.NSMenuItem index){
			final com.apple.jobjc.Invoke.MsgSend indexOfItem_IMetInst = get_indexOfItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, index);
		indexOfItem_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithRepresentedObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithRepresentedObject_IMetInst(){
		return ((indexOfItemWithRepresentedObject_IMetInst != null)
	? (indexOfItemWithRepresentedObject_IMetInst)
	: (indexOfItemWithRepresentedObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithRepresentedObject:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItemWithRepresentedObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithRepresentedObject_IMetInst = get_indexOfItemWithRepresentedObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithRepresentedObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		indexOfItemWithRepresentedObject_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithSubmenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithSubmenu_IMetInst(){
		return ((indexOfItemWithSubmenu_IMetInst != null)
	? (indexOfItemWithSubmenu_IMetInst)
	: (indexOfItemWithSubmenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithSubmenu:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItemWithSubmenu(final com.apple.jobjc.appkit.NSMenu submenu){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithSubmenu_IMetInst = get_indexOfItemWithSubmenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithSubmenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, submenu);
		indexOfItemWithSubmenu_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithTag_IMetInst(){
		return ((indexOfItemWithTag_IMetInst != null)
	? (indexOfItemWithTag_IMetInst)
	: (indexOfItemWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithTag:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long indexOfItemWithTag(final long aTag){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithTag_IMetInst = get_indexOfItemWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, aTag);
		indexOfItemWithTag_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithTarget_andAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithTarget_andAction_IMetInst(){
		return ((indexOfItemWithTarget_andAction_IMetInst != null)
	? (indexOfItemWithTarget_andAction_IMetInst)
	: (indexOfItemWithTarget_andAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithTarget:andAction:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST)));
	}

	 public long indexOfItemWithTarget_andAction(final com.apple.jobjc.ID target, final com.apple.jobjc.SEL actionSelector){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithTarget_andAction_IMetInst = get_indexOfItemWithTarget_andAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithTarget_andAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, target);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, actionSelector);
		indexOfItemWithTarget_andAction_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend indexOfItemWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_indexOfItemWithTitle_IMetInst(){
		return ((indexOfItemWithTitle_IMetInst != null)
	? (indexOfItemWithTitle_IMetInst)
	: (indexOfItemWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "indexOfItemWithTitle:", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public long indexOfItemWithTitle(final com.apple.jobjc.foundation.NSString aTitle){
			final com.apple.jobjc.Invoke.MsgSend indexOfItemWithTitle_IMetInst = get_indexOfItemWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		indexOfItemWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTitle);
		indexOfItemWithTitle_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithTitle_IMetInst(){
		return ((initWithTitle_IMetInst != null)
	? (initWithTitle_IMetInst)
	: (initWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithTitle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithTitle(final com.apple.jobjc.foundation.NSString aTitle){
			final com.apple.jobjc.Invoke.MsgSend initWithTitle_IMetInst = get_initWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTitle);
		initWithTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend insertItem_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertItem_atIndex_IMetInst(){
		return ((insertItem_atIndex_IMetInst != null)
	? (insertItem_atIndex_IMetInst)
	: (insertItem_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertItem:atIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void insertItem_atIndex(final com.apple.jobjc.appkit.NSMenuItem newItem, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertItem_atIndex_IMetInst = get_insertItem_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertItem_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newItem);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertItem_atIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst(){
		return ((insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst != null)
	? (insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst)
	: (insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "insertItemWithTitle:action:keyEquivalent:atIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.SELCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem insertItemWithTitle_action_keyEquivalent_atIndex(final com.apple.jobjc.foundation.NSString aString, final com.apple.jobjc.SEL aSelector, final com.apple.jobjc.foundation.NSString charCode, final long index){
			final com.apple.jobjc.Invoke.MsgSend insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst = get_insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		com.apple.jobjc.Coder.SELCoder.INST.push(nativeBuffer, aSelector);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, charCode);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		insertItemWithTitle_action_keyEquivalent_atIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isAttached_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isAttached_IMetInst(){
		return ((isAttached_IMetInst != null)
	? (isAttached_IMetInst)
	: (isAttached_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isAttached", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isAttached(){
			final com.apple.jobjc.Invoke.MsgSend isAttached_IMetInst = get_isAttached_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isAttached_IMetInst.init(nativeBuffer, this);
		isAttached_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isTornOff_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isTornOff_IMetInst(){
		return ((isTornOff_IMetInst != null)
	? (isTornOff_IMetInst)
	: (isTornOff_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isTornOff", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isTornOff(){
			final com.apple.jobjc.Invoke.MsgSend isTornOff_IMetInst = get_isTornOff_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isTornOff_IMetInst.init(nativeBuffer, this);
		isTornOff_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemArray_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemArray_IMetInst(){
		return ((itemArray_IMetInst != null)
	? (itemArray_IMetInst)
	: (itemArray_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemArray", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSArray itemArray(){
			final com.apple.jobjc.Invoke.MsgSend itemArray_IMetInst = get_itemArray_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemArray_IMetInst.init(nativeBuffer, this);
		itemArray_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSArray returnValue = (com.apple.jobjc.foundation.NSArray) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtIndex_IMetInst(){
		return ((itemAtIndex_IMetInst != null)
	? (itemAtIndex_IMetInst)
	: (itemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtIndex:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem itemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend itemAtIndex_IMetInst = get_itemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		itemAtIndex_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemChanged_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemChanged_IMetInst(){
		return ((itemChanged_IMetInst != null)
	? (itemChanged_IMetInst)
	: (itemChanged_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemChanged:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void itemChanged(final com.apple.jobjc.appkit.NSMenuItem item){
			final com.apple.jobjc.Invoke.MsgSend itemChanged_IMetInst = get_itemChanged_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemChanged_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		itemChanged_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend itemWithTag_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemWithTag_IMetInst(){
		return ((itemWithTag_IMetInst != null)
	? (itemWithTag_IMetInst)
	: (itemWithTag_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemWithTag:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem itemWithTag(final long tag){
			final com.apple.jobjc.Invoke.MsgSend itemWithTag_IMetInst = get_itemWithTag_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemWithTag_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, tag);
		itemWithTag_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemWithTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemWithTitle_IMetInst(){
		return ((itemWithTitle_IMetInst != null)
	? (itemWithTitle_IMetInst)
	: (itemWithTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemWithTitle:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenuItem itemWithTitle(final com.apple.jobjc.foundation.NSString aTitle){
			final com.apple.jobjc.Invoke.MsgSend itemWithTitle_IMetInst = get_itemWithTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemWithTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aTitle);
		itemWithTitle_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenuItem returnValue = (com.apple.jobjc.appkit.NSMenuItem) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend locationForSubmenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_locationForSubmenu_IMetInst(){
		return ((locationForSubmenu_IMetInst != null)
	? (locationForSubmenu_IMetInst)
	: (locationForSubmenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "locationForSubmenu:", com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPoint locationForSubmenu(final com.apple.jobjc.appkit.NSMenu aSubmenu){
			final com.apple.jobjc.Invoke.MsgSend locationForSubmenu_IMetInst = get_locationForSubmenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		locationForSubmenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aSubmenu);
				com.apple.jobjc.foundation.NSPoint returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSPoint();
		locationForSubmenu_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuBarHeight_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuBarHeight_IMetInst(){
		return ((menuBarHeight_IMetInst != null)
	? (menuBarHeight_IMetInst)
	: (menuBarHeight_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuBarHeight", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double menuBarHeight(){
			final com.apple.jobjc.Invoke.MsgSend menuBarHeight_IMetInst = get_menuBarHeight_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuBarHeight_IMetInst.init(nativeBuffer, this);
		menuBarHeight_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuChangedMessagesEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuChangedMessagesEnabled_IMetInst(){
		return ((menuChangedMessagesEnabled_IMetInst != null)
	? (menuChangedMessagesEnabled_IMetInst)
	: (menuChangedMessagesEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuChangedMessagesEnabled", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean menuChangedMessagesEnabled(){
			final com.apple.jobjc.Invoke.MsgSend menuChangedMessagesEnabled_IMetInst = get_menuChangedMessagesEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuChangedMessagesEnabled_IMetInst.init(nativeBuffer, this);
		menuChangedMessagesEnabled_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend menuRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_menuRepresentation_IMetInst(){
		return ((menuRepresentation_IMetInst != null)
	? (menuRepresentation_IMetInst)
	: (menuRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "menuRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T menuRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend menuRepresentation_IMetInst = get_menuRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		menuRepresentation_IMetInst.init(nativeBuffer, this);
		menuRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend minimumWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_minimumWidth_IMetInst(){
		return ((minimumWidth_IMetInst != null)
	? (minimumWidth_IMetInst)
	: (minimumWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "minimumWidth", com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public double minimumWidth(){
			final com.apple.jobjc.Invoke.MsgSend minimumWidth_IMetInst = get_minimumWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		minimumWidth_IMetInst.init(nativeBuffer, this);
		minimumWidth_IMetInst.invoke(nativeBuffer);
		final double returnValue = (double) (com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.popDouble(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend numberOfItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_numberOfItems_IMetInst(){
		return ((numberOfItems_IMetInst != null)
	? (numberOfItems_IMetInst)
	: (numberOfItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "numberOfItems", com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public long numberOfItems(){
			final com.apple.jobjc.Invoke.MsgSend numberOfItems_IMetInst = get_numberOfItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		numberOfItems_IMetInst.init(nativeBuffer, this);
		numberOfItems_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend performActionForItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performActionForItemAtIndex_IMetInst(){
		return ((performActionForItemAtIndex_IMetInst != null)
	? (performActionForItemAtIndex_IMetInst)
	: (performActionForItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performActionForItemAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void performActionForItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend performActionForItemAtIndex_IMetInst = get_performActionForItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performActionForItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		performActionForItemAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_performKeyEquivalent_IMetInst(){
		return ((performKeyEquivalent_IMetInst != null)
	? (performKeyEquivalent_IMetInst)
	: (performKeyEquivalent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "performKeyEquivalent:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean performKeyEquivalent(final com.apple.jobjc.appkit.NSEvent theEvent){
			final com.apple.jobjc.Invoke.MsgSend performKeyEquivalent_IMetInst = get_performKeyEquivalent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		performKeyEquivalent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, theEvent);
		performKeyEquivalent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend popUpMenuPositioningItem_atLocation_inView_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_popUpMenuPositioningItem_atLocation_inView_IMetInst(){
		return ((popUpMenuPositioningItem_atLocation_inView_IMetInst != null)
	? (popUpMenuPositioningItem_atLocation_inView_IMetInst)
	: (popUpMenuPositioningItem_atLocation_inView_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "popUpMenuPositioningItem:atLocation:inView:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.foundation.NSPoint.getStructCoder(), com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean popUpMenuPositioningItem_atLocation_inView(final com.apple.jobjc.appkit.NSMenuItem item, final com.apple.jobjc.foundation.NSPoint location, final com.apple.jobjc.appkit.NSView view){
			final com.apple.jobjc.Invoke.MsgSend popUpMenuPositioningItem_atLocation_inView_IMetInst = get_popUpMenuPositioningItem_atLocation_inView_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		popUpMenuPositioningItem_atLocation_inView_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		com.apple.jobjc.foundation.NSPoint.getStructCoder().push(nativeBuffer, location);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, view);
		popUpMenuPositioningItem_atLocation_inView_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend propertiesToUpdate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_propertiesToUpdate_IMetInst(){
		return ((propertiesToUpdate_IMetInst != null)
	? (propertiesToUpdate_IMetInst)
	: (propertiesToUpdate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "propertiesToUpdate", com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder)));
	}

	 public long propertiesToUpdate(){
			final com.apple.jobjc.Invoke.MsgSend propertiesToUpdate_IMetInst = get_propertiesToUpdate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		propertiesToUpdate_IMetInst.init(nativeBuffer, this);
		propertiesToUpdate_IMetInst.invoke(nativeBuffer);
		final long returnValue = (long) (com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.popLong(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend removeAllItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeAllItems_IMetInst(){
		return ((removeAllItems_IMetInst != null)
	? (removeAllItems_IMetInst)
	: (removeAllItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeAllItems", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void removeAllItems(){
			final com.apple.jobjc.Invoke.MsgSend removeAllItems_IMetInst = get_removeAllItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeAllItems_IMetInst.init(nativeBuffer, this);
		removeAllItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItem_IMetInst(){
		return ((removeItem_IMetInst != null)
	? (removeItem_IMetInst)
	: (removeItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeItem(final com.apple.jobjc.appkit.NSMenuItem item){
			final com.apple.jobjc.Invoke.MsgSend removeItem_IMetInst = get_removeItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		removeItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend removeItemAtIndex_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeItemAtIndex_IMetInst(){
		return ((removeItemAtIndex_IMetInst != null)
	? (removeItemAtIndex_IMetInst)
	: (removeItemAtIndex_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeItemAtIndex:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder)));
	}

	 public void removeItemAtIndex(final long index){
			final com.apple.jobjc.Invoke.MsgSend removeItemAtIndex_IMetInst = get_removeItemAtIndex_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeItemAtIndex_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.SIntSLongLongCoder.push(nativeBuffer, index);
		removeItemAtIndex_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAllowsContextMenuPlugIns_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAllowsContextMenuPlugIns_IMetInst(){
		return ((setAllowsContextMenuPlugIns_IMetInst != null)
	? (setAllowsContextMenuPlugIns_IMetInst)
	: (setAllowsContextMenuPlugIns_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAllowsContextMenuPlugIns:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAllowsContextMenuPlugIns(final boolean allows){
			final com.apple.jobjc.Invoke.MsgSend setAllowsContextMenuPlugIns_IMetInst = get_setAllowsContextMenuPlugIns_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAllowsContextMenuPlugIns_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, allows);
		setAllowsContextMenuPlugIns_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutoenablesItems_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutoenablesItems_IMetInst(){
		return ((setAutoenablesItems_IMetInst != null)
	? (setAutoenablesItems_IMetInst)
	: (setAutoenablesItems_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutoenablesItems:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutoenablesItems(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutoenablesItems_IMetInst = get_setAutoenablesItems_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutoenablesItems_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutoenablesItems_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setContextMenuRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setContextMenuRepresentation_IMetInst(){
		return ((setContextMenuRepresentation_IMetInst != null)
	? (setContextMenuRepresentation_IMetInst)
	: (setContextMenuRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setContextMenuRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setContextMenuRepresentation(final com.apple.jobjc.ID menuRep){
			final com.apple.jobjc.Invoke.MsgSend setContextMenuRepresentation_IMetInst = get_setContextMenuRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setContextMenuRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menuRep);
		setContextMenuRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setDelegate_IMetInst(){
		return ((setDelegate_IMetInst != null)
	? (setDelegate_IMetInst)
	: (setDelegate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setDelegate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setDelegate(final com.apple.jobjc.ID anObject){
			final com.apple.jobjc.Invoke.MsgSend setDelegate_IMetInst = get_setDelegate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setDelegate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anObject);
		setDelegate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFont_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFont_IMetInst(){
		return ((setFont_IMetInst != null)
	? (setFont_IMetInst)
	: (setFont_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFont:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFont(final com.apple.jobjc.appkit.NSFont font){
			final com.apple.jobjc.Invoke.MsgSend setFont_IMetInst = get_setFont_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFont_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, font);
		setFont_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenuChangedMessagesEnabled_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenuChangedMessagesEnabled_IMetInst(){
		return ((setMenuChangedMessagesEnabled_IMetInst != null)
	? (setMenuChangedMessagesEnabled_IMetInst)
	: (setMenuChangedMessagesEnabled_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenuChangedMessagesEnabled:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setMenuChangedMessagesEnabled(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setMenuChangedMessagesEnabled_IMetInst = get_setMenuChangedMessagesEnabled_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenuChangedMessagesEnabled_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setMenuChangedMessagesEnabled_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMenuRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMenuRepresentation_IMetInst(){
		return ((setMenuRepresentation_IMetInst != null)
	? (setMenuRepresentation_IMetInst)
	: (setMenuRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMenuRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setMenuRepresentation(final com.apple.jobjc.ID menuRep){
			final com.apple.jobjc.Invoke.MsgSend setMenuRepresentation_IMetInst = get_setMenuRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMenuRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menuRep);
		setMenuRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setMinimumWidth_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setMinimumWidth_IMetInst(){
		return ((setMinimumWidth_IMetInst != null)
	? (setMinimumWidth_IMetInst)
	: (setMinimumWidth_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setMinimumWidth:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder)));
	}

	 public void setMinimumWidth(final double width){
			final com.apple.jobjc.Invoke.MsgSend setMinimumWidth_IMetInst = get_setMinimumWidth_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setMinimumWidth_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.MixedPrimitiveCoder.FloatDoubleCoder.push(nativeBuffer, width);
		setMinimumWidth_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setShowsStateColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setShowsStateColumn_IMetInst(){
		return ((setShowsStateColumn_IMetInst != null)
	? (setShowsStateColumn_IMetInst)
	: (setShowsStateColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setShowsStateColumn:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setShowsStateColumn(final boolean showsState){
			final com.apple.jobjc.Invoke.MsgSend setShowsStateColumn_IMetInst = get_setShowsStateColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setShowsStateColumn_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, showsState);
		setShowsStateColumn_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSubmenu_forItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSubmenu_forItem_IMetInst(){
		return ((setSubmenu_forItem_IMetInst != null)
	? (setSubmenu_forItem_IMetInst)
	: (setSubmenu_forItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSubmenu:forItem:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSubmenu_forItem(final com.apple.jobjc.appkit.NSMenu aMenu, final com.apple.jobjc.appkit.NSMenuItem anItem){
			final com.apple.jobjc.Invoke.MsgSend setSubmenu_forItem_IMetInst = get_setSubmenu_forItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSubmenu_forItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aMenu);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, anItem);
		setSubmenu_forItem_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setSupermenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setSupermenu_IMetInst(){
		return ((setSupermenu_IMetInst != null)
	? (setSupermenu_IMetInst)
	: (setSupermenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setSupermenu:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setSupermenu(final com.apple.jobjc.appkit.NSMenu supermenu){
			final com.apple.jobjc.Invoke.MsgSend setSupermenu_IMetInst = get_setSupermenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setSupermenu_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, supermenu);
		setSupermenu_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTearOffMenuRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTearOffMenuRepresentation_IMetInst(){
		return ((setTearOffMenuRepresentation_IMetInst != null)
	? (setTearOffMenuRepresentation_IMetInst)
	: (setTearOffMenuRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTearOffMenuRepresentation:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTearOffMenuRepresentation(final com.apple.jobjc.ID menuRep){
			final com.apple.jobjc.Invoke.MsgSend setTearOffMenuRepresentation_IMetInst = get_setTearOffMenuRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTearOffMenuRepresentation_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, menuRep);
		setTearOffMenuRepresentation_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setTitle_IMetInst(){
		return ((setTitle_IMetInst != null)
	? (setTitle_IMetInst)
	: (setTitle_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setTitle:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setTitle(final com.apple.jobjc.foundation.NSString aString){
			final com.apple.jobjc.Invoke.MsgSend setTitle_IMetInst = get_setTitle_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setTitle_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, aString);
		setTitle_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend showsStateColumn_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_showsStateColumn_IMetInst(){
		return ((showsStateColumn_IMetInst != null)
	? (showsStateColumn_IMetInst)
	: (showsStateColumn_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "showsStateColumn", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean showsStateColumn(){
			final com.apple.jobjc.Invoke.MsgSend showsStateColumn_IMetInst = get_showsStateColumn_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		showsStateColumn_IMetInst.init(nativeBuffer, this);
		showsStateColumn_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend size_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_size_IMetInst(){
		return ((size_IMetInst != null)
	? (size_IMetInst)
	: (size_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "size", com.apple.jobjc.foundation.NSSize.getStructCoder())));
	}

	 public com.apple.jobjc.foundation.NSSize size(){
			final com.apple.jobjc.Invoke.MsgSend size_IMetInst = get_size_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		size_IMetInst.init(nativeBuffer, this);
				com.apple.jobjc.foundation.NSSize returnValue = com.apple.jobjc.JObjC.getInstance(getRuntime()).Foundation().makeNSSize();
		size_IMetInst.invoke(nativeBuffer, returnValue);
		
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_sizeToFit_IMetInst(){
		return ((sizeToFit_IMetInst != null)
	? (sizeToFit_IMetInst)
	: (sizeToFit_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "sizeToFit", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void sizeToFit(){
			final com.apple.jobjc.Invoke.MsgSend sizeToFit_IMetInst = get_sizeToFit_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		sizeToFit_IMetInst.init(nativeBuffer, this);
		sizeToFit_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend submenuAction_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_submenuAction_IMetInst(){
		return ((submenuAction_IMetInst != null)
	? (submenuAction_IMetInst)
	: (submenuAction_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "submenuAction:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void submenuAction(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend submenuAction_IMetInst = get_submenuAction_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		submenuAction_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		submenuAction_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend supermenu_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_supermenu_IMetInst(){
		return ((supermenu_IMetInst != null)
	? (supermenu_IMetInst)
	: (supermenu_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "supermenu", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.appkit.NSMenu supermenu(){
			final com.apple.jobjc.Invoke.MsgSend supermenu_IMetInst = get_supermenu_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		supermenu_IMetInst.init(nativeBuffer, this);
		supermenu_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.appkit.NSMenu returnValue = (com.apple.jobjc.appkit.NSMenu) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend tearOffMenuRepresentation_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_tearOffMenuRepresentation_IMetInst(){
		return ((tearOffMenuRepresentation_IMetInst != null)
	? (tearOffMenuRepresentation_IMetInst)
	: (tearOffMenuRepresentation_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "tearOffMenuRepresentation", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T tearOffMenuRepresentation(){
			final com.apple.jobjc.Invoke.MsgSend tearOffMenuRepresentation_IMetInst = get_tearOffMenuRepresentation_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		tearOffMenuRepresentation_IMetInst.init(nativeBuffer, this);
		tearOffMenuRepresentation_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend title_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_title_IMetInst(){
		return ((title_IMetInst != null)
	? (title_IMetInst)
	: (title_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "title", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString title(){
			final com.apple.jobjc.Invoke.MsgSend title_IMetInst = get_title_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		title_IMetInst.init(nativeBuffer, this);
		title_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend update_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_update_IMetInst(){
		return ((update_IMetInst != null)
	? (update_IMetInst)
	: (update_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "update", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void update(){
			final com.apple.jobjc.Invoke.MsgSend update_IMetInst = get_update_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		update_IMetInst.init(nativeBuffer, this);
		update_IMetInst.invoke(nativeBuffer);
		
		
	}

}
