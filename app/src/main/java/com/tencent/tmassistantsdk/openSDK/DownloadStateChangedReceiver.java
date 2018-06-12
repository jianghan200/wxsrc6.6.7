package com.tencent.tmassistantsdk.openSDK;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;

public class DownloadStateChangedReceiver
  extends BroadcastReceiver
{
  private static final String TAG = "DownloadStateChangedReceiver";
  protected static DownloadStateChangedReceiver mInstance = null;
  protected ag handler = null;
  protected HandlerThread handlerThread = new HandlerThread("downloadStateChangedThread");
  protected boolean isRegisted = false;
  ArrayList<IDownloadStateChangedListener> mListeners = new ArrayList();
  
  public DownloadStateChangedReceiver()
  {
    this.handlerThread.start();
    this.handler = new ag(this.handlerThread.getLooper());
  }
  
  public static DownloadStateChangedReceiver getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new DownloadStateChangedReceiver();
      }
      DownloadStateChangedReceiver localDownloadStateChangedReceiver = mInstance;
      return localDownloadStateChangedReceiver;
    }
    finally {}
  }
  
  public void addDownloadStateChangedListener(IDownloadStateChangedListener paramIDownloadStateChangedListener)
  {
    if ((paramIDownloadStateChangedListener != null) && (!this.mListeners.contains(paramIDownloadStateChangedListener))) {
      this.mListeners.add(paramIDownloadStateChangedListener);
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.handler != null) {
      this.handler.post(new DownloadStateChangedReceiver.1(this, paramIntent));
    }
  }
  
  public void registeReceiver(Context paramContext)
  {
    IntentFilter localIntentFilter;
    if (!this.isRegisted)
    {
      TMLog.i("DownloadStateChangedReceiver", "registeReceiver   context" + paramContext + "  receiver:" + this);
      localIntentFilter = new IntentFilter("com.tencent.assistantOpenSDK.downloadStateChange.action");
    }
    try
    {
      TMLog.i("DownloadStateChangedReceiver", String.valueOf(paramContext.registerReceiver(this, localIntentFilter)));
      this.isRegisted = true;
      return;
    }
    catch (Throwable paramContext)
    {
      TMLog.i("DownloadStateChangedReceiver", "registeReceiver exception!!!");
      this.isRegisted = false;
      x.printErrStackTrace("DownloadStateChangedReceiver", paramContext, "", new Object[0]);
    }
  }
  
  public void removeDownloadStateChangedListener(IDownloadStateChangedListener paramIDownloadStateChangedListener)
  {
    if (paramIDownloadStateChangedListener != null) {
      this.mListeners.remove(paramIDownloadStateChangedListener);
    }
  }
  
  public void unRegisteReceiver(Context paramContext)
  {
    if ((paramContext == null) || (mInstance == null)) {}
    while (!this.isRegisted) {
      return;
    }
    TMLog.i("DownloadStateChangedReceiver", "realy unRegisteReceiver  context:" + paramContext + "  receiver:" + this);
    try
    {
      paramContext.unregisterReceiver(this);
      this.isRegisted = false;
      return;
    }
    catch (Throwable paramContext)
    {
      TMLog.i("DownloadStateChangedReceiver", "unRegisteReceiver exception!!!");
      this.isRegisted = false;
      x.printErrStackTrace("DownloadStateChangedReceiver", paramContext, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tmassistantsdk/openSDK/DownloadStateChangedReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */