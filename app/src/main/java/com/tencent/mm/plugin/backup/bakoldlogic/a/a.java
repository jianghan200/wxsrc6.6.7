package com.tencent.mm.plugin.backup.bakoldlogic.a;

import android.os.StatFs;
import com.tencent.mm.a.e;
import com.tencent.mm.a.g;
import com.tencent.mm.bk.b;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.pointers.PLong;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bia;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  private static List<String> gRN = null;
  
  public static String a(ey paramey, int paramInt)
  {
    return a(paramey, paramInt, null);
  }
  
  public static String a(ey paramey, int paramInt, String paramString)
  {
    if ((paramey.rfA == paramInt) && (paramey.rfy != null))
    {
      paramey = g.u(paramey.rfy.siK.lR);
      return paramey;
    }
    if ((paramey.rfx != null) && (paramey.rfw != null))
    {
      Iterator localIterator = paramey.rfx.iterator();
      int i = 0;
      for (;;)
      {
        if (!localIterator.hasNext()) {
          break label147;
        }
        if (((bia)localIterator.next()).siO == paramInt)
        {
          String str = ((bhz)paramey.rfw.get(i)).siM;
          if ((!bi.oW(paramString)) && (!str.endsWith(paramString)))
          {
            i = i + 1 + 1;
            continue;
          }
          paramey = str;
          if (e.cn(wI(str))) {
            break;
          }
          return null;
        }
        i += 1;
      }
    }
    label147:
    return null;
  }
  
  public static boolean a(long paramLong, PLong paramPLong1, PLong paramPLong2, String paramString)
  {
    Object localObject = new StatFs(h.getExternalStorageDirectory().getPath());
    long l1 = ((StatFs)localObject).getBlockSize();
    paramPLong1.value = (((StatFs)localObject).getAvailableBlocks() * l1);
    localObject = h.getDataDirectory();
    StatFs localStatFs = new StatFs(((File)localObject).getPath());
    l1 = localStatFs.getBlockCount();
    long l2 = localStatFs.getAvailableBlocks();
    paramPLong2.value = (localStatFs.getBlockSize() * localStatFs.getAvailableBlocks());
    x.i("MicroMsg.BakUtil", "checkDataFull, SDAvailSize:%d, DataAvailSize%d, dbSize:%d", new Object[] { Long.valueOf(paramPLong1.value), Long.valueOf(paramPLong2.value), Long.valueOf(paramLong) });
    if (l1 <= 0L) {
      return false;
    }
    if (l1 - l2 < 0L) {
      return false;
    }
    if ((paramPLong1.value == paramPLong2.value) || (paramString.startsWith(((File)localObject).getPath()))) {
      paramPLong1.value = 0L;
    }
    return paramLong <= paramPLong2.value;
  }
  
  public static int aR(String paramString, int paramInt)
  {
    int i = paramInt;
    if (!bi.oW(paramString)) {}
    try
    {
      i = Integer.valueOf(paramString).intValue();
      return i;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.BakUtil", paramString, "", new Object[0]);
    }
    return paramInt;
  }
  
  public static List<String> arb()
  {
    if (gRN != null) {
      return gRN;
    }
    gRN = new LinkedList();
    String[] arrayOfString = s.dAV;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str = arrayOfString[i];
      gRN.add(str);
      i += 1;
    }
    gRN.add("weixin");
    gRN.add("weibo");
    gRN.add("qqmail");
    gRN.add("fmessage");
    gRN.add("tmessage");
    gRN.add("qmessage");
    gRN.add("qqsync");
    gRN.add("floatbottle");
    gRN.add("lbsapp");
    gRN.add("shakeapp");
    gRN.add("medianote");
    gRN.add("qqfriend");
    gRN.add("readerapp");
    gRN.add("newsapp");
    gRN.add("blogapp");
    gRN.add("facebookapp");
    gRN.add("masssendapp");
    gRN.add("meishiapp");
    gRN.add("feedsapp");
    gRN.add("voipapp");
    gRN.add("officialaccounts");
    gRN.add("helper_entry");
    gRN.add("pc_share");
    gRN.add("cardpackage");
    gRN.add("voicevoipapp");
    gRN.add("voiceinputapp");
    gRN.add("linkedinplugin");
    gRN.add("appbrandcustomerservicemsg");
    return gRN;
  }
  
  public static String asK()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    au.HU();
    return c.Gq() + "backup/";
  }
  
  public static boolean b(ey paramey, int paramInt, String paramString)
  {
    if ((paramey.rfA == paramInt) && (paramey.rfy != null))
    {
      paramey = paramey.rfy.siK.lR;
      if (paramey.length > 0) {}
    }
    do
    {
      return false;
      e.b(paramString, paramey, paramey.length);
      return true;
      paramey = a(paramey, paramInt, null);
    } while (bi.oW(paramey));
    j.q(wI(paramey), paramString, false);
    return true;
  }
  
  public static byte[] b(ey paramey, int paramInt)
  {
    if ((paramey.rfA == paramInt) && (paramey.rfy != null)) {
      return paramey.rfy.siK.lR;
    }
    if ((paramey.rfx != null) && (paramey.rfw != null))
    {
      Iterator localIterator = paramey.rfx.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        if (((bia)localIterator.next()).siO == paramInt)
        {
          paramey = wI(((bhz)paramey.rfw.get(i)).siM);
          paramInt = e.cm(paramey);
          if ((paramInt == 0) || (paramInt > 1048576))
          {
            x.e("MicroMsg.BakUtil", "thumb not exist or  too big!");
            return null;
          }
          return e.f(paramey, 0, -1);
        }
        i += 1;
      }
    }
    return null;
  }
  
  public static int c(ey paramey, int paramInt)
  {
    if (paramey.rfA == paramInt) {
      if (paramey.rfy != null) {}
    }
    for (;;)
    {
      return 0;
      return paramey.rfy.siK.lR.length;
      if ((paramey.rfx != null) && (paramey.rfw != null))
      {
        Iterator localIterator = paramey.rfx.iterator();
        int i = 0;
        while (localIterator.hasNext())
        {
          if (((bia)localIterator.next()).siO == paramInt) {
            return e.cm(wI(((bhz)paramey.rfw.get(i)).siM));
          }
          i += 1;
        }
      }
    }
  }
  
  public static boolean d(ey paramey, int paramInt)
  {
    if ((paramey.rfA == paramInt) && (paramey.rfy != null)) {
      return true;
    }
    paramey = paramey.rfx.iterator();
    while (paramey.hasNext()) {
      if (((bia)paramey.next()).siO == paramInt) {
        return true;
      }
    }
    return false;
  }
  
  public static void wH(String paramString)
  {
    File localFile = new File(paramString);
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    localFile = new File(paramString + "backupItem/");
    if (!localFile.exists()) {
      localFile.mkdirs();
    }
    paramString = new File(paramString + "backupMeida/");
    if (!paramString.exists()) {
      paramString.mkdirs();
    }
  }
  
  public static String wI(String paramString)
  {
    if ((paramString == null) || (paramString.equals(""))) {
      return "";
    }
    return asK() + "backupMeida/" + wv(paramString) + paramString;
  }
  
  public static String wv(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    String str2 = g.u(paramString.getBytes());
    paramString = "";
    String str1 = "";
    if (str2.length() > 0) {
      paramString = str2.charAt(0) + "/";
    }
    if (str2.length() >= 2) {
      str1 = str2.charAt(1) + "/";
    }
    return paramString + str1;
  }
  
  public static boolean wx(String paramString)
  {
    if (paramString == null) {}
    String str;
    do
    {
      return false;
      int i = paramString.indexOf('<');
      str = paramString;
      if (i > 0) {
        str = paramString.substring(i);
      }
    } while (bl.z(str, "msg") == null);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */