package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.s;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class i
{
  protected int backgroundColor;
  protected View contentView = null;
  public Context context;
  private long grJ = 0L;
  protected int hmV;
  protected int hmW;
  protected s nDt;
  private int nDu = 0;
  private long nDv = 0L;
  boolean nDw = false;
  protected ViewGroup nDx;
  
  public i(Context paramContext, s params, ViewGroup paramViewGroup)
  {
    this.context = paramContext;
    this.nDt = params;
    this.nDx = paramViewGroup;
    paramContext = ad.ee(paramContext);
    this.hmV = paramContext[0];
    this.hmW = paramContext[1];
  }
  
  private int getGravity()
  {
    int i = 0;
    switch (this.nDt.nBg)
    {
    }
    for (;;)
    {
      switch (this.nDt.nBh)
      {
      default: 
        return i;
        i = 80;
        continue;
        i = 16;
        continue;
        i = 48;
      }
    }
    return i | 0x1;
    return i | 0x3;
    return i | 0x5;
  }
  
  public void N(Map<String, Object> paramMap) {}
  
  public void W(int paramInt1, int paramInt2, int paramInt3) {}
  
  public void a(s params)
  {
    s locals = this.nDt;
    if (locals == params) {}
    while ((locals != null) && (locals.equals(params))) {
      return;
    }
    this.nDt = params;
    bzQ();
    bzK();
  }
  
  public boolean aa(JSONObject paramJSONObject)
  {
    if (this.grJ == 0L) {}
    while (this.nDt.nBj) {
      return false;
    }
    try
    {
      paramJSONObject.put("cid", this.nDt.nAW);
      paramJSONObject.put("exposureCount", this.nDu);
      paramJSONObject.put("stayTime", this.grJ);
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.Sns.AdLandingPageBaseComponent", paramJSONObject, "", new Object[0]);
    }
    return false;
  }
  
  public void bzA()
  {
    if (this.nDw) {
      return;
    }
    this.nDw = true;
    this.nDv = System.currentTimeMillis();
    this.nDu += 1;
  }
  
  public void bzB()
  {
    if (!this.nDw) {
      return;
    }
    this.nDw = false;
    if (this.nDv > 0L) {
      this.grJ += System.currentTimeMillis() - this.nDv;
    }
    this.nDv = 0L;
  }
  
  public void bzE() {}
  
  protected void bzK()
  {
    ij(false);
  }
  
  public View bzM()
  {
    return this.contentView;
  }
  
  protected void bzQ()
  {
    x.w("MicroMsg.Sns.AdLandingPageBaseComponent", "for component reuse, subclass must implement this method");
  }
  
  protected View bzR()
  {
    return null;
  }
  
  public final s bzT()
  {
    return this.nDt;
  }
  
  public final String bzU()
  {
    return this.nDt.nAW;
  }
  
  public void bzV() {}
  
  public void bzz()
  {
    bzB();
  }
  
  protected int getLayout()
  {
    return Integer.MAX_VALUE;
  }
  
  public final View getView()
  {
    if (this.contentView != null) {
      return this.contentView;
    }
    if (this.contentView == null)
    {
      int i = getLayout();
      if (i != Integer.MAX_VALUE) {
        this.contentView = ((LayoutInflater)this.context.getSystemService("layout_inflater")).inflate(i, this.nDx, false);
      }
      while (this.contentView == null)
      {
        throw new IllegalStateException("implement getLayout() or customLayout() to get a valid root view");
        this.contentView = bzR();
        if ((this.contentView != null) && (this.contentView.getLayoutParams() == null))
        {
          this.nDx.addView(this.contentView);
          ViewGroup.LayoutParams localLayoutParams = this.contentView.getLayoutParams();
          this.nDx.removeView(this.contentView);
          this.contentView.setLayoutParams(localLayoutParams);
        }
      }
    }
    bzM();
    bzE();
    bzQ();
    bzK();
    return this.contentView;
  }
  
  protected final void ij(boolean paramBoolean)
  {
    if (this.contentView == null) {
      throw new IllegalStateException("set field contentView first");
    }
    ViewGroup.LayoutParams localLayoutParams;
    Object localObject;
    int i;
    if (this.nDt != null)
    {
      localLayoutParams = this.contentView.getLayoutParams();
      if (localLayoutParams == null) {
        break label222;
      }
      if (this.nDt.nBc != 2.14748365E9F) {
        localLayoutParams.width = ((int)this.nDt.nBc);
      }
      if (this.nDt.nBd != 2.14748365E9F) {
        localLayoutParams.height = ((int)this.nDt.nBd);
      }
      if ((paramBoolean) && ((localLayoutParams instanceof ViewGroup.MarginLayoutParams))) {
        ((ViewGroup.MarginLayoutParams)localLayoutParams).setMargins((int)this.nDt.nBa, (int)this.nDt.nAY, (int)this.nDt.nBb, (int)this.nDt.nAZ);
      }
      if (!(localLayoutParams instanceof LinearLayout.LayoutParams)) {
        break label182;
      }
      localObject = (LinearLayout.LayoutParams)localLayoutParams;
      i = getGravity();
      if (i == 0) {
        break label173;
      }
      ((LinearLayout.LayoutParams)localObject).gravity = i;
    }
    for (;;)
    {
      this.contentView.setLayoutParams(localLayoutParams);
      return;
      label173:
      ((LinearLayout.LayoutParams)localObject).gravity = -1;
      continue;
      label182:
      if ((localLayoutParams instanceof FrameLayout.LayoutParams))
      {
        localObject = (FrameLayout.LayoutParams)localLayoutParams;
        i = getGravity();
        if (i != 0) {
          ((FrameLayout.LayoutParams)localObject).gravity = i;
        } else {
          ((FrameLayout.LayoutParams)localObject).gravity = -1;
        }
      }
    }
    label222:
    x.i("MicroMsg.Sns.AdLandingPageBaseComponent", this + " has no layoutParams in container " + this.nDx);
  }
  
  public boolean r(JSONArray paramJSONArray)
  {
    return false;
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    this.backgroundColor = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */