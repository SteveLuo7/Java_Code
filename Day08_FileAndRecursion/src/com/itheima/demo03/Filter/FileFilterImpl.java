package com.itheima.demo03.Filter;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()) {
            return true;
        }
        return pathname.getName().endsWith("java");

    }
}
