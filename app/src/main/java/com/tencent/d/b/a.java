package com.tencent.d.b;

import android.util.SparseArray;
import com.tencent.d.b.f.h;
import com.tencent.d.b.f.j;
import com.tencent.d.b.f.k;

public final class a
{
  public static boolean Hp(int paramInt)
  {
    boolean bool = com.tencent.d.b.b.a.cFO().isInit();
    String str = (String)com.tencent.d.b.b.a.cFO().cFQ().get(paramInt);
    if ((bool) && (!com.tencent.d.a.c.f.oW(str))) {
      return com.tencent.d.a.a.bD(str, false).errCode == 0;
    }
    if (!bool)
    {
      com.tencent.d.a.c.c.w("Soter.SoterWrapperApi", "soter: not initialized yet", new Object[0]);
      return false;
    }
    com.tencent.d.a.c.c.w("Soter.SoterWrapperApi", "soter: scene not registered in init. please make sure", new Object[0]);
    return false;
  }
  
  public static void a(com.tencent.d.b.a.b<com.tencent.d.b.a.a> paramb, com.tencent.d.b.f.b paramb1)
  {
    com.tencent.d.a.c.c.i("Soter.SoterWrapperApi", "soter: request authorize provide challenge. scene: %d", new Object[] { Integer.valueOf(paramb1.fdx) });
    paramb1 = new h(paramb1);
    paramb1.vmm = paramb;
    if (!com.tencent.d.b.f.f.cFZ().a(paramb1, new com.tencent.d.b.a.a())) {
      com.tencent.d.a.c.c.d("Soter.SoterWrapperApi", "soter: add requestAuthorizeAndSign task failed.", new Object[0]);
    }
  }
  
  public static void a(com.tencent.d.b.a.b<com.tencent.d.b.a.c> paramb, boolean paramBoolean, int paramInt, com.tencent.d.b.e.e parame1, com.tencent.d.b.e.e parame2)
  {
    com.tencent.d.a.c.c.i("Soter.SoterWrapperApi", "soter: starting prepare auth key: %d", new Object[] { Integer.valueOf(paramInt) });
    parame1 = new k(paramInt, parame1, parame2, paramBoolean);
    parame1.vmm = paramb;
    if (!com.tencent.d.b.f.f.cFZ().a(parame1, new com.tencent.d.b.a.c())) {
      com.tencent.d.a.c.c.d("Soter.SoterWrapperApi", "soter: add prepareAuthKey task failed.", new Object[0]);
    }
  }
  
  public static void a(com.tencent.d.b.a.b<com.tencent.d.b.a.c> paramb, boolean paramBoolean, com.tencent.d.b.e.e parame)
  {
    com.tencent.d.a.c.c.i("Soter.SoterWrapperApi", "soter: starting prepare ask key. ", new Object[0]);
    parame = new j(parame, paramBoolean);
    parame.vmm = paramb;
    if (!com.tencent.d.b.f.f.cFZ().a(parame, new com.tencent.d.b.a.c())) {
      com.tencent.d.a.c.c.d("Soter.SoterWrapperApi", "soter: add prepareAppSecureKey task failed.", new Object[0]);
    }
  }
  
  public static boolean cFN()
  {
    return (com.tencent.d.b.b.a.cFO().isInit()) && (com.tencent.d.b.b.a.cFO().cFN());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */