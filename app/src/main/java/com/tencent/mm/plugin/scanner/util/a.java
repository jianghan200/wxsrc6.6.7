package com.tencent.mm.plugin.scanner.util;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.ab;
import com.tencent.mm.plugin.scanner.a.f;
import com.tencent.mm.plugin.scanner.b;
import com.tencent.mm.plugin.scanner.ui.ProductUI;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.j;
import com.tencent.mm.protocal.c.ik;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;

public final class a
  implements com.tencent.mm.ab.e
{
  public Bundle bJx;
  public Activity bOb;
  public ProgressDialog eHw;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.BarcodeStringHandler", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    bsT();
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 4) && (paramInt2 == -4)) {
      h.a(this.bOb, R.l.qrcode_no_user_tip, R.l.app_tip, null);
    }
    label259:
    do
    {
      do
      {
        return;
        switch (paramInt1)
        {
        default: 
          i = 0;
        }
        while (i == 0)
        {
          if ((paramInt1 != 4) || (paramInt2 != 63532)) {
            break label259;
          }
          h.i(this.bOb, R.l.qrcode_ban_by_expose, R.l.app_tip);
          return;
          if (au.DF().Lh())
          {
            au.DF().getNetworkServerIp();
            new StringBuilder().append(paramInt2);
          }
          for (;;)
          {
            i = 1;
            break;
            if (ab.bU(this.bOb)) {
              j.eY(this.bOb);
            } else {
              Toast.makeText(this.bOb, this.bOb.getString(R.l.fmt_http_err, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2) }), 1).show();
            }
          }
          Toast.makeText(this.bOb, this.bOb.getString(R.l.fmt_iap_err), 1).show();
          i = 1;
        }
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          Toast.makeText(this.bOb, this.bOb.getString(R.l.fmt_search_err, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
          return;
        }
      } while (paraml.getType() != 1061);
      localObject = ((f)paraml).bsb();
      if (localObject == null)
      {
        x.e("MicroMsg.BarcodeStringHandler", "onSceneEnd(), getResp() == null");
        return;
      }
      x.d("MicroMsg.BarcodeStringHandler", "onSceneEnd() ScanBarcode Type = %s", new Object[] { Integer.valueOf(((ik)localObject).hcE) });
    } while (bi.oW(((ik)localObject).rjl));
    paramInt1 = ((ik)localObject).hcE;
    paramString = this.bOb;
    Object localObject = ((ik)localObject).rjl;
    paramInt2 = ((f)paraml).bJr;
    int i = ((f)paraml).bJs;
    e locale = new e();
    paraml = this.bJx;
    int j = n.KP((String)localObject);
    x.d("MicroMsg.Scanner.ScanXmlHelper", "processReturnXml(), xmlType = [%s]", new Object[] { Integer.valueOf(j) });
    n.c localc;
    if (j == 1)
    {
      localc = n.KQ((String)localObject);
      if ((localc == null) || (bi.oW(localc.username)))
      {
        x.w("MicroMsg.Scanner.ScanXmlHelper", "xmlUser null");
        paramInt1 = 2;
      }
    }
    for (;;)
    {
      switch (paramInt1)
      {
      default: 
        return;
      case 0: 
        x.i("MicroMsg.BarcodeStringHandler", "onSceneEnd PROCESS_XML_RETURN_TYPE_OK");
        return;
        au.HU();
        localObject = c.FR().Yg(localc.username);
        if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).dhP > 0))
        {
          paraml = new Intent();
          paraml.putExtra("Contact_User", ((ai)localObject).field_username);
          paraml.setFlags(65536);
          b.ezn.d(paraml, paramString);
          paramInt1 = 0;
        }
        else
        {
          locale.a(paramString, localc.username, 2, paramInt2, i, null, paraml);
          paramInt1 = 1;
          continue;
          if (j == 2)
          {
            localObject = n.KR((String)localObject);
            if ((localObject == null) || (bi.oW(((n.b)localObject).egr)))
            {
              x.w("MicroMsg.Scanner.ScanXmlHelper", "xmlurl null");
              paramInt1 = 2;
            }
            else
            {
              x.d("MicroMsg.Scanner.ScanXmlHelper", "xmlurl.link: [%s]", new Object[] { ((n.b)localObject).egr });
              if (paramInt1 == 5)
              {
                ((com.tencent.mm.plugin.appbrand.n.e)g.l(com.tencent.mm.plugin.appbrand.n.e.class)).b(paramString, ((n.b)localObject).egr, 1031, paraml);
                paramInt1 = 0;
              }
              else
              {
                paraml = new Intent();
                paraml.putExtra("rawUrl", ((n.b)localObject).egr);
                paraml.setFlags(65536);
                b.ezn.j(paraml, paramString);
                paramInt1 = 0;
              }
            }
          }
          else if ((j == 3) || (j == 4))
          {
            x.d("MicroMsg.Scanner.ScanXmlHelper", "funcType = [%s], addProductToDB = [%s]", new Object[] { Integer.valueOf(4), Boolean.valueOf(true) });
            paraml = new Intent();
            paraml.setClass(paramString, ProductUI.class);
            paraml.setFlags(65536);
            paraml.putExtra("key_Product_xml", (String)localObject);
            paraml.putExtra("key_Product_funcType", 4);
            paraml.putExtra("key_ProductUI_addToDB", true);
            paraml.putExtra("key_need_add_to_history", true);
            paraml.putExtra("key_is_from_barcode", true);
            paramString.startActivity(paraml);
            paramInt1 = 0;
          }
          else
          {
            x.w("MicroMsg.Scanner.ScanXmlHelper", "wrong xmlType");
            x.v("MicroMsg.Scanner.ScanXmlHelper", "wrong xml : [%s]", new Object[] { localObject });
            paramInt1 = 2;
          }
        }
        break;
      }
    }
    x.i("MicroMsg.BarcodeStringHandler", "onSceneEnd() PROCESS_XML_RETURN_TYPE_SEARCH_CONTACT");
    return;
    x.e("MicroMsg.BarcodeStringHandler", "onSceneEnd() PROCESS_XML_RETURN_TYPE_WRONG");
  }
  
  final void bsT()
  {
    au.DF().b(1061, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */