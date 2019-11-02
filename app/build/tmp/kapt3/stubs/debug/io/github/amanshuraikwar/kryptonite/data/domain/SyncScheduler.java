package io.github.amanshuraikwar.kryptonite.data.domain;

import java.lang.System;

/**
 * Runs tasks synchronously.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u001e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\r\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0006\u0010\u000e\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/domain/SyncScheduler;", "Lio/github/amanshuraikwar/kryptonite/data/domain/Scheduler;", "()V", "postDelayedTasks", "", "Lkotlin/Function0;", "", "clearScheduledPostdelayedTasks", "execute", "task", "postDelayedToMainThread", "delay", "", "postToMainThread", "runAllScheduledPostDelayedTasks", "app_debug"})
public final class SyncScheduler implements io.github.amanshuraikwar.kryptonite.data.domain.Scheduler {
    private static final java.util.List<kotlin.jvm.functions.Function0<kotlin.Unit>> postDelayedTasks = null;
    public static final io.github.amanshuraikwar.kryptonite.data.domain.SyncScheduler INSTANCE = null;
    
    @java.lang.Override()
    public void execute(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> task) {
    }
    
    @java.lang.Override()
    public void postToMainThread(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> task) {
    }
    
    @java.lang.Override()
    public void postDelayedToMainThread(long delay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> task) {
    }
    
    public final void runAllScheduledPostDelayedTasks() {
    }
    
    public final void clearScheduledPostdelayedTasks() {
    }
    
    private SyncScheduler() {
        super();
    }
}