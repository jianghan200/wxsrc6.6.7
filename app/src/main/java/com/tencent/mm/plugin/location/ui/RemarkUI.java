package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.plugin.map.a.e;
import com.tencent.mm.plugin.map.a.f;
import com.tencent.mm.plugin.map.a.h;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.tools.MMTextInputUI;

public class RemarkUI
  extends MMTextInputUI
{
  protected final int getLayoutId()
  {
    return a.f.remark_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.h.location_remark_hint);
    paramBundle = getIntent().getStringExtra("Kwebmap_locaion");
    if (bi.oW(paramBundle))
    {
      findViewById(a.e.location_info_ll).setVisibility(8);
      return;
    }
    ((TextView)findViewById(a.e.location_text_tv)).setText(paramBundle);
  }
  
  protected final void w(CharSequence paramCharSequence)
  {
    long l = getIntent().getLongExtra("kFavInfoLocalId", -1L);
    if (l > 0L) {
      if (paramCharSequence != null) {
        break label140;
      }
    }
    label140:
    for (paramCharSequence = "";; paramCharSequence = paramCharSequence.toString())
    {
      x.i("MicroMsg.MMTextInputUI", "same remark[%s]", new Object[] { paramCharSequence });
      if (!paramCharSequence.equals(getIntent().getStringExtra("kRemark")))
      {
        ch localch = new ch();
        localch.bJF.type = -2;
        localch.bJF.bJv = Long.toString(l);
        localch.bJF.desc = paramCharSequence;
        x.d("MicroMsg.MMTextInputUI", "update location remark, favlocalid is %s, remark is %s", new Object[] { localch.bJF.bJv, localch.bJF.desc });
        a.sFg.m(localch);
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/location/ui/RemarkUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */