package com.tencent.mm.plugin.offline;

import android.text.TextUtils;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.offline.c.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

public final class e
  extends a<b>
{
  public String lIF = "";
  private i.a lIG = new e.1(this);
  
  public e()
  {
    k.bkO();
    if (k.bkR() != null)
    {
      k.bkO();
      k.bkR().lJj = this.lIG;
    }
  }
  
  private static void bkG()
  {
    k.bkO();
    k.bkR().dg(1, 1);
  }
  
  public static int bkH()
  {
    k.bkO();
    k.bkR();
    return i.bkN();
  }
  
  public final void auM()
  {
    if (this.lIC == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.lIC.size())
      {
        Object localObject = (WeakReference)this.lIC.get(i);
        if (localObject != null)
        {
          localObject = (b)((WeakReference)localObject).get();
          if (localObject != null) {
            ((b)localObject).awE();
          }
        }
        i += 1;
      }
    }
  }
  
  public final String k(int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    int j = bkH();
    Object localObject;
    if (j > 0)
    {
      if (j < k.lJy)
      {
        x.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount < %s", new Object[] { Integer.valueOf(k.lJy) });
        k.bkO();
        k.bkR().uj(2);
      }
      k.bkO();
      localObject = k.uk(196617);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        x.e("MicroMsg.OfflineCodesMgr", "generateKey_V3 cn is null, the csr is not exist! cn:" + (String)localObject);
        return "";
      }
      com.tencent.mm.wallet_core.c.a.cCW();
      localObject = com.tencent.mm.wallet_core.c.a.getToken((String)localObject);
      if (TextUtils.isEmpty((CharSequence)localObject))
      {
        bkG();
        x.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null");
        return "";
      }
    }
    else
    {
      paramString = h.mEJ;
      if (com.tencent.mm.plugin.offline.c.a.dE(ad.getContext()))
      {
        paramInt1 = 0;
        paramInt2 = i;
        if (ao.isNetworkConnected(ad.getContext())) {
          paramInt2 = 1;
        }
        paramString.h(14163, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        h.mEJ.a(135L, 29L, 1L, true);
        if (!ao.isNetworkConnected(ad.getContext())) {
          break label244;
        }
        h.mEJ.a(135L, 31L, 1L, true);
      }
      for (;;)
      {
        bkG();
        x.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 getTokenCount is 0");
        return "";
        paramInt1 = 1;
        break;
        label244:
        h.mEJ.a(135L, 30L, 1L, true);
      }
    }
    if (localObject != null) {
      x.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code length : %s ext_business_attach %s %s", new Object[] { Integer.valueOf(((String)localObject).length()), paramString, localObject });
    }
    paramString = new com.tencent.mm.plugin.offline.a.o(j - 1, paramInt1, paramInt2, paramString);
    g.Ek();
    g.Eh().dpP.a(paramString, 0);
    x.i("MicroMsg.OfflineCodesMgr", "doNetSceneShowCode count " + (j - 1));
    paramString = com.tencent.mm.plugin.offline.c.a.Jc(com.tencent.mm.plugin.offline.c.a.blO());
    if ((paramString == null) || (paramString.size() == 0))
    {
      x.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 cardList is null");
      bkG();
      return "";
    }
    long l2;
    long l1;
    if ((localObject != null) && (com.tencent.mm.plugin.offline.c.a.xW((String)localObject)))
    {
      l2 = Long.valueOf((String)localObject, 10).longValue();
      l1 = 0L;
      paramInt1 = 0;
      if (paramInt1 >= paramString.size()) {
        break label485;
      }
      localObject = (a.a)paramString.get(paramInt1);
      if ((localObject == null) || (((a.a)localObject).lMW == null) || (!((a.a)localObject).lMW.equals(this.lIF))) {
        break label674;
      }
      l1 = ((a.a)localObject).lMU;
    }
    label485:
    label674:
    for (;;)
    {
      paramInt1 += 1;
      break;
      x.i("MicroMsg.OfflineCodesMgr", "generateKey_V3 code is null or is not isNumeric");
      return "";
      localObject = String.valueOf(l1 << 48 | l2);
      if (((String)localObject).length() == 15) {
        paramString = "0" + (String)localObject;
      }
      while (!TextUtils.isEmpty(com.tencent.mm.plugin.offline.c.a.blQ()))
      {
        return com.tencent.mm.plugin.offline.c.a.blQ() + paramString;
        if (((String)localObject).length() == 14)
        {
          paramString = "00" + (String)localObject;
        }
        else if (((String)localObject).length() == 13)
        {
          paramString = "000" + (String)localObject;
        }
        else
        {
          paramString = (String)localObject;
          if (((String)localObject).length() == 12) {
            paramString = "0000" + (String)localObject;
          }
        }
      }
      return "12" + paramString;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/offline/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */