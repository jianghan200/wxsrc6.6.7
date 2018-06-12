package com.tencent.mm.plugin.card.sharecard.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.tencent.mm.plugin.card.b.e;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo;
import com.tencent.mm.ui.MMActivity;

public final class i
{
  MMActivity gKS;
  View hAr;
  TextView hAs;
  TextView hAt;
  private boolean hAu = false;
  private View hyK;
  
  public i(MMActivity paramMMActivity, View paramView)
  {
    this.gKS = paramMMActivity;
    this.hyK = paramView;
  }
  
  public final void aL()
  {
    Integer localInteger = (Integer)am.axn().getValue("key_share_card_show_type");
    Object localObject = localInteger;
    if (localInteger == null) {
      localObject = Integer.valueOf(0);
    }
    if ((((Integer)localObject).intValue() != 0) && (!b.axI()))
    {
      this.hAr.setVisibility(0);
      this.hAs.setVisibility(0);
      localObject = new ShareCardInfo();
      if (!TextUtils.isEmpty(((ShareCardInfo)localObject).nF(10)))
      {
        this.hAs.setVisibility(0);
        this.hAs.setText(((ShareCardInfo)localObject).nF(10));
      }
      while (!TextUtils.isEmpty(""))
      {
        this.hAt.setVisibility(0);
        this.hAt.setText("");
        return;
        this.hAs.setVisibility(8);
      }
      this.hAt.setVisibility(8);
      return;
    }
    this.hAr.setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/ui/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */