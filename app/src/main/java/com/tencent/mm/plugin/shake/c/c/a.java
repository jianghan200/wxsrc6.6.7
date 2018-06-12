package com.tencent.mm.plugin.shake.c.c;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public final class a
{
  private static SimpleDateFormat hIH = null;
  
  private static boolean buS()
  {
    au.HU();
    int i = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sOB, Integer.valueOf(0))).intValue();
    au.HU();
    int j = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sOC, Integer.valueOf(0))).intValue();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time : " + i + " end time : " + j);
    if (i <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is " + i + " , invalid");
      return false;
    }
    if (j <= 0)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil end time  is " + j + " , invalid");
      return false;
    }
    if (i >= j)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil begin time is >= end time, invalid time");
      return false;
    }
    int k = (int)(System.currentTimeMillis() / 1000L);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time : " + k);
    if ((k >= i) && (k <= j))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is incled in [btime, etime]");
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", "ShakeCardUtil current time is not incled in [btime, etime]");
    return false;
  }
  
  public static int buT()
  {
    au.HU();
    return ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sOH, Integer.valueOf(0))).intValue();
  }
  
  public static String buU()
  {
    au.HU();
    return (String)com.tencent.mm.model.c.DT().get(aa.a.sOG, "");
  }
  
  public static String buV()
  {
    au.HU();
    return (String)com.tencent.mm.model.c.DT().get(aa.a.sOD, "");
  }
  
  public static String buW()
  {
    au.HU();
    return (String)com.tencent.mm.model.c.DT().get(aa.a.sOJ, "");
  }
  
  public static String buX()
  {
    au.HU();
    return (String)com.tencent.mm.model.c.DT().get(aa.a.sOI, "");
  }
  
  public static String buY()
  {
    au.HU();
    return (String)com.tencent.mm.model.c.DT().get(aa.a.sOM, "");
  }
  
  public static String buZ()
  {
    au.HU();
    return (String)com.tencent.mm.model.c.DT().get(aa.a.sOL, "");
  }
  
  public static void buw()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance()");
    if (!bux())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is not open");
      if (buS())
      {
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sOA, Boolean.valueOf(true));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() open shake card entrance");
      }
    }
    do
    {
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time");
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() entrance is open");
    } while (buS());
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "checkShakeCardEntrance() card entrance is not in open time, close card entrance");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOA, Boolean.valueOf(false));
  }
  
  public static boolean bux()
  {
    if (!au.HX())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", "acc is not ready");
      return false;
    }
    au.HU();
    Object localObject = com.tencent.mm.model.c.DT().get(aa.a.sOA, Boolean.valueOf(false));
    if (localObject != null) {}
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false) {
      return bool;
    }
  }
  
  public static void buy()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil setShakeCardEntranceData()");
    int i = (int)(System.currentTimeMillis() / 1000L);
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOB, Integer.valueOf(i));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOC, Integer.valueOf(86400 + i));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOD, "");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOH, Integer.valueOf(0));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOE, Integer.valueOf(1));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOF, Integer.valueOf(6));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOG, "");
    com.tencent.mm.s.c.Cp().v(262154, true);
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOI, String.valueOf(i));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOJ, "hello");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOK, "shake card");
  }
  
  public static void buz()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil clearShakeCardEntranceData()");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOB, Integer.valueOf(0));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOC, Integer.valueOf(0));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOD, "");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOH, Integer.valueOf(0));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOE, Integer.valueOf(0));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOF, Integer.valueOf(0));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOG, "");
    com.tencent.mm.s.c.Cp().v(262154, false);
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOI, "");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOJ, "");
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sOK, "");
  }
  
  public static int bva()
  {
    au.HU();
    int i = com.tencent.mm.model.c.Df();
    int j = (int)(System.currentTimeMillis() % 10L);
    i = (new Random(i).nextInt(10) + j) % 10;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "genShakeCardFrequencyLevel retRand:" + i);
    return i;
  }
  
  public static boolean bvb()
  {
    return (bux()) && (w.chL());
  }
  
  public static String bx(long paramLong)
  {
    paramLong = 1000L * paramLong;
    new GregorianCalendar().setTimeInMillis(paramLong);
    if (hIH == null) {
      hIH = new SimpleDateFormat("yyyy.MM.dd");
    }
    return hIH.format(new Date(paramLong));
  }
  
  public static void s(Context paramContext, String paramString1, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil doCardDetailUI()");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_card_id", paramString1);
    localIntent.putExtra("key_card_ext", paramString2);
    localIntent.putExtra("key_from_scene", 15);
    d.b(paramContext, "card", ".ui.CardDetailUI", localIntent);
  }
  
  public static boolean vV(int paramInt)
  {
    return (paramInt >= 0) && (paramInt <= 5);
  }
  
  public static int vW(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      return 0;
    case 1: 
      return 10;
    case 2: 
      return 30;
    case 3: 
      return 60;
    case 4: 
      return 120;
    }
    return 240;
  }
  
  public static int vX(int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
    default: 
      return 10;
    case 1: 
      return 20;
    case 2: 
      return 30;
    case 3: 
      return 60;
    case 4: 
      return 90;
    case 5: 
      return 120;
    case 6: 
      return 150;
    case 7: 
      return 180;
    case 8: 
      return 240;
    }
    return 300;
  }
  
  public static int xV(String paramString)
  {
    int i = Color.rgb(66, 66, 66);
    if ((paramString == null) || (paramString.length() < 7) || (!paramString.startsWith("#")))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", "string format error");
      return i;
    }
    try
    {
      paramString = paramString.substring(1).toUpperCase();
      int j = Color.argb(255, Integer.parseInt(paramString.substring(0, 2), 16), Integer.parseInt(paramString.substring(2, 4), 16), Integer.parseInt(paramString.substring(4, 6), 16));
      return j;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShakeCardUtil", paramString.toString());
    }
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/shake/c/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */