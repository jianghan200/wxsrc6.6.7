package com.tencent.mm.plugin.webview.ui.tools.game.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;

public class GameMenuView
  extends LinearLayout
{
  private LayoutInflater Bc;
  private Context mContext;
  private boolean qgI = false;
  private View qgN;
  private LinearLayout qgO;
  private LinearLayout qgP;
  private f qgQ;
  private b.c qgR;
  private b.a qgS;
  
  public GameMenuView(Context paramContext)
  {
    super(paramContext, null);
    this.mContext = paramContext;
    this.Bc = LayoutInflater.from(this.mContext);
    paramContext = this.mContext.getResources().getDisplayMetrics();
    if (paramContext.widthPixels > paramContext.heightPixels) {
      bool = true;
    }
    this.qgI = bool;
    initView();
  }
  
  public GameMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    this.mContext = paramContext;
    initView();
  }
  
  private void initView()
  {
    if (this.qgI)
    {
      setOrientation(0);
      this.Bc.inflate(R.i.game_menu_split_style_landscape, this, true);
    }
    for (View localView = this.Bc.inflate(R.i.game_menu_layout_landscape, this, true);; localView = this.Bc.inflate(R.i.game_menu_layout_portrait, this, true))
    {
      this.qgN = localView.findViewById(R.h.game_menu_layout);
      this.qgO = ((LinearLayout)localView.findViewById(R.h.game_menu_first_line));
      this.qgP = ((LinearLayout)localView.findViewById(R.h.game_menu_second_line));
      return;
      setOrientation(1);
      this.Bc.inflate(R.i.game_menu_split_style_portrait, this, true);
    }
  }
  
  public void setAdapter(f paramf)
  {
    this.qgQ = paramf;
    paramf.registerDataSetObserver(new GameMenuView.1(this));
    paramf.notifyDataSetChanged();
  }
  
  public void setDismissListener(b.a parama)
  {
    this.qgS = parama;
  }
  
  public void setGameMenuItemSelectedListener(b.c paramc)
  {
    this.qgR = paramc;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/game/menu/GameMenuView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */