package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/LiveResponse;", "Lio/github/amanshuraikwar/kryptonite/data/BaseApiResponse;", "success", "", "terms", "", "privacy", "error", "Lio/github/amanshuraikwar/kryptonite/data/Error;", "timestamp", "", "source", "quotes", "Lcom/google/gson/JsonObject;", "(ZLjava/lang/String;Ljava/lang/String;Lio/github/amanshuraikwar/kryptonite/data/Error;JLjava/lang/String;Lcom/google/gson/JsonObject;)V", "getQuotes", "()Lcom/google/gson/JsonObject;", "getSource", "()Ljava/lang/String;", "getTimestamp", "()J", "app_debug"})
public final class LiveResponse extends io.github.amanshuraikwar.kryptonite.data.BaseApiResponse {
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.JsonObject quotes = null;
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonObject getQuotes() {
        return null;
    }
    
    public LiveResponse(boolean success, @org.jetbrains.annotations.NotNull()
    java.lang.String terms, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy, @org.jetbrains.annotations.Nullable()
    io.github.amanshuraikwar.kryptonite.data.Error error, long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String source, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject quotes) {
        super(false, null, null, null);
    }
}