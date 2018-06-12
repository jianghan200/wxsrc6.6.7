package com.tencent.mm.plugin.wallet_payu.order.ui;

import android.app.Dialog;
import android.view.View;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.order.model.g;
import com.tencent.mm.plugin.order.model.i;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI;
import com.tencent.mm.plugin.order.ui.MallOrderRecordListUI.a;
import com.tencent.mm.plugin.wallet_payu.order.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.protocal.c.bad;
import com.tencent.mm.protocal.c.ban;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class PayUMallOrderRecordListUI
  extends MallOrderRecordListUI
{
  protected final void bmA()
  {
    jr(1519);
    jr(1544);
  }
  
  protected final void bmB()
  {
    js(1519);
    js(1544);
  }
  
  protected final void bmC()
  {
    a(new a(this.tH), true, true);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    Object localObject;
    boolean bool;
    if ((paraml instanceof a))
    {
      if (this.jhd != null)
      {
        this.jhd.dismiss();
        this.jhd = null;
      }
      paramString = (a)paraml;
      localObject = ((bad)paramString.diG.dIE.dIL).scP;
      paraml = new LinkedList();
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        ban localban = (ban)((Iterator)localObject).next();
        i locali = new i();
        locali.jSv = localban.jSv;
        locali.lOO = localban.lOO;
        locali.lOP = localban.lOP;
        locali.lOH = localban.lOH;
        locali.lOK = localban.lOK;
        locali.lOG = localban.lOG;
        locali.lON = "0";
        locali.lOJ = localban.lOJ;
        locali.lOM = localban.lOM;
        locali.lOS = 1;
        locali.lOR = localban.lOR;
        locali.lOQ = localban.lOQ;
        locali.lOL = localban.lOL;
        locali.lOF = localban.scI;
        locali.lOI = localban.lOI;
        locali.lOE = localban.lOE;
        paraml.add(locali);
      }
      bE(paraml);
      bF(null);
      this.mCount = this.lPM.size();
      if (paramString.bRl() > this.mCount)
      {
        bool = true;
        this.kUl = bool;
        this.lPL.notifyDataSetChanged();
        x.d("MicroMsg.PayUMallOrderRecordListUI", "orders list count: " + this.mCount);
        x.d("MicroMsg.PayUMallOrderRecordListUI", "orders list total record: " + paramString.bRl());
        x.d("MicroMsg.PayUMallOrderRecordListUI", "orders list has more: " + this.kUl);
        this.mHandler.post(new PayUMallOrderRecordListUI.1(this));
        this.acT = false;
      }
    }
    for (;;)
    {
      if ((this.mCount <= 0) && (this.lPM.size() == 0))
      {
        showOptionMenu(false);
        findViewById(a.f.empty_tip_layout).setVisibility(0);
        return true;
        bool = false;
        break;
        if ((paraml instanceof g))
        {
          if (this.jhd != null)
          {
            this.jhd.dismiss();
            this.jhd = null;
          }
          paramString = (g)paraml;
          label523:
          if (paramString.bmw() == 2)
          {
            if (this.lPM != null) {
              this.lPM.clear();
            }
            this.mCount = 0;
            this.kUl = false;
            this.hPi.crD();
          }
          for (;;)
          {
            this.mHandler.post(new PayUMallOrderRecordListUI.2(this));
            break;
            paramString = paramString.bmx();
            x.d("MicroMsg.PayUMallOrderRecordListUI", "delete transId:" + paramString);
            if (!bi.oW(paramString))
            {
              paraml = this.lPM.iterator();
              if (paraml.hasNext())
              {
                localObject = (i)paraml.next();
                if (!paramString.equals(((i)localObject).lOE)) {
                  break label523;
                }
                this.lPM.remove(localObject);
                this.mCount = this.lPM.size();
              }
            }
          }
        }
      }
    }
    showOptionMenu(true);
    findViewById(a.f.empty_tip_layout).setVisibility(8);
    return true;
  }
  
  protected final void ed(String paramString1, String paramString2)
  {
    a(new com.tencent.mm.plugin.wallet_payu.order.a.b(paramString1), true, true);
  }
  
  protected final String uu(int paramInt)
  {
    return e.a(paramInt, new SimpleDateFormat("dd MMMM", Locale.ENGLISH), new SimpleDateFormat("dd MMMM yyyy", Locale.ENGLISH));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/order/ui/PayUMallOrderRecordListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */