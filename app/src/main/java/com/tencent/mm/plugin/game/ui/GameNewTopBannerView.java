package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class GameNewTopBannerView
  extends FrameLayout
  implements View.OnClickListener
{
  String fHA = null;
  int jNv;
  ImageView jVs;
  ImageView jVt;
  int kbe;
  int kbf;
  String kbg = "";
  private String kbh = "";
  Context mContext;
  
  public GameNewTopBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  static void aVc()
  {
    GameIndexListView.setDefaultPadding(0);
    GameIndexListView.setInitPadding(0);
    GameIndexListView.setCanPulldown(false);
  }
  
  final int b(ImageView paramImageView, int paramInt1, int paramInt2)
  {
    int i = c.getScreenWidth(this.mContext);
    ViewGroup.LayoutParams localLayoutParams = paramImageView.getLayoutParams();
    if (localLayoutParams == null)
    {
      x.e("MicroMsg.GameTopBannerView", "resizeGameThemePic, params is null");
      return 0;
    }
    float f = paramInt1 / paramInt2;
    localLayoutParams.height = ((int)(i * f));
    paramImageView.setLayoutParams(localLayoutParams);
    paramImageView.setScaleType(ImageView.ScaleType.FIT_XY);
    return localLayoutParams.height;
  }
  
  public void onClick(View paramView)
  {
    if ((paramView.getTag() != null) && ((paramView.getTag() instanceof String)))
    {
      paramView = (String)paramView.getTag();
      if (!bi.oW(paramView))
      {
        int i = c.r(this.mContext, paramView, "game_center_top_banner");
        an.a(this.mContext, 10, 1017, 1, i, 0, null, this.jNv, 0, null, null, this.fHA);
      }
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jVs = ((ImageView)findViewById(f.e.big_image));
    this.jVt = ((ImageView)findViewById(f.e.small_image));
    x.i("MicroMsg.GameTopBannerView", "initView finished");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameNewTopBannerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */