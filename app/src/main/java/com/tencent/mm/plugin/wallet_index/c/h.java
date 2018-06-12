package com.tencent.mm.plugin.wallet_index.c;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.a.gw.a;
import com.tencent.mm.g.a.lo;
import com.tencent.mm.g.a.lo.a;
import com.tencent.mm.g.a.te;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.u;
import com.tencent.mm.wallet_core.tenpay.model.k;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class h
  extends c<te>
  implements e
{
  int pCR;
  int pCS = 0;
  gw pCT;
  lo pCU;
  long pCV;
  public c pCW = new h.1(this);
  public c<lo> pCX = new h.2(this);
  
  public h()
  {
    this.sFo = te.class.getName().hashCode();
  }
  
  private void cs(String paramString, int paramInt)
  {
    x.d("MicroMsg.WalletGetA8KeyRedirectListener", "startPay reqKey = " + paramString);
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.bVY = this.pCR;
    String[] arrayOfString = paramString.replace("http://p.qq.com?", "").split("&");
    int j = arrayOfString.length;
    int i = 0;
    paramString = null;
    Object localObject1 = null;
    String str1;
    if (i < j)
    {
      String str2 = arrayOfString[i];
      Object localObject2;
      if (str2.startsWith("errcode="))
      {
        localObject2 = str2.replace("errcode=", "");
        str1 = paramString;
      }
      for (;;)
      {
        i += 1;
        paramString = str1;
        localObject1 = localObject2;
        break;
        if (str2.startsWith("errmsg="))
        {
          str1 = str2.replace("errmsg=", "");
          localObject2 = localObject1;
        }
        else if (str2.startsWith("reqkey="))
        {
          localPayInfo.bOd = str2.replace("reqkey=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else if (str2.startsWith("uuid="))
        {
          localPayInfo.fMk = str2.replace("uuid=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else if (str2.startsWith("appid="))
        {
          localPayInfo.appId = str2.replace("appid=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else if (str2.startsWith("appsource="))
        {
          localPayInfo.pCO = str2.replace("appsource=", "");
          str1 = paramString;
          localObject2 = localObject1;
        }
        else
        {
          str1 = paramString;
          localObject2 = localObject1;
          if (str2.startsWith("productid="))
          {
            localPayInfo.bKk = str2.replace("productid=", "");
            str1 = paramString;
            localObject2 = localObject1;
          }
        }
      }
    }
    localPayInfo.bVU = paramInt;
    if ("0".equals(localObject1))
    {
      com.tencent.mm.pluginsdk.wallet.h.a(this.pCT.bQd.context, localPayInfo, 0);
      if (this.pCT.bJX != null)
      {
        this.pCT.bQe.ret = 1;
        this.pCT.bJX.run();
      }
    }
    for (;;)
    {
      if ((!TextUtils.isEmpty((CharSequence)localObject1)) && (Pattern.compile("[0-9]*").matcher((CharSequence)localObject1).matches())) {
        i(0, Integer.valueOf((String)localObject1).intValue(), 0L);
      }
      return;
      str1 = paramString;
      if (bi.oW(paramString)) {
        str1 = this.pCT.bQd.context.getString(a.i.wallet_unknown_err);
      }
      com.tencent.mm.ui.base.h.a(this.pCT.bQd.context, str1, "", new h.5(this));
    }
  }
  
  private void i(int paramInt1, int paramInt2, long paramLong)
  {
    int i = 132;
    if (this.pCR == 1) {
      i = 163;
    }
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey1 = new IDKey();
    localIDKey1.SetID(i);
    localIDKey1.SetValue(1L);
    localIDKey1.SetKey(26);
    localArrayList.add(localIDKey1);
    IDKey localIDKey2;
    IDKey localIDKey3;
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      localIDKey1 = new IDKey();
      localIDKey1.SetID(i);
      localIDKey1.SetValue(1L);
      localIDKey2 = new IDKey();
      localIDKey2.SetID(i);
      localIDKey2.SetValue(1L);
      localIDKey1.SetKey(8);
      if (paramInt2 < 0) {
        localIDKey2.SetKey(9);
      }
    }
    else if ((this.pCR == 4) && (paramLong > 0L))
    {
      localIDKey1 = new IDKey();
      localIDKey1.SetID(i);
      localIDKey1.SetValue(1L);
      localIDKey2 = new IDKey();
      localIDKey2.SetID(i);
      localIDKey2.SetValue(1L);
      localIDKey3 = new IDKey();
      localIDKey3.SetID(i);
      localIDKey3.SetValue((int)paramLong);
      localIDKey1.SetKey(0);
      if (paramLong > 1000L) {
        break label290;
      }
      localIDKey2.SetKey(1);
      localIDKey3.SetKey(4);
    }
    for (;;)
    {
      localArrayList.add(localIDKey1);
      localArrayList.add(localIDKey2);
      localArrayList.add(localIDKey3);
      com.tencent.mm.plugin.report.service.h.mEJ.b(localArrayList, true);
      return;
      if (paramInt2 <= 0) {
        break;
      }
      localIDKey2.SetKey(10);
      break;
      label290:
      if ((paramLong > 1000L) && (paramLong <= 3000L))
      {
        localIDKey2.SetKey(2);
        localIDKey3.SetKey(5);
      }
      else if (paramLong > 3000L)
      {
        localIDKey2.SetKey(3);
        localIDKey3.SetKey(6);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.modelsimple.h))
    {
      long l = System.currentTimeMillis() - this.pCV;
      com.tencent.mm.plugin.report.service.h.mEJ.h(11170, new Object[] { Integer.valueOf(233), Integer.valueOf(0), Long.valueOf(l), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(ao.getNetType(ad.getContext())), "" });
      i(paramInt1, paramInt2, l);
      x.d("MicroMsg.WalletGetA8KeyRedirectListener", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
      g.Ek();
      g.Eh().dpP.b(233, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        paraml = paramString;
        if (bi.oW(paramString)) {
          paraml = this.pCT.bQd.context.getString(a.i.wallet_unknown_err);
        }
        com.tencent.mm.ui.base.h.a(this.pCT.bQd.context, paraml, "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            if (h.this.pCT.bJX != null)
            {
              h.this.pCT.bQe.ret = 1;
              h.this.pCT.bJX.run();
            }
          }
        });
      }
    }
    do
    {
      return;
      cs(((com.tencent.mm.modelsimple.h)paraml).QL(), this.pCS);
      return;
      if (!(paraml instanceof k)) {
        break;
      }
      x.d("MicroMsg.WalletGetA8KeyRedirectListener", "native auth, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      g.Ek();
      g.Eh().dpP.b(385, this);
      if ((paramInt1 != 0) || (paramInt2 != 0) || (!"0".equals(((k)paraml).uYk)))
      {
        if (!bi.oW(paramString)) {}
        for (;;)
        {
          u.j(this.pCR, "", paramInt2);
          com.tencent.mm.ui.base.h.a(this.pCU.bVS.context, paramString, "", new h.4(this));
          return;
          if (!bi.oW(((k)paraml).fFG)) {
            paramString = ((k)paraml).fFG;
          } else {
            paramString = this.pCU.bVS.context.getString(a.i.wallet_unknown_err);
          }
        }
      }
      u.j(this.pCR, ((k)paraml).bOd, paramInt2);
      paramString = (k)paraml;
      paraml = new PayInfo();
      paraml.bVY = this.pCR;
      paraml.bOd = paramString.bOd;
      paraml.appId = paramString.appId;
      paraml.pCO = paramString.pCO;
      paraml.bKk = paramString.bKk;
      paraml.bVU = paramString.bVU;
      x.d("MicroMsg.WalletGetA8KeyRedirectListener", "startPay native, payInfo: %s", new Object[] { paraml.toString() });
      com.tencent.mm.pluginsdk.wallet.h.a(this.pCU.bVS.context, paraml, 0);
    } while (this.pCU.bJX == null);
    this.pCU.bVT.ret = 1;
    this.pCU.bJX.run();
    return;
    x.i("MicroMsg.WalletGetA8KeyRedirectListener", "other scene");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */