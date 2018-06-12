package com.tencent.mm.k;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tencent.mm.network.aa;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public class a
{
  public static final String dgL = null;
  private static SharedPreferences dgM = null;
  private static SharedPreferences dgN = null;
  private static String dgO = dgL;
  
  public static SharedPreferences Ah()
  {
    SharedPreferences localSharedPreferences = aa.US();
    dgN = localSharedPreferences;
    return localSharedPreferences;
  }
  
  public static boolean Ai()
  {
    return com.tencent.mm.kernel.a.Dv().getBoolean("command_notification_status", false);
  }
  
  public static boolean Aj()
  {
    return com.tencent.mm.kernel.a.Dv().getBoolean("settings_new_msg_notification", true);
  }
  
  public static boolean Ak()
  {
    return com.tencent.mm.kernel.a.Dv().getBoolean("settings_new_voip_msg_notification", true);
  }
  
  public static boolean Al()
  {
    return com.tencent.mm.kernel.a.Dv().getBoolean("settings_show_detail", true);
  }
  
  public static boolean Am()
  {
    return com.tencent.mm.kernel.a.Dv().getBoolean("settings_sound", true);
  }
  
  public static String An()
  {
    String str2 = com.tencent.mm.kernel.a.Dv().getString("settings.ringtone", dgL);
    String str1 = str2;
    if (str2 != dgL)
    {
      str1 = str2;
      if (!str2.equals(dgO))
      {
        RingtoneManager localRingtoneManager = new RingtoneManager(ad.getContext());
        localRingtoneManager.setType(2);
        str1 = str2;
        if (localRingtoneManager.getRingtonePosition(Uri.parse(str2)) < 0)
        {
          str1 = dgL;
          fj(str1);
          x.i("MicroMsg.BaseNotificationConfig", "reset ringTone");
        }
        dgO = str1;
      }
    }
    return str1;
  }
  
  public static boolean Ao()
  {
    return com.tencent.mm.kernel.a.Dv().getBoolean("settings_shake", true);
  }
  
  public static boolean Ap()
  {
    return com.tencent.mm.kernel.a.Dv().getBoolean("settings_active_time_full", true);
  }
  
  public static int Aq()
  {
    return com.tencent.mm.kernel.a.Dv().getInt("settings_active_begin_time_hour", 8);
  }
  
  public static int Ar()
  {
    return com.tencent.mm.kernel.a.Dv().getInt("settings_active_end_time_hour", 23);
  }
  
  public static int As()
  {
    return com.tencent.mm.kernel.a.Dv().getInt("settings_active_begin_time_min", 0);
  }
  
  public static int At()
  {
    return com.tencent.mm.kernel.a.Dv().getInt("settings_active_end_time_min", 0);
  }
  
  public static boolean aQ(int paramInt1, int paramInt2)
  {
    if (Ap()) {}
    int i;
    int j;
    int k;
    int m;
    do
    {
      do
      {
        do
        {
          return true;
          i = Aq();
          j = As();
          k = Ar();
          m = At();
          if ((i == k) && (j == m)) {
            return false;
          }
          if ((i != k) || (j >= m)) {
            break;
          }
        } while ((paramInt1 == i) && (paramInt2 > j) && (paramInt2 < m));
        return false;
        if (k <= i) {
          break;
        }
      } while (((paramInt1 > i) && (paramInt1 < k)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)));
      return false;
    } while (((k >= i) && ((i != k) || (j <= m))) || ((paramInt1 > i) && (paramInt1 <= 23)) || ((paramInt1 == i) && (paramInt2 > j)) || ((paramInt1 == k) && (paramInt2 < m)) || ((paramInt1 > 0) && (paramInt1 < k)));
    return false;
  }
  
  static void fj(String paramString)
  {
    ad.chZ().edit().putString("settings.ringtone", paramString).commit();
    com.tencent.mm.kernel.a.Dv().edit().putString("settings.ringtone", paramString).commit();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/k/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */