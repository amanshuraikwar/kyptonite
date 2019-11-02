package io.github.amanshuraikwar.kryptonite.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006\u0011"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/BaseApiResponse;", "", "success", "", "terms", "", "privacy", "error", "Lio/github/amanshuraikwar/kryptonite/data/Error;", "(ZLjava/lang/String;Ljava/lang/String;Lio/github/amanshuraikwar/kryptonite/data/Error;)V", "getError", "()Lio/github/amanshuraikwar/kryptonite/data/Error;", "getPrivacy", "()Ljava/lang/String;", "getSuccess", "()Z", "getTerms", "app_debug"})
public class BaseApiResponse {
    private final boolean success = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String terms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String privacy = null;
    @org.jetbrains.annotations.Nullable()
    private final io.github.amanshuraikwar.kryptonite.data.Error error = null;
    
    public final boolean getSuccess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTerms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrivacy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.github.amanshuraikwar.kryptonite.data.Error getError() {
        return null;
    }
    
    public BaseApiResponse(boolean success, @org.jetbrains.annotations.NotNull()
    java.lang.String terms, @org.jetbrains.annotations.NotNull()
    java.lang.String privacy, @org.jetbrains.annotations.Nullable()
    io.github.amanshuraikwar.kryptonite.data.Error error) {
        super();
    }
}