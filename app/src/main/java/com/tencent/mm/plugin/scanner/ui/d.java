package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.bp.a;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.io.IOException;

public final class d
  extends Preference
  implements y.a
{
  private f eOE;
  private TextView gsY = null;
  private ImageView hVP = null;
  String jNk;
  private TextView mHZ = null;
  String mIa;
  private View mView = null;
  String myS;
  
  public d(Context paramContext)
  {
    super(paramContext);
    setLayoutResource(R.i.product_comment_preference);
    y.a(this);
  }
  
  public final View getView(View paramView, ViewGroup paramViewGroup)
  {
    if (this.mView == null) {
      this.mView = onCreateView(paramViewGroup);
    }
    onBindView(this.mView);
    return this.mView;
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    if ((!bi.oW(paramString)) && (paramString.equals(this.mIa)) && (paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      this.hVP.setImageBitmap(paramBitmap);
      this.hVP.setBackgroundColor(0);
      if (this.eOE != null) {
        this.eOE.notifyDataSetChanged();
      }
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.hVP = ((ImageView)paramView.findViewById(R.h.comment_avatar));
    this.gsY = ((TextView)paramView.findViewById(R.h.comment_nickname));
    this.mHZ = ((TextView)paramView.findViewById(R.h.comment_content));
    Object localObject;
    if (!bi.oW(this.mIa))
    {
      localObject = y.a(new o(this.mIa));
      if ((localObject != null) && (!((Bitmap)localObject).isRecycled()))
      {
        this.hVP.setImageBitmap((Bitmap)localObject);
        this.hVP.setBackgroundColor(0);
        if (bi.oW(this.myS)) {
          break label284;
        }
        this.gsY.setText(j.a(this.mContext, this.myS, this.gsY.getTextSize()));
        label134:
        if (bi.oW(this.jNk)) {
          break label296;
        }
        this.mHZ.setText(this.jNk);
      }
    }
    for (;;)
    {
      if ((bi.oW(this.myS)) && (bi.oW(this.mIa)))
      {
        paramView = (LinearLayout)paramView.findViewById(R.h.comment_container);
        localObject = paramView.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject).height = this.mContext.getResources().getDimensionPixelSize(R.f.product_common_pref_height);
        paramView.setPadding(BackwardSupportUtil.b.b(this.mContext, 9.0F), 0, 0, 0);
        paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      return;
      try
      {
        localObject = BackwardSupportUtil.b.a(ad.getContext().getAssets().open("avatar/default_nor_avatar.png"), a.getDensity(null));
        this.hVP.setImageBitmap((Bitmap)localObject);
      }
      catch (IOException localIOException)
      {
        this.hVP.setImageBitmap(null);
      }
      break;
      this.hVP.setVisibility(8);
      break;
      label284:
      this.gsY.setVisibility(8);
      break label134;
      label296:
      this.mHZ.setVisibility(8);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */