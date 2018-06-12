package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.h.a;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
  extends b
{
  private LinearLayout jeZ;
  private ImageView nDe;
  private TextView nDf;
  private LinearLayout nDg;
  int nDh;
  h nDo;
  private View nDp;
  private ImageView nDq;
  
  public g(Context paramContext, h paramh, ViewGroup paramViewGroup)
  {
    super(paramContext, paramh, paramViewGroup);
    this.nDo = paramh;
  }
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      paramJSONObject.put("clickCount", this.nDh);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("AdLandingBorderedComp", paramJSONObject, "", new Object[0]);
    }
    return false;
  }
  
  public final View bzM()
  {
    View localView = this.contentView;
    this.nDq = ((ImageView)localView.findViewById(i.f.left_icon));
    this.nDe = ((ImageView)localView.findViewById(i.f.right_arrow));
    this.nDf = ((TextView)localView.findViewById(i.f.desc));
    this.nDg = ((LinearLayout)localView.findViewById(i.f.innter_container));
    this.jeZ = ((LinearLayout)localView.findViewById(i.f.container));
    this.nDp = this.nDg;
    return this.contentView;
  }
  
  protected final void bzQ()
  {
    this.nDf.setText(this.nDo.nAl.kCz);
    if (this.nDo.nBe)
    {
      this.nDq.setImageDrawable(a.f(this.context, i.e.lbs_w));
      this.nDe.setImageDrawable(a.f(this.context, i.e.right_arrow_w));
      this.nDf.setTextColor(-16777216);
      this.nDg.setBackgroundResource(i.e.adlanding_comp_click_dark);
    }
    for (;;)
    {
      this.nDg.setPadding((int)this.nDo.nBa, 0, (int)this.nDo.nBb, 0);
      this.jeZ.setPadding(0, (int)this.nDo.nAY, 0, (int)this.nDo.nAZ);
      a(this.nDg);
      g.1 local1 = new g.1(this);
      if (this.nDp != null) {
        this.nDp.setOnClickListener(local1);
      }
      return;
      this.nDq.setImageDrawable(a.f(this.context, i.e.lbs));
      this.nDe.setImageDrawable(a.f(this.context, i.e.right_arrow));
      this.nDf.setTextColor(-1);
      this.nDg.setBackgroundResource(i.e.adlanding_comp_click_light);
    }
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_lbs;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */