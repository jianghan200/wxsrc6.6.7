package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.v;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.e.e;
import com.tencent.mm.plugin.game.e.e.a.a;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.LinkedList;

public class GameFeedTitleDescView
  extends LinearLayout
{
  private TextView gsY;
  private TextView hVS;
  private LinearLayout jYD;
  
  public GameFeedTitleDescView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public final void a(String paramString1, String paramString2, LinkedList<v> paramLinkedList)
  {
    int k = 0;
    if ((bi.oW(paramString1)) && (bi.oW(paramString2)))
    {
      setVisibility(8);
      return;
    }
    setVisibility(0);
    int i;
    int j;
    label340:
    int m;
    if (!bi.cX(paramLinkedList))
    {
      this.jYD.setVisibility(0);
      ImageView localImageView;
      Object localObject1;
      while (this.jYD.getChildCount() < paramLinkedList.size() + 1)
      {
        localImageView = new ImageView(getContext());
        localObject1 = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(f.c.GameSmallAvatarSize), getResources().getDimensionPixelSize(f.c.GameSmallAvatarSize));
        ((LinearLayout.LayoutParams)localObject1).setMargins(0, 0, getResources().getDimensionPixelSize(f.c.GameMiniPadding), 0);
        ((LinearLayout.LayoutParams)localObject1).gravity = 16;
        localImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.jYD.addView(localImageView, 0, (ViewGroup.LayoutParams)localObject1);
      }
      i = 0;
      for (;;)
      {
        j = i;
        if (i >= paramLinkedList.size()) {
          break;
        }
        Object localObject2 = (v)paramLinkedList.get(i);
        localImageView = (ImageView)this.jYD.getChildAt(i);
        localObject1 = e.aVj();
        localObject2 = ((v)localObject2).jPM;
        e.a.a locala = new e.a.a();
        locala.dXW = true;
        ((e)localObject1).a(localImageView, (String)localObject2, locala.aVk(), null);
        localImageView.setVisibility(0);
        i += 1;
      }
      while (j < this.jYD.getChildCount() - 1)
      {
        this.jYD.getChildAt(j).setVisibility(8);
        j += 1;
      }
      if (!bi.oW(paramString1)) {
        ((TextView)this.jYD.getChildAt(j)).setText(paramString1);
      }
      this.gsY.setVisibility(8);
      if (bi.oW(paramString2)) {
        break label442;
      }
      this.hVS.setText(paramString2);
      this.hVS.setVisibility(0);
      paramString2 = this.gsY;
      i = c.getScreenWidth(getContext());
      j = ((ViewGroup)getParent()).getPaddingLeft();
      m = ((ViewGroup)getParent()).getPaddingRight();
      if (!bi.oW(paramString1)) {
        break label454;
      }
      i = k;
    }
    for (;;)
    {
      if (i <= 1) {
        break label487;
      }
      this.hVS.setMaxLines(1);
      return;
      if (!bi.oW(paramString1))
      {
        this.gsY.setText(paramString1);
        this.gsY.setVisibility(0);
        break;
      }
      this.gsY.setVisibility(8);
      break;
      label442:
      this.hVS.setVisibility(8);
      break label340;
      label454:
      if (paramString2.getPaint().measureText(paramString1) > i - j - m) {
        i = 2;
      } else {
        i = 1;
      }
    }
    label487:
    this.hVS.setMaxLines(2);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    View localView = LayoutInflater.from(getContext()).inflate(f.f.game_feed_title_desc_view, this, true);
    this.jYD = ((LinearLayout)localView.findViewById(f.e.user_title_container));
    this.gsY = ((TextView)localView.findViewById(f.e.title));
    this.hVS = ((TextView)localView.findViewById(f.e.desc));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameFeedTitleDescView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */