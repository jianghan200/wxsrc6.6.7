package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.v;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.game.d.dh;
import com.tencent.mm.plugin.game.d.di;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.af;
import com.tencent.mm.plugin.game.model.af.a;
import com.tencent.mm.plugin.game.model.an;

public class GameDetailRankLikeView
  extends LinearLayout
  implements View.OnClickListener
{
  private int jNv;
  af jWa;
  af.a jWb;
  private Drawable jWc;
  private Drawable jWd;
  private Animation jWe;
  private ImageView jWf;
  private TextView jWg;
  String mAppId;
  
  public GameDetailRankLikeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void setCount(int paramInt)
  {
    if (paramInt > 99)
    {
      this.jWg.setText("99+");
      return;
    }
    if (paramInt == 0)
    {
      this.jWg.setText("");
      return;
    }
    this.jWg.setText(String.valueOf(paramInt));
  }
  
  final void aUT()
  {
    if (this.jWb != null)
    {
      if (this.jWb.jNJ) {
        this.jWf.setImageDrawable(this.jWc);
      }
      for (;;)
      {
        setCount(this.jWb.jNI);
        return;
        this.jWf.setImageDrawable(this.jWd);
      }
    }
    setVisibility(8);
  }
  
  public void onClick(View paramView)
  {
    if (q.GF().equals(this.jWb.bWJ)) {
      if (this.jWb.jNI > 0)
      {
        paramView = new Intent(getContext(), GameDetailRankLikedUI.class);
        paramView.putExtra("extra_appdi", this.mAppId);
        getContext().startActivity(paramView);
      }
    }
    while (this.jWb.jNJ) {
      return;
    }
    this.jWb.jNJ = true;
    paramView = this.jWb;
    paramView.jNI += 1;
    this.jWa.aUq();
    paramView = this.mAppId;
    String str = this.jWb.bWJ;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new dh();
    ((b.a)localObject).dIH = new di();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/upfriend";
    ((b.a)localObject).dIF = 1330;
    localObject = ((b.a)localObject).KT();
    dh localdh = (dh)((b)localObject).dID.dIL;
    localdh.jPc = paramView;
    localdh.jTu = str;
    v.a((b)localObject, new GameDetailRankLikeView.1(this));
    an.a(getContext(), 12, 1203, 1, 2, this.mAppId, this.jNv, null);
    aUT();
    this.jWf.startAnimation(this.jWe);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    this.jWc = getContext().getResources().getDrawable(f.d.game_rank_like_btn_hightlight);
    this.jWd = getContext().getResources().getDrawable(f.d.game_rank_like_btn_gray);
    this.jWe = AnimationUtils.loadAnimation(getContext(), f.a.scale_up_down);
    inflate(getContext(), f.f.game_detail2_rank_item_like, this);
    setOnClickListener(this);
    this.jWf = ((ImageView)findViewById(f.e.like_btn));
    this.jWg = ((TextView)findViewById(f.e.like_count));
  }
  
  public void setSourceScene(int paramInt)
  {
    this.jNv = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailRankLikeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */