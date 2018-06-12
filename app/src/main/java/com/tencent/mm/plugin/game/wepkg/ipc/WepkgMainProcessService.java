package com.tencent.mm.plugin.game.wepkg.ipc;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import com.tencent.mm.plugin.game.wepkg.utils.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WepkgMainProcessService
  extends Service
{
  private static ServiceConnection fDH;
  private static Map<Integer, WeakReference<WepkgMainProcessTask>> fDJ = new ConcurrentHashMap();
  private static Handler fDK = new Handler(Looper.getMainLooper())
  {
    public final void handleMessage(Message paramAnonymousMessage)
    {
      int i = paramAnonymousMessage.what;
      paramAnonymousMessage = WepkgMainProcessService.C(paramAnonymousMessage.getData());
      WepkgMainProcessTask localWepkgMainProcessTask = WepkgMainProcessService.rc(i);
      if (localWepkgMainProcessTask == null)
      {
        x.e("MicroMsg.Wepkg.WepkgMainProcessService", "receive client msg, get null task by id %s", new Object[] { Integer.valueOf(i) });
        return;
      }
      WepkgMainProcessService.b(paramAnonymousMessage, localWepkgMainProcessTask);
      localWepkgMainProcessTask.aaj();
    }
  };
  private static Messenger fDL = new Messenger(fDK);
  private static a keI;
  private static final LinkedList<Message> keJ = new LinkedList();
  private final Messenger fDE = new Messenger(this.mHandler);
  private final a.a keH = new a.a()
  {
    public final void o(Message paramAnonymousMessage)
    {
      WepkgMainProcessService.a(WepkgMainProcessService.this).send(paramAnonymousMessage);
    }
    
    public final void t(Bundle paramAnonymousBundle)
    {
      WepkgMainProcessService.C(paramAnonymousBundle).aai();
    }
  };
  private final Handler mHandler = new WepkgMainProcessService.1(this, d.Em().lnJ.getLooper());
  
  private static WepkgMainProcessTask B(Bundle paramBundle)
  {
    paramBundle.setClassLoader(WepkgMainProcessTask.class.getClassLoader());
    return (WepkgMainProcessTask)paramBundle.getParcelable("task_object");
  }
  
  public static void a(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    fDJ.put(Integer.valueOf(paramWepkgMainProcessTask.hashCode()), new WeakReference(paramWepkgMainProcessTask));
    Message localMessage = Message.obtain();
    localMessage.what = paramWepkgMainProcessTask.hashCode();
    localMessage.replyTo = fDL;
    localMessage.setData(c(paramWepkgMainProcessTask));
    p(localMessage);
  }
  
  private static void a(WepkgMainProcessTask paramWepkgMainProcessTask1, WepkgMainProcessTask paramWepkgMainProcessTask2)
  {
    Parcel localParcel = Parcel.obtain();
    paramWepkgMainProcessTask1.writeToParcel(localParcel, 0);
    localParcel.setDataPosition(0);
    paramWepkgMainProcessTask2.g(localParcel);
    localParcel.recycle();
  }
  
  private static void ahr()
  {
    if (fDH == null) {
      fDH = new ServiceConnection()
      {
        public final void onServiceConnected(ComponentName paramAnonymousComponentName, IBinder paramAnonymousIBinder)
        {
          WepkgMainProcessService.a(a.a.S(paramAnonymousIBinder));
          WepkgMainProcessService.aSp();
          x.i("MicroMsg.Wepkg.WepkgMainProcessService", "onServiceConnected(%s)", new Object[] { ad.getProcessName() });
        }
        
        public final void onServiceDisconnected(ComponentName paramAnonymousComponentName)
        {
          WepkgMainProcessService.a(null);
          WepkgMainProcessService.aSq();
          x.i("MicroMsg.Wepkg.WepkgMainProcessService", "onServiceDisconnected(%s)", new Object[] { ad.getProcessName() });
        }
      };
    }
    x.i("MicroMsg.Wepkg.WepkgMainProcessService", "tryBindService");
    Context localContext = ad.getContext();
    localContext.bindService(new Intent(localContext, WepkgMainProcessService.class), fDH, 1);
  }
  
  public static boolean ajG()
  {
    return keI != null;
  }
  
  public static boolean b(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    Bundle localBundle = c(paramWepkgMainProcessTask);
    if (q(localBundle))
    {
      a(B(localBundle), paramWepkgMainProcessTask);
      paramWepkgMainProcessTask.aaj();
      return true;
    }
    return false;
  }
  
  static Bundle c(WepkgMainProcessTask paramWepkgMainProcessTask)
  {
    Bundle localBundle = new Bundle(1);
    localBundle.putParcelable("task_object", paramWepkgMainProcessTask);
    return localBundle;
  }
  
  private static void p(Message paramMessage)
  {
    paramMessage.replyTo = fDL;
    if (keI == null)
    {
      ahr();
      synchronized (keJ)
      {
        keJ.add(paramMessage);
        return;
      }
    }
    try
    {
      keI.o(paramMessage);
      return;
    }
    catch (Exception paramMessage)
    {
      x.e("MicroMsg.Wepkg.WepkgMainProcessService", paramMessage.getMessage());
    }
  }
  
  private static boolean q(Bundle paramBundle)
  {
    try
    {
      keI.t(paramBundle);
      return true;
    }
    catch (Exception paramBundle)
    {
      x.e("MicroMsg.Wepkg.WepkgMainProcessService", paramBundle.getMessage());
    }
    return false;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return this.keH;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/ipc/WepkgMainProcessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */