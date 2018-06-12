package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.R.f;
import com.tencent.mm.bp.a;

public class PaddingImageView
  extends FrameLayout
{
  ImageView isa;
  ImageView isb;
  private int isc;
  
  public PaddingImageView(Context paramContext)
  {
    super(paramContext);
    init(paramContext);
  }
  
  public PaddingImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  public PaddingImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init(paramContext);
  }
  
  private void init(Context paramContext)
  {
    this.isc = a.ad(getContext(), R.f.NormalPadding);
    this.isa = new ImageView(paramContext);
    this.isa.setPadding(this.isc, this.isc, this.isc, this.isc);
    this.isb = new ImageView(paramContext);
  }
  
  public ImageView getImageView()
  {
    return this.isa;
  }
  
  public ImageView getImageViewFG()
  {
    return this.isb;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/emoji/ui/v2/PaddingImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */