package com.tencent.mm.wallet_core.c;

import android.content.Context;
import com.tencent.mm.a.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tenpay.ndk.CertUtil;
import com.tenpay.ndk.MessageDigestUtil;

public final class a
{
  static boolean huc = false;
  private static a uWU = null;
  private boolean uWV = false;
  
  public static int abT(String paramString)
  {
    int i = CertUtil.getInstance().getTokenCount(paramString);
    x.d("MicroMsg.CertUtilWx", "getTokenCount ret: %d stack %s", new Object[] { Integer.valueOf(i), bi.cjd().toString() });
    return i;
  }
  
  public static a cCW()
  {
    if (uWU == null) {
      uWU = new a();
    }
    return uWU;
  }
  
  public static void clean()
  {
    x.d("MicroMsg.CertUtilWx", "clean allcrt stack %s", new Object[] { bi.cjd().toString() });
    CertUtil.getInstance().clearAllCert();
  }
  
  public static void clearCert(String paramString)
  {
    x.d("MicroMsg.CertUtilWx", "clearCert stack %s", new Object[] { bi.cjd().toString() });
    CertUtil.getInstance().clearCert(paramString);
  }
  
  public static void clearToken(String paramString)
  {
    x.d("MicroMsg.CertUtilWx", "clearToken stack %s", new Object[] { bi.cjd().toString() });
    CertUtil.getInstance().clearToken(paramString);
  }
  
  public static String genUserSig(String paramString1, String paramString2)
  {
    x.d("MicroMsg.CertUtilWx", "genUserSig stack %s", new Object[] { bi.cjd().toString() });
    return CertUtil.getInstance().genUserSig(paramString1, paramString2);
  }
  
  public static int getLastError()
  {
    x.d("MicroMsg.CertUtilWx", "getLastError stack %s", new Object[] { bi.cjd().toString() });
    return CertUtil.getInstance().getLastError();
  }
  
  public static String getToken(String paramString)
  {
    x.d("MicroMsg.CertUtilWx", "getToken stack %s", new Object[] { bi.cjd().toString() });
    return CertUtil.getInstance().getToken(paramString);
  }
  
  public static void init(Context paramContext)
  {
    if (huc) {
      return;
    }
    x.d("MicroMsg.CertUtilWx", "init  %s", new Object[] { bi.cjd().toString() });
    CertUtil.getInstance().init(paramContext);
    huc = true;
  }
  
  public static boolean isCertExist(String paramString)
  {
    x.d("MicroMsg.CertUtilWx", "isCertExist stack %s", new Object[] { bi.cjd().toString() });
    h.mEJ.a(414L, 5L, 1L, true);
    boolean bool = CertUtil.getInstance().isCertExist(paramString);
    h.mEJ.a(414L, 6L, 1L, true);
    return bool;
  }
  
  public static boolean t(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject1 = "";
    if (paramBoolean)
    {
      localObject1 = new MessageDigestUtil();
      g.Ek();
      g.Eg();
      Object localObject2 = o.getString(com.tencent.mm.kernel.a.Df());
      String str = (String)localObject2 + "_pUI6cNqzLt2Z3mQSrYuF09XSGsBtTIcUgp9jcWZ7F7BBs8/DFVFMKiwbtaRPOiLE";
      localObject2 = new byte[16];
      localObject1 = ((MessageDigestUtil)localObject1).getSHA256Hex(str.getBytes()).getBytes();
      int i = 0;
      while ((i < 16) && (i < localObject1.length))
      {
        localObject2[i] = localObject1[i];
        i += 1;
      }
      localObject1 = new String((byte[])localObject2);
    }
    x.d("MicroMsg.CertUtilWx", "setTokens stack v2 useSm4 %s sm4Key %s %s", new Object[] { Boolean.valueOf(paramBoolean), localObject1, bi.cjd().toString() });
    paramBoolean = CertUtil.getInstance().setTokens(paramString1, paramString2, paramBoolean, (String)localObject1);
    x.d("MicroMsg.CertUtilWx", "setTokens result ret:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    return paramBoolean;
  }
  
  public final boolean cCX()
  {
    x.d("MicroMsg.CertUtilWx", "importCertNone");
    try
    {
      this.uWV = false;
      return false;
    }
    finally {}
  }
  
  public final String dw(String paramString, int paramInt)
  {
    x.d("MicroMsg.CertUtilWx", "getCertApplyCSR lock %s %s", new Object[] { bi.cjd().toString(), Integer.valueOf(paramInt) });
    try
    {
      if (this.uWV)
      {
        x.i("MicroMsg.CertUtilWx", "isCert_Wating");
        return "";
      }
      this.uWV = true;
      paramString = CertUtil.getInstance().getCertApplyCSR(paramString, paramInt);
      return paramString;
    }
    finally {}
  }
  
  public final boolean importCert(String paramString1, String paramString2)
  {
    x.d("MicroMsg.CertUtilWx", "importCert  cid %s cert %s stack %s", new Object[] { paramString1, paramString2, bi.cjd().toString() });
    try
    {
      this.uWV = false;
      boolean bool = CertUtil.getInstance().importCert(paramString1, paramString2);
      return bool;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */