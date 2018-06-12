package com.tencent.mm.plugin.mall.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.wallet_core.model.mall.a;
import com.tencent.mm.plugin.wallet_core.model.mall.b;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public class BannerActView
  extends LinearLayout
{
  private List<a> kYn;
  private r kYo;
  private TextView kYp = (TextView)LayoutInflater.from(getContext()).inflate(a.g.banner_activity_view, this, true).findViewById(a.f.mall_banner_wording);
  
  public BannerActView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOnClickListener(new BannerActView.1(this));
  }
  
  public void setActivityList(List<a> paramList)
  {
    this.kYn = paramList;
    if ((this.kYn == null) || (this.kYn.size() <= 0)) {
      x.i("MicroMsg.BannerActivityView", "func[setActivityList] actList null");
    }
    while (!b.cE(this.kYn))
    {
      setVisibility(8);
      return;
    }
    this.kYp.setText(((a)this.kYn.get(0)).prQ);
    setVisibility(0);
  }
  
  public void setData(r paramr)
  {
    this.kYo = paramr;
    if (this.kYo != null)
    {
      this.kYp.setText(this.kYo.field_bulletin_content);
      setVisibility(0);
      return;
    }
    setVisibility(8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/mall/ui/BannerActView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */