package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.scanner.util.o;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public final class CategoryWithTitlePreference
  extends Preference
  implements y.a
{
  private Context context;
  private TextView eBO;
  private f eOE;
  private ImageView gxd;
  private int hWb = 34;
  private String iconUrl;
  private int mFp = 34;
  private String title = "";
  
  public CategoryWithTitlePreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public CategoryWithTitlePreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public CategoryWithTitlePreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference_category_with_title);
    this.context = paramContext;
    y.a(this);
  }
  
  public final void m(String paramString, Bitmap paramBitmap)
  {
    x.d("MicroMsg.scanner.CategoryWithTitlePreference", "get pic:" + paramString + ", iconurl:" + this.iconUrl);
    if ((!bi.oW(paramString)) && (paramString.equals(this.iconUrl)) && (paramBitmap != null) && (!paramBitmap.isRecycled()) && (this.gxd != null)) {
      ah.A(new CategoryWithTitlePreference.1(this, paramBitmap));
    }
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.eBO = ((TextView)paramView.findViewById(16908310));
    this.gxd = ((ImageView)paramView.findViewById(R.h.icon));
    paramView = this.gxd.getLayoutParams();
    paramView.width = BackwardSupportUtil.b.b(this.context, this.hWb / 2);
    paramView.height = BackwardSupportUtil.b.b(this.context, this.mFp / 2);
    this.gxd.setLayoutParams(paramView);
    if ((this.title != null) && (this.title.length() > 0) && (this.eBO != null))
    {
      this.eBO.setVisibility(0);
      this.eBO.setText(this.title);
      x.v("MicroMsg.scanner.CategoryWithTitlePreference", "onBindView title : " + this.eBO.getText());
    }
    if (!bi.oW(this.iconUrl))
    {
      paramView = y.a(new o(this.iconUrl));
      if ((paramView != null) && (!paramView.isRecycled()))
      {
        this.gxd.setImageBitmap(paramView);
        this.gxd.setVisibility(0);
      }
    }
  }
  
  public final void setTitle(int paramInt)
  {
    if (this.eBO != null)
    {
      if (this.context != null) {
        this.title = this.context.getString(paramInt);
      }
      if (bi.oW(this.title)) {
        break label61;
      }
      this.eBO.setVisibility(0);
      this.eBO.setText(this.title);
    }
    for (;;)
    {
      super.setTitle(paramInt);
      return;
      label61:
      this.eBO.setVisibility(8);
    }
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      this.title = paramCharSequence.toString();
      if (this.eBO != null)
      {
        this.eBO.setVisibility(0);
        this.eBO.setText(paramCharSequence);
        x.v("MicroMsg.scanner.CategoryWithTitlePreference", "title : " + this.eBO.getText());
      }
    }
    for (;;)
    {
      super.setTitle(paramCharSequence);
      return;
      if (this.eBO != null) {
        this.eBO.setVisibility(8);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/CategoryWithTitlePreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */