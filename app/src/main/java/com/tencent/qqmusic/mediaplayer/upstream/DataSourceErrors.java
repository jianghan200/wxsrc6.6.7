package com.tencent.qqmusic.mediaplayer.upstream;

public abstract interface DataSourceErrors
{
  public static final int CREATE_NATIVE_DATASOURCE_GENERAL = -1;
  public static final int CREATE_NATIVE_DATASOURCE_ILLEAGAL_ARUMENTS = -5;
  public static final int CREATE_NATIVE_DATASOURCE_NULL_NATIVE_INSTANCE = -4;
  public static final int CREATE_NATIVE_DATASOURCE_SO_LOAD_FAILED = -3;
  public static final int CREATE_NATIVE_DATASOURCE_UNSATISFIED_LINK = -2;
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/upstream/DataSourceErrors.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */