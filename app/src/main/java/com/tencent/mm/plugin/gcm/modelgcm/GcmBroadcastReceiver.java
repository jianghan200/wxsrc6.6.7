package com.tencent.mm.plugin.gcm.modelgcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mm.g.a.gi;
import com.tencent.mm.kernel.k;
import com.tencent.mm.network.aa;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GcmBroadcastReceiver
  extends BroadcastReceiver
{
  static List<Pair<Long, Long>> khd = new LinkedList();
  private static volatile boolean khe = false;
  private static WakerLock wakerlock = null;
  
  public static void aVF()
  {
    khd.clear();
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    x.i("GcmBroadcastReceiver", "GcmBroadcastReceiver onReceive in.");
    String str1;
    String str2;
    if (paramIntent.getAction().equals("com.google.android.c2dm.intent.REGISTRATION"))
    {
      localObject1 = a.aVG();
      str1 = ((a)localObject1).aVJ();
      str2 = paramIntent.getStringExtra("registration_id");
      x.i("GcmBroadcastReceiver", "REGISTRATION intent received:" + paramIntent.toString());
      if ((paramIntent.getStringExtra("error") == null) && (paramIntent.getStringExtra("unregistered") == null) && (str2 != null) && (str1.compareTo(str2) != 0))
      {
        if (aa.UX() != null) {
          break label139;
        }
        x.w("GcmBroadcastReceiver", "gcm reg id recv, but mmpushcore not init, id = " + str2);
      }
      for (;;)
      {
        f.mDy.a(452L, 25L, 1L, false);
        return;
        label139:
        ((a)localObject1).aq(paramContext, str2);
        aa.UX().post(new GcmBroadcastReceiver.2((a)localObject1));
      }
    }
    Object localObject1 = a.aVG();
    if ((localObject1 == null) || (bi.oW(((a)localObject1).aVJ())))
    {
      boolean bool1;
      boolean bool2;
      if (localObject1 == null)
      {
        bool1 = true;
        if (localObject1 != null) {
          break label273;
        }
        bool2 = false;
        label203:
        x.i("GcmBroadcastReceiver", "Gcm push is not reg to server. reg == null[%b], isRegToSvr[%b]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        h.mEJ.k(11250, "1,2");
        paramContext = f.mDy;
        if (localObject1 != null) {
          break label283;
        }
      }
      label273:
      label283:
      for (l1 = 26L;; l1 = 27L)
      {
        paramContext.a(452L, l1, 1L, false);
        return;
        bool1 = false;
        break;
        bool2 = ((a)localObject1).aVO();
        break label203;
      }
    }
    if (((a)localObject1).aVK())
    {
      f.mDy.a(452L, 42L, 1L, false);
      if (khe)
      {
        x.i("GcmBroadcastReceiver", "Gcm push isRegistrationExpired and reNewalRegistting return");
        f.mDy.a(452L, 44L, 1L, false);
        return;
      }
      if (aa.UX() == null)
      {
        x.i("GcmBroadcastReceiver", "Gcm push isRegistrationExpired but handler is null wait for next push");
        return;
      }
      khe = true;
      aa.UX().postDelayed(new GcmBroadcastReceiver.1(this, (a)localObject1), 500L);
      return;
    }
    khe = false;
    try
    {
      if (k.bA(paramContext))
      {
        x.i("GcmBroadcastReceiver", "Logout or exit MM. no need show Notification.");
        h.mEJ.k(11250, "1,2");
        f.mDy.a(452L, 28L, 1L, false);
        return;
      }
    }
    catch (Exception paramContext)
    {
      paramIntent = paramContext.toString();
      x.e("GcmBroadcastReceiver", "GcmBroadcastReceiver error :" + paramIntent);
      x.printErrStackTrace("GcmBroadcastReceiver", paramContext, "", new Object[0]);
      f.mDy.a(452L, 36L, 1L, false);
    }
    String str9;
    String str10;
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    String str8;
    int i;
    do
    {
      for (;;)
      {
        x.i("GcmBroadcastReceiver", "GcmBroadcastReceiver onReceive out.");
        return;
        localObject2 = paramIntent.getExtras();
        com.google.android.gms.gcm.a.al(paramContext);
        str9 = com.google.android.gms.gcm.a.c(paramIntent);
        if (((Bundle)localObject2).isEmpty())
        {
          x.i("GcmBroadcastReceiver", "Intent extras is empty: ");
          h.mEJ.k(11250, "1,0");
          f.mDy.a(452L, 29L, 1L, false);
          return;
        }
        paramIntent = ((Bundle)localObject2).getString("seq");
        localObject1 = ((Bundle)localObject2).getString("uin");
        str1 = ((Bundle)localObject2).getString("cmd");
        str10 = ((Bundle)localObject2).getString("username");
        str2 = ((Bundle)localObject2).getString("time");
        str3 = ((Bundle)localObject2).getString("collapse_key");
        str4 = ((Bundle)localObject2).getString("sound");
        str5 = ((Bundle)localObject2).getString("alert");
        str6 = ((Bundle)localObject2).getString("msgType");
        str7 = ((Bundle)localObject2).getString("badge");
        str8 = ((Bundle)localObject2).getString("from");
        ((Bundle)localObject2).getString("ext");
        if ("send_error".equals(str9))
        {
          paramContext = bi.Xf(str10);
          if (str5 == null) {}
          for (i = -1;; i = str5.length())
          {
            x.i("GcmBroadcastReceiver", "Send error:. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", new Object[] { paramIntent, localObject1, str1, paramContext, str2, str3, str4, Integer.valueOf(i), str6, str7, str8 });
            h.mEJ.k(11250, "1,1");
            f.mDy.a(452L, 30L, 1L, false);
            break;
          }
        }
        if (!"deleted_messages".equals(str9)) {
          break;
        }
        x.i("GcmBroadcastReceiver", "Deleted messages on server.");
        h.mEJ.k(11250, "1,1");
        f.mDy.a(452L, 31L, 1L, false);
      }
    } while (!"gcm".equals(str9));
    f.mDy.a(452L, 32L, 1L, false);
    Object localObject2 = bi.Xf(str10);
    label882:
    label967:
    long l2;
    label977:
    long l3;
    if (str5 == null)
    {
      i = -1;
      x.i("GcmBroadcastReceiver", "Received gcm msg. seq[%s] uin[%s] cmd[%s] username[%s] time[%s] collapse_key[%s] sound[%s] alert len[%s], msgType[%s], badge[%s], from[%s]", new Object[] { paramIntent, localObject1, str1, localObject2, str2, str3, str4, Integer.valueOf(i), str6, str7, str8 });
      if (!bi.oW((String)localObject1)) {
        break label1096;
      }
      l1 = 0L;
      if (!bi.oW(paramIntent)) {
        break label1107;
      }
      l2 = 0L;
      if (!bi.oW(str1)) {
        break label1117;
      }
      l3 = 0L;
      label988:
      i = com.tencent.mm.kernel.a.Dz();
      if ((l1 != 0L) && (Integer.toHexString(i).equals(Long.toHexString(l1)))) {
        break label1128;
      }
      x.e("GcmBroadcastReceiver", "Logined user changed. no need show Notification.uin:" + l1 + ", oldUin:" + i);
      h.mEJ.k(11250, "1,3");
      paramContext = f.mDy;
      if (l1 != 0L) {
        break label1352;
      }
    }
    label1096:
    label1107:
    label1117:
    label1128:
    label1352:
    for (long l1 = 33L;; l1 = 34L)
    {
      paramContext.a(452L, l1, 1L, false);
      return;
      i = str5.length();
      break label882;
      l1 = bi.getLong((String)localObject1, 0L);
      break label967;
      l2 = bi.getLong(paramIntent, 0L);
      break label977;
      l3 = bi.getLong(str1, 0L);
      break label988;
      paramIntent = khd.iterator();
      do
      {
        if (!paramIntent.hasNext()) {
          break;
        }
        localObject1 = (Pair)paramIntent.next();
      } while ((((Long)((Pair)localObject1).first).longValue() != l3) || (((Long)((Pair)localObject1).second).longValue() != l2));
      for (i = 1;; i = 0)
      {
        if (i != 0)
        {
          x.w("GcmBroadcastReceiver", "already has this seq:" + l2);
          f.mDy.a(452L, 35L, 1L, false);
          return;
        }
        khd.add(Pair.create(Long.valueOf(l3), Long.valueOf(l2)));
        if (khd.size() > 60) {
          khd.remove(0);
        }
        if (wakerlock == null)
        {
          wakerlock = new WakerLock(paramContext, "GcmBroadcastReceiver");
          x.i("GcmBroadcastReceiver", "start new wakerlock");
        }
        wakerlock.lock(200L, "GcmBroadcastReceiver.onReceive");
        paramContext = new gi();
        paramContext.bPw.type = 13;
        com.tencent.mm.sdk.b.a.sFg.m(paramContext);
        break;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gcm/modelgcm/GcmBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */