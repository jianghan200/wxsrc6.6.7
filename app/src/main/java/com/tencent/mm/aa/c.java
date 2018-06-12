package com.tencent.mm.aa;

import android.graphics.Bitmap;
import com.tencent.mm.a.o;
import com.tencent.mm.kernel.a;
import com.tencent.mm.protocal.c.aue;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;

public final class c
{
  public static String A(String paramString, boolean paramBoolean)
  {
    if ((bi.oW(paramString)) || (!com.tencent.mm.kernel.g.Eg().Dx())) {}
    while (!com.tencent.mm.kernel.g.Ei().DW()) {
      return null;
    }
    if (ab.gY(paramString)) {
      return q.Kp().c(ab.XV(paramString), false, paramBoolean);
    }
    return q.Kp().c(paramString, false, paramBoolean);
  }
  
  public static boolean J(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    j localj2 = q.KH().kc(paramString);
    if ((localj2 != null) && (paramString.equals(localj2.getUsername())) && (paramInt == localj2.csA)) {
      return true;
    }
    j localj1 = localj2;
    if (localj2 == null) {
      localj1 = new j();
    }
    localj1.username = paramString;
    localj1.csA = paramInt;
    localj1.bWA = 3;
    return q.KH().a(localj1);
  }
  
  public static Bitmap a(String paramString, boolean paramBoolean, int paramInt)
  {
    if ((bi.oW(paramString)) || (!com.tencent.mm.kernel.g.Eg().Dx())) {
      return null;
    }
    if (!com.tencent.mm.kernel.g.Ei().DW()) {
      return q.Kp().bJ(ad.getContext());
    }
    String str = paramString;
    if (ab.gY(paramString)) {
      str = ab.XV(paramString);
    }
    return q.KJ().b(str, paramBoolean, paramInt);
  }
  
  public static j a(String paramString, aue paramaue)
  {
    j localj = new j();
    localj.bWA = -1;
    localj.username = paramString;
    localj.dHQ = paramaue.rra;
    localj.dHR = paramaue.rqZ;
    x.i("MicroMsg.AvatarLogic", "dkhurl contact %s b[%s] s[%s]", new Object[] { localj.getUsername(), localj.Kx(), localj.Ky() });
    boolean bool;
    if (paramaue.rXe != 0)
    {
      bool = true;
      localj.by(bool);
      if ((paramaue.rWZ != 3) && (paramaue.rWZ != 4)) {
        break label111;
      }
      localj.csA = paramaue.rWZ;
    }
    label111:
    do
    {
      do
      {
        return localj;
        bool = false;
        break;
      } while (paramaue.rWZ != 2);
      localj.csA = 3;
    } while (com.tencent.mm.model.q.GF().equals(paramString));
    q.Kp();
    f.B(paramString, false);
    q.Kp();
    f.B(paramString, true);
    q.KJ().jO(paramString);
    return localj;
  }
  
  private static String aX(long paramLong)
  {
    return new o(paramLong) + "@qqim";
  }
  
  public static Bitmap aY(long paramLong)
  {
    return a(aX(paramLong), false, -1);
  }
  
  public static String ac(String paramString1, String paramString2)
  {
    return paramString1 + "?access_token=" + paramString2;
  }
  
  public static Bitmap c(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((bi.oW(paramString)) || (!com.tencent.mm.kernel.g.Eg().Dx())) {
      paramString = null;
    }
    Object localObject;
    do
    {
      return paramString;
      localObject = q.Kp();
      x.d("MicroMsg.AvatarStorage", "getHDBitmap user:%s, width:%d, height:%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (bi.oW(paramString)) {}
      for (localObject = null; localObject == null; localObject = com.tencent.mm.sdk.platformtools.c.a(((f)localObject).c(paramString, true, false), paramInt1, paramInt2, null, 0, new int[] { 0, 1 }))
      {
        localObject = new g();
        ((g)localObject).a(paramString, new g.b()
        {
          public final int bd(int paramAnonymousInt1, int paramAnonymousInt2)
          {
            this.dGE.Ku();
            x.i("MicroMsg.AvatarLogic", "getHDHeadImage onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
            return 0;
          }
        });
        return a(paramString, false, paramInt3);
      }
      paramString = (String)localObject;
    } while (paramInt3 <= 5);
    return com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject, false, paramInt3);
  }
  
  public static boolean d(long paramLong, int paramInt)
  {
    if (paramInt != 3) {
      return false;
    }
    return jL(aX(paramLong));
  }
  
  public static Bitmap jF(String paramString)
  {
    return a(paramString + "@google", false, -1);
  }
  
  private static String jG(String paramString)
  {
    return "http://graph.facebook.com/" + paramString + "/picture";
  }
  
  public static void jH(String paramString)
  {
    if (bi.oW(paramString)) {}
    String str;
    j localj2;
    do
    {
      return;
      str = paramString + "@fb";
      localj2 = q.KH().kc(str);
    } while ((localj2 != null) && (str.equals(localj2.getUsername())) && (3 == localj2.csA));
    j localj1 = localj2;
    if (localj2 == null) {
      localj1 = new j();
    }
    localj1.username = str;
    localj1.csA = 3;
    localj1.dHR = jG(paramString);
    localj1.dHQ = jG(paramString);
    localj1.by(true);
    localj1.bWA = 31;
    q.KH().a(localj1);
  }
  
  public static Bitmap jI(String paramString)
  {
    return a(paramString + "@fb", false, -1);
  }
  
  public static long jJ(String paramString)
  {
    if (!ab.XS(paramString)) {
      return -1L;
    }
    paramString = paramString.split("@");
    try
    {
      long l = bi.getLong(paramString[0], -1L);
      return l;
    }
    catch (Exception paramString) {}
    return -1L;
  }
  
  public static long jK(String paramString)
  {
    if (!ab.XQ(paramString)) {
      return -1L;
    }
    paramString = paramString.split("@");
    try
    {
      long l = bi.getLong(paramString[0], -1L);
      return l;
    }
    catch (Exception paramString) {}
    return -1L;
  }
  
  public static boolean jL(String paramString)
  {
    if (paramString == null)
    {
      x.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
      return false;
    }
    if (!paramString.endsWith("@qqim"))
    {
      x.w("MicroMsg.AvatarLogic", "setQQAvatarImgFlag failed : invalid username");
      return false;
    }
    j localj = new j();
    localj.username = paramString;
    localj.csA = 3;
    localj.bWA = 3;
    return q.KH().a(localj);
  }
  
  public static Bitmap jM(String paramString)
  {
    return a(paramString, false, -1);
  }
  
  public static void jN(String paramString)
  {
    j localj = q.KH().kc(paramString);
    if (localj == null) {}
    while (!paramString.equals(localj.getUsername())) {
      return;
    }
    localj.dHT = 0;
    localj.bWA = 64;
    q.KH().a(localj);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/aa/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */