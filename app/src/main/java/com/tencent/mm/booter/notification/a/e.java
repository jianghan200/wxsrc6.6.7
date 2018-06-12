package com.tencent.mm.booter.notification.a;

import android.content.Context;
import android.media.AudioManager;
import android.text.format.Time;
import com.tencent.mm.g.a.su;
import com.tencent.mm.g.a.su.b;
import com.tencent.mm.k.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.HashSet;
import java.util.Set;

public final class e
{
  private static final Set<String> cZg;
  public boolean cZh;
  
  static
  {
    HashSet localHashSet = new HashSet();
    cZg = localHashSet;
    localHashSet.add("readerapp");
    cZg.add("blogapp");
    cZg.add("newsapp");
  }
  
  public static boolean a(String paramString, bd parambd)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((f.fr(paramString)) && (!f.e(parambd)))
    {
      bool1 = true;
      if (bool1) {
        break label47;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.Notification.Silent.Handle", "check is NOT Must Mute: %B", new Object[] { Boolean.valueOf(bool2) });
      return bool1;
      bool1 = false;
      break;
      label47:
      bool2 = false;
    }
  }
  
  public static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (boolean bool = true;; bool = false)
    {
      paramArrayOfBoolean[0] &= paramBoolean;
      paramArrayOfBoolean[1] &= paramBoolean;
      return bool;
    }
  }
  
  public static boolean a(boolean[] paramArrayOfBoolean, boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((!paramBoolean1) && (!paramBoolean2)) {}
    for (boolean bool = true;; bool = false)
    {
      paramArrayOfBoolean[0] &= paramBoolean1;
      paramArrayOfBoolean[1] &= paramBoolean2;
      return bool;
    }
  }
  
  public static boolean eO(String paramString)
  {
    if (af.Wr("keep_chatting_silent" + paramString))
    {
      x.i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: FALSE");
      return true;
    }
    x.i("MicroMsg.Notification.Silent.Handle", "check is Sound NOT Lock: TRUE");
    return false;
  }
  
  public static boolean eP(String paramString)
  {
    boolean bool1 = true;
    boolean bool2 = cZg.contains(paramString);
    if (!bool2) {}
    for (;;)
    {
      x.i("MicroMsg.Notification.Silent.Handle", "check is NOT Siler User: %B", new Object[] { Boolean.valueOf(bool1) });
      return bool2;
      bool1 = false;
    }
  }
  
  public static boolean fx(int paramInt)
  {
    if ((paramInt & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Sound: %B", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static boolean fy(int paramInt)
  {
    if ((paramInt & 0x2) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.Notification.Silent.Handle", "check is Service Request Shake: %B", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
  }
  
  public static boolean o(int paramInt, String paramString)
  {
    boolean bool;
    if (f.fW(paramInt)) {
      if (f.fm(paramString)) {
        bool = f.AR();
      }
    }
    for (;;)
    {
      x.i("MicroMsg.Notification.Silent.Handle", "check is Voip Need Sound: %B", new Object[] { Boolean.valueOf(bool) });
      return bool;
      if (f.fn(paramString)) {
        bool = f.AS();
      } else {
        bool = true;
      }
    }
  }
  
  public static boolean yg()
  {
    Time localTime = new Time();
    localTime.setToNow();
    if (!com.tencent.mm.k.a.aQ(localTime.hour, localTime.minute))
    {
      x.w("MicroMsg.Notification.Silent.Handle", "no shake & sound notification during background deactive time");
      return true;
    }
    return false;
  }
  
  public static boolean yh()
  {
    boolean bool = f.Am();
    x.i("MicroMsg.Notification.Silent.Handle", "check is Sound Mode: %B", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public static boolean yi()
  {
    boolean bool2 = true;
    try
    {
      su localsu = new su();
      localsu.cdE.bOh = 2;
      com.tencent.mm.sdk.b.a.sFg.m(localsu);
      bool1 = localsu.cdF.cdG;
      if (!bool1)
      {
        x.d("MicroMsg.Notification.Silent.Handle", "check is Voip NOT Calling: %B", new Object[] { Boolean.valueOf(bool2) });
        return bool1;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Notification.Silent.Handle", localException, "", new Object[0]);
        boolean bool1 = false;
        continue;
        bool2 = false;
      }
    }
  }
  
  public static boolean yj()
  {
    boolean bool = f.Ao();
    int i = yk();
    if (i == 0) {
      bool = false;
    }
    x.i("MicroMsg.Notification.Silent.Handle", "check is Shake Mode: %B, System AudioManager Mode: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
    return bool;
  }
  
  public static int yk()
  {
    return ((AudioManager)ad.getContext().getSystemService("audio")).getRingerMode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/notification/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */