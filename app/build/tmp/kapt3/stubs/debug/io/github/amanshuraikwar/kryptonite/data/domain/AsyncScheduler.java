package io.github.amanshuraikwar.kryptonite.data.domain;

import java.lang.System;

/**
 * Runs tasks in a [ExecutorService] with a fixed thread of pools
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0002J\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016J\u0016\u0010\u000e\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/domain/AsyncScheduler;", "Lio/github/amanshuraikwar/kryptonite/data/domain/Scheduler;", "()V", "executorService", "Ljava/util/concurrent/ExecutorService;", "execute", "", "task", "Lkotlin/Function0;", "isMainThread", "", "postDelayedToMainThread", "delay", "", "postToMainThread", "app_debug"})
public final class AsyncScheduler implements io.github.amanshuraikwar.kryptonite.data.domain.Scheduler {
    private static final java.util.concurrent.ExecutorService executorService = null;
    public static final io.github.amanshuraikwar.kryptonite.data.domain.AsyncScheduler INSTANCE = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> task) {
    }
    
    @java.lang.Override()
    public void postToMainThread(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> task) {
    }
    
    private final boolean isMainThread() {
        return false;
    }
    
    @java.lang.Override()
    public void postDelayedToMainThread(long delay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> task) {
    }
    
    private AsyncScheduler() {
        super();
    }
}