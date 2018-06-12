package com.tencent.mm.plugin.cdndownloader.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.n.a;
import com.tencent.mm.plugin.cdndownloader.a.a.a;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskInfo;
import com.tencent.mm.plugin.cdndownloader.ipc.CDNTaskState;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.Set;

public final class a
  implements com.tencent.mm.ipcinvoker.wx_extension.b.a
{
  private static a hJY;
  private long hJZ = 0L;
  long hKa = 0L;
  com.tencent.mm.plugin.cdndownloader.a.a hKb;
  Set<CDNTaskInfo> hKc = new com.tencent.mm.plugin.cdndownloader.d.a(new a.1(this));
  public b hKd;
  private ServiceConnection hKe = new ServiceConnection()
  {
    public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
    {
      x.i("MicroMsg.CDNDownloadClient", "onServiceConnected");
      a.this.hKb = a.a.H(paramAnonymousIBinder);
      paramAnonymousComponentName = a.this;
      try
      {
        x.i("MicroMsg.CDNDownloadClient", "registerCallback");
        paramAnonymousComponentName.hKb.a(paramAnonymousComponentName.hKg);
        a.c(a.this);
        return;
      }
      catch (RemoteException paramAnonymousComponentName)
      {
        for (;;)
        {
          x.e("MicroMsg.CDNDownloadClient", "registerCallback: " + paramAnonymousComponentName.getMessage());
        }
      }
    }
    
    public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
    {
      x.i("MicroMsg.CDNDownloadClient", "onServiceDisconnected");
      if (a.this.hKc.size() != 0)
      {
        paramAnonymousComponentName = a.this.hKc.iterator();
        while (paramAnonymousComponentName.hasNext()) {
          ((CDNTaskInfo)paramAnonymousComponentName.next()).hKp = true;
        }
      }
    }
  };
  al hKf = new al(com.tencent.mm.bu.a.coq().getLooper(), new a.3(this), true);
  com.tencent.mm.plugin.cdndownloader.a.b hKg = new a.4(this);
  private n.a hKh = new n.a()
  {
    public final void ev(int paramAnonymousInt)
    {
      a locala = a.this;
      x.i("MicroMsg.CDNDownloadClient", "notifyNetworkChange: " + paramAnonymousInt);
      if (locala.hKb != null) {}
      try
      {
        locala.hKb.od(paramAnonymousInt);
        return;
      }
      catch (RemoteException localRemoteException) {}
    }
  };
  private Context mContext = ad.getContext();
  
  public a()
  {
    g.Ek();
    g.Eh().a(this.hKh);
    aAl();
  }
  
  public static a aAk()
  {
    try
    {
      if (hJY == null) {
        hJY = new a();
      }
      a locala = hJY;
      return locala;
    }
    finally {}
  }
  
  public final int a(CDNTaskInfo paramCDNTaskInfo)
  {
    if ((paramCDNTaskInfo == null) || (bi.oW(paramCDNTaskInfo.downloadUrl)))
    {
      x.w("MicroMsg.CDNDownloadClient", "addDownloadTask, info invalid");
      return -1;
    }
    x.i("MicroMsg.CDNDownloadClient", "addDownloadTask filePath:%s, url:%s", new Object[] { paramCDNTaskInfo.filePath, paramCDNTaskInfo.downloadUrl });
    if (this.hKc.contains(paramCDNTaskInfo))
    {
      x.i("MicroMsg.CDNDownloadClient", "addDownloadTask, already in running");
      return -2;
    }
    if (this.hKb != null) {
      try
      {
        int i = this.hKb.a(paramCDNTaskInfo);
        if ((i == 0) || (i == -2)) {
          this.hKc.add(paramCDNTaskInfo);
        }
        return i;
      }
      catch (RemoteException localRemoteException)
      {
        x.e("MicroMsg.CDNDownloadClient", "addDownloadTask, " + localRemoteException.getMessage());
      }
    }
    this.hKc.add(paramCDNTaskInfo);
    aAl();
    return 0;
  }
  
  final void aAg()
  {
    if (this.hKb != null) {}
    try
    {
      this.hKb.aAg();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      x.e("MicroMsg.CDNDownloadClient", "addIPCTaskMarker: " + localRemoteException);
    }
  }
  
  /* Error */
  final void aAl()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 264	android/content/Intent
    //   5: dup
    //   6: aload_0
    //   7: getfield 93	com/tencent/mm/plugin/cdndownloader/c/a:mContext	Landroid/content/Context;
    //   10: ldc_w 266
    //   13: invokespecial 269	android/content/Intent:<init>	(Landroid/content/Context;Ljava/lang/Class;)V
    //   16: astore_2
    //   17: aload_0
    //   18: getfield 93	com/tencent/mm/plugin/cdndownloader/c/a:mContext	Landroid/content/Context;
    //   21: aload_2
    //   22: aload_0
    //   23: getfield 55	com/tencent/mm/plugin/cdndownloader/c/a:hKe	Landroid/content/ServiceConnection;
    //   26: iconst_1
    //   27: invokevirtual 275	android/content/Context:bindService	(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    //   30: istore_1
    //   31: ldc 124
    //   33: new 126	java/lang/StringBuilder
    //   36: dup
    //   37: ldc_w 277
    //   40: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   43: iload_1
    //   44: invokevirtual 280	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   47: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   50: invokestatic 156	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   53: aload_0
    //   54: monitorexit
    //   55: return
    //   56: astore_2
    //   57: ldc 124
    //   59: new 126	java/lang/StringBuilder
    //   62: dup
    //   63: ldc_w 277
    //   66: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   69: aload_2
    //   70: invokevirtual 281	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   73: invokevirtual 257	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: invokevirtual 139	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   79: invokestatic 145	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: goto -29 -> 53
    //   85: astore_2
    //   86: aload_0
    //   87: monitorexit
    //   88: aload_2
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	a
    //   30	14	1	bool	boolean
    //   16	6	2	localIntent	android.content.Intent
    //   56	14	2	localException	Exception
    //   85	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   17	53	56	java/lang/Exception
    //   2	17	85	finally
    //   17	53	85	finally
    //   57	82	85	finally
  }
  
  public final int b(CDNTaskInfo paramCDNTaskInfo)
  {
    int i;
    if ((paramCDNTaskInfo == null) || (bi.oW(paramCDNTaskInfo.downloadUrl)))
    {
      x.w("MicroMsg.CDNDownloadClient", "resumeDownloadTask, info invalid");
      i = -1;
    }
    for (;;)
    {
      return i;
      x.i("MicroMsg.CDNDownloadClient", "resumeDownloadTask: " + paramCDNTaskInfo.downloadUrl);
      paramCDNTaskInfo.hKp = true;
      if (this.hKb != null) {
        try
        {
          int j = this.hKb.b(paramCDNTaskInfo);
          if (j != 0)
          {
            i = j;
            if (j != -2) {}
          }
          else
          {
            this.hKc.add(paramCDNTaskInfo);
            return j;
          }
        }
        catch (RemoteException localRemoteException)
        {
          x.e("MicroMsg.CDNDownloadClient", "resumeDownloadTask, " + localRemoteException.getMessage());
        }
      }
    }
    this.hKc.add(paramCDNTaskInfo);
    aAl();
    return 0;
  }
  
  public final boolean yj(String paramString)
  {
    x.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask: " + paramString);
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.CDNDownloadClient", "pauseDownloadTask, url invalid");
      return false;
    }
    if (this.hKb != null) {
      try
      {
        this.hKc.remove(new CDNTaskInfo(paramString));
        boolean bool = this.hKb.yj(paramString);
        return bool;
      }
      catch (RemoteException paramString)
      {
        x.e("MicroMsg.CDNDownloadClient", "pauseDownloadTask, " + paramString.getMessage());
      }
    }
    x.i("MicroMsg.CDNDownloadClient", "pauseDownloadTask false, service interface is null");
    return false;
  }
  
  public final boolean yk(String paramString)
  {
    x.i("MicroMsg.CDNDownloadClient", "removeDownloadTask: " + paramString);
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.CDNDownloadClient", "removeDownloadTask, url invalid");
      return false;
    }
    if (this.hKb != null) {
      try
      {
        this.hKc.remove(new CDNTaskInfo(paramString));
        boolean bool = this.hKb.yk(paramString);
        return bool;
      }
      catch (RemoteException paramString)
      {
        x.e("MicroMsg.CDNDownloadClient", "removeDownloadTask, " + paramString.getMessage());
      }
    }
    x.i("MicroMsg.CDNDownloadClient", "removeDownloadTask false, service interface is null");
    return false;
  }
  
  public final CDNTaskState yl(String paramString)
  {
    if (bi.oW(paramString)) {
      x.w("MicroMsg.CDNDownloadClient", "queryDownloadTask, url invalid");
    }
    while (this.hKb == null) {
      return null;
    }
    try
    {
      paramString = this.hKb.yl(paramString);
      return paramString;
    }
    catch (RemoteException paramString)
    {
      x.e("MicroMsg.CDNDownloadClient", "queryDownloadTask, " + paramString.getMessage());
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/cdndownloader/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */