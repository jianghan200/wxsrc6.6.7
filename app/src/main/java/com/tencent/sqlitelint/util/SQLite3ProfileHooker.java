package com.tencent.sqlitelint.util;

import java.lang.reflect.Field;

public final class SQLite3ProfileHooker
{
  private static volatile boolean vob;
  
  public static void cGj()
  {
    SLog.i("SQLiteLint.SQLite3ProfileHooker", "hook sIsTryHook: %b", new Object[] { Boolean.valueOf(vob) });
    nativeStartProfile();
    if (!vob)
    {
      if (cGl()) {
        break label71;
      }
      SLog.i("SQLiteLint.SQLite3ProfileHooker", "doHook hookOpenSQLite3Profile failed", new Object[0]);
    }
    label71:
    for (boolean bool = false;; bool = nativeDoHook())
    {
      SLog.i("SQLiteLint.SQLite3ProfileHooker", "hook hookRet: %b", new Object[] { Boolean.valueOf(bool) });
      vob = true;
      return;
    }
  }
  
  public static void cGk()
  {
    if (vob)
    {
      cGm();
      nativeStopProfile();
      SLog.i("SQLiteLint.SQLite3ProfileHooker", "unHook unHookRet: %b", new Object[] { Boolean.valueOf(true) });
      vob = false;
    }
  }
  
  private static boolean cGl()
  {
    try
    {
      Class localClass = Class.forName("android.database.sqlite.SQLiteDebug");
      Field localField = localClass.getDeclaredField("DEBUG_SQL_TIME");
      localField.setAccessible(true);
      localField.setBoolean(localClass, true);
      localField.setAccessible(false);
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      SLog.e("SQLiteLint.SQLite3ProfileHooker", "prepareHookBeforeOpenDatabase: e=%s", new Object[] { localClassNotFoundException.getLocalizedMessage() });
      return false;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "prepareHookBeforeOpenDatabase: e=%s", new Object[] { localIllegalAccessException.getLocalizedMessage() });
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "prepareHookBeforeOpenDatabase: e=%s", new Object[] { localNoSuchFieldException.getLocalizedMessage() });
      }
    }
  }
  
  private static boolean cGm()
  {
    try
    {
      Class localClass = Class.forName("android.database.sqlite.SQLiteDebug");
      Field localField = localClass.getDeclaredField("DEBUG_SQL_TIME");
      localField.setAccessible(true);
      localField.setBoolean(localClass, false);
      localField.setAccessible(false);
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      SLog.e("SQLiteLint.SQLite3ProfileHooker", "unHookOpenSQLite3Profile: e=%s", new Object[] { localClassNotFoundException.getLocalizedMessage() });
      return false;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      for (;;)
      {
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "unHookOpenSQLite3Profile: e=%s", new Object[] { localIllegalAccessException.getLocalizedMessage() });
      }
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        SLog.e("SQLiteLint.SQLite3ProfileHooker", "unHookOpenSQLite3Profile: e=%s", new Object[] { localNoSuchFieldException.getLocalizedMessage() });
      }
    }
  }
  
  private static native boolean nativeDoHook();
  
  private static native void nativeStartProfile();
  
  private static native void nativeStopProfile();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/util/SQLite3ProfileHooker.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */