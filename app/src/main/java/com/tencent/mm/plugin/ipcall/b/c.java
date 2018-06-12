package com.tencent.mm.plugin.ipcall.b;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.format.DateFormat;
import com.tencent.mm.R.c;
import com.tencent.mm.R.l;
import com.tencent.mm.ax.b;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.voip.b.d;
import com.tencent.mm.protocal.c.akc;
import com.tencent.mm.protocal.c.bbu;
import com.tencent.mm.protocal.c.byx;
import com.tencent.mm.protocal.c.byy;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public final class c
{
  private static int Fw(String paramString)
  {
    try
    {
      byte[] arrayOfByte = InetAddress.getByName(paramString).getAddress();
      if (arrayOfByte != null)
      {
        int i = 0;
        int j = 0;
        while (i < arrayOfByte.length)
        {
          j = j << 8 | arrayOfByte[i] & 0xFF;
          i += 1;
        }
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.IPCallUtil", "ipAddressStrToInt, ip: %s, result: %d", new Object[] { paramString, Integer.valueOf(j) });
        return j;
      }
    }
    catch (UnknownHostException paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.IPCallUtil", paramString, "", new Object[0]);
    }
    return 0;
  }
  
  public static String Fx(String paramString)
  {
    return paramString.replace("-", "").replace(" ", "").replace("(", "").replace(")", "").trim();
  }
  
  public static byy V(LinkedList<bbu> paramLinkedList)
  {
    if ((paramLinkedList == null) || (paramLinkedList.size() <= 0)) {
      return null;
    }
    byy localbyy = new byy();
    localbyy.suW = paramLinkedList.size();
    localbyy.suX = new LinkedList();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      bbu localbbu = (bbu)paramLinkedList.next();
      byx localbyx = new byx();
      localbyx.spR = Fw(localbbu.rTO);
      localbyx.sed = localbbu.sed;
      localbyy.suX.add(localbyx);
    }
    return localbyy;
  }
  
  public static String aA(Context paramContext, String paramString)
  {
    int j = 0;
    String[] arrayOfString = paramContext.getResources().getStringArray(R.c.time_month);
    paramContext = new ArrayList();
    paramContext.add("");
    int i = 0;
    while (i < arrayOfString.length)
    {
      paramContext.add(arrayOfString[i]);
      i += 1;
    }
    try
    {
      i = bi.getInt(paramString, 0);
      if (i >= paramContext.size()) {
        return "";
      }
      return (String)paramContext.get(i);
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        i = j;
      }
    }
  }
  
  public static int aYA()
  {
    Context localContext = ad.getContext();
    if (ao.is2G(localContext)) {
      return 1;
    }
    if (ao.is3G(localContext)) {
      return 3;
    }
    if (ao.is4G(localContext)) {
      return 5;
    }
    if (ao.isWifi(localContext)) {
      return 4;
    }
    return 0;
  }
  
  public static String aYB()
  {
    String str = ad.getContext().getSharedPreferences("IPCall_LastInputPref", 0).getString("IPCall_LastInputCountryCode", "");
    if (!bi.oW(str)) {
      return str.replace("+", "");
    }
    return a.aYy();
  }
  
  public static boolean aYC()
  {
    boolean bool = false;
    if (com.tencent.mm.k.g.AT().getInt("WCOClosePurchaseEntranceSwitch", 0) != 0) {
      bool = true;
    }
    return bool;
  }
  
  public static akc aYD()
  {
    au.HU();
    Object localObject = com.tencent.mm.model.c.DT().get(aa.a.sSg, null);
    if (localObject != null)
    {
      akc localakc = new akc();
      localObject = bi.WP(localObject.toString());
      try
      {
        localakc.aG((byte[])localObject);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallUtil", "[royle]parse success,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,Balance:%s,PVWording:%s,PackageMsg:%s", new Object[] { localakc.rMH, localakc.ksB, localakc.bHD, localakc.jOS, localakc.rMI, localakc.rMJ, localakc.rMK, localakc.rML, localakc.rMS });
        return localakc;
      }
      catch (IOException localIOException)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.IPCallUtil", "[royle]parse exception:%s", new Object[] { localIOException.getMessage() });
      }
    }
    return null;
  }
  
  public static void c(MMActivity paramMMActivity, String paramString)
  {
    ((ClipboardManager)paramMMActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, paramString));
  }
  
  public static boolean dK(Context paramContext)
  {
    int i;
    if (d.bLT()) {
      i = R.l.in_voip_tip;
    }
    for (;;)
    {
      if (i == 0)
      {
        return true;
        if (d.bLU())
        {
          i = R.l.in_voip_cs_tip;
        }
        else if (com.tencent.mm.ax.e.SA())
        {
          i = R.l.in_share_location_tip;
        }
        else if (com.tencent.mm.p.a.BQ())
        {
          i = R.l.in_multitalk_tip;
        }
        else
        {
          if ((com.tencent.mm.ax.g.elf != null) && (com.tencent.mm.ax.g.elf.Sm())) {}
          for (i = 1;; i = 0)
          {
            if (i == 0) {
              break label101;
            }
            i = R.l.in_share_location_tip;
            break;
          }
        }
      }
      else
      {
        h.i(paramContext, i, R.l.app_tip);
        return false;
        label101:
        i = 0;
      }
    }
  }
  
  public static String dR(long paramLong)
  {
    int j = 1;
    Context localContext = ad.getContext();
    if (dS(paramLong) == 0L) {}
    for (int i = 1; i != 0; i = 0) {
      return new SimpleDateFormat("HH:mm", Locale.US).format(new Date(paramLong));
    }
    if (dS(paramLong) == -1L) {}
    for (i = j; i != 0; i = 0) {
      return localContext.getString(R.l.ip_call_call_time_yesterday_format);
    }
    return new SimpleDateFormat("MM/dd", Locale.US).format(new Date(paramLong));
  }
  
  private static long dS(long paramLong)
  {
    Calendar localCalendar = Calendar.getInstance();
    long l1 = localCalendar.getTimeInMillis();
    localCalendar.add(6, 1);
    l1 = localCalendar.getTimeInMillis() - l1;
    long l2 = Calendar.getInstance().getTimeInMillis();
    return paramLong / l1 - l2 / l1;
  }
  
  public static String dT(long paramLong)
  {
    Context localContext = ad.getContext();
    if (paramLong <= 60.0D) {
      return localContext.getString(R.l.ip_call_duration_second, new Object[] { String.valueOf(paramLong) });
    }
    double d = paramLong / 60.0D;
    int j = (int)(paramLong / 60.0D);
    int i = j;
    if (d - j > 0.0D) {
      i = j + 1;
    }
    return localContext.getString(R.l.ip_call_duration, new Object[] { String.valueOf(i) });
  }
  
  public static CharSequence h(Context paramContext, long paramLong)
  {
    return DateFormat.format(paramContext.getString(R.l.fmt_normal_time_24), paramLong);
  }
  
  public static String rL(int paramInt)
  {
    Context localContext = ad.getContext();
    switch (paramInt)
    {
    case 3: 
    case 4: 
    case 5: 
    default: 
      return localContext.getString(R.l.ip_call_status_cancel);
    case 1: 
      return localContext.getString(R.l.ip_call_status_cancel);
    case 2: 
      return localContext.getString(R.l.ip_call_status_cancel);
    case 6: 
      return localContext.getString(R.l.ip_call_status_call_failed);
    }
    return localContext.getString(R.l.ip_call_status_call_invalid_number);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */