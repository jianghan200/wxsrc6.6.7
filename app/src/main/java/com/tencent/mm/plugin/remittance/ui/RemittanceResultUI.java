package com.tencent.mm.plugin.remittance.ui;

import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.fp;
import com.tencent.mm.plugin.remittance.model.o;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.lr;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class RemittanceResultUI
  extends WalletBaseUI
{
  private Orders mCZ;
  
  private void E(Class<?> paramClass)
  {
    if (cDK() == null)
    {
      a(paramClass, getIntent());
      return;
    }
    cDK().c(this, paramClass, this.sy);
  }
  
  protected boolean brH()
  {
    return true;
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof o))
    {
      x.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      paramString = (o)paraml;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = paramString.mxu;
        x.i("MicroMsg.RemittanceResultUI", "on f2f succpage scene end, retcode: %s, retmsg: %s, exposesureInfo: %s", new Object[] { Integer.valueOf(paramString.hUm), paramString.hUn, paramString.pqb });
        if (paramString.hUm != 0) {}
      }
      for (;;)
      {
        try
        {
          this.sy.putByteArray("key_succpage_resp", paramString.toByteArray());
          E(RemittanceResultNewUI.class);
          finish();
          return true;
        }
        catch (Exception paramString)
        {
          x.printErrStackTrace("MicroMsg.RemittanceResultUI", paramString, "pass succ page resp error: %s", new Object[] { paramString.getMessage() });
          continue;
        }
        Toast.makeText(this, paramString.hUn, 1).show();
        E(RemittanceResultNewUI.class);
      }
    }
    return false;
  }
  
  protected int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    PayInfo localPayInfo;
    if (brH())
    {
      ux(4);
      getWindow().setBackgroundDrawableResource(a.c.transparent);
      this.mCZ = ((Orders)this.sy.getParcelable("key_orders"));
      localPayInfo = (PayInfo)this.sy.getParcelable("key_pay_info");
      if (localPayInfo == null) {
        break label703;
      }
    }
    label92:
    label488:
    label637:
    label643:
    label656:
    label666:
    label679:
    label703:
    for (int i = localPayInfo.bVY;; i = 0)
    {
      boolean bool1;
      boolean bool2;
      Object localObject1;
      if ((i == 31) || (i == 5))
      {
        bool1 = false;
        if (this.mCZ != null) {
          break label637;
        }
        bool2 = true;
        x.i("MicroMsg.RemittanceResultUI", "orders==null:%s, paysScene: %s, needFetchF2fData: %s", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i), Boolean.valueOf(bool1) });
        if (this.mCZ == null) {
          break label666;
        }
        x.i("MicroMsg.RemittanceResultUI", "is_use_new_paid_succ_page: %s", new Object[] { Integer.valueOf(this.mCZ.ppp) });
        if (this.mCZ.ppp != 1) {
          break label656;
        }
        if (!bool1) {
          break label666;
        }
        Object localObject2 = this.mCZ;
        if ((localPayInfo == null) || (localPayInfo.qUL == null)) {
          break label643;
        }
        x.i("MicroMsg.RemittanceResultUI", "fetch f2f data");
        String str1 = localPayInfo.qUL.getString("extinfo_key_11");
        localObject1 = "";
        paramBundle = (Bundle)localObject1;
        if (localObject2 != null)
        {
          paramBundle = (Bundle)localObject1;
          if (((Orders)localObject2).ppf.size() > 0) {
            paramBundle = ((Orders.Commodity)((Orders)localObject2).ppf.get(0)).bOe;
          }
        }
        i = localPayInfo.qUL.getInt("extinfo_key_15", 0);
        String str2 = localPayInfo.qUL.getString("extinfo_key_7");
        String str3 = localPayInfo.qUL.getString("extinfo_key_3");
        int j = localPayInfo.qUL.getInt("extinfo_key_12", 0);
        String str4 = localPayInfo.qUL.getString("extinfo_key_13");
        String str5 = localPayInfo.qUL.getString("extinfo_key_14");
        localObject2 = localPayInfo.qUL.getString("extinfo_key_16");
        localObject1 = localObject2;
        if (bi.oW((String)localObject2)) {
          localObject1 = paramBundle;
        }
        x.i("MicroMsg.RemittanceResultUI", "fetchF2fData, f2fid: %s, transid: %s, amount: %s, payerDesc: %s, recvDesc: %s, scanScene: %s, paySuccSign: %s, paySuccExtend: %s, channel: %s, payscene: %s", new Object[] { str1, localObject1, Integer.valueOf(i), str2, str3, Integer.valueOf(j), str4, str5, Integer.valueOf(localPayInfo.bVU), Integer.valueOf(localPayInfo.bVY) });
        jr(2773);
        int k = localPayInfo.bVU;
        int m = localPayInfo.bVY;
        a(new o(str1, (String)localObject1, i, str2, str3, k, j, str4, str5), true, true);
        i = 0;
        paramBundle = (PayInfo)this.sy.getParcelable("key_pay_info");
        if (paramBundle != null) {
          i = paramBundle.bVY;
        }
        if ((i == 33) || (i == 32) || (i == 48) || (i == 31))
        {
          localObject1 = new fp();
          ((fp)localObject1).bOc.bOd = paramBundle.bOd;
          if (i != 31) {
            break label679;
          }
        }
      }
      for (((fp)localObject1).bOc.type = 0;; ((fp)localObject1).bOc.type = 1) {
        do
        {
          if ((this.mCZ != null) && (!this.mCZ.ppf.isEmpty())) {
            ((fp)localObject1).bOc.bOe = ((Orders.Commodity)this.mCZ.ppf.get(0)).bOe;
          }
          com.tencent.mm.sdk.b.a.sFg.m((b)localObject1);
          return;
          bool1 = true;
          break;
          bool2 = false;
          break label92;
          E(RemittanceResultNewUI.class);
          finish();
          break label488;
          E(RemittanceResultOldUI.class);
          break label488;
          E(RemittanceResultNewUI.class);
          finish();
          break label488;
        } while ((i != 32) && (i != 33));
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(2773);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */