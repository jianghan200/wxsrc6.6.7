package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.y;

public class ScannerFlashSwitcher
  extends LinearLayout
{
  ImageView mLJ;
  TextView mLK;
  boolean mLL = false;
  
  public ScannerFlashSwitcher(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  public ScannerFlashSwitcher(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }
  
  private void init()
  {
    y.gq(getContext()).inflate(R.i.scanner_flash_switcher, this, true);
    this.mLJ = ((ImageView)findViewById(R.h.flash_switcher));
    this.mLK = ((TextView)findViewById(R.h.flash_open_hint));
    this.mLL = true;
  }
  
  public final void bsS()
  {
    x.i("MicroMsg.ScannerFlashSwitcher", "closeFlashStatus");
    this.mLJ.setImageResource(R.k.scanner_flash_open_normal);
  }
  
  public final void hide()
  {
    x.i("MicroMsg.ScannerFlashSwitcher", "hide");
    setEnabled(false);
    this.mLJ.animate().alpha(0.0F).setDuration(500L);
    this.mLK.animate().alpha(0.0F).setDuration(500L).setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        ScannerFlashSwitcher.this.setVisibility(8);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/scanner/ui/ScannerFlashSwitcher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */