package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.b;
import com.tencent.mm.plugin.game.model.b.a;

public class GameIndexSearchView
  extends LinearLayout
{
  LayoutInflater Bc;
  private Context mContext;
  
  public GameIndexSearchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(0);
    this.mContext = paramContext;
    this.Bc = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameIndexSearchView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */