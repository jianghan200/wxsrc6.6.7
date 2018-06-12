package com.tencent.mm.plugin.walletlock.gesture.a;

import android.os.SystemClock;
import com.tencent.mm.a.o;
import com.tencent.mm.bk.b;
import com.tencent.mm.jni.utils.UtilsJni;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.c.ayy;
import com.tencent.mm.protocal.c.ayz;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.sdk.platformtools.x;
import java.io.ByteArrayOutputStream;
import java.util.List;

public final class e
{
  public static byte[] PI(String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i < paramString.length())
    {
      localByteArrayOutputStream.write(Integer.parseInt(paramString.substring(i, i + 2), 16));
      i += 2;
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static void a(g paramg)
  {
    if (paramg.pGZ == -1L) {
      return;
    }
    long l = SystemClock.elapsedRealtime();
    if (l < paramg.pGZ)
    {
      paramg.pGZ = l;
      paramg.pHa += l;
      x.d("MicroMsg.GestureUtil", String.format("Rebooted, need to add additional %d ms, now elapsed %d ms", new Object[] { Long.valueOf(l), Long.valueOf(paramg.pHa) }));
      return;
    }
    paramg.pHa = (l - paramg.pGZ + paramg.pHa);
    paramg.pGZ = l;
  }
  
  private static byte[] aX(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    while (i < paramArrayOfByte.length - 1)
    {
      localByteArrayOutputStream.write("0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[i])) << 4 | "0123456789abcdef".indexOf(Character.toLowerCase(paramArrayOfByte[(i + 1)])));
      i += 2;
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static String aY(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfByte.length;
    int i = 0;
    while (i < j)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() < 2) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public static boolean b(ayy paramayy)
  {
    boolean bool = true;
    if ((paramayy == null) || (paramayy.sbJ == null) || (paramayy.sbJ.siK == null)) {
      bool = false;
    }
    int i;
    do
    {
      return bool;
      byte[] arrayOfByte = paramayy.sbJ.siK.lR;
      if ((arrayOfByte.length == 0) || ((arrayOfByte.length & 0x1) != 0)) {
        return false;
      }
      long l = new o(paramayy.uin).longValue();
      arrayOfByte = aX(arrayOfByte);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(paramayy.version);
      if (paramayy.sbH.siL) {
        localStringBuilder.append(new String(paramayy.sbH.siK.lR));
      }
      localStringBuilder.append(l);
      i = UtilsJni.doEcdsaVerify(a.pGV, localStringBuilder.toString().getBytes(), arrayOfByte);
      x.d("MicroMsg.GestureUtil", String.format("verifyPatternBuffer, ret:%d", new Object[] { Integer.valueOf(i) }));
    } while (i == 1);
    return false;
  }
  
  public static boolean b(ayz paramayz)
  {
    if ((paramayz == null) || (paramayz.sbL == null) || (paramayz.sbL.siK == null)) {}
    do
    {
      return false;
      arrayOfByte = paramayz.sbL.siK.lR;
    } while ((arrayOfByte.length == 0) || ((arrayOfByte.length & 0x1) != 0));
    byte[] arrayOfByte = aX(arrayOfByte);
    com.tencent.mm.kernel.g.Eg();
    long l = new o(com.tencent.mm.kernel.a.Df()).longValue();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramayz.sbK);
    localStringBuilder.append(l);
    int i = UtilsJni.doEcdsaVerify(a.pGV, localStringBuilder.toString().getBytes(), arrayOfByte);
    if (((i != 1) && (paramayz.sbM == 1)) || ((i == 1) && (paramayz.sbM == 0))) {}
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.GestureUtil", String.format("verifyPatternInfo, verifyRes:%d ret:%b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool) }));
      return bool;
    }
  }
  
  public static boolean bRE()
  {
    int k = -1;
    if ((!com.tencent.mm.kernel.g.Eg().Dx()) || (com.tencent.mm.kernel.a.Dr())) {
      x.w("MicroMsg.GestureUtil", "not login !!");
    }
    label43:
    label50:
    label60:
    label67:
    label108:
    label115:
    label226:
    label231:
    label236:
    label245:
    label251:
    label363:
    do
    {
      do
      {
        for (;;)
        {
          return false;
          ayz localayz = d.bRL();
          ayy localayy = d.bRK();
          int j;
          int i;
          boolean bool1;
          boolean bool2;
          if (localayz == null)
          {
            j = 1;
            if (localayy != null) {
              break label226;
            }
            i = 1;
            if (j != 0) {
              break label231;
            }
            bool1 = b(localayz);
            if (localayz != null) {
              break label236;
            }
            j = -1;
            x.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock serverInfo:%s status:%d  svrinfoValid:%s", new Object[] { localayz, Integer.valueOf(j), Boolean.valueOf(bool1) });
            if (i != 0) {
              break label245;
            }
            bool2 = b(localayy);
            if (localayy != null) {
              break label251;
            }
            i = k;
            x.i("MicroMsg.GestureUtil", "tom isUserSetWalletLock localBuff:%s status:%d  localBuffValid:%s", new Object[] { localayy, Integer.valueOf(i), Boolean.valueOf(bool2) });
            if ((bool1) && (!bool2)) {
              break label363;
            }
          }
          try
          {
            x.i("MicroMsg.GestureUtil", "Both info & buff are valid, choose one to trust.");
            if (localayz.sbK > localayy.version)
            {
              x.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, srvInfo wins.", new Object[] { Integer.valueOf(localayz.sbK), Integer.valueOf(localayy.version) });
              i = localayz.sbM;
              if (i == 1)
              {
                return true;
                j = 0;
                break label43;
                i = 0;
                break label50;
                bool1 = false;
                break label60;
                j = localayz.sbM;
                break label67;
                bool2 = false;
                break label108;
                i = localayy.sbI;
                break label115;
              }
            }
            else if (localayz.sbK == localayy.version)
            {
              x.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, draw.", new Object[] { Integer.valueOf(localayz.sbK), Integer.valueOf(localayy.version) });
              if (localayz.sbM == 1) {
                return true;
              }
            }
            else
            {
              x.i("MicroMsg.GestureUtil", "srvInfoVer:%d, localBuffVer:%d, localBuff wins.", new Object[] { Integer.valueOf(localayz.sbK), Integer.valueOf(localayy.version) });
              if (localayy.sbI == 1) {
                return true;
              }
            }
          }
          catch (Exception localException)
          {
            x.printErrStackTrace("MicroMsg.GestureUtil", localException, "isUserSetWalletLock throw an exception.", new Object[0]);
          }
        }
        x.i("MicroMsg.GestureUtil", "Info is valid but buf is invalid, we trust info this time.");
      } while (localayz.sbM != 1);
      return true;
      if (!bool2) {
        break;
      }
      x.i("MicroMsg.GestureUtil", "Info is invalid but buff is valid, we trust buff this time.");
    } while (localayy.sbI != 1);
    return true;
    x.w("MicroMsg.GestureUtil", "Both buff & info are invalid, do not activate this time and wait for next sync.");
    return false;
    return false;
  }
  
  public static byte[] cJ(List<f> paramList)
  {
    if (paramList == null) {
      throw new IllegalArgumentException("pattern is null");
    }
    int j = paramList.size();
    Object localObject = new byte[j];
    int i = 0;
    while (i < j)
    {
      f localf = (f)paramList.get(i);
      int k = localf.pGW;
      localObject[i] = ((byte)(localf.pGX + k * 3 + 1));
      i += 1;
    }
    paramList = new StringBuilder();
    i = 0;
    while (i < j)
    {
      paramList.append(localObject[i]);
      i += 1;
    }
    paramList = paramList.toString();
    localObject = q.GF();
    localObject = com.tencent.mm.a.g.u((com.tencent.mm.a.g.u(paramList.getBytes()) + (String)localObject).getBytes());
    return com.tencent.mm.a.g.u(((String)localObject + paramList).getBytes()).getBytes();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */