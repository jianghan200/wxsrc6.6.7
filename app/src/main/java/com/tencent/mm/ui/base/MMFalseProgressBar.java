package com.tencent.mm.ui.base;

import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;

public class MMFalseProgressBar
  extends ProgressBar
{
  private boolean bpL = false;
  private ag mHandler = new MMFalseProgressBar.1(this, Looper.getMainLooper());
  private float tua = 0.0F;
  private float tub;
  private float tuc;
  private float tud;
  private float tue;
  public boolean tuf = true;
  
  public MMFalseProgressBar(Context paramContext)
  {
    this(paramContext, null);
    crt();
  }
  
  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MMFalseProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setMax(1000);
    crt();
  }
  
  private void crt()
  {
    if (ao.fK(ad.getContext()))
    {
      this.tub = 4.0F;
      this.tuc = 1.0F;
      this.tud = 0.3F;
      this.tue = 50.0F;
      return;
    }
    this.tub = 2.0F;
    this.tuc = 0.5F;
    this.tud = 0.15F;
    this.tue = 50.0F;
  }
  
  public final void finish()
  {
    x.d("MicroMsg.MMFalseProgressBar", "[cpan] finish");
    if (this.mHandler != null) {
      this.mHandler.sendEmptyMessage(1002);
    }
  }
  
  public final void start()
  {
    x.d("MicroMsg.MMFalseProgressBar", "[cpan] start");
    if (!this.tuf) {}
    do
    {
      do
      {
        return;
      } while (this.bpL);
      this.bpL = true;
      crt();
    } while (this.mHandler == null);
    this.mHandler.sendEmptyMessage(1000);
    this.mHandler.sendEmptyMessage(1001);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/base/MMFalseProgressBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */