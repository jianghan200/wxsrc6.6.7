package com.tencent.mm.model;

import com.tencent.mm.k.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;

public final class as
{
  public static void ha(int paramInt)
  {
    boolean bool2 = a.Aj();
    boolean bool3 = a.Ak();
    boolean bool4 = a.Al();
    boolean bool5 = a.Am();
    boolean bool6 = a.Ao();
    boolean bool7 = a.Ap();
    int i2 = a.Aq();
    int i3 = a.As();
    int i4 = a.Ar();
    int i5 = a.At();
    g.Ek();
    boolean bool8 = ((Boolean)g.Ei().DT().get(73217, Boolean.valueOf(true))).booleanValue();
    g.Ek();
    boolean bool9 = ((Boolean)g.Ei().DT().get(73218, Boolean.valueOf(true))).booleanValue();
    boolean bool1;
    h localh;
    int i;
    label284:
    int j;
    label291:
    int k;
    label298:
    int m;
    label306:
    int n;
    label314:
    int i1;
    label322:
    String str1;
    String str2;
    if ((bool8) || (bool9))
    {
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.KvNotificationStat", "doStatNotification, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, isNotificationShowDetail: %s, isNotificationSound: %s, isNotificationShake: %s, isActiveSilentTime: %s, activeBegin: %s, activeEnd: %s, scene: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool6), Boolean.valueOf(bool7), hb(i2) + hb(i3), hb(i4) + hb(i5), Integer.valueOf(paramInt), Boolean.valueOf(bool8), Boolean.valueOf(bool9), Boolean.valueOf(bool1) });
      localh = h.mEJ;
      if (!bool2) {
        break label480;
      }
      i = 1;
      if (!bool3) {
        break label485;
      }
      j = 1;
      if (!bool4) {
        break label490;
      }
      k = 1;
      if (!bool5) {
        break label495;
      }
      m = 1;
      if (!bool6) {
        break label501;
      }
      n = 1;
      if (!bool7) {
        break label507;
      }
      i1 = 2;
      str1 = hb(i4) + hb(i5);
      str2 = hb(i2) + hb(i3);
      if (!bool1) {
        break label513;
      }
    }
    label480:
    label485:
    label490:
    label495:
    label501:
    label507:
    label513:
    for (i2 = 1;; i2 = 2)
    {
      localh.h(15308, new Object[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(i1), str1, str2, Integer.valueOf(paramInt), Integer.valueOf(i2) });
      return;
      bool1 = false;
      break;
      i = 2;
      break label284;
      j = 2;
      break label291;
      k = 2;
      break label298;
      m = 2;
      break label306;
      n = 2;
      break label314;
      i1 = 1;
      break label322;
    }
  }
  
  private static String hb(int paramInt)
  {
    if (paramInt > 10) {
      return String.valueOf(paramInt);
    }
    return "0" + paramInt;
  }
  
  public static void j(boolean paramBoolean1, boolean paramBoolean2)
  {
    int j = 2;
    boolean bool2 = a.Aj();
    boolean bool3 = a.Ak();
    g.Ek();
    boolean bool4 = ((Boolean)g.Ei().DT().get(73217, Boolean.valueOf(true))).booleanValue();
    g.Ek();
    boolean bool5 = ((Boolean)g.Ei().DT().get(73218, Boolean.valueOf(true))).booleanValue();
    boolean bool1;
    h localh;
    int k;
    label159:
    int m;
    label167:
    int n;
    label175:
    int i;
    if ((bool4) || (bool5))
    {
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.KvNotificationStat", "doStatSysNotificationAfterModify, switchNewMsg: %s, switchVoipInvite: %s, isNewMsgNotification: %s, isNewVoipMsgNotification: %s, voipSound: %s, voipAudioSound: %s, voipHasSound: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(bool4), Boolean.valueOf(bool5), Boolean.valueOf(bool1) });
      localh = h.mEJ;
      if (!bool2) {
        break label276;
      }
      k = 1;
      if (!bool3) {
        break label282;
      }
      m = 1;
      if (!bool1) {
        break label288;
      }
      n = 1;
      if (!paramBoolean1) {
        break label299;
      }
      if (!bool2) {
        break label294;
      }
      i = 2;
      label186:
      if (!paramBoolean2) {
        break label309;
      }
      if (!bool3) {
        break label304;
      }
    }
    for (;;)
    {
      localh.h(14852, new Object[] { Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(0) });
      return;
      bool1 = false;
      break;
      label276:
      k = 0;
      break label159;
      label282:
      m = 0;
      break label167;
      label288:
      n = 0;
      break label175;
      label294:
      i = 1;
      break label186;
      label299:
      i = 0;
      break label186;
      label304:
      j = 1;
      continue;
      label309:
      j = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/model/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */