package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.f.a;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import java.util.ArrayList;
import java.util.List;

public class GameDetailAutoScrollView
  extends LinearLayout
{
  private int irJ = 0;
  private al jUl = new al(new al.a()
  {
    public final boolean vD()
    {
      GameDetailAutoScrollView.a(GameDetailAutoScrollView.this);
      return true;
    }
  }, true);
  private ArrayList<String> jVK = new ArrayList();
  private ViewGroup jVL;
  private TextView jVM;
  private TextView jVN;
  private ViewGroup jVO;
  private TextView jVP;
  private TextView jVQ;
  private Animation jVR;
  private Animation jVS;
  
  public GameDetailAutoScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.jVL = ((ViewGroup)LayoutInflater.from(paramContext).inflate(f.f.game_detail2_brief_item, this, false));
    this.jVM = ((TextView)this.jVL.findViewById(f.e.game_detail_brief_item_text1));
    this.jVN = ((TextView)this.jVL.findViewById(f.e.game_detail_brief_item_text2));
    addView(this.jVL);
    this.jVL.setVisibility(8);
    this.jVO = ((ViewGroup)LayoutInflater.from(paramContext).inflate(f.f.game_detail2_brief_item, this, false));
    this.jVP = ((TextView)this.jVO.findViewById(f.e.game_detail_brief_item_text1));
    this.jVQ = ((TextView)this.jVO.findViewById(f.e.game_detail_brief_item_text2));
    addView(this.jVO);
    this.jVO.setVisibility(8);
    this.jVR = AnimationUtils.loadAnimation(paramContext, f.a.slide_bottom_in);
    this.jVS = AnimationUtils.loadAnimation(paramContext, f.a.slide_top_out);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.jUl.SO();
  }
  
  public void setText(List<String> paramList)
  {
    this.jVK.clear();
    this.jUl.SO();
    if ((paramList == null) || (paramList.size() == 0) || (paramList.size() % 2 != 0))
    {
      this.jVL.setVisibility(8);
      this.jVO.setVisibility(8);
    }
    do
    {
      return;
      this.jVK.addAll(paramList);
      this.irJ = 0;
      paramList = j.a(getContext(), (CharSequence)this.jVK.get(0), this.jVM.getTextSize());
      this.jVM.setText(paramList);
      this.jVN.setText((CharSequence)this.jVK.get(1));
      this.jVL.setVisibility(0);
      this.jVO.setVisibility(8);
    } while (this.jVK.size() / 2 == 1);
    this.jUl.J(5000L, 5000L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameDetailAutoScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */