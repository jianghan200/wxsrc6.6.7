package com.tencent.mm.plugin.shake.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.platformtools.y.a;
import com.tencent.mm.plugin.shake.e.b;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import java.util.List;

public class TVThumbPreference
  extends Preference
  implements y.a
{
  f gua;
  private ImageView nbF;
  private ImageView nbG;
  private ImageView nbH;
  List<String> nbI = null;
  
  public TVThumbPreference(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TVThumbPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.tv_thumb_preference);
    setWidgetLayoutResource(0);
    y.a(this);
  }
  
  public final void m(String paramString, final Bitmap paramBitmap)
  {
    if ((paramString == null) || (paramBitmap == null) || (paramBitmap.isRecycled())) {}
    do
    {
      return;
      if ((this.nbF != null) && (this.nbF.getTag() != null) && (paramString.equals((String)this.nbF.getTag())))
      {
        this.nbF.post(new Runnable()
        {
          public final void run()
          {
            TVThumbPreference.a(TVThumbPreference.this).setImageBitmap(paramBitmap);
            if (TVThumbPreference.b(TVThumbPreference.this) != null) {
              TVThumbPreference.b(TVThumbPreference.this).notifyDataSetChanged();
            }
          }
        });
        return;
      }
      if ((this.nbG != null) && (this.nbG.getTag() != null) && (paramString.equals((String)this.nbG.getTag())))
      {
        this.nbG.post(new Runnable()
        {
          public final void run()
          {
            TVThumbPreference.c(TVThumbPreference.this).setImageBitmap(paramBitmap);
            if (TVThumbPreference.b(TVThumbPreference.this) != null) {
              TVThumbPreference.b(TVThumbPreference.this).notifyDataSetChanged();
            }
          }
        });
        return;
      }
    } while ((this.nbH == null) || (this.nbH.getTag() == null) || (!paramString.equals((String)this.nbH.getTag())));
    this.nbH.post(new Runnable()
    {
      public final void run()
      {
        TVThumbPreference.d(TVThumbPreference.this).setImageBitmap(paramBitmap);
        if (TVThumbPreference.b(TVThumbPreference.this) != null) {
          TVThumbPreference.b(TVThumbPreference.this).notifyDataSetChanged();
        }
      }
    });
  }
  
  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.nbF = ((ImageView)paramView.findViewById(R.h.thumb_1));
    this.nbG = ((ImageView)paramView.findViewById(R.h.thumb_2));
    this.nbH = ((ImageView)paramView.findViewById(R.h.thumb_3));
    if ((this.nbI == null) || (this.nbI.size() <= 0)) {}
    do
    {
      do
      {
        return;
        paramView = new b((String)this.nbI.get(0));
        this.nbF.setTag(paramView.Vx());
        paramView = y.a(paramView);
        if ((paramView != null) && (!paramView.isRecycled())) {
          this.nbF.setImageBitmap(paramView);
        }
        this.nbF.setVisibility(0);
      } while (1 >= this.nbI.size());
      paramView = new b((String)this.nbI.get(1));
      this.nbG.setTag(paramView.Vx());
      paramView = y.a(paramView);
      if ((paramView != null) && (!paramView.isRecycled())) {
        this.nbG.setImageBitmap(paramView);
      }
      this.nbG.setVisibility(0);
    } while (2 >= this.nbI.size());
    paramView = new b((String)this.nbI.get(2));
    this.nbH.setTag(paramView.Vx());
    paramView = y.a(paramView);
    if ((paramView != null) && (!paramView.isRecycled())) {
      this.nbH.setImageBitmap(paramView);
    }
    this.nbH.setVisibility(0);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    return super.onCreateView(paramViewGroup);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/shake/ui/TVThumbPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */