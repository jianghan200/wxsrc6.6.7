package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

public class ContentLoadingProgressBar
  extends ProgressBar
{
  private long mStartTime = -1L;
  private boolean nv = false;
  private boolean yO = false;
  private boolean yP = false;
  private final Runnable yQ = new Runnable()
  {
    public final void run()
    {
      ContentLoadingProgressBar.a(ContentLoadingProgressBar.this);
      ContentLoadingProgressBar.a(ContentLoadingProgressBar.this, -1L);
      ContentLoadingProgressBar.this.setVisibility(8);
    }
  };
  private final Runnable yR = new ContentLoadingProgressBar.2(this);
  
  public ContentLoadingProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
  }
  
  private void cA()
  {
    removeCallbacks(this.yQ);
    removeCallbacks(this.yR);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    cA();
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    cA();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/android/support/v4/widget/ContentLoadingProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */