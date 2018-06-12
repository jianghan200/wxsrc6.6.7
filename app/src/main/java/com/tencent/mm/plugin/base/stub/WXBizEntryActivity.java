package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.u;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.c.cp;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public class WXBizEntryActivity
  extends AutoLoginActivity
{
  private int hdK;
  
  protected final boolean A(Intent paramIntent)
  {
    return true;
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    String str1 = null;
    paramIntent = null;
    x.i("MicroMsg.WXBizEntryActivity", "postLogin, loginResult = " + parama);
    if (getIntent() != null) {
      this.hdK = getIntent().getIntExtra("key_command_id", 0);
    }
    switch (WXBizEntryActivity.6.hdM[parama.ordinal()])
    {
    default: 
      x.e("MicroMsg.WXBizEntryActivity", "postLogin, unknown login result = " + parama);
    }
    for (;;)
    {
      finish();
      for (;;)
      {
        return;
        x.i("MicroMsg.WXBizEntryActivity", "req type = %d", new Object[] { Integer.valueOf(this.hdK) });
        switch (this.hdK)
        {
        case 10: 
        case 18: 
        case 20: 
        case 21: 
        case 22: 
        case 23: 
        default: 
          finish();
          return;
        case 9: 
          com.tencent.mm.bg.d.c(this, "card", ".ui.CardAddEntranceUI", getIntent());
          finish();
          return;
        case 16: 
          com.tencent.mm.bg.d.c(this, "card", ".ui.CardListSelectedUI", getIntent());
          finish();
          return;
        case 7: 
        case 8: 
          parama = getIntent();
          parama.setClassName(this, "com.tencent.mm.ui.CheckCanSubscribeBizUI");
          startActivity(parama);
          finish();
          return;
        case 11: 
          parama = getIntent();
          parama.putExtra("device_type", 1);
          com.tencent.mm.bg.d.c(this, "exdevice", ".ui.ExdeviceRankInfoUI", parama);
          finish();
          return;
        case 13: 
          parama = getIntent();
          parama.putExtra("key_static_from_scene", 100001);
          com.tencent.mm.bg.d.c(this, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", parama);
          finish();
          return;
        case 14: 
        case 15: 
          new a(this, getIntent().getStringExtra("key_app_id"), getIntent().getStringExtra("open_id"), new WXBizEntryActivity.1(this)).atx();
          return;
        case 17: 
          String str2;
          int i;
          try
          {
            paramIntent = getIntent().getData();
            parama = new WXBizEntryActivity.2(this);
            str1 = getIntent().getStringExtra("key_package_name");
            str2 = getIntent().getStringExtra("key_package_signature");
            i = getIntent().getIntExtra("translate_link_scene", 1);
            x.d("MicroMsg.WXBizLogic", "dealWithHandleScanResult: callPackage=%s, packageSignature=%s", new Object[] { str1, str2 });
            if ((bi.oW(str1)) || (bi.oW(str2)))
            {
              x.e("MicroMsg.WXBizLogic", "dealWithHandleScanResult:packageName or signature null");
              return;
            }
          }
          catch (Exception parama)
          {
            x.e("MicroMsg.WXBizEntryActivity", "get url from intent failed : %s", new Object[] { parama.getMessage() });
            return;
          }
          LinkedList localLinkedList = new LinkedList();
          cp localcp = new cp();
          x.i("MicroMsg.WXBizLogic", "dealWithHandleScanResult package name = %s", new Object[] { str1 });
          localcp.rcN = str1;
          localcp.signature = str2;
          localLinkedList.add(localcp);
          paramIntent = new aa(paramIntent.toString(), i, localLinkedList);
          parama = new e.1(this, parama);
          au.DF().a(1200, parama);
          au.DF().a(paramIntent, 0);
          return;
        case 12: 
          try
          {
            parama = getIntent().getData();
            if ((parama != null) && (com.tencent.mm.pluginsdk.d.SB(parama.toString())))
            {
              u.Hx().ib("key_data_center_session_id");
              com.tencent.mm.pluginsdk.d.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new WXBizEntryActivity.3(this), getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
              return;
            }
          }
          catch (Exception parama)
          {
            for (;;)
            {
              x.e("MicroMsg.WXBizEntryActivity", "post login get url from intent failed : %s", new Object[] { parama.getMessage() });
              parama = paramIntent;
            }
          }
        case 19: 
          try
          {
            parama = getIntent().getData();
            if (parama != null)
            {
              com.tencent.mm.pluginsdk.d.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new WXBizEntryActivity.4(this), getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
              return;
            }
          }
          catch (Exception parama)
          {
            for (;;)
            {
              x.e("MicroMsg.WXBizEntryActivity", "get data from intent for launch wxminiprogram failed : %s", new Object[] { parama.getMessage() });
              parama = str1;
            }
          }
        case 24: 
          try
          {
            parama = getIntent().getData();
            if (parama != null)
            {
              com.tencent.mm.pluginsdk.d.a(this, parama.toString(), getIntent().getIntExtra("translate_link_scene", 1), new WXBizEntryActivity.5(this), getIntent().getStringExtra("key_package_name"), getIntent().getStringExtra("key_package_signature"));
              return;
            }
          }
          catch (Exception parama)
          {
            for (;;)
            {
              x.e("MicroMsg.WXBizEntryActivity", "get data from intent for offline pay failed : %s", new Object[] { parama.getMessage() });
              parama = null;
            }
          }
        }
      }
      x.e("MicroMsg.WXBizEntryActivity", "postLogin fail, loginResult = " + parama);
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.biz_share_check;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitleVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/base/stub/WXBizEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */