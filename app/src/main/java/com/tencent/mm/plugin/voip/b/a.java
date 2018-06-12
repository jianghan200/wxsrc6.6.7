package com.tencent.mm.plugin.voip.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.tencent.mm.protocal.c.bqq;
import com.tencent.mm.protocal.c.byx;
import com.tencent.mm.protocal.c.byy;
import com.tencent.mm.protocal.c.car;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.BufferedOutputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.LinkedList;

public final class a
{
  public static boolean oST = false;
  static BufferedOutputStream oSU = null;
  
  public static int Fw(String paramString)
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
        x.d("MicroMsg.Voip", "ipAddressStrToInt, ip: %s, result: %d", new Object[] { paramString, Integer.valueOf(j) });
        return j;
      }
    }
    catch (UnknownHostException paramString)
    {
      x.printErrStackTrace("MicroMsg.Voip", paramString, "", new Object[0]);
    }
    return 0;
  }
  
  private static void OK(String paramString)
  {
    if (oSU == null) {
      return;
    }
    try
    {
      oSU.write(paramString.getBytes());
      return;
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.Voip", paramString, "", new Object[0]);
    }
  }
  
  public static int[] a(byy parambyy)
  {
    x.d("MicroMsg.Voip", "convertSvrAddr: voipAddr.Cnt " + parambyy.suW);
    if (3 >= parambyy.suW) {}
    for (int i = parambyy.suW;; i = 3)
    {
      x.d("MicroMsg.Voip", "convertSvrAddr: addrCnt " + i);
      int[] arrayOfInt = new int[i * 2];
      int j = 0;
      while (j < i)
      {
        arrayOfInt[(j * 2)] = ((byx)parambyy.suX.get(j)).spR;
        arrayOfInt[(j * 2 + 1)] = ((byx)parambyy.suX.get(j)).sed;
        x.d("MicroMsg.Voip", "convertSvrAddr: ip " + yQ(((byx)parambyy.suX.get(j)).spR) + " Port: " + ((byx)parambyy.suX.get(j)).sed);
        j += 1;
      }
      return arrayOfInt;
    }
  }
  
  public static int[] a(car paramcar)
  {
    x.d("MicroMsg.Voip", "convertSpeedTestPara: testID= " + paramcar.swW + " SvrListCnt= " + paramcar.sxb);
    if (3 >= paramcar.sxb) {}
    for (int i = paramcar.sxb;; i = 3)
    {
      int[] arrayOfInt = new int[i * 6];
      int j = 0;
      while (j < i)
      {
        arrayOfInt[(j * 6)] = ((bqq)paramcar.sxc.get(j)).sop.spR;
        arrayOfInt[(j * 6 + 1)] = ((bqq)paramcar.sxc.get(j)).sop.sed;
        arrayOfInt[(j * 6 + 2)] = ((bqq)paramcar.sxc.get(j)).soo;
        arrayOfInt[(j * 6 + 3)] = ((bqq)paramcar.sxc.get(j)).soK;
        arrayOfInt[(j * 6 + 4)] = ((bqq)paramcar.sxc.get(j)).soL;
        arrayOfInt[(j * 6 + 5)] = ((bqq)paramcar.sxc.get(j)).soM;
        x.d("MicroMsg.Voip", "convertSpeedTestPara: ip " + yQ(((bqq)paramcar.sxc.get(j)).sop.spR) + " Port: " + ((bqq)paramcar.sxc.get(j)).sop.sed + " TestCnt= " + ((bqq)paramcar.sxc.get(j)).soo + " TestGap= " + ((bqq)paramcar.sxc.get(j)).soK + " Timeout= " + ((bqq)paramcar.sxc.get(j)).soL + " PktSize= " + ((bqq)paramcar.sxc.get(j)).soM);
        j += 1;
      }
      return arrayOfInt;
    }
  }
  
  public static int aV(byte[] paramArrayOfByte)
  {
    int i = 0;
    int k;
    int m;
    for (int j = 0;; j = (m & 0xFF) << k * 8 | j)
    {
      k = i;
      if (k >= 4) {
        break;
      }
      m = paramArrayOfByte[k];
      i = k + 1;
    }
    return j;
  }
  
  public static void b(byte[] paramArrayOfByte, String paramString, int paramInt)
  {
    byte[] arrayOfByte = paramArrayOfByte;
    if (bi.bC(paramArrayOfByte)) {
      arrayOfByte = new byte[0];
    }
    paramArrayOfByte = new String(arrayOfByte);
    if (paramInt == 4) {
      x.e(paramString, paramArrayOfByte);
    }
    while (!paramString.equals("MicroMsg.v2Core"))
    {
      OK(paramString + ":" + paramArrayOfByte + " \n");
      return;
      if (paramInt == 2) {
        x.i(paramString, paramArrayOfByte);
      } else {
        x.d(paramString, paramArrayOfByte);
      }
    }
    OK(paramString + ":" + paramArrayOfByte);
  }
  
  public static void bLO()
  {
    if (oSU == null) {
      return;
    }
    try
    {
      oSU.flush();
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Voip", localException, "", new Object[0]);
    }
  }
  
  public static void eT(String paramString1, String paramString2)
  {
    x.e(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    OK(paramString1 + ":" + paramString2 + " \n");
  }
  
  public static void eU(String paramString1, String paramString2)
  {
    x.i(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    OK(paramString1 + ":" + paramString2 + " \n");
  }
  
  public static void eV(String paramString1, String paramString2)
  {
    x.d(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    OK(paramString1 + ":" + paramString2 + " \n");
  }
  
  public static void eW(String paramString1, String paramString2)
  {
    x.w(paramString1, "[" + Thread.currentThread().getId() + "]" + paramString2);
    OK(paramString1 + ":" + paramString2 + " \n");
  }
  
  public static int getNetType(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null) {
        return 2;
      }
      if (paramContext.getType() == 1) {
        return 4;
      }
      if (paramContext.getType() != 0) {
        return 2;
      }
      if (paramContext.getSubtype() == 1) {
        return 1;
      }
      if (paramContext.getSubtype() == 2) {
        return 1;
      }
      if (paramContext.getSubtype() == 13) {
        return 5;
      }
      if ((paramContext.getSubtype() < 3) || (paramContext.getSubtype() >= 13))
      {
        int i = paramContext.getSubtype();
        if (i <= 13) {}
      }
      else
      {
        return 3;
      }
      return 1;
    }
    catch (NullPointerException paramContext)
    {
      x.printErrStackTrace("MicroMsg.Voip", paramContext, "", new Object[0]);
    }
    return 2;
  }
  
  public static byte[] yO(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    int i = 0;
    while (i < 4)
    {
      arrayOfByte[i] = ((byte)(paramInt >>> i * 8));
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static void yP(int paramInt)
  {
    long l = paramInt;
    try
    {
      Thread.sleep(l);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      x.printErrStackTrace("MicroMsg.Voip", localInterruptedException, "", new Object[0]);
    }
  }
  
  private static String yQ(int paramInt)
  {
    try
    {
      String str = InetAddress.getByAddress(new byte[] { (byte)(paramInt >>> 24 & 0xFF), (byte)(paramInt >>> 16 & 0xFF), (byte)(paramInt >>> 8 & 0xFF), (byte)(paramInt & 0xFF) }).getHostAddress();
      return str;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.Voip", localException, "", new Object[0]);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/voip/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */