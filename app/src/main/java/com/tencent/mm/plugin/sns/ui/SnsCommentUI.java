package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;

@com.tencent.mm.ui.base.a(17)
public class SnsCommentUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private int bNv;
  private SnsEditText nVT;
  private int nVU = 0;
  private boolean nVV = false;
  private boolean nVW = false;
  private int nkZ;
  private p tipDialog = null;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SnsCommentUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " type = " + paraml.getType() + " @" + hashCode());
    if (this.tipDialog != null) {
      this.tipDialog.dismiss();
    }
    switch (paraml.getType())
    {
    }
    do
    {
      return;
    } while (!this.nVV);
    finish();
  }
  
  public void finish()
  {
    super.finish();
    long l1;
    long l2;
    String str1;
    String str2;
    long l3;
    if ((!this.nVW) && (this.nVU == 2))
    {
      l1 = getIntent().getLongExtra("sns_id", 0L);
      l2 = getIntent().getLongExtra("action_st_time", 0L);
      str1 = bi.aG(getIntent().getStringExtra("sns_uxinfo"), "");
      str2 = bi.aG(getIntent().getStringExtra("sns_actionresult"), "");
      str2 = str2 + "|4:0:";
      l3 = System.currentTimeMillis();
      localObject = af.byg().bzh();
      if ((localObject != null) && (((com.tencent.mm.plugin.sns.f.h)localObject).bzi())) {}
    }
    else
    {
      return;
    }
    String str3 = ((com.tencent.mm.plugin.sns.f.h)localObject).ntY;
    Object localObject = ((com.tencent.mm.plugin.sns.f.h)localObject).ntX;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SnsCommentUI", "report abtestnotlike " + l1 + " uxinfo:" + str1 + " actionresult: " + str2 + " " + l2 + " " + l3);
    com.tencent.mm.plugin.report.service.h.mEJ.h(11988, new Object[] { str3, localObject, "", "", i.eF(l1), str1, str2, Long.valueOf(l2 / 1000L), Long.valueOf(l3 / 1000L) });
  }
  
  protected final int getLayoutId()
  {
    return i.g.sns_comment_ui;
  }
  
  protected final void initView()
  {
    this.nVT = ((SnsEditText)findViewById(i.f.content));
    this.nVT.setTextSize(1, ah.fe(this.mController.tml) * this.nVT.getTextSize() / com.tencent.mm.bp.a.getDensity(this.mController.tml));
    a(0, getString(i.j.app_send), new SnsCommentUI.2(this), s.b.tmX);
    if (this.nVU == 0) {
      setMMTitle(i.j.sns_comment_title);
    }
    for (;;)
    {
      setBackBtn(new SnsCommentUI.3(this));
      this.nVT.addTextChangedListener(new SnsCommentUI.4(this));
      return;
      if (this.nVU == 1)
      {
        setMMTitle(i.j.sns_wirte_down);
        com.tencent.mm.kernel.g.Ek();
        String str = bi.aG((String)com.tencent.mm.kernel.g.Ei().DT().get(68408, ""), "");
        com.tencent.mm.kernel.g.Ek();
        int i = bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(7489, Integer.valueOf(0)), 0);
        this.nVT.setPasterLen(i);
        this.nVT.append(bi.aG(str, ""));
        if ((str != null) && (str.length() > 0)) {
          enableOptionMenu(true);
        } else {
          enableOptionMenu(false);
        }
      }
      else if (this.nVU == 2)
      {
        setMMTitle(i.j.sns_ad_abtest_not_like_title);
        enableOptionMenu(false);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.nkZ = getIntent().getIntExtra("sns_comment_localId", 0);
    this.nVU = getIntent().getIntExtra("sns_comment_type", 0);
    this.bNv = getIntent().getIntExtra("sns_source", 0);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(213, this);
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(213, this);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      YC();
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    if (this.nVT != null)
    {
      String str = this.nVT.getText().toString().trim();
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().set(68408, str);
      if (!bi.oW(str))
      {
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().set(7489, Integer.valueOf(this.nVT.getPasterLen()));
      }
    }
    else
    {
      return;
    }
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Ei().DT().set(7489, Integer.valueOf(0));
  }
  
  public void onResume()
  {
    super.onResume();
    showVKB();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsCommentUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */