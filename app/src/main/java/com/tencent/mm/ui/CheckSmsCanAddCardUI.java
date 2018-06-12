package com.tencent.mm.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ab.v;
import com.tencent.mm.bg.d;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.account.ui.SimpleLoginUI;
import com.tencent.mm.protocal.c.om;
import com.tencent.mm.protocal.c.on;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class CheckSmsCanAddCardUI
  extends MMActivity
  implements e
{
  private b diG;
  private String tho;
  
  private void coS()
  {
    Toast.makeText(this, getString(R.l.verify_authority_err), 1).show();
    LauncherUI.gm(this);
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paraml = (on)this.diG.dIE.dIL;
      paramString = paraml.cac;
      paraml = paraml.cad;
      x.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd cardid:%s extMsg:%s", new Object[] { paramString, paraml });
      Intent localIntent = new Intent();
      localIntent.putExtra("key_card_id", paramString);
      localIntent.putExtra("key_card_ext", paraml);
      localIntent.putExtra("key_from_scene", 8);
      localIntent.putExtra("key_is_sms_add_card", true);
      d.c(this, "card", ".ui.CardDetailUI", localIntent);
      finish();
      return;
    }
    coS();
  }
  
  protected final int getLayoutId()
  {
    return R.i.jump_to_biz_profile_loading;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mController.hideTitleView();
    if ((!au.HW()) || (au.Dr()))
    {
      MMWizardActivity.b(this, new Intent(this, SimpleLoginUI.class), getIntent());
      finish();
      return;
    }
    paramBundle = getIntent().getData();
    if (paramBundle != null)
    {
      String str = paramBundle.getHost();
      if ((!bi.oW(str)) && (str.equals("cardpackage"))) {
        break label212;
      }
      x.e("MicroMsg.CheckSmsCanAddCardUI", "err host, host = %s", new Object[] { str });
    }
    for (int i = 0;; i = 1)
    {
      if (i == 0) {
        break label255;
      }
      au.DF().a(1038, this);
      paramBundle = new b.a();
      paramBundle.dIG = new om();
      paramBundle.dIH = new on();
      paramBundle.dIF = 1038;
      paramBundle.uri = "/cgi-bin/mmbiz-bin/api/checksmscanaddcard";
      this.diG = paramBundle.KT();
      ((om)this.diG.dID.dIL).rsO = this.tho;
      x.i("MicroMsg.CheckSmsCanAddCardUI", "encry value is %s", new Object[] { this.tho });
      this.diG = v.a(this.diG);
      return;
      label212:
      this.tho = paramBundle.getQueryParameter("encrystr");
      x.i("MicroMsg.CheckSmsCanAddCardUI", "encryptCardInfo = %s", new Object[] { this.tho });
      if (bi.oW(this.tho)) {
        break;
      }
    }
    label255:
    coS();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(1038, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/CheckSmsCanAddCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */