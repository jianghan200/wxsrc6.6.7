package com.tencent.xweb.b;

import org.xwalk.core.Log;

public final class d
  implements b
{
  public static a vAW = null;
  public c vAX = null;
  
  public static void a(a parama)
  {
    StringBuilder localStringBuilder = new StringBuilder("XWalkLib SetFileDownloaderProxy:");
    if (parama == null) {}
    for (boolean bool = true;; bool = false)
    {
      Log.i("WXFileDownloaderBridge", bool);
      vAW = parama;
      return;
    }
  }
  
  public static boolean isValid()
  {
    return vAW != null;
  }
  
  public final void s(String paramString, int paramInt, boolean paramBoolean)
  {
    Log.i("WXFileDownloaderBridge", "onTaskFailed, url=" + paramString + ", errCode=" + paramInt);
    this.vAX.onTaskFail(paramString, paramInt, paramBoolean);
  }
  
  public final void u(String paramString1, String paramString2, boolean paramBoolean)
  {
    Log.i("WXFileDownloaderBridge", "onTaskFinished url=" + paramString1 + ", save_path=" + paramString2);
    this.vAX.onTaskSucc(paramString1, paramString2, paramBoolean);
  }
  
  public final void y(String paramString, long paramLong1, long paramLong2)
  {
    Log.i("WXFileDownloaderBridge", "onTaskProgressChanged, url=" + paramString + ", cur_size:" + paramLong1 + ", total_size:" + paramLong2);
    this.vAX.onProgressChange(paramString, paramLong1, paramLong2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/xweb/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */