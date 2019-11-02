package io.github.amanshuraikwar.multiitemlistadapter.annotations

@Retention(AnnotationRetention.SOURCE)
@Target(AnnotationTarget.CLASS)
annotation class ListItem(
    val layoutResId: Int
)
