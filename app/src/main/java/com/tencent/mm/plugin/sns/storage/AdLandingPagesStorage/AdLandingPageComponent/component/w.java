package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.p;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.d;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class w
  extends a
{
  private ImageView bOA;
  ProgressBar eVR;
  private int hmV;
  private int hmW;
  boolean nAI;
  boolean nDm = true;
  private WindowManager nFy;
  
  public w(Context paramContext, p paramp, ViewGroup paramViewGroup)
  {
    super(paramContext, paramp, paramViewGroup);
  }
  
  public final boolean I(Bitmap paramBitmap)
  {
    if (paramBitmap == null)
    {
      x.e("AdLandingPagePureImageComponet", "when set image the bmp is null!");
      return false;
    }
    if (this.bOA == null)
    {
      x.e("AdLandingPagePureImageComponet", "when set image the imageView is null!");
      return false;
    }
    if (paramBitmap.getWidth() == 0)
    {
      x.e("AdLandingPagePureImageComponet", "when set image the bmp.getWidth is 0!");
      return false;
    }
    this.bOA.setImageBitmap(paramBitmap);
    this.eVR.setVisibility(8);
    return true;
  }
  
  public final boolean aa(JSONObject paramJSONObject)
  {
    if (!super.aa(paramJSONObject)) {
      return false;
    }
    try
    {
      if (!this.nDm)
      {
        String str = ac.ce(((p)this.nDt).nAL);
        JSONObject localJSONObject = new JSONObject();
        localJSONObject.put("urlMd5", str);
        localJSONObject.put("needDownload", 1);
        paramJSONObject.put("imgUrlInfo", localJSONObject);
      }
      return true;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("AdLandingPagePureImageComponet", paramJSONObject, "", new Object[0]);
    }
    return false;
  }
  
  public final View bzM()
  {
    this.bOA = ((ImageView)this.contentView.findViewById(i.f.sns_ad_native_landing_pages_items_pure_image_img));
    this.eVR = ((ProgressBar)this.contentView.findViewById(i.f.progressbar));
    return this.contentView;
  }
  
  protected final void bzQ()
  {
    if ((this.contentView == null) || (this.bOA == null) || (this.eVR == null)) {}
    while ((p)this.nDt == null) {
      return;
    }
    if (this.nFy == null)
    {
      this.nFy = ((WindowManager)this.context.getSystemService("window"));
      this.hmV = this.nFy.getDefaultDisplay().getWidth();
      this.hmW = this.nFy.getDefaultDisplay().getHeight();
    }
    String str = ((p)this.nDt).nAL;
    Object localObject = ((p)this.nDt).nAM;
    float f1 = ((p)this.nDt).height;
    float f2 = ((p)this.nDt).width;
    this.nAI = ((p)this.nDt).nAI;
    if ((f1 != 0.0F) && (f2 != 0.0F) && (!this.nAI)) {
      this.bOA.setLayoutParams(new RelativeLayout.LayoutParams((int)f2, (int)f1));
    }
    for (;;)
    {
      if ((localObject != null) && (((String)localObject).length() > 0)) {}
      try
      {
        this.bOA.setBackgroundColor(Color.parseColor((String)localObject));
        if ((str == null) || (str.length() <= 0))
        {
          x.i("AdLandingPagePureImageComponet", "Pure image component fillItem without imageurl.");
          return;
          if ((this.nAI) && (f1 != 0.0F) && (f2 != 0.0F))
          {
            this.bOA.setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
            continue;
          }
          this.bOA.setLayoutParams(new RelativeLayout.LayoutParams(this.hmV, this.hmW));
          continue;
        }
        localObject = d.eK("adId", str);
        if ((localObject != null) && (I((Bitmap)localObject)))
        {
          x.i("AdLandingPagePureImageComponet", "loaded cached image with  " + str);
          this.nDm = true;
          return;
        }
        this.nDm = false;
        startLoading();
        d.a(str, ((p)this.nDt).nAX, new w.1(this));
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  protected final int getLayout()
  {
    return i.g.sns_ad_native_landing_pages_item_pure_image;
  }
  
  public final void startLoading()
  {
    this.eVR.setVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */