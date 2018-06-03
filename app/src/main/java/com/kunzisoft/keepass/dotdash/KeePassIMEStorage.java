package com.kunzisoft.keepass.dotdash;

public class KeePassIMEStorage {
    private static String title;
    private static String password;
    private static String username;
    private static String url;

    static String getTitle() {
        return title;
    }

    public static void setTitle(String title) {
        KeePassIMEStorage.title = title;
    }


    static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        KeePassIMEStorage.password = password;
    }

    static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        KeePassIMEStorage.username = username;
    }

    static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        KeePassIMEStorage.url = url;
    }
}
