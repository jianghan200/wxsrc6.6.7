package com.tencent.xweb.util;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.d;
import com.tencent.xweb.g;
import com.tencent.xweb.g.a;
import com.tencent.xweb.q;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.xwalk.core.XWalkEnvironment;

public final class e
{
  public static String bJK = "";
  private static String vAE = "";
  private static boolean vDo = false;
  static q vDp = null;
  
  public static void a(q paramq)
  {
    vDp = paramq;
  }
  
  public static void adF(String paramString)
  {
    if (paramString != null) {
      vAE = paramString;
    }
  }
  
  public static int adG(String paramString)
  {
    if (paramString.startsWith("https://servicewechat.com/")) {
      return 0;
    }
    if ((paramString.startsWith("http://mp.weixin.qq.com/")) || (paramString.startsWith("https://mp.weixin.qq.com/")) || (paramString.startsWith("https://servicewechat.com/preload/")) || (paramString.startsWith("http://mp.weixinbridge.com/"))) {
      return 1;
    }
    return 2;
  }
  
  public static void at(int paramInt, boolean paramBoolean)
  {
    if (vDp != null)
    {
      int i = 0;
      switch (paramInt)
      {
      default: 
        paramInt = i;
      }
    }
    for (;;)
    {
      if (paramInt > 0) {
        vDp.am(paramInt);
      }
      return;
      if (paramBoolean)
      {
        paramInt = 163;
      }
      else
      {
        paramInt = 159;
        continue;
        if (paramBoolean)
        {
          paramInt = 164;
        }
        else
        {
          paramInt = 160;
          continue;
          if (paramBoolean)
          {
            paramInt = 165;
          }
          else
          {
            paramInt = 161;
            continue;
            if (paramBoolean) {
              paramInt = 166;
            } else {
              paramInt = 162;
            }
          }
        }
      }
    }
  }
  
  public static void au(int paramInt, boolean paramBoolean)
  {
    if (vDp != null)
    {
      int i = 0;
      switch (paramInt)
      {
      default: 
        paramInt = i;
      }
    }
    for (;;)
    {
      if (paramInt > 0) {
        vDp.am(paramInt);
      }
      return;
      if (paramBoolean)
      {
        paramInt = 155;
      }
      else
      {
        paramInt = 151;
        continue;
        if (paramBoolean)
        {
          paramInt = 156;
        }
        else
        {
          paramInt = 152;
          continue;
          if (paramBoolean)
          {
            paramInt = 157;
          }
          else
          {
            paramInt = 153;
            continue;
            if (paramBoolean) {
              paramInt = 158;
            } else {
              paramInt = 154;
            }
          }
        }
      }
    }
  }
  
  public static void b(String paramString, int paramInt1, long paramLong, int paramInt2)
  {
    q localq;
    int j;
    int k;
    if (vDp != null)
    {
      cII();
      vDp.am(5L);
      vDp.k(15003, "");
      localq = vDp;
      j = XWalkEnvironment.getAvailableVersion();
      k = adG(paramString);
      paramString = bJK;
      if (g.cIl() != null) {
        break label78;
      }
    }
    label78:
    for (int i = 100;; i = g.cIl().ordinal())
    {
      localq.a(j, k, paramString, i, 1, paramInt1, (int)paramLong, paramInt2);
      return;
    }
  }
  
  public static void bh(int paramInt, String paramString)
  {
    if (vDp != null) {
      vDp.k(paramInt, paramString);
    }
  }
  
  public static void c(WebView.d paramd)
  {
    if (vDp == null) {}
    label16:
    String str1;
    label23:
    String str4;
    int j;
    do
    {
      String str2;
      do
      {
        return;
        if (paramd != WebView.d.vAP) {
          break;
        }
        i = 1;
        if (i == 0) {
          break label147;
        }
        str1 = "REPORT_APK_VER_TIME";
        str4 = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String str3 = XWalkEnvironment.getSharedPreferences().getString(str1, "");
        str2 = str3;
        if (str3 == null) {
          str2 = "";
        }
      } while (str4.equals(str2));
      if (paramd != WebView.d.vAP) {
        break label167;
      }
      j = XWalkEnvironment.getAvailableVersion();
    } while (j <= 0);
    int i = 99;
    vDp.am(j % 50 + 100);
    for (;;)
    {
      vDp.am(i);
      XWalkEnvironment.getSharedPreferences().edit().putString(str1, str4).apply();
      return;
      i = 0;
      break label16;
      label147:
      str1 = "REPORT_APK_VER_TIME_" + paramd;
      break label23;
      label167:
      if (paramd == WebView.d.vAR)
      {
        i = 97;
      }
      else
      {
        if (paramd != WebView.d.vAQ) {
          break;
        }
        i = 98;
      }
    }
  }
  
  public static void cIH()
  {
    int j = 73;
    int i;
    if (vDp != null)
    {
      vDp.am(0L);
      if (!vDo)
      {
        if (!vAE.equals("tools")) {
          break label70;
        }
        i = 70;
      }
    }
    for (;;)
    {
      j = WebView.getCurWebType().ordinal() - 1;
      if ((i >= 70) && (j >= 0))
      {
        vDo = true;
        vDp.am(i + j);
      }
      return;
      label70:
      i = j;
      if (!vAE.equals("appbrand"))
      {
        i = j;
        if (!vAE.equals("support")) {
          i = -1;
        }
      }
    }
  }
  
  public static void cII()
  {
    if (vDp != null) {
      vDp.am(1L);
    }
  }
  
  public static void cIJ()
  {
    if (vDp != null) {
      vDp.am(46L);
    }
  }
  
  public static void cIK()
  {
    if (vDp != null) {
      vDp.am(47L);
    }
  }
  
  public static void cIL()
  {
    if (vDp != null) {
      vDp.am(42L);
    }
  }
  
  public static void cIM()
  {
    if (vDp != null) {
      vDp.am(43L);
    }
  }
  
  public static void cIN()
  {
    if (vDp != null) {
      vDp.am(52L);
    }
  }
  
  public static void cIO()
  {
    if (vDp != null) {
      vDp.am(53L);
    }
  }
  
  public static void cIP()
  {
    if (vDp != null) {
      vDp.am(54L);
    }
  }
  
  public static void cIQ()
  {
    if (vDp != null) {
      vDp.am(55L);
    }
  }
  
  public static void cIR()
  {
    if (vDp != null) {
      vDp.am(56L);
    }
  }
  
  public static void cIS()
  {
    if (vDp != null) {
      vDp.am(57L);
    }
  }
  
  public static void cIT()
  {
    if (vDp != null) {
      vDp.am(58L);
    }
  }
  
  public static void cIU()
  {
    if (vDp != null) {
      vDp.am(59L);
    }
  }
  
  public static void cIV()
  {
    if (vDp != null) {
      vDp.am(9L);
    }
  }
  
  public static void cIW()
  {
    if (vDp != null) {
      vDp.am(10L);
    }
  }
  
  public static void cIX()
  {
    if (vDp != null) {
      vDp.am(60L);
    }
  }
  
  public static void cIY()
  {
    if (vDp != null) {
      vDp.am(61L);
    }
  }
  
  public static void cIZ()
  {
    if (vDp != null) {
      vDp.am(20L);
    }
  }
  
  public static void cJa()
  {
    if (vDp != null) {
      vDp.am(21L);
    }
  }
  
  public static void cJb()
  {
    if (vDp != null) {
      vDp.am(25L);
    }
  }
  
  public static void cJc()
  {
    if (vDp != null) {
      vDp.am(26L);
    }
  }
  
  public static void cJd()
  {
    if (vDp != null) {
      vDp.am(14L);
    }
  }
  
  public static void cJe()
  {
    if (vDp != null) {
      vDp.am(15L);
    }
  }
  
  public static void cJf()
  {
    if (vDp == null) {
      return;
    }
    vDp.am(83L);
  }
  
  public static void cJg()
  {
    if (vDp == null) {
      return;
    }
    vDp.am(87L);
  }
  
  public static void cJh()
  {
    if (vDp == null) {
      return;
    }
    vDp.am(88L);
  }
  
  public static void d(WebView.d paramd)
  {
    if (vDp == null) {
      return;
    }
    int i;
    switch (1.vDq[paramd.ordinal()])
    {
    default: 
      return;
    case 1: 
      i = 82;
    }
    for (;;)
    {
      vDp.am(i);
      return;
      i = 81;
      continue;
      i = 80;
    }
  }
  
  public static void dH(String paramString, int paramInt)
  {
    q localq;
    int j;
    int k;
    if (vDp != null)
    {
      cIH();
      bJK = UUID.randomUUID().toString().replace("-", "");
      vDp.am(4L);
      localq = vDp;
      j = XWalkEnvironment.getAvailableVersion();
      k = adG(paramString);
      paramString = bJK;
      if (g.cIl() != null) {
        break label78;
      }
    }
    label78:
    for (int i = 100;; i = g.cIl().ordinal())
    {
      localq.a(j, k, paramString, i, 0, 0, 0, paramInt);
      return;
    }
  }
  
  public static void e(WebView.d paramd)
  {
    if (vDp == null) {
      return;
    }
    int i;
    switch (1.vDq[paramd.ordinal()])
    {
    default: 
      return;
    case 1: 
      i = 86;
    }
    for (;;)
    {
      vDp.am(i);
      return;
      i = 85;
      continue;
      i = 84;
    }
  }
  
  public static void gY(long paramLong)
  {
    if (vDp != null) {
      vDp.am(paramLong);
    }
  }
  
  public static void gZ(long paramLong)
  {
    if ((vDp != null) && (paramLong > 0L) && (paramLong < 300000L)) {
      vDp.w(2, 3, (int)paramLong);
    }
  }
  
  public static void ha(long paramLong)
  {
    if ((vDp != null) && (paramLong > 0L) && (paramLong < 300000L)) {
      vDp.w(48, 49, (int)paramLong);
    }
  }
  
  public static void hb(long paramLong)
  {
    if ((vDp != null) && (paramLong > 0L) && (paramLong < 300000L)) {
      vDp.w(44, 45, (int)paramLong);
    }
  }
  
  public static void hc(long paramLong)
  {
    if ((vDp != null) && (vDp != null) && (paramLong > 0L) && (paramLong < 600000L)) {
      vDp.w(11, 12, (int)paramLong);
    }
  }
  
  public static void hd(long paramLong)
  {
    if ((vDp != null) && (vDp != null) && (paramLong > 0L) && (paramLong < 600000L)) {
      vDp.w(22, 23, (int)paramLong);
    }
  }
  
  public static void he(long paramLong)
  {
    if ((vDp != null) && (vDp != null) && (paramLong > 0L) && (paramLong < 600000L)) {
      vDp.w(27, 28, (int)paramLong);
    }
  }
  
  public static void hf(long paramLong)
  {
    if ((vDp != null) && (vDp != null) && (paramLong > 0L) && (paramLong < 120000L)) {
      vDp.w(16, 17, (int)paramLong);
    }
  }
  
  public static void j(String paramString, long paramLong, int paramInt)
  {
    gZ(paramLong);
    q localq;
    int j;
    int k;
    if ((vDp != null) && (paramLong > 0L) && (paramLong < 300000L))
    {
      vDp.w(6, 7, (int)paramLong);
      localq = vDp;
      j = XWalkEnvironment.getAvailableVersion();
      k = adG(paramString);
      paramString = bJK;
      if (g.cIl() != null) {
        break label84;
      }
    }
    label84:
    for (int i = 100;; i = g.cIl().ordinal())
    {
      localq.a(j, k, paramString, i, 1, 0, (int)paramLong, paramInt);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/xweb/util/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */