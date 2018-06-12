package com.tencent.mm.plugin.webwx.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.jp;
import com.tencent.mm.g.a.jp.a;
import com.tencent.mm.g.a.jq;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.protocal.c.ux;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

@com.tencent.mm.ui.base.a(3)
public class ExtDeviceWXLoginUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private boolean bTs = false;
  private String bZD = null;
  private int efG = 0;
  private ProgressDialog kxR = null;
  private boolean qma = false;
  private String qmk = null;
  private int qml;
  private int qmm;
  private boolean qmn = false;
  private Button qmo;
  private TextView qmp;
  private int type = 0;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (this.kxR != null)
    {
      this.kxR.dismiss();
      this.kxR = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtDeviceWXLoginUI", "onSceneEnd type[%d], [%d, %d]", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      au.DF().b(972, this);
      if (paraml.getType() == 972)
      {
        paramString = (com.tencent.mm.plugin.webwx.a.e)paraml;
        if ((paramString.qma) || (this.bTs))
        {
          paramString = (ux)paramString.dZf.dIE.dIL;
          if ((paramString != null) && (paramString.ryo != null)) {
            break label192;
          }
          paramString = null;
          paraml = new jq();
          paraml.bTp.bTq = paramString;
          paraml.bTp.bTr = this.efG;
          paraml.bTp.bTs = this.bTs;
          com.tencent.mm.sdk.b.a.sFg.m(paraml);
        }
      }
      for (;;)
      {
        this.type = 0;
        finish();
        return;
        label192:
        paramString = paramString.ryo.toByteArray();
        break;
        paraml.getType();
      }
    }
    if (paramInt2 == -1)
    {
      this.type = -1;
      if (!bi.oW(paramString))
      {
        ((CheckBox)findViewById(R.h.status_content_checkbox)).setVisibility(8);
        ((TextView)findViewById(R.h.status_content)).setVisibility(0);
        ((TextView)findViewById(R.h.status_content)).setText(paramString);
      }
      if (this.type != -1) {
        break label341;
      }
      if (this.qmo != null) {
        this.qmo.setEnabled(false);
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtDeviceWXLoginUI", "[oneliang][onSceneEnd]errType:%s,errCode:%s,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      return;
      if (paramInt2 != -2) {
        break;
      }
      this.type = -2;
      break;
      label341:
      if (this.type == -2)
      {
        if (this.qmo != null)
        {
          this.qmo.setEnabled(true);
          this.qmo.setText(R.l.webwx_login_retry);
        }
        if (this.qmp != null) {
          this.qmp.setVisibility(4);
        }
      }
    }
  }
  
  public void finish()
  {
    super.finish();
    overridePendingTransition(R.a.anim_not_change, R.a.push_down_out);
  }
  
  protected final int getLayoutId()
  {
    return R.i.device_wx_login;
  }
  
  protected final void initView()
  {
    this.bZD = getIntent().getStringExtra("intent.key.login.url");
    this.type = getIntent().getIntExtra("intent.key.type", 0);
    Object localObject2 = getIntent().getStringExtra("intent.key.title.string");
    this.efG = getIntent().getIntExtra("intent.key.icon.type", 0);
    String str1 = getIntent().getStringExtra("intent.key.ok.string");
    String str2 = getIntent().getStringExtra("intent.key.cancel.string");
    Object localObject1 = getIntent().getStringExtra("intent.key.content.string");
    this.qmk = getIntent().getStringExtra("intent.key.ok.session.list");
    this.qml = getIntent().getIntExtra("intent.key.login.client.version", 0);
    this.qmm = getIntent().getIntExtra("intent.key.function.control", 0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtDeviceWXLoginUI", "type:%s title:%s ok:%s content:%s", new Object[] { Integer.valueOf(this.type), localObject2, str1, localObject1 });
    setMMTitle("");
    if (!bi.oW((String)localObject2)) {
      ((TextView)findViewById(R.h.status_title)).setText((CharSequence)localObject2);
    }
    localObject2 = new jp();
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
    int i = ((jp)localObject2).bTl.bTm;
    int j = ((jp)localObject2).bTl.bTn;
    int k = ((jp)localObject2).bTl.bTo;
    switch (this.efG)
    {
    default: 
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUX, Integer.valueOf(0));
      if (!bi.oW((String)localObject1))
      {
        ((CheckBox)findViewById(R.h.status_content_checkbox)).setVisibility(8);
        ((TextView)findViewById(R.h.status_content)).setVisibility(0);
        ((TextView)findViewById(R.h.status_content)).setText((CharSequence)localObject1);
        label345:
        localObject1 = (ImageView)findViewById(R.h.status_icon);
        if (this.efG == 1) {
          break label899;
        }
        if (this.efG != 2) {
          break label861;
        }
        ((ImageView)localObject1).setImageResource(R.k.connect_mac);
        label381:
        this.qmp = ((TextView)findViewById(R.h.webwx_logoutBt));
        this.qmp.setText(str2);
        this.qmp.setOnClickListener(new ExtDeviceWXLoginUI.1(this));
        this.qmo = ((Button)findViewById(R.h.webwx_loginBt));
        if (bi.oW(str1)) {
          break label966;
        }
        this.qmo.setText(str1);
        if (this.type != 0) {
          break label910;
        }
        this.qmo.setEnabled(true);
      }
      break;
    }
    for (;;)
    {
      this.qmo.setOnClickListener(new ExtDeviceWXLoginUI.2(this));
      this.mController.contentView.post(new ExtDeviceWXLoginUI.3(this));
      ((TextView)findViewById(R.h.webwx_login_closeBt)).setOnClickListener(new ExtDeviceWXLoginUI.4(this));
      au.DF().a(972, this);
      au.DF().a(973, this);
      return;
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUX, Integer.valueOf(3));
      break;
      au.HU();
      com.tencent.mm.model.c.DT().a(aa.a.sUX, Integer.valueOf(4));
      break;
      if (i < 0) {
        break label345;
      }
      if ((this.qmm & 0x1) > 0) {}
      for (boolean bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ExtDeviceWXLoginUI", "msgsynchronize needCheckedSync[%b], iconType[%d]", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.efG) });
        if ((this.efG != 1) || (this.qml < j)) {
          break label747;
        }
        this.qma = true;
        ((TextView)findViewById(R.h.status_content)).setVisibility(8);
        ((CheckBox)findViewById(R.h.status_content_checkbox)).setVisibility(0);
        ((CheckBox)findViewById(R.h.status_content_checkbox)).setText(R.l.webwx_login_msg_synchronize_windows);
        if (bool)
        {
          au.HU();
          if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sUW, Boolean.valueOf(true))).booleanValue()) {
            break;
          }
        }
        ((CheckBox)findViewById(R.h.status_content_checkbox)).setChecked(false);
        break;
      }
      label747:
      if ((this.efG != 2) || (this.qml < k)) {
        break label345;
      }
      this.qma = true;
      ((TextView)findViewById(R.h.status_content)).setVisibility(8);
      ((CheckBox)findViewById(R.h.status_content_checkbox)).setVisibility(0);
      ((CheckBox)findViewById(R.h.status_content_checkbox)).setText(R.l.webwx_login_msg_synchronize_mac);
      if (bool)
      {
        au.HU();
        if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sUW, Boolean.valueOf(true))).booleanValue()) {
          break label345;
        }
      }
      ((CheckBox)findViewById(R.h.status_content_checkbox)).setChecked(false);
      break label345;
      label861:
      if (this.efG == 3)
      {
        ((ImageView)localObject1).setImageResource(R.k.connect_ipad);
        break label381;
      }
      if (this.efG == 5)
      {
        ((ImageView)localObject1).setImageResource(R.k.connect_wx_album);
        break label381;
      }
      label899:
      ((ImageView)localObject1).setImageResource(R.k.connect_pc);
      break label381;
      label910:
      if (this.type == -1)
      {
        this.qmo.setEnabled(false);
        if (this.efG == 5) {
          this.qmp.setVisibility(8);
        }
      }
      else if (this.type == -2)
      {
        this.qmo.setEnabled(true);
        continue;
        label966:
        this.qmo.setVisibility(4);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getSupportActionBar().hide();
    initView();
    overridePendingTransition(R.a.push_up_in, R.a.anim_not_change);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(972, this);
    au.DF().b(973, this);
  }
  
  protected void onPause()
  {
    super.onPause();
    xt localxt;
    if ((this.qmn) && (au.HX()))
    {
      localxt = new xt();
      localxt.rDz = 27;
      if (!q.gT(q.GL())) {
        break label75;
      }
    }
    label75:
    for (int i = 1;; i = 2)
    {
      localxt.rDA = i;
      au.HU();
      com.tencent.mm.model.c.FQ().b(new h.a(23, localxt));
      this.qmn = false;
      return;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webwx/ui/ExtDeviceWXLoginUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */