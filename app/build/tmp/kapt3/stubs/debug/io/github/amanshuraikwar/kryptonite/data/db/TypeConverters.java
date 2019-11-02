package io.github.amanshuraikwar.kryptonite.data.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0014\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0007R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lio/github/amanshuraikwar/kryptonite/data/db/TypeConverters;", "", "()V", "formatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "fromOffsetDateTime", "", "date", "Lorg/threeten/bp/OffsetDateTime;", "toOffsetDateTime", "value", "app_debug"})
public final class TypeConverters {
    private static final org.threeten.bp.format.DateTimeFormatter formatter = null;
    public static final io.github.amanshuraikwar.kryptonite.data.db.TypeConverters INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final org.threeten.bp.OffsetDateTime toOffsetDateTime(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public static final java.lang.String fromOffsetDateTime(@org.jetbrains.annotations.Nullable()
    org.threeten.bp.OffsetDateTime date) {
        return null;
    }
    
    private TypeConverters() {
        super();
    }
}