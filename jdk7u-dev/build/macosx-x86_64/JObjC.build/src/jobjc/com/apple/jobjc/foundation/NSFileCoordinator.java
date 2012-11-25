package com.apple.jobjc.foundation;

public  class NSFileCoordinator extends com.apple.jobjc.foundation.NSObject {
	public NSFileCoordinator(final long objPtr, final com.apple.jobjc.JObjCRuntime runtime) {
		super(objPtr, runtime);
	}
	public NSFileCoordinator(final NSFileCoordinator obj, final com.apple.jobjc.JObjCRuntime runtime) {
		super(obj, runtime);
	}
	private static com.apple.jobjc.Invoke.MsgSend cancel_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_cancel_IMetInst(){
		return ((cancel_IMetInst != null)
	? (cancel_IMetInst)
	: (cancel_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "cancel", com.apple.jobjc.Coder.VoidCoder.INST)));
	}

	 public void cancel(){
			final com.apple.jobjc.Invoke.MsgSend cancel_IMetInst = get_cancel_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		cancel_IMetInst.init(nativeBuffer, this);
		cancel_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend coordinateReadingItemAtURL_options_error_byAccessor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coordinateReadingItemAtURL_options_error_byAccessor_IMetInst(){
		return ((coordinateReadingItemAtURL_options_error_byAccessor_IMetInst != null)
	? (coordinateReadingItemAtURL_options_error_byAccessor_IMetInst)
	: (coordinateReadingItemAtURL_options_error_byAccessor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coordinateReadingItemAtURL:options:error:byAccessor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void coordinateReadingItemAtURL_options_error_byAccessor(final com.apple.jobjc.foundation.NSURL url, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError, final Object /* void(^)(NSURL*) (@, @) */ reader){
			final com.apple.jobjc.Invoke.MsgSend coordinateReadingItemAtURL_options_error_byAccessor_IMetInst = get_coordinateReadingItemAtURL_options_error_byAccessor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coordinateReadingItemAtURL_options_error_byAccessor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, reader);
		coordinateReadingItemAtURL_options_error_byAccessor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst(){
		return ((coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst != null)
	? (coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst)
	: (coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor(final com.apple.jobjc.foundation.NSURL readingURL, final long readingOptions, final com.apple.jobjc.foundation.NSURL writingURL, final long writingOptions, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError, final Object /* void(^)(NSURL*,NSURL*) (@, @) */ readerWriter){
			final com.apple.jobjc.Invoke.MsgSend coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst = get_coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, readingURL);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, readingOptions);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, writingURL);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, writingOptions);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, readerWriter);
		coordinateReadingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend coordinateWritingItemAtURL_options_error_byAccessor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coordinateWritingItemAtURL_options_error_byAccessor_IMetInst(){
		return ((coordinateWritingItemAtURL_options_error_byAccessor_IMetInst != null)
	? (coordinateWritingItemAtURL_options_error_byAccessor_IMetInst)
	: (coordinateWritingItemAtURL_options_error_byAccessor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coordinateWritingItemAtURL:options:error:byAccessor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void coordinateWritingItemAtURL_options_error_byAccessor(final com.apple.jobjc.foundation.NSURL url, final long options, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError, final Object /* void(^)(NSURL*) (@, @) */ writer){
			final com.apple.jobjc.Invoke.MsgSend coordinateWritingItemAtURL_options_error_byAccessor_IMetInst = get_coordinateWritingItemAtURL_options_error_byAccessor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coordinateWritingItemAtURL_options_error_byAccessor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, writer);
		coordinateWritingItemAtURL_options_error_byAccessor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst(){
		return ((coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst != null)
	? (coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst)
	: (coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor(final com.apple.jobjc.foundation.NSURL url1, final long options1, final com.apple.jobjc.foundation.NSURL url2, final long options2, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError, final Object /* void(^)(NSURL*,NSURL*) (@, @) */ writer){
			final com.apple.jobjc.Invoke.MsgSend coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst = get_coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url1);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options1);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, url2);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, options2);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, writer);
		coordinateWritingItemAtURL_options_writingItemAtURL_options_error_byAccessor_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend initWithFilePresenter_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_initWithFilePresenter_IMetInst(){
		return ((initWithFilePresenter_IMetInst != null)
	? (initWithFilePresenter_IMetInst)
	: (initWithFilePresenter_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "initWithFilePresenter:", com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public <T extends com.apple.jobjc.ID> T initWithFilePresenter(final com.apple.jobjc.ID filePresenterOrNil){
			final com.apple.jobjc.Invoke.MsgSend initWithFilePresenter_IMetInst = get_initWithFilePresenter_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		initWithFilePresenter_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, filePresenterOrNil);
		initWithFilePresenter_IMetInst.invoke(nativeBuffer);
		final com.apple.jobjc.ID returnValue = (com.apple.jobjc.ID) (com.apple.jobjc.Coder.IDCoder.INST.pop(nativeBuffer));
		return (T)returnValue;
	}

	private static com.apple.jobjc.Invoke.MsgSend itemAtURL_didMoveToURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtURL_didMoveToURL_IMetInst(){
		return ((itemAtURL_didMoveToURL_IMetInst != null)
	? (itemAtURL_didMoveToURL_IMetInst)
	: (itemAtURL_didMoveToURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtURL:didMoveToURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void itemAtURL_didMoveToURL(final com.apple.jobjc.foundation.NSURL oldURL, final com.apple.jobjc.foundation.NSURL newURL){
			final com.apple.jobjc.Invoke.MsgSend itemAtURL_didMoveToURL_IMetInst = get_itemAtURL_didMoveToURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtURL_didMoveToURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newURL);
		itemAtURL_didMoveToURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend itemAtURL_willMoveToURL_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_itemAtURL_willMoveToURL_IMetInst(){
		return ((itemAtURL_willMoveToURL_IMetInst != null)
	? (itemAtURL_willMoveToURL_IMetInst)
	: (itemAtURL_willMoveToURL_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "itemAtURL:willMoveToURL:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.Coder.IDCoder.INST)));
	}

	 public void itemAtURL_willMoveToURL(final com.apple.jobjc.foundation.NSURL oldURL, final com.apple.jobjc.foundation.NSURL newURL){
			final com.apple.jobjc.Invoke.MsgSend itemAtURL_willMoveToURL_IMetInst = get_itemAtURL_willMoveToURL_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		itemAtURL_willMoveToURL_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, oldURL);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, newURL);
		itemAtURL_willMoveToURL_IMetInst.invoke(nativeBuffer);
		
		
	}

	private static com.apple.jobjc.Invoke.MsgSend prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst;
	 final private com.apple.jobjc.Invoke.MsgSend get_prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst(){
		return ((prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst != null)
	? (prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst)
	: (prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst = new com.apple.jobjc.Invoke.MsgSend(getRuntime(), "prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:", com.apple.jobjc.Coder.VoidCoder.INST, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.IDCoder.INST, com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder, com.apple.jobjc.Coder.PointerCoder.INST, com.apple.jobjc.Coder.UnknownCoder.INST)));
	}

	 public void prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor(final com.apple.jobjc.foundation.NSArray readingURLs, final long readingOptions, final com.apple.jobjc.foundation.NSArray writingURLs, final long writingOptions, final com.apple.jobjc.Pointer<com.apple.jobjc.foundation.NSError> outError, final Object /* void(^)(void(^)(void)) (@, @) */ batchAccessor){
			final com.apple.jobjc.Invoke.MsgSend prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst = get_prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst();

		final com.apple.jobjc.NativeArgumentBuffer nativeBuffer = getRuntime().getThreadLocalState();
		prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst.init(nativeBuffer, this);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, readingURLs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, readingOptions);
		com.apple.jobjc.Coder.IDCoder.INST.push(nativeBuffer, writingURLs);
		com.apple.jobjc.MixedPrimitiveCoder.UIntULongLongCoder.push(nativeBuffer, writingOptions);
		com.apple.jobjc.Coder.PointerCoder.INST.push(nativeBuffer, outError);
		com.apple.jobjc.Coder.UnknownCoder.INST.push(nativeBuffer, batchAccessor);
		prepareForReadingItemsAtURLs_options_writingItemsAtURLs_options_error_byAccessor_IMetInst.invoke(nativeBuffer);
		
		
	}

}
