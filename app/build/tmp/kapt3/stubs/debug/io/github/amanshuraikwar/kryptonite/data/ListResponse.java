package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/ListResponse;", "Lio/github/amanshuraikwar/kryptonite/data/BaseApiResponse;", "success", "", "terms", "", "privacy", "error", "Lio/github/amanshuraikwar/kryptonite/data/Error;", "currencies", "Lcom/google/gson/JsonObject;", "(ZLjava/lang/String;Ljava/lang/String;Lio/github/amanshuraikwar/kryptonite/data/Error;Lcom/google/gson/JsonObject;)V", "getCurrencies", "()Lcom/google/gson/JsonObject;", "app_debug"})
public final class ListResponse extends io.github.amanshuraikwar.kryptonite.data.BaseApiResponse {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.JsonObject currencies = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.JsonObject getCurrencies() {
        return null;
    }
    
    public ListResponse(boolean success, @org.jetbrains.annotations.NotNull()
    java.lang.String terms, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy, @org.jetbrains.annotations.Nullable()
    io.github.amanshuraikwar.kryptonite.data.Error error, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject currencies) {
        super(false, null, null, null);
    }
}