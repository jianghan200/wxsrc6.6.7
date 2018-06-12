package com.tencent.mm.plugin.setting.ui.qrcode;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.bp.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class ShareMicroMsgChoiceUI
  extends MMPreference
{
  private f eOE;
  
  public final int Ys()
  {
    return a.k.share_micromsg_choice;
  }
  
  protected final boolean Yy()
  {
    return false;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if (paramf.equals("share_micromsg_qzone")) {
      if (bi.f((Integer)g.Ei().DT().get(9, null)) != 0)
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 2);
        startActivity(paramf);
      }
    }
    for (;;)
    {
      return false;
      h.i(this, a.i.self_qrcode_show_no_qq_tip, a.i.app_tip);
      continue;
      if (paramf.equals("share_micromsg_to_sina"))
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 3);
        startActivity(paramf);
      }
      else if (paramf.equals("share_micromsg_to_fuckbook"))
      {
        paramf = new Intent(this, ShowQRCodeStep1UI.class);
        paramf.putExtra("show_to", 4);
        startActivity(paramf);
      }
    }
  }
  
  public final int getLayoutId()
  {
    return a.g.share_mm_choice;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.send_qrcode_to_microblog);
    this.eOE = this.tCL;
    setBackBtn(new ShareMicroMsgChoiceUI.1(this));
    ((IconPreference)this.eOE.ZZ("share_micromsg_to_sina")).drawable = a.f(this, a.e.share_to_sinaweibo_icon);
    ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().Hg("@t.qq.com");
    int i;
    IconPreference localIconPreference;
    if (bi.f((Integer)g.Ei().DT().get(9, null)) != 0)
    {
      i = 1;
      localIconPreference = (IconPreference)this.eOE.ZZ("share_micromsg_qzone");
      if (i != 0) {
        break label163;
      }
      this.eOE.c(localIconPreference);
    }
    for (;;)
    {
      localIconPreference = (IconPreference)this.eOE.ZZ("share_micromsg_to_fuckbook");
      if (!q.He()) {
        break label177;
      }
      localIconPreference.drawable = a.f(this, a.e.share_to_facebook_icon);
      return;
      i = 0;
      break;
      label163:
      localIconPreference.drawable = a.f(this, a.e.self_qrcode_show_to_qzone);
    }
    label177:
    this.eOE.c(localIconPreference);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/qrcode/ShareMicroMsgChoiceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */