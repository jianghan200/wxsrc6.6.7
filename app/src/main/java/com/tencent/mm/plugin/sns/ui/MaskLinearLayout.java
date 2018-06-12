package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class MaskLinearLayout
  extends LinearLayout
{
  private boolean bKe = false;
  private List<MaskImageView> list = new LinkedList();
  private ag nLo = new ag();
  private Runnable nLp = new Runnable()
  {
    public final void run()
    {
      MaskLinearLayout.this.setPressed(false);
      MaskLinearLayout.a(MaskLinearLayout.this);
      MaskLinearLayout.this.invalidate();
    }
  };
  
  public MaskLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    super.setOnTouchListener(new MaskLinearLayout.2(this));
  }
  
  public final void b(MaskImageView paramMaskImageView)
  {
    this.list.add(paramMaskImageView);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
  }
  
  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    Assert.assertTrue(false);
  }
  
  public void settouchEnable(boolean paramBoolean)
  {
    this.bKe = paramBoolean;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/MaskLinearLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */