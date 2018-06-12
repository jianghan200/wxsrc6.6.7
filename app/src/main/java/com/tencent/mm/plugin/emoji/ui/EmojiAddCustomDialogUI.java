package com.tencent.mm.plugin.emoji.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.n;
import com.tencent.mm.plugin.emoji.f.f;
import com.tencent.mm.plugin.emoji.f.g;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.protocal.c.er;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.ui.MMBaseActivity;
import java.util.ArrayList;
import java.util.LinkedList;

public class EmojiAddCustomDialogUI
  extends MMBaseActivity
  implements com.tencent.mm.ab.e
{
  private ProgressDialog eEX;
  private String fHy;
  private int fdx;
  private String ilc;
  private EmojiInfo ild;
  private com.tencent.mm.ui.widget.a.c ile;
  private com.tencent.mm.ui.widget.a.c ilf;
  private Context mContext;
  private ag mHandler = new EmojiAddCustomDialogUI.1(this);
  
  private void aFA()
  {
    x.d("MicroMsg.emoji.EmojiAddCustomDialogUI", "dealSaveSuccess");
    int i;
    if (this.ild.field_catalog != EmojiInfo.tcH)
    {
      this.ild.field_catalog = EmojiInfo.tcH;
      i = i.aEA().igx.cnM();
      if (i >= n.aEj()) {
        break label323;
      }
      i = n.aEj();
    }
    for (;;)
    {
      this.ild.field_reserved3 = i;
      i.aEA().igx.p(this.ild);
      com.tencent.mm.plugin.report.service.h.mEJ.h(10431, new Object[] { Integer.valueOf(this.fdx), this.ild.Xh(), this.ild.field_designerID, this.ild.field_groupId, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(this.ild.field_size), this.ilc, this.ild.field_activityid });
      com.tencent.mm.plugin.emoji.e.e.aDM().c(this.ild, false);
      Object localObject = this.ild.cnF() + "_cover";
      if ((!bi.oW(this.ild.field_thumbUrl)) && (!com.tencent.mm.a.e.cn((String)localObject)))
      {
        c.a locala = new c.a();
        locala.dXA = ((String)localObject);
        locala.dXy = true;
        locala.dXw = false;
        localObject = locala.Pt();
        com.tencent.mm.ak.o.Pj().a(this.ild.field_thumbUrl, null, (com.tencent.mm.ak.a.a.c)localObject);
      }
      localObject = i.aEA().igy;
      if (!com.tencent.mm.storage.emotion.a.cnl()) {
        i.aEA().igy.cnm();
      }
      aFs();
      com.tencent.mm.ui.base.h.bA(this.mContext, ad.getContext().getString(R.l.app_added));
      finish();
      return;
      label323:
      i += 1;
    }
  }
  
  private void aFB()
  {
    this.ile = com.tencent.mm.ui.base.h.a(this.mContext, R.l.emoji_upper_limit_warning, R.l.app_empty_string, R.l.emoji_store_mgr_alert, R.l.app_cancel, new EmojiAddCustomDialogUI.3(this), new EmojiAddCustomDialogUI.4(this));
    if (this.ile != null) {
      this.ile.setOnDismissListener(new EmojiAddCustomDialogUI.5(this));
    }
  }
  
  private void aFz()
  {
    x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error.");
    aFs();
    com.tencent.mm.ui.base.h.bA(this.mContext, ad.getContext().getString(R.l.emoji_add_failed));
    com.tencent.mm.plugin.report.service.h.mEJ.h(10431, new Object[] { Integer.valueOf(this.fdx), this.ild.Xh(), this.ild.field_designerID, this.ild.field_groupId, Integer.valueOf(1), Integer.valueOf(3), Integer.valueOf(this.ild.field_size), this.ilc, this.ild.field_activityid });
    finish();
  }
  
  private static void i(EmojiInfo paramEmojiInfo)
  {
    x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji start.do NetSceneBackupEmojiOperate ");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramEmojiInfo.Xh());
    paramEmojiInfo = new com.tencent.mm.plugin.emoji.f.c(1, localArrayList);
    au.DF().a(paramEmojiInfo, 0);
  }
  
  private void zK(String paramString)
  {
    this.ilf = com.tencent.mm.ui.base.h.b(this, paramString, "", true);
    this.ilf.setOnDismissListener(new EmojiAddCustomDialogUI.8(this));
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    int i = paraml.getType();
    if (i == 698) {
      if (paramInt2 == 65102)
      {
        x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd error over size.");
        aFs();
        aFB();
        com.tencent.mm.plugin.report.service.h.mEJ.h(10431, new Object[] { Integer.valueOf(this.fdx), this.ild.Xh(), this.ild.field_designerID, this.ild.field_groupId, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(this.ild.field_size), this.ilc, this.ild.field_activityid });
      }
    }
    do
    {
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji onSceneEnd ok.");
        paramString = (er)((com.tencent.mm.plugin.emoji.f.c)paraml).diG.dIE.dIL;
        if ((paramString != null) && (paramString.rff != null) && (paramString.rff.size() > 0))
        {
          x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "upload size is %d", new Object[] { Integer.valueOf(paramString.rff.size()) });
          paramString.rff.get(0);
          paramString = new f(this.ild);
          au.DF().a(paramString, 0);
          x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "start upload emoji");
          return;
        }
        aFA();
        return;
      }
      aFz();
      return;
      if (i == 423)
      {
        paramString = (g)paraml;
        if ((paramString != null) && (!bi.oW(paramString.iiv)) && (this.ild != null) && (!bi.oW(this.ild.field_groupId)) && (this.ild.field_groupId.equalsIgnoreCase(paramString.iiv)))
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            i(this.ild);
            return;
          }
          if (paramInt2 == 4)
          {
            aFs();
            zK(getString(R.l.emoji_add_failed_no_play));
            return;
          }
          if (paramInt2 == 8)
          {
            aFs();
            zK(getString(R.l.emoji_add_failed_no_area));
            return;
          }
          if (paramInt2 == 9)
          {
            aFs();
            zK(getString(R.l.emoji_add_failed_expired));
            return;
          }
          if (paramInt2 == -2)
          {
            aFs();
            zK(getString(R.l.emoji_add_failed_no_try));
            return;
          }
          aFs();
          zK(getString(R.l.emoji_add_failed));
          return;
        }
        x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "no the same product ID");
        return;
      }
    } while (i != 703);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      aFA();
      return;
    }
    aFz();
  }
  
  protected final void aFs()
  {
    if (this.mHandler != null) {
      this.mHandler.removeMessages(1001);
    }
    if ((this.eEX != null) && (this.eEX.isShowing())) {
      this.eEX.dismiss();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setStatusBarColor(0);
    }
    this.mContext = this;
    this.fHy = getIntent().getStringExtra("extra_id");
    this.fdx = getIntent().getIntExtra("extra_scence", -1);
    this.ilc = getIntent().getStringExtra("extra_username");
    if (bi.oW(this.fHy))
    {
      x.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "md5 is null.");
      finish();
    }
    this.ild = i.aEA().igx.Zy(this.fHy);
    au.DF().a(698, this);
    au.DF().a(423, this);
    au.DF().a(703, this);
    this.mHandler.sendEmptyMessageDelayed(1001, 300L);
    Object localObject = this.mContext;
    paramBundle = this.ild;
    if (localObject == null)
    {
      x.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. context is null");
      return;
    }
    if (paramBundle == null)
    {
      x.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "[cpan] save emoji failed. emoji is null");
      return;
    }
    localObject = com.tencent.mm.ui.tools.a.b.abg(paramBundle.cnF());
    ((com.tencent.mm.ui.tools.a.b)localObject).fi = com.tencent.mm.k.b.Ay();
    ((com.tencent.mm.ui.tools.a.b)localObject).Gh(com.tencent.mm.k.b.Az()).a(new EmojiAddCustomDialogUI.2(this, paramBundle));
  }
  
  protected void onDestroy()
  {
    au.DF().b(698, this);
    au.DF().b(423, this);
    au.DF().b(703, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/EmojiAddCustomDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */