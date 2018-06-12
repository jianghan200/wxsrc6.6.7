package com.tencent.mm.wallet_core.d;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.tencent.mm.ab.o;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.m;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave;
import com.tencent.mm.wallet_core.tenpay.model.ITenpaySave.RetryPayInfo;
import com.tencent.mm.wallet_core.tenpay.model.j;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class i
  implements com.tencent.mm.ab.e, e
{
  public String dox;
  public HashSet<com.tencent.mm.ab.l> eXE = new HashSet();
  public HashSet<com.tencent.mm.ab.l> eXF = new HashSet();
  public Dialog eXG = null;
  private Set<Integer> eXU = new HashSet();
  private f kQv = null;
  public Context mContext;
  public Bundle sy;
  private a uXM;
  private b uXN;
  public HashMap<Integer, c> uXO;
  
  public i(Context paramContext, f paramf)
  {
    this.mContext = paramContext;
    this.kQv = paramf;
    this.uXM = new a(this);
    this.uXN = new b(this);
    this.uXO = new HashMap();
  }
  
  private boolean l(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    boolean bool3 = false;
    x.i("MicroMsg.WalletNetSceneMgr", "onSceneEnd scene is %s %s", new Object[] { this, paraml.toString() });
    x.d("MicroMsg.WalletNetSceneMgr", "tofutest: %s errType: %d, errCode: %d, errMsg: %s, %s", new Object[] { this, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Boolean.valueOf(af.eyh) });
    if ((af.eyh) && ((paraml instanceof j)) && (!((j)paraml).mxp) && (!((j)paraml).bNv()))
    {
      paramString = (j)paraml;
      x.i("MicroMsg.WalletNetSceneMgr", "test do delay query order");
      this.uXM.b(paramString);
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          return bool1;
          if ((paraml instanceof ITenpaySave))
          {
            paramString = (ITenpaySave)paraml;
            if ((paramString instanceof ITenpaySave))
            {
              paramString = paramString.bMO();
              if ((paramString != null) && (paramString.cDx())) {
                b.oYE = paramString;
              }
            }
          }
          if ((paraml instanceof j))
          {
            if (((j)paraml).mxp)
            {
              x.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass %s", new Object[] { paraml });
              return false;
            }
            if ((((j)paraml).bNv()) && ((paraml instanceof com.tencent.mm.wallet_core.tenpay.model.a)))
            {
              bool1 = ((j)paraml).uYn;
              if (!((j)paraml).uXm) {}
              for (bool2 = true;; bool2 = false)
              {
                x.d("MicroMsg.WalletNetSceneMgr", "%s save or fetch shouldRetry, network: %B, server: %B", new Object[] { this, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
                if (!bool1)
                {
                  bool1 = bool3;
                  if (!bool2) {
                    break;
                  }
                }
                bool1 = bool3;
                if (!this.uXN.d((j)paraml)) {
                  break;
                }
                return true;
              }
            }
          }
          int i = paraml.getType();
          if (this.uXO == null) {
            break;
          }
          paramString = (c)this.uXO.get(Integer.valueOf(i));
          if (!(paraml instanceof d)) {
            break;
          }
          bool1 = bool3;
        } while (((d)paraml).bre());
        d locald = (d)paraml;
        x.i("MicroMsg.IDelayQueryOrder", "startQueryOrder %s ", new Object[] { locald });
        paramString.uXJ = locald;
        if (paramString.a(paramInt1, paramInt2, locald)) {
          return true;
        }
        bool1 = bool3;
      } while (!(paraml instanceof j));
      bool1 = bool3;
    } while (((j)paraml).bNv());
    if (((j)paraml).mxp)
    {
      x.i("MicroMsg.WalletNetSceneMgr", "getHasRetried pass");
      return false;
    }
    paramString = (j)paraml;
    boolean bool1 = this.uXM.a(paramString);
    if (!paramString.uXm) {}
    for (boolean bool2 = true;; bool2 = false)
    {
      x.d("MicroMsg.WalletNetSceneMgr", "%s shouldRetry, network: %B, server: %B", new Object[] { this, Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if (!bool1)
      {
        bool1 = bool3;
        if (!bool2) {
          break;
        }
      }
      x.i("MicroMsg.WalletNetSceneMgr", "%s doing delay order query retry", new Object[] { this });
      this.uXM.b(paramString);
      return true;
    }
  }
  
  private void q(com.tencent.mm.ab.l paraml)
  {
    if ((paraml != null) && ((paraml instanceof m)))
    {
      ((m)paraml).dox = this.dox;
      if (this.sy == null) {
        break label41;
      }
      ((m)paraml).sy = this.sy;
    }
    label41:
    while (!(this.mContext instanceof WalletBaseUI)) {
      return;
    }
    ((m)paraml).sy = ((WalletBaseUI)this.mContext).sy;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    int i;
    if (this.eXF.contains(paraml))
    {
      x.d("MicroMsg.WalletNetSceneMgr", "%s has find scene ", new Object[] { this });
      if (!l(paramInt1, paramInt2, paramString, paraml))
      {
        x.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", new Object[] { this });
        this.eXF.remove(paraml);
        i = 1;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.WalletNetSceneMgr", "%s onSceneEnd scenes %s forcescenes %s", new Object[] { this, Integer.valueOf(this.eXF.size()), Integer.valueOf(this.eXE.size()) });
      if ((this.eXF.isEmpty()) && (this.eXE.isEmpty())) {
        bNx();
      }
      for (boolean bool = true;; bool = false)
      {
        if ((i != 0) && (this.kQv != null)) {
          this.kQv.b(paramInt1, paramInt2, paramString, paraml, bool);
        }
        return;
        x.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", new Object[] { this });
        return;
        if (!this.eXE.contains(paraml)) {
          break label272;
        }
        x.d("MicroMsg.WalletNetSceneMgr", "%s has find forcescenes ", new Object[] { this });
        if (!l(paramInt1, paramInt2, paramString, paraml))
        {
          this.eXE.remove(paraml);
          x.i("MicroMsg.WalletNetSceneMgr", "%s Not need delay query order,remove scene", new Object[] { this });
          i = 1;
          break;
        }
        x.i("MicroMsg.WalletNetSceneMgr", "%s do delay order query.break off!", new Object[] { this });
        return;
      }
      label272:
      i = 0;
    }
  }
  
  public final void a(com.tencent.mm.ab.l paraml, boolean paramBoolean)
  {
    q(paraml);
    this.eXE.add(paraml);
    if ((paramBoolean) && ((this.eXG == null) || ((this.eXG != null) && (!this.eXG.isShowing()))))
    {
      if (this.eXG != null) {
        this.eXG.dismiss();
      }
      if (this.mContext == null)
      {
        x.w("MicroMsg.WalletNetSceneMgr", "%s activity has destroyed!!!", new Object[] { this });
        return;
      }
      this.eXG = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new i.1(this));
    }
    if ((af.eyh) && ((paraml instanceof com.tencent.mm.wallet_core.tenpay.model.i)) && ((((com.tencent.mm.wallet_core.tenpay.model.i)paraml).getUri().contains("authen")) || (((com.tencent.mm.wallet_core.tenpay.model.i)paraml).getUri().contains("verify")))) {
      ((com.tencent.mm.wallet_core.tenpay.model.i)paraml).cDz();
    }
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(paraml, 0);
  }
  
  public final void a(com.tencent.mm.ab.l paraml, boolean paramBoolean, int paramInt)
  {
    int i = paraml.getType();
    boolean bool2 = paraml instanceof com.tencent.mm.wallet_core.c.d;
    if ((this.eXG == null) || ((this.eXG != null) && (!this.eXG.isShowing()))) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      x.i("MicroMsg.WalletNetSceneMgr", "this %s isShowProgress %s scene: %s dialogType %s type %s IWxSafePay %s tipDialog showing? %s", new Object[] { this, Boolean.valueOf(paramBoolean), paraml, Integer.valueOf(paramInt), Integer.valueOf(i), Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      q(paraml);
      this.eXF.add(paraml);
      if ((!paramBoolean) || ((this.eXG != null) && ((this.eXG == null) || (this.eXG.isShowing())))) {
        break label209;
      }
      if (this.eXG != null) {
        this.eXG.dismiss();
      }
      if (this.mContext != null) {
        break;
      }
      x.w("MicroMsg.WalletNetSceneMgr", "activity has destroyed!!!");
      return;
    }
    if (paramInt == 1) {
      if ((paraml instanceof com.tencent.mm.wallet_core.c.d))
      {
        this.eXG = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new i.2(this));
        label209:
        if ((af.eyh) && ((paraml instanceof com.tencent.mm.wallet_core.tenpay.model.i)) && ((((com.tencent.mm.wallet_core.tenpay.model.i)paraml).getUri().contains("authen")) || (((com.tencent.mm.wallet_core.tenpay.model.i)paraml).getUri().contains("verify")))) {
          ((com.tencent.mm.wallet_core.tenpay.model.i)paraml).cDz();
        }
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(paraml, 0);
        if (paraml.dJd != null) {
          break label541;
        }
      }
    }
    label541:
    for (Object localObject = "";; localObject = paraml.dJd.getUri())
    {
      x.i("MicroMsg.WalletNetSceneMgr", "this %s scene url %s %s", new Object[] { this, paraml, localObject });
      return;
      localObject = this.mContext;
      this.mContext.getString(a.i.app_empty_string);
      this.eXG = h.a((Context)localObject, this.mContext.getString(a.i.wallet_pay_loading), false, new i.3(this));
      break;
      if (paramInt == 2)
      {
        localObject = this.mContext;
        this.mContext.getString(a.i.app_empty_string);
        this.eXG = h.a((Context)localObject, this.mContext.getString(a.i.wallet_pay_loading), false, new i.4(this));
        break;
      }
      if (paramInt == 3)
      {
        this.eXG = com.tencent.mm.wallet_core.ui.g.e(this.mContext, "验证中", new i.5(this));
        break;
      }
      if (paramInt == 4)
      {
        this.eXG = com.tencent.mm.wallet_core.ui.g.a(this.mContext, false, new i.6(this));
        break;
      }
      x.i("MicroMsg.WalletNetSceneMgr", "unknown dialog type: %d", new Object[] { Integer.valueOf(paramInt) });
      localObject = this.mContext;
      this.mContext.getString(a.i.app_empty_string);
      this.eXG = h.a((Context)localObject, this.mContext.getString(a.i.wallet_pay_loading), false, new i.7(this));
      break;
    }
  }
  
  public final void bNx()
  {
    if (this.eXG != null)
    {
      this.eXG.dismiss();
      this.eXG = null;
    }
  }
  
  public final void baT()
  {
    if (this.eXG != null)
    {
      this.eXG.dismiss();
      this.eXG = null;
    }
    Iterator localIterator = this.eXE.iterator();
    com.tencent.mm.ab.l locall;
    while (localIterator.hasNext())
    {
      locall = (com.tencent.mm.ab.l)localIterator.next();
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.c(locall);
    }
    localIterator = this.eXF.iterator();
    while (localIterator.hasNext())
    {
      locall = (com.tencent.mm.ab.l)localIterator.next();
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.c(locall);
    }
    this.eXE.clear();
    this.eXF.clear();
  }
  
  public final boolean baU()
  {
    return (!this.eXF.isEmpty()) || (!this.eXE.isEmpty());
  }
  
  public final void baV()
  {
    bNx();
  }
  
  public final void jr(int paramInt)
  {
    this.eXU.add(Integer.valueOf(paramInt));
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(paramInt, this);
  }
  
  public final void js(int paramInt)
  {
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(paramInt, this);
    this.eXU.remove(Integer.valueOf(paramInt));
    if (this.eXU.isEmpty())
    {
      baT();
      this.kQv = null;
      this.mContext = null;
      Object localObject = this.uXM;
      ((a)localObject).uXI = null;
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.b(385, (com.tencent.mm.ab.e)localObject);
      localObject = this.uXN;
      ((b)localObject).uXI = null;
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.b(385, (com.tencent.mm.ab.e)localObject);
      localObject = this.uXO.values().iterator();
      while (((Iterator)localObject).hasNext())
      {
        c localc = (c)((Iterator)localObject).next();
        x.i("MicroMsg.IDelayQueryOrder", "onDestory rtType %s", new Object[] { Integer.valueOf(localc.rtType) });
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.b(localc.rtType, localc);
      }
      this.uXO.clear();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */