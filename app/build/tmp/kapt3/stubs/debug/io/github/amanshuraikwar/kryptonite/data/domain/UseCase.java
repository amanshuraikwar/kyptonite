package io.github.amanshuraikwar.kryptonite.data.domain;

import java.lang.System;

/**
 * Executes business logic synchronously or asynchronously using a [Scheduler].
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000f2\u0006\u0010\f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010\u0013J*\u0010\u0011\u001a\u00020\u00142\u0006\u0010\f\u001a\u00028\u00002\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f0\u0016H\u0086\u0002\u00a2\u0006\u0002\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/domain/UseCase;", "P", "R", "", "()V", "taskScheduler", "Lio/github/amanshuraikwar/kryptonite/data/domain/Scheduler;", "getTaskScheduler", "()Lio/github/amanshuraikwar/kryptonite/data/domain/Scheduler;", "setTaskScheduler", "(Lio/github/amanshuraikwar/kryptonite/data/domain/Scheduler;)V", "execute", "parameters", "(Ljava/lang/Object;)Ljava/lang/Object;", "executeNow", "Lio/github/amanshuraikwar/kryptonite/data/domain/result/Result;", "(Ljava/lang/Object;)Lio/github/amanshuraikwar/kryptonite/data/domain/result/Result;", "invoke", "Landroidx/lifecycle/LiveData;", "(Ljava/lang/Object;)Landroidx/lifecycle/LiveData;", "", "result", "Landroidx/lifecycle/MutableLiveData;", "(Ljava/lang/Object;Landroidx/lifecycle/MutableLiveData;)V", "app_debug"})
public abstract class UseCase<P extends java.lang.Object, R extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private io.github.amanshuraikwar.kryptonite.data.domain.Scheduler taskScheduler;
    
    @org.jetbrains.annotations.NotNull()
    protected final io.github.amanshuraikwar.kryptonite.data.domain.Scheduler getTaskScheduler() {
        return null;
    }
    
    protected final void setTaskScheduler(@org.jetbrains.annotations.NotNull()
    io.github.amanshuraikwar.kryptonite.data.domain.Scheduler p0) {
    }
    
    /**
     * Executes the use case asynchronously and places the [Result] in a MutableLiveData
     *
     * @param parameters the input parameters to run the use case with
     * @param result the MutableLiveData where the result is posted to
     */
    public final void invoke(P parameters, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Result<R>> result) {
    }
    
    /**
     * Executes the use case asynchronously and returns a [Result] in a new LiveData object.
     *
     * @return an observable [LiveData] with a [Result].
     *
     * @param parameters the input parameters to run the use case with
     */
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<io.github.amanshuraikwar.kryptonite.data.domain.result.Result<R>> invoke(P parameters) {
        return null;
    }
    
    /**
     * Executes the use case synchronously
     */
    @org.jetbrains.annotations.NotNull()
    public final io.github.amanshuraikwar.kryptonite.data.domain.result.Result<R> executeNow(P parameters) {
        return null;
    }
    
    /**
     * Override this to set the code to be executed.
     */
    protected abstract R execute(P parameters);
    
    public UseCase() {
        super();
    }
}