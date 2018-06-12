package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.mm.pluginsdk.ui.d.c;
import com.tencent.mm.pluginsdk.ui.d.c.a;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends b
{
  LinearLayout jeZ;
  private ImageView nDd;
  private ImageView nDe;
  private TextView nDf;
  LinearLayout nDg;
  int nDh;
  
  public d(Context paramContext, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d paramd, ViewGroup paramViewGroup)
  {
    super(paramContext, paramd, paramViewGroup);
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
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.nDt).nAj.isEmpty()) {
      return null;
    }
    View localView = this.contentView;
    this.nDd = ((ImageView)localView.findViewById(i.f.left_icon));
    this.nDe = ((ImageView)localView.findViewById(i.f.right_arrow));
    this.nDf = ((TextView)localView.findViewById(i.f.desc));
    this.jeZ = ((LinearLayout)localView.findViewById(i.f.container));
    this.nDg = ((LinearLayout)localView.findViewById(i.f.innter_container));
    return this.contentView;
  }
  
  protected final void bzQ()
  {
    this.nDf.setText((CharSequence)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.nDt).nAj.get(0));
    if (((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.nDt).nBe)
    {
      this.nDd.setImageDrawable(a.f(this.context, i.e.tel_w));
      this.nDe.setImageDrawable(a.f(this.context, i.e.right_arrow_w));
      this.nDf.setTextColor(-16777216);
      this.nDg.setBackgroundResource(i.e.adlanding_comp_click_dark);
    }
    for (;;)
    {
      this.nDg.setPadding((int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.nDt).nBa, 0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.nDt).nBb, 0);
      this.jeZ.setPadding(0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.nDt).nAY, 0, (int)((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.d)this.nDt).nAZ);
      a(this.nDg);
      this.nDg.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = d.this;
          paramAnonymousView.nDh += 1;
          if (c.a.qPG == null) {}
          do
          {
            return;
            if (d.a(d.this).nAj.size() > 1)
            {
              c.a.qPG.a(d.this.context, d.a(d.this).nAj, new d.1.1(this));
              return;
            }
          } while (d.a(d.this).nAj.size() <= 0);
          AdLandingPagesProxy.getInstance().confirmDialPhoneNum((Activity)d.this.context, (String)d.a(d.this).nAj.get(0));
        }
      });
      return;
      this.nDd.setImageDrawable(a.f(this.context, i.e.tel));
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */