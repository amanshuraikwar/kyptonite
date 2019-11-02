package io.github.amanshuraikwar.kryptonite.data.domain;

import java.lang.System;

/**
 * A shim [Scheduler] that by default handles operations in the [AsyncScheduler].
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0001R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/domain/DefaultScheduler;", "Lio/github/amanshuraikwar/kryptonite/data/domain/Scheduler;", "()V", "delegate", "execute", "", "task", "Lkotlin/Function0;", "postDelayedToMainThread", "delay", "", "postToMainThread", "setDelegate", "newDelegate", "app_debug"})
public final class DefaultScheduler implements io.github.amanshuraikwar.kryptonite.data.domain.Scheduler {
    private static io.github.amanshuraikwar.kryptonite.data.domain.Scheduler delegate;
    public static final io.github.amanshuraikwar.kryptonite.data.domain.DefaultScheduler INSTANCE = null;
    
    /**
     * Sets the new delegate scheduler, null to revert to the default async one.
     */
    public final void setDelegate(@org.jetbrains.annotations.Nullable()
    io.github.amanshuraikwar.kryptonite.data.domain.Scheduler newDelegate) {
    }
    
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
    
    private DefaultScheduler() {
        super();
    }
}