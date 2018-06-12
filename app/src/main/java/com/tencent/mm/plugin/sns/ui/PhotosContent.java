package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.ui.base.MMFrameLayout;
import java.util.ArrayList;

public class PhotosContent
  extends MMFrameLayout
{
  private int fAU = 120;
  public ArrayList<TagImageView> nPW = new ArrayList();
  private float nPX;
  
  public PhotosContent(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void a(TagImageView paramTagImageView)
  {
    this.nPW.add(paramTagImageView);
  }
  
  public final void bCz()
  {
    this.nPW.clear();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setImageViewWidth(int paramInt)
  {
    if (paramInt <= 0) {}
    int i;
    do
    {
      return;
      this.nPX = getResources().getDisplayMetrics().density;
      this.fAU = ((int)(this.fAU * this.nPX));
      if (paramInt < this.fAU) {}
      for (;;)
      {
        i = 0;
        while (i < this.nPW.size())
        {
          localObject1 = getChildAt(i);
          Object localObject2 = new ViewGroup.MarginLayoutParams(((View)localObject1).getLayoutParams());
          ((ViewGroup.MarginLayoutParams)localObject2).width = paramInt;
          ((ViewGroup.MarginLayoutParams)localObject2).height = paramInt;
          ((ViewGroup.MarginLayoutParams)localObject2).leftMargin = ((int)(i % 3 * (paramInt + this.nPX * 3.0F)));
          ((ViewGroup.MarginLayoutParams)localObject2).topMargin = ((int)(i / 3 * (paramInt + this.nPX * 3.0F)));
          localObject2 = new FrameLayout.LayoutParams((ViewGroup.MarginLayoutParams)localObject2);
          ((FrameLayout.LayoutParams)localObject2).gravity = 51;
          ((View)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
          i += 1;
        }
        paramInt = this.fAU;
      }
      i = this.nPW.size() / 3;
    } while (i <= 0);
    Object localObject1 = (ViewGroup.MarginLayoutParams)getLayoutParams();
    float f1 = paramInt * i;
    float f2 = this.nPX;
    ((ViewGroup.MarginLayoutParams)localObject1).height = ((int)((i - 1) * (f2 * 3.0F) + f1));
    setLayoutParams((ViewGroup.LayoutParams)localObject1);
  }
  
  public final TagImageView xm(int paramInt)
  {
    if (paramInt < this.nPW.size()) {
      return (TagImageView)this.nPW.get(paramInt);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/PhotosContent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */