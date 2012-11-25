package com.apple.jobjc.appkit;

public  class NSObjectController extends com.apple.jobjc.appkit.NSController {
	public NSObjectController(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSObjectController(final NSObjectController obj, final com.apple.jobjc.JObjCRuntime runtime) {
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

	private static com.apple.jobjc.Invoke.MsgSend addObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_addObject_IMetInst(){
		return ((addObject_IMetInst != null)
	? (addObject_IMetInst)
	: (addObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "addObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void addObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend addObject_IMetInst = get_addObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		addObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		addObject_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend automaticallyPreparesContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_automaticallyPreparesContent_IMetInst(){
		return ((automaticallyPreparesContent_IMetInst != null)
	? (automaticallyPreparesContent_IMetInst)
	: (automaticallyPreparesContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "automaticallyPreparesContent", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean automaticallyPreparesContent(){
			final com.apple.jobjc.Invoke.MsgSend automaticallyPreparesContent_IMetInst = get_automaticallyPreparesContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		automaticallyPreparesContent_IMetInst.init(nativeBuffer, this);
		automaticallyPreparesContent_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canAdd_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canAdd_IMetInst(){
		return ((canAdd_IMetInst != null)
	? (canAdd_IMetInst)
	: (canAdd_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canAdd", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canAdd(){
			final com.apple.jobjc.Invoke.MsgSend canAdd_IMetInst = get_canAdd_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canAdd_IMetInst.init(nativeBuffer, this);
		canAdd_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend canRemove_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_canRemove_IMetInst(){
		return ((canRemove_IMetInst != null)
	? (canRemove_IMetInst)
	: (canRemove_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "canRemove", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean canRemove(){
			final com.apple.jobjc.Invoke.MsgSend canRemove_IMetInst = get_canRemove_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		canRemove_IMetInst.init(nativeBuffer, this);
		canRemove_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
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

	private static com.apple.jobjc.Invoke.MsgSend defaultFetchRequest_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_defaultFetchRequest_IMetInst(){
		return ((defaultFetchRequest_IMetInst != null)
	? (defaultFetchRequest_IMetInst)
	: (defaultFetchRequest_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "defaultFetchRequest", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSFetchRequest* (@, @) */ defaultFetchRequest(){
			final com.apple.jobjc.Invoke.MsgSend defaultFetchRequest_IMetInst = get_defaultFetchRequest_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		defaultFetchRequest_IMetInst.init(nativeBuffer, this);
		defaultFetchRequest_IMetInst.invoke(nativeBuffer);
		final Object /* NSFetchRequest* (@, @) */ returnValue = (Object /* NSFetchRequest* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend entityName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_entityName_IMetInst(){
		return ((entityName_IMetInst != null)
	? (entityName_IMetInst)
	: (entityName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "entityName", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSString entityName(){
			final com.apple.jobjc.Invoke.MsgSend entityName_IMetInst = get_entityName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		entityName_IMetInst.init(nativeBuffer, this);
		entityName_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSString returnValue = (com.apple.jobjc.foundation.NSString) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fetch_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fetch_IMetInst(){
		return ((fetch_IMetInst != null)
	? (fetch_IMetInst)
	: (fetch_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fetch:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void fetch(final com.apple.jobjc.ID sender){
			final com.apple.jobjc.Invoke.MsgSend fetch_IMetInst = get_fetch_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fetch_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, sender);
		fetch_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend fetchPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fetchPredicate_IMetInst(){
		return ((fetchPredicate_IMetInst != null)
	? (fetchPredicate_IMetInst)
	: (fetchPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fetchPredicate", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public com.apple.jobjc.foundation.NSPredicate fetchPredicate(){
			final com.apple.jobjc.Invoke.MsgSend fetchPredicate_IMetInst = get_fetchPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fetchPredicate_IMetInst.init(nativeBuffer, this);
		fetchPredicate_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.foundation.NSPredicate returnValue = (com.apple.jobjc.foundation.NSPredicate) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend fetchWithRequest_merge_error_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_fetchWithRequest_merge_error_IMetInst(){
		return ((fetchWithRequest_merge_error_IMetInst != null)
	? (fetchWithRequest_merge_error_IMetInst)
	: (fetchWithRequest_merge_error_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "fetchWithRequest:merge:error:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.PointerCoder.INST)));
	}

	 public boolean fetchWithRequest_merge_error(final Object /* NSFetchRequest* (@, @) */ fetchRequest, final boolean merge, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> error){
			final com.apple.jobjc.Invoke.MsgSend fetchWithRequest_merge_error_IMetInst = get_fetchWithRequest_merge_error_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		fetchWithRequest_merge_error_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, fetchRequest);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, merge);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, error);
		fetchWithRequest_merge_error_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithContent_IMetInst(){
		return ((initWithContent_IMetInst != null)
	? (initWithContent_IMetInst)
	: (initWithContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithContent:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithContent(final com.apple.jobjc.ID content){
			final com.apple.jobjc.Invoke.MsgSend initWithContent_IMetInst = get_initWithContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithContent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, content);
		initWithContent_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_isEditable_IMetInst(){
		return ((isEditable_IMetInst != null)
	? (isEditable_IMetInst)
	: (isEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "isEditable", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean isEditable(){
			final com.apple.jobjc.Invoke.MsgSend isEditable_IMetInst = get_isEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		isEditable_IMetInst.init(nativeBuffer, this);
		isEditable_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend managedObjectContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_managedObjectContext_IMetInst(){
		return ((managedObjectContext_IMetInst != null)
	? (managedObjectContext_IMetInst)
	: (managedObjectContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "managedObjectContext", com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public Object /* NSManagedObjectContext* (@, @) */ managedObjectContext(){
			final com.apple.jobjc.Invoke.MsgSend managedObjectContext_IMetInst = get_managedObjectContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		managedObjectContext_IMetInst.init(nativeBuffer, this);
		managedObjectContext_IMetInst.invoke(nativeBuffer);
		final Object /* NSManagedObjectContext* (@, @) */ returnValue = (Object /* NSManagedObjectContext* (@, @) */) (com.apple.jobjc.Coder.UnknownCoder.INST.pop(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend newObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_newObject_IMetInst(){
		return ((newObject_IMetInst != null)
	? (newObject_IMetInst)
	: (newObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "newObject", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T newObject(){
			final com.apple.jobjc.Invoke.MsgSend newObject_IMetInst = get_newObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		newObject_IMetInst.init(nativeBuffer, this);
		newObject_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend objectClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_objectClass_IMetInst(){
		return ((objectClass_IMetInst != null)
	? (objectClass_IMetInst)
	: (objectClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "objectClass", com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public <T extends com.apple.jobjc.NSClass> T objectClass(){
			final com.apple.jobjc.Invoke.MsgSend objectClass_IMetInst = get_objectClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		objectClass_IMetInst.init(nativeBuffer, this);
		objectClass_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.NSClass returnValue = (com.apple.jobjc.NSClass) (com.apple.jobjc.Coder.NSClassCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend prepareContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prepareContent_IMetInst(){
		return ((prepareContent_IMetInst != null)
	? (prepareContent_IMetInst)
	: (prepareContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prepareContent", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void prepareContent(){
			final com.apple.jobjc.Invoke.MsgSend prepareContent_IMetInst = get_prepareContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prepareContent_IMetInst.init(nativeBuffer, this);
		prepareContent_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_removeObject_IMetInst(){
		return ((removeObject_IMetInst != null)
	? (removeObject_IMetInst)
	: (removeObject_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "removeObject:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void removeObject(final com.apple.jobjc.ID object){
			final com.apple.jobjc.Invoke.MsgSend removeObject_IMetInst = get_removeObject_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		removeObject_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, object);
		removeObject_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend selection_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_selection_IMetInst(){
		return ((selection_IMetInst != null)
	? (selection_IMetInst)
	: (selection_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "selection", com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T selection(){
			final com.apple.jobjc.Invoke.MsgSend selection_IMetInst = get_selection_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		selection_IMetInst.init(nativeBuffer, this);
		selection_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend setAutomaticallyPreparesContent_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setAutomaticallyPreparesContent_IMetInst(){
		return ((setAutomaticallyPreparesContent_IMetInst != null)
	? (setAutomaticallyPreparesContent_IMetInst)
	: (setAutomaticallyPreparesContent_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setAutomaticallyPreparesContent:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setAutomaticallyPreparesContent(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setAutomaticallyPreparesContent_IMetInst = get_setAutomaticallyPreparesContent_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setAutomaticallyPreparesContent_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setAutomaticallyPreparesContent_IMetInst.invoke(nativeBuffer);
		
		
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

	private static com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEditable_IMetInst(){
		return ((setEditable_IMetInst != null)
	? (setEditable_IMetInst)
	: (setEditable_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEditable:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setEditable(final boolean flag){
			final com.apple.jobjc.Invoke.MsgSend setEditable_IMetInst = get_setEditable_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEditable_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, flag);
		setEditable_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setEntityName_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setEntityName_IMetInst(){
		return ((setEntityName_IMetInst != null)
	? (setEntityName_IMetInst)
	: (setEntityName_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setEntityName:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setEntityName(final com.apple.jobjc.foundation.NSString entityName){
			final com.apple.jobjc.Invoke.MsgSend setEntityName_IMetInst = get_setEntityName_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setEntityName_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, entityName);
		setEntityName_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setFetchPredicate_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setFetchPredicate_IMetInst(){
		return ((setFetchPredicate_IMetInst != null)
	? (setFetchPredicate_IMetInst)
	: (setFetchPredicate_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setFetchPredicate:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void setFetchPredicate(final com.apple.jobjc.foundation.NSPredicate predicate){
			final com.apple.jobjc.Invoke.MsgSend setFetchPredicate_IMetInst = get_setFetchPredicate_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setFetchPredicate_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, predicate);
		setFetchPredicate_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setManagedObjectContext_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setManagedObjectContext_IMetInst(){
		return ((setManagedObjectContext_IMetInst != null)
	? (setManagedObjectContext_IMetInst)
	: (setManagedObjectContext_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setManagedObjectContext:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void setManagedObjectContext(final Object /* NSManagedObjectContext* (@, @) */ managedObjectContext){
			final com.apple.jobjc.Invoke.MsgSend setManagedObjectContext_IMetInst = get_setManagedObjectContext_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setManagedObjectContext_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, managedObjectContext);
		setManagedObjectContext_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setObjectClass_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setObjectClass_IMetInst(){
		return ((setObjectClass_IMetInst != null)
	? (setObjectClass_IMetInst)
	: (setObjectClass_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setObjectClass:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.NSClassCoder.INST)));
	}

	 public void setObjectClass(final com.apple.jobjc.NSClass objectClass){
			final com.apple.jobjc.Invoke.MsgSend setObjectClass_IMetInst = get_setObjectClass_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setObjectClass_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.NSClassCoder.INST.push(nativeBuffer, objectClass);
		setObjectClass_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend setUsesLazyFetching_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_setUsesLazyFetching_IMetInst(){
		return ((setUsesLazyFetching_IMetInst != null)
	? (setUsesLazyFetching_IMetInst)
	: (setUsesLazyFetching_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "setUsesLazyFetching:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public void setUsesLazyFetching(final boolean enabled){
			final com.apple.jobjc.Invoke.MsgSend setUsesLazyFetching_IMetInst = get_setUsesLazyFetching_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		setUsesLazyFetching_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.push(nativeBuffer, enabled);
		setUsesLazyFetching_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend usesLazyFetching_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_usesLazyFetching_IMetInst(){
		return ((usesLazyFetching_IMetInst != null)
	? (usesLazyFetching_IMetInst)
	: (usesLazyFetching_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "usesLazyFetching", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST)));
	}

	 public boolean usesLazyFetching(){
			final com.apple.jobjc.Invoke.MsgSend usesLazyFetching_IMetInst = get_usesLazyFetching_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		usesLazyFetching_IMetInst.init(nativeBuffer, this);
		usesLazyFetching_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend validateUserInterfaceItem_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_validateUserInterfaceItem_IMetInst(){
		return ((validateUserInterfaceItem_IMetInst != null)
	? (validateUserInterfaceItem_IMetInst)
	: (validateUserInterfaceItem_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "validateUserInterfaceItem:", com.apple.jobjc.PrimitiveCoder.BoolCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public boolean validateUserInterfaceItem(final com.apple.jobjc.ID item){
			final com.apple.jobjc.Invoke.MsgSend validateUserInterfaceItem_IMetInst = get_validateUserInterfaceItem_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		validateUserInterfaceItem_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, item);
		validateUserInterfaceItem_IMetInst.invoke(nativeBuffer);
		final boolean returnValue = (boolean) (com.apple.jobjc.PrimitiveCoder.BoolCoder.INST.popBoolean(nativeBuffer));
		return returnValue;
	}

}
