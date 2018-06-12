package com.tencent.wcdb.database;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public final class SQLiteGlobal
{
  private static final String TAG = "WCDB.SQLiteGlobal";
  public static final String defaultJournalMode = "PERSIST";
  public static final int defaultPageSize;
  public static final String defaultSyncMode = "FULL";
  public static final int journalSizeLimit = 524288;
  public static final int walAutoCheckpoint = 100;
  public static final int walConnectionPoolSize = 4;
  public static final String walSyncMode = "FULL";
  
  static
  {
    try
    {
      i = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getBlockSize();
      defaultPageSize = i;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;)
      {
        try
        {
          nativeSetDefaultPageSize(i);
          return;
        }
        catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
        {
          int i;
          System.loadLibrary("wcdb");
          nativeSetDefaultPageSize(i);
        }
        localRuntimeException = localRuntimeException;
        i = 4096;
      }
    }
  }
  
  public static void loadLib() {}
  
  private static native int nativeReleaseMemory();
  
  private static native void nativeSetDefaultPageSize(int paramInt);
  
  public static int releaseMemory()
  {
    return nativeReleaseMemory();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/wcdb/database/SQLiteGlobal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */