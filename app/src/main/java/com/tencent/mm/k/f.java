package com.tencent.mm.k;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.su.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import java.util.List;

public final class f
  extends a
{
  private static String TAG = "MicroMsg.NotificationConfig";
  
  public static boolean AL()
  {
    return com.tencent.mm.kernel.a.gI(com.tencent.mm.kernel.a.Du());
  }
  
  public static boolean AM()
  {
    return q.gT(com.tencent.mm.kernel.a.Dv().getInt("notification.status.webonline.push.open", 0));
  }
  
  public static void AN()
  {
    SharedPreferences localSharedPreferences = ad.chZ();
    SharedPreferences.Editor localEditor = com.tencent.mm.kernel.a.Dv().edit();
    boolean bool1 = localSharedPreferences.getBoolean("settings_new_msg_notification", true);
    localEditor.putBoolean("settings_new_msg_notification", bool1);
    localEditor.putBoolean("settings_new_voip_msg_notification", localSharedPreferences.getBoolean("settings_new_voip_msg_notification", true));
    boolean bool2 = localSharedPreferences.getBoolean("settings_show_detail", true);
    localEditor.putBoolean("settings_show_detail", bool2);
    boolean bool3 = localSharedPreferences.getBoolean("settings_sound", true);
    localEditor.putBoolean("settings_sound", bool3);
    String str = localSharedPreferences.getString("settings.ringtone", dgL);
    localEditor.putString("settings.ringtone", str);
    boolean bool4 = localSharedPreferences.getBoolean("settings_shake", true);
    localEditor.putBoolean("settings_shake", bool4);
    boolean bool5 = localSharedPreferences.getBoolean("settings_active_time_full", true);
    localEditor.putBoolean("settings_active_time_full", bool5);
    int i = localSharedPreferences.getInt("settings_active_begin_time_hour", 8);
    localEditor.putInt("settings_active_begin_time_hour", i);
    int j = localSharedPreferences.getInt("settings_active_begin_time_min", 0);
    localEditor.putInt("settings_active_begin_time_min", j);
    int k = localSharedPreferences.getInt("settings_active_end_time_hour", 23);
    localEditor.putInt("settings_active_end_time_hour", k);
    int m = localSharedPreferences.getInt("settings_active_end_time_min", 0);
    localEditor.putInt("settings_active_end_time_min", m);
    localEditor.commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "notification config copyDefault, newMsgNotification: %B, showDetail: %B, isSound: %B, ringTone: %s, isShake: %B, isActiveTime: %B, begin: %d:%d, end: %d:Td", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(bool3), str, Boolean.valueOf(bool4), Boolean.valueOf(bool5), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m) });
  }
  
  public static int AO()
  {
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.w(TAG, "getUnReadTalkerCount, but mmcore not ready");
      return 0;
    }
    return t.hY(s.dAN);
  }
  
  public static List<String> AP()
  {
    return t.hZ(s.dAN);
  }
  
  public static int AQ()
  {
    if (!g.Eg().Dx())
    {
      com.tencent.mm.sdk.platformtools.x.w(TAG, "getUnReadMsgCoun, but mmcore not ready");
      return 0;
    }
    return t.hX(s.dAN);
  }
  
  public static boolean AR()
  {
    return ((Boolean)g.Ei().DT().get(73217, Boolean.valueOf(true))).booleanValue();
  }
  
  public static boolean AS()
  {
    return ((Boolean)g.Ei().DT().get(73218, Boolean.valueOf(true))).booleanValue();
  }
  
  public static void aR(int paramInt1, int paramInt2)
  {
    SharedPreferences localSharedPreferences = ad.chZ();
    localSharedPreferences.edit().putInt("settings_active_begin_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_begin_time_min", paramInt2).commit();
    localSharedPreferences = com.tencent.mm.kernel.a.Dv();
    localSharedPreferences.edit().putInt("settings_active_begin_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_begin_time_min", paramInt2).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveActiveBegine: %d:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static void aS(int paramInt1, int paramInt2)
  {
    SharedPreferences localSharedPreferences = ad.chZ();
    localSharedPreferences.edit().putInt("settings_active_end_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_end_time_min", paramInt2).commit();
    localSharedPreferences = com.tencent.mm.kernel.a.Dv();
    localSharedPreferences.edit().putInt("settings_active_end_time_hour", paramInt1).commit();
    localSharedPreferences.edit().putInt("settings_active_end_time_min", paramInt2).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveActiveEnd: %d:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static void bg(boolean paramBoolean)
  {
    ad.chZ().edit().putBoolean("settings_new_msg_notification", paramBoolean).commit();
    com.tencent.mm.kernel.a.Dv().edit().putBoolean("settings_new_msg_notification", paramBoolean).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveNewMsgNotification: %B", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public static void bh(boolean paramBoolean)
  {
    ad.chZ().edit().putBoolean("settings_new_voip_msg_notification", paramBoolean).commit();
    com.tencent.mm.kernel.a.Dv().edit().putBoolean("settings_new_voip_msg_notification", paramBoolean).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveNewVoIPMsgNotification: %B", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public static void bi(boolean paramBoolean)
  {
    ad.chZ().edit().putBoolean("settings_show_detail", paramBoolean).commit();
    com.tencent.mm.kernel.a.Dv().edit().putBoolean("settings_show_detail", paramBoolean).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShowDetail: %B", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public static void bj(boolean paramBoolean)
  {
    com.tencent.mm.kernel.a.Dv().edit().putBoolean("command_notification_status", paramBoolean).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]is notification by system: %B", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public static void bk(boolean paramBoolean)
  {
    ad.chZ().edit().putBoolean("settings_sound", paramBoolean).commit();
    com.tencent.mm.kernel.a.Dv().edit().putBoolean("settings_sound", paramBoolean).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsSound: %B", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public static void bl(boolean paramBoolean)
  {
    ad.chZ().edit().putBoolean("settings_shake", paramBoolean).commit();
    com.tencent.mm.kernel.a.Dv().edit().putBoolean("settings_shake", paramBoolean).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsShake: %B", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public static void bm(boolean paramBoolean)
  {
    ad.chZ().edit().putBoolean("settings_active_time_full", paramBoolean).commit();
    com.tencent.mm.kernel.a.Dv().edit().putBoolean("settings_active_time_full", paramBoolean).commit();
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveIsActiveTime: %B", new Object[] { Boolean.valueOf(paramBoolean) });
  }
  
  public static boolean e(bd parambd)
  {
    if (parambd == null) {
      return false;
    }
    return parambd.YU(q.GF());
  }
  
  public static void fV(int paramInt)
  {
    com.tencent.mm.kernel.a.Dv().edit().putInt("notification.status.webonline.push.open", paramInt).commit();
  }
  
  public static boolean fW(int paramInt)
  {
    return (paramInt == 50) || (paramInt == 53);
  }
  
  public static void fj(String paramString)
  {
    a.fj(paramString);
    com.tencent.mm.sdk.platformtools.x.i(TAG, "[NOTIFICATION SETTINGS]double write : saveSoundTone: %s", new Object[] { paramString });
  }
  
  public static boolean fm(String paramString)
  {
    su localsu = new su();
    localsu.cdE.bOh = 1;
    localsu.cdE.content = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(localsu);
    return (localsu.cdF.type == 2) || (paramString.equals(bd.tby));
  }
  
  public static boolean fn(String paramString)
  {
    su localsu = new su();
    localsu.cdE.bOh = 1;
    localsu.cdE.content = paramString;
    com.tencent.mm.sdk.b.a.sFg.m(localsu);
    return (localsu.cdF.type == 3) || (paramString.equals(bd.tbx));
  }
  
  public static int fo(String paramString)
  {
    return t.M(paramString, null);
  }
  
  public static boolean fp(String paramString)
  {
    return ab.gY(paramString);
  }
  
  public static boolean fq(String paramString)
  {
    return paramString.toLowerCase().endsWith("@chatroom");
  }
  
  public static boolean fr(String paramString)
  {
    return (s.hT(paramString)) || ((s.fq(paramString)) && (!s.hS(paramString)));
  }
  
  public static int fs(String paramString)
  {
    return ((i)g.l(i.class)).FW().YF(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */