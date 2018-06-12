package com.tencent.mm.plugin.game.gamewebview.ipc;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class GameWebViewMainProcessService
  extends Service
{
  private static ServiceConnection fDH;
  private static final LinkedList<Parcel> fDI = new LinkedList();
  private static Map<String, WeakReference<GWMainProcessTask>> fDJ = new ConcurrentHashMap();
  private static Handler fDK = new GameWebViewMainProcessService.3();
  private static Messenger fDL = new Messenger(fDK);
  private static b jGm;
  private static Set<Object> jGn = new HashSet();
  private final Messenger fDE = new Messenger(this.mHandler);
  private com.tencent.mm.plugin.game.gamewebview.model.d jGj;
  private com.tencent.mm.plugin.game.gamewebview.model.e jGk;
  private final b.a jGl = new GameWebViewMainProcessService.2(this);
  private final Handler mHandler = new GameWebViewMainProcessService.1(this, com.tencent.mm.plugin.game.gamewebview.a.d.Em().lnJ.getLooper());
  
  static Bundle a(GWMainProcessTask paramGWMainProcessTask, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle(3);
    localBundle.putParcelable("task_object", paramGWMainProcessTask);
    if (paramBoolean) {
      localBundle.putParcelable("task_client", fDL);
    }
    localBundle.putString("task_id", paramGWMainProcessTask.fEl);
    return localBundle;
  }
  
  public static void a(GWMainProcessTask paramGWMainProcessTask)
  {
    fDJ.put(paramGWMainProcessTask.fEl, new WeakReference(paramGWMainProcessTask));
    r(a(paramGWMainProcessTask, true));
  }
  
  private static void a(GWMainProcessTask paramGWMainProcessTask1, GWMainProcessTask paramGWMainProcessTask2)
  {
    Parcel localParcel = Parcel.obtain();
    paramGWMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramGWMainProcessTask2.g(localParcel);
    localParcel.recycle();
  }
  
  private static void ahr()
  {
    if (fDH == null) {
      fDH = new GameWebViewMainProcessService.4();
    }
    x.i("MicroMsg.GameWebViewMainProcessService", "tryBindService");
    Context localContext = com.tencent.mm.sdk.platformtools.ad.getContext();
    localContext.bindService(new Intent(localContext, GameWebViewMainProcessService.class), fDH, 1);
  }
  
  public static boolean b(GWMainProcessTask paramGWMainProcessTask)
  {
    boolean bool = false;
    Bundle localBundle = a(paramGWMainProcessTask, false);
    if (q(localBundle))
    {
      a(d(localBundle, false), paramGWMainProcessTask);
      paramGWMainProcessTask.aaj();
      bool = true;
    }
    return bool;
  }
  
  private static GWMainProcessTask d(Bundle paramBundle, boolean paramBoolean)
  {
    paramBundle.setClassLoader(GWMainProcessTask.class.getClassLoader());
    GWMainProcessTask localGWMainProcessTask = (GWMainProcessTask)paramBundle.getParcelable("task_object");
    if (paramBoolean) {
      localGWMainProcessTask.fEz = ((Messenger)paramBundle.getParcelable("task_client"));
    }
    localGWMainProcessTask.fEl = paramBundle.getString("task_id");
    return localGWMainProcessTask;
  }
  
  private static boolean q(Bundle paramBundle)
  {
    try
    {
      jGm.t(paramBundle);
      return true;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.GameWebViewMainProcessService", paramBundle.getMessage());
    }
    return false;
  }
  
  private static void r(Bundle paramBundle)
  {
    if (jGm == null)
    {
      ahr();
      synchronized (fDI)
      {
        LinkedList localLinkedList2 = fDI;
        Parcel localParcel = Parcel.obtain();
        paramBundle.writeToParcel(localParcel, 0);
        localLinkedList2.add(localParcel);
        return;
      }
    }
    try
    {
      jGm.s(paramBundle);
      return;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.GameWebViewMainProcessService", paramBundle.getMessage());
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.jGl;
  }
  
  public void onCreate()
  {
    x.i("MicroMsg.GameWebViewMainProcessService", "onCreate");
    super.onCreate();
    if (g.Eg().Dx())
    {
      this.jGj = new com.tencent.mm.plugin.game.gamewebview.model.d();
      com.tencent.mm.plugin.webview.modeltools.e.bUW().a(this.jGj);
    }
    this.jGk = new com.tencent.mm.plugin.game.gamewebview.model.e();
    com.tencent.mm.plugin.downloader.model.d.aCU();
    com.tencent.mm.plugin.downloader.model.b.a(this.jGk);
  }
  
  public void onDestroy()
  {
    x.i("MicroMsg.GameWebViewMainProcessService", "onDestroy");
    super.onDestroy();
    com.tencent.mm.plugin.downloader.model.d.aCU();
    com.tencent.mm.plugin.downloader.model.b.b(this.jGk);
    if (au.HX()) {
      com.tencent.mm.plugin.webview.modeltools.e.bUW().b(this.jGj);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/ipc/GameWebViewMainProcessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */