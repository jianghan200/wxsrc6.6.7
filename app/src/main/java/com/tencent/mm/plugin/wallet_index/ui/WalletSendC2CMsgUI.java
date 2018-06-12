package com.tencent.mm.plugin.wallet_index.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@com.tencent.mm.ui.base.a(7)
public class WalletSendC2CMsgUI
  extends WalletBaseUI
{
  private int fdx;
  private Map<String, String> pDL = null;
  
  private boolean PC(String paramString)
  {
    String str4;
    String str5;
    String str6;
    String str3;
    Object localObject;
    String str1;
    String str2;
    if (this.fdx == 1)
    {
      paramString = getIntent().getStringExtra("key_receiver");
      str4 = getIntent().getStringExtra("key_sender_des");
      str5 = getIntent().getStringExtra("key_receiver_des");
      str6 = URLEncoder.encode(getIntent().getStringExtra("key_url"));
      str3 = getIntent().getStringExtra("key_templateid");
      localObject = getIntent().getStringExtra("key_sceneid");
      str1 = getIntent().getStringExtra("key_receivertitle");
      str2 = getIntent().getStringExtra("key_sendertitle");
    }
    for (;;)
    {
      if ((!bi.oW(str6)) && (!bi.oW(str3)))
      {
        x.d("MicroMsg.WalletSendC2CMsgUI", "send c2c msg to" + paramString);
        a(new com.tencent.mm.plugin.wallet_index.c.f(paramString, str1, str2, str3, str4, str5, str6, (String)localObject), true, true);
        return true;
        localObject = bRh();
        if ((localObject != null) && (!bi.oW(paramString)))
        {
          str1 = URLDecoder.decode(bi.oV((String)((Map)localObject).get("receivertitle")));
          str2 = URLDecoder.decode(bi.oV((String)((Map)localObject).get("sendertitle")));
          str4 = URLDecoder.decode(bi.oV((String)((Map)localObject).get("senderdes")));
          str5 = URLDecoder.decode(bi.oV((String)((Map)localObject).get("receiverdes")));
          str6 = bi.oV((String)((Map)localObject).get("url"));
          str3 = URLDecoder.decode(bi.oV((String)((Map)localObject).get("templateid")));
          localObject = URLDecoder.decode(bi.oV((String)((Map)localObject).get("senceid")));
        }
      }
      else
      {
        x.w("MicroMsg.WalletSendC2CMsgUI", "url = " + bi.oW(str6) + "templateId=" + bi.oW(str3));
        return false;
      }
      localObject = null;
      str3 = null;
      str6 = null;
      str5 = null;
      str4 = null;
      str2 = null;
      str1 = null;
    }
  }
  
  private Map<String, String> bRh()
  {
    if (this.pDL == null)
    {
      Object localObject = getIntent().getStringExtra("packageExt");
      x.d("MicroMsg.WalletSendC2CMsgUI", "func[getPackageData] packageExt: " + (String)localObject);
      if (!bi.oW((String)localObject))
      {
        localObject = ((String)localObject).split("&");
        this.pDL = new HashMap();
        if ((localObject != null) && (localObject.length > 0))
        {
          int i = 0;
          while (i < localObject.length)
          {
            if (!bi.oW(localObject[i]))
            {
              String[] arrayOfString = localObject[i].split("=");
              if ((arrayOfString.length == 2) && (!bi.oW(arrayOfString[0]))) {
                this.pDL.put(arrayOfString[0], arrayOfString[1]);
              }
            }
            i += 1;
          }
        }
      }
    }
    return this.pDL;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 0;
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
      {
        x.i("MicroMsg.WalletSendC2CMsgUI", "Check jsapi suc & Go Select Contact");
        com.tencent.mm.pluginsdk.wallet.f.Ul(((com.tencent.mm.plugin.wallet_core.c.a)paraml).bOj());
        x.i("MicroMsg.WalletSendC2CMsgUI", "doCallSelectConversationUI");
        paramString = bRh();
        paramInt1 = i;
        if (paramString != null)
        {
          paramInt1 = i;
          if (paramString.containsKey("togroup"))
          {
            paramInt1 = i;
            if ("0".equals(paramString.get("togroup"))) {
              paramInt1 = 1;
            }
          }
        }
        paramString = new Intent();
        if (paramInt1 == 0) {
          break label272;
        }
      }
    }
    label272:
    for (paramInt1 = 7;; paramInt1 = 3)
    {
      paramString.putExtra("select_is_ret", true);
      paramString.putExtra("Select_Conv_Type", paramInt1);
      d.b(this, ".ui.transmit.SelectConversationUI", paramString, 1);
      return true;
      if ((paraml instanceof com.tencent.mm.plugin.wallet_index.c.f))
      {
        x.i("MicroMsg.WalletSendC2CMsgUI", "Send c2c msg suc");
        if (this.fdx == 1) {
          h.bA(this, getString(a.i.wallet_send_c2c_msg_resent));
        }
        for (;;)
        {
          finish();
          return true;
          h.bA(this, getString(a.i.has_send));
          setResult(-1);
        }
        if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.a))
        {
          x.e("MicroMsg.WalletSendC2CMsgUI", "Check jsapi fail");
          setResult(64536);
          finish();
          return true;
        }
        if ((paraml instanceof com.tencent.mm.plugin.wallet_index.c.f))
        {
          if (this.fdx == 1) {
            h.bA(this, paramString);
          }
          for (;;)
          {
            finish();
            return true;
            setResult(64536);
          }
        }
        setResult(64536);
        finish();
      }
      return false;
    }
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null) {
      x.d("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
    }
    while (paramInt1 == 1) {
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        paramIntent = paramIntent.getStringExtra("Select_Conv_User");
        x.d("MicroMsg.WalletSendC2CMsgUI", "Select user , " + bi.oV(paramIntent));
        if (!PC(paramIntent))
        {
          x.e("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
          setResult(64536);
          finish();
        }
        return;
        x.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
      }
      else
      {
        x.e("MicroMsg.WalletSendC2CMsgUI", "cancel select contact fail");
        setResult(0);
        finish();
        return;
      }
    }
    x.e("MicroMsg.WalletSendC2CMsgUI", "onActivityResult, unknown requestCode = " + paramInt1);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(8);
    this.fdx = getIntent().getIntExtra("key_scene", 0);
    x.i("MicroMsg.WalletSendC2CMsgUI", "scene:" + this.fdx);
    if (this.fdx == 0)
    {
      jr(580);
      if (getIntent() == null)
      {
        x.e("MicroMsg.WalletSendC2CMsgUI", "func[doCheckPayNetscene] intent null");
        setResult(64536);
        finish();
      }
    }
    while (PC(null))
    {
      return;
      a(new com.tencent.mm.plugin.wallet_core.c.a(getIntent().getStringExtra("appId"), getIntent().getStringExtra("timeStamp"), getIntent().getStringExtra("nonceStr"), getIntent().getStringExtra("packageExt"), getIntent().getStringExtra("signtype"), getIntent().getStringExtra("paySignature"), getIntent().getStringExtra("url"), 6, "getSendC2CMessageRequest", getIntent().getIntExtra("pay_channel", 0)), true, false);
      return;
    }
    x.d("MicroMsg.WalletSendC2CMsgUI", "doSendC2CMsg fail");
    setResult(64536);
    finish();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    js(580);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/ui/WalletSendC2CMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */