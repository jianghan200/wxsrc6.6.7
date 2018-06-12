package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.k;
import com.tencent.mm.plugin.bottle.a.h.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;

public class PickBottleUI
  extends FrameLayout
  implements View.OnClickListener, View.OnTouchListener
{
  private float density;
  float fto;
  float ftp;
  ag handler = new ag();
  private boolean hasInit = false;
  BottleBeachUI hlO;
  SprayLayout hmj;
  PickedBottleImageView hmk;
  ImageView hml;
  private h.b hmm;
  Runnable hmn = new PickBottleUI.1(this);
  Runnable hmo = new Runnable()
  {
    public final void run()
    {
      if ((PickBottleUI.b(PickBottleUI.this) != null) && (PickBottleUI.b(PickBottleUI.this).isShown())) {
        PickBottleUI.c(PickBottleUI.this).nm(0);
      }
    }
  };
  
  public PickBottleUI(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.hlO = ((BottleBeachUI)paramContext);
  }
  
  public PickBottleUI(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.hlO = ((BottleBeachUI)paramContext);
  }
  
  private boolean F(float paramFloat1, float paramFloat2)
  {
    int k = getHeight();
    int m = getWidth();
    int i = m * 180 / 480;
    int j = k * 75 / 800;
    m = m * 240 / 480;
    k = k * 495 / 800;
    paramFloat1 -= m;
    paramFloat2 -= k;
    paramFloat1 = paramFloat1 * paramFloat1 / (i * i);
    return paramFloat2 * paramFloat2 / (j * j) + paramFloat1 <= 1.0F;
  }
  
  public final void initView()
  {
    if (!this.hasInit)
    {
      this.hmk = ((PickedBottleImageView)findViewById(R.h.bottle_picked_result_img));
      this.hmj = ((SprayLayout)this.hlO.findViewById(R.h.bottle_spray_fl));
      this.hml = ((ImageView)this.hlO.findViewById(R.h.bottle_close_frame_btn));
      this.hmk.setOnClickListener(this);
      if (!bi.ciW()) {
        setBackgroundResource(R.g.bottle_pick_bg_spotlight_night);
      }
      setOnClickListener(this);
      setOnTouchListener(this);
      this.hasInit = true;
    }
  }
  
  public void onClick(View paramView)
  {
    if (R.h.bottle_picked_result_img == paramView.getId())
    {
      if (this.hmk.getBottleTalker() != null)
      {
        au.HU();
        c.FW().Ys(this.hmk.getBottleTalker());
        au.HU();
        ai localai = c.FW().Yq("floatbottle");
        if ((localai != null) && (!bi.oW(localai.field_username)))
        {
          localai.eV(k.GB());
          au.HU();
          c.FW().a(localai, localai.field_username);
        }
      }
      this.hlO.onClick(paramView);
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    initView();
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if (i == 0)
    {
      this.fto = paramMotionEvent.getX();
      this.ftp = paramMotionEvent.getY();
    }
    float f1;
    float f2;
    label275:
    do
    {
      do
      {
        do
        {
          return true;
        } while (i != 1);
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        int j = getHeight();
        i = getWidth();
        j = j * 550 / 800;
        int k = (i - i * 120 / 480) / 2;
        if (f2 > j) {
          i = 1;
        }
        for (;;)
        {
          if (i == 0) {
            break label275;
          }
          if (this.hmk.isShown()) {
            break;
          }
          if (this.hmm != null)
          {
            paramView = this.hmm;
            au.DF().b(155, paramView);
            au.DF().b(156, paramView);
            au.DF().c(paramView.hkc);
            this.hmm = null;
          }
          this.handler.removeCallbacks(this.hmn);
          this.handler.removeCallbacks(this.hmo);
          this.hlO.nm(0);
          return true;
          if (f1 < k - k * f2 / j)
          {
            i = 1;
          }
          else
          {
            float f3 = i - k;
            if (f1 > k * f2 / j + f3) {
              i = 1;
            } else {
              i = 0;
            }
          }
        }
      } while (this.hmk.getBottleTalker() != null);
      this.hlO.nm(0);
      return true;
    } while ((!F(f1, f2)) || (!F(this.fto, this.ftp)));
    if (this.hmk.getBottleTalker() != null)
    {
      au.HU();
      c.FW().Ys(this.hmk.getBottleTalker());
      au.HU();
      paramView = c.FW().Yq("floatbottle");
      if ((paramView != null) && (!bi.oW(paramView.field_username)))
      {
        paramView.eV(k.GB());
        au.HU();
        c.FW().a(paramView, paramView.field_username);
      }
    }
    this.hlO.onClick(this.hmk);
    return true;
  }
  
  public void setDensity(float paramFloat)
  {
    this.density = paramFloat;
  }
  
  public void setVisibility(int paramInt)
  {
    this.hmj.setVisibility(paramInt);
    this.hmk.setVisibility(8);
    super.setVisibility(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/PickBottleUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */