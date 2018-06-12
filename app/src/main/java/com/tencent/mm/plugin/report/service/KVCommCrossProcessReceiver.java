package com.tencent.mm.plugin.report.service;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.Process;
import com.tencent.mars.BaseEvent;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public class KVCommCrossProcessReceiver
  extends BroadcastReceiver
{
  private static String className;
  private static Object lock = new Object();
  private static ag mEe;
  private static int mEf;
  private static volatile long mEg;
  private static volatile int mEh;
  private static BroadCastData mEi;
  
  static
  {
    HandlerThread localHandlerThread = e.Xs("kv_report");
    localHandlerThread.start();
    mEe = new ag(localHandlerThread.getLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        super.handleMessage(paramAnonymousMessage);
        if (paramAnonymousMessage.what == 1) {
          KVCommCrossProcessReceiver.vg();
        }
      }
    };
    className = "";
    mEf = 10000;
    mEg = 10000L;
    mEh = -1;
    mEi = new BroadCastData();
  }
  
  public static void K(ArrayList<IDKey> paramArrayList)
  {
    x.d("MicroMsg.ReportManagerKvCheck", "receive group id size:%d, isImportant:%b", new Object[] { Integer.valueOf(paramArrayList.size()), Boolean.valueOf(false) });
    do
    {
      synchronized (lock)
      {
        BroadCastData localBroadCastData = mEi;
        paramArrayList = new GroupIDKeyDataInfo(paramArrayList);
        localBroadCastData.mDX.add(paramArrayList);
        if ((mEg == 0L) || (brN()))
        {
          brM();
          return;
        }
      }
    } while (mEe.hasMessages(1));
    mEe.sendEmptyMessageDelayed(1, mEg);
  }
  
  public static void a(KVReportDataInfo paramKVReportDataInfo)
  {
    x.d("MicroMsg.ReportManagerKvCheck", "receive kv logid:%d, isImportant: %b,isReportNow: %b", new Object[] { Long.valueOf(paramKVReportDataInfo.mEv), Boolean.valueOf(paramKVReportDataInfo.mDZ), Boolean.valueOf(paramKVReportDataInfo.mEw) });
    do
    {
      synchronized (lock)
      {
        mEi.mDV.add(paramKVReportDataInfo);
        if (mEg == 0L)
        {
          brM();
          return;
        }
      }
    } while (mEe.hasMessages(1));
    mEe.sendEmptyMessageDelayed(1, mEg);
  }
  
  public static void a(StIDKeyDataInfo paramStIDKeyDataInfo)
  {
    x.d("MicroMsg.ReportManagerKvCheck", "receive id ID:%d, key:%d,value:%d, isImportant:%b", new Object[] { Long.valueOf(paramStIDKeyDataInfo.mFa), Long.valueOf(paramStIDKeyDataInfo.key), Long.valueOf(paramStIDKeyDataInfo.value), Boolean.valueOf(paramStIDKeyDataInfo.mDZ) });
    do
    {
      synchronized (lock)
      {
        mEi.mDW.add(paramStIDKeyDataInfo);
        if ((mEg == 0L) || (brN()))
        {
          brM();
          return;
        }
      }
    } while (mEe.hasMessages(1));
    mEe.sendEmptyMessageDelayed(1, mEg);
  }
  
  public static void brK()
  {
    if (100L < 0L) {
      return;
    }
    mEg = 100L;
  }
  
  public static void brL()
  {
    mEh = 1000;
  }
  
  private static void brM()
  {
    Object localObject5;
    Object localObject6;
    synchronized (lock)
    {
      Object localObject2 = new BroadCastData(mEi);
      localObject5 = mEi;
      ((BroadCastData)localObject5).mDV.clear();
      ((BroadCastData)localObject5).mDW.clear();
      ((BroadCastData)localObject5).mDX.clear();
      localObject6 = ((BroadCastData)localObject2).mDX;
      localObject5 = ((BroadCastData)localObject2).mDW;
      ??? = ((BroadCastData)localObject2).mDV;
      if ((!k.bB(ad.getContext())) && (ad.cig())) {
        break label221;
      }
      x.i("MicroMsg.ReportManagerKvCheck", "sendKVBroadcast shut_down_weixin, no need to notify worker");
      localObject2 = ((ArrayList)localObject6).iterator();
      if (((Iterator)localObject2).hasNext())
      {
        localObject6 = (GroupIDKeyDataInfo)((Iterator)localObject2).next();
        f.d(((GroupIDKeyDataInfo)localObject6).mDY, ((GroupIDKeyDataInfo)localObject6).mDZ);
      }
    }
    Object localObject4 = ((ArrayList)localObject5).iterator();
    while (((Iterator)localObject4).hasNext())
    {
      localObject5 = (StIDKeyDataInfo)((Iterator)localObject4).next();
      f.d((int)((StIDKeyDataInfo)localObject5).mFa, (int)((StIDKeyDataInfo)localObject5).key, (int)((StIDKeyDataInfo)localObject5).value, ((StIDKeyDataInfo)localObject5).mDZ);
    }
    ??? = ((ArrayList)???).iterator();
    label221:
    Intent localIntent;
    while (((Iterator)???).hasNext())
    {
      localObject4 = (KVReportDataInfo)((Iterator)???).next();
      f.b((int)((KVReportDataInfo)localObject4).mEv, ((KVReportDataInfo)localObject4).value, ((KVReportDataInfo)localObject4).mEw, ((KVReportDataInfo)localObject4).mDZ);
      continue;
      localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver");
      localIntent.setComponent(new ComponentName(ad.getPackageName(), getClassName()));
      localIntent.putExtra("type", 1);
      Bundle localBundle = new Bundle();
      localBundle.putParcelable("BUNDLE_IDKEYGROUP", (Parcelable)localObject4);
      localIntent.putExtra("INTENT_IDKEYGROUP", localBundle);
      x.d("MicroMsg.ReportManagerKvCheck", "try sendBroadcast kvdata lenght: %d, idkey data lenght:%d,group lenght:%d", new Object[] { Integer.valueOf(((ArrayList)???).size()), Integer.valueOf(((ArrayList)localObject5).size()), Integer.valueOf(((ArrayList)localObject6).size()) });
    }
    try
    {
      ad.getContext().sendBroadcast(localIntent);
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.ReportManagerKvCheck", localException, "sendBroadcastMessageDirectly", new Object[0]);
    }
  }
  
  private static boolean brN()
  {
    if (mEh <= 0) {}
    for (;;)
    {
      return false;
      if (mEi != null) {
        try
        {
          int i = mEi.mDW.size();
          int j = mEi.mDX.size();
          int k = mEi.mDV.size();
          int m = mEh;
          if (i + j + k >= m) {
            return true;
          }
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.ReportManagerKvCheck", "checkExceedCacheItemCountLimit e = %s", new Object[] { localException });
        }
      }
    }
    return false;
  }
  
  public static void brO()
  {
    if ((k.bB(ad.getContext())) || (!ad.cig()))
    {
      x.w("MicroMsg.ReportManagerKvCheck", "sendOnCrashOrExceptionBroadCast shut_down_weixin, NO MM Process , return.");
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver");
    localIntent.setComponent(new ComponentName(ad.getPackageName(), getClassName()));
    localIntent.putExtra("type", 2);
    ad.getContext().sendBroadcast(localIntent);
  }
  
  public static void brP()
  {
    if (mEe == null) {
      return;
    }
    mEe.removeMessages(1);
    mEe.handleMessage(mEe.obtainMessage(1));
  }
  
  private static String getClassName()
  {
    if (bi.oW(className)) {
      className = ad.getPackageName() + ".plugin.report.service.KVCommCrossProcessReceiver";
    }
    return className;
  }
  
  public void onReceive(Context paramContext, final Intent paramIntent)
  {
    if (paramIntent == null)
    {
      x.e("MicroMsg.ReportManagerKvCheck", "onReceive intent == null");
      return;
    }
    mEe.post(new Runnable()
    {
      public final void run()
      {
        x.i("MicroMsg.ReportManagerKvCheck", "summeranrt true report runnable run tid:%d", new Object[] { Long.valueOf(Thread.currentThread().getId()) });
        KVCommCrossProcessReceiver.a(KVCommCrossProcessReceiver.this, paramIntent);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/report/service/KVCommCrossProcessReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */