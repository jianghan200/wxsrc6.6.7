package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.x;

public class GameInfoViewForeign
  extends RelativeLayout
{
  private int cYz = 0;
  private int jNv = 0;
  private TextView jYY;
  private int jYZ = 2;
  private View.OnClickListener jZa = new GameInfoViewForeign.1(this);
  private Context mContext;
  
  public GameInfoViewForeign(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public final void aUW()
  {
    this.cYz = ((c)g.l(c.class)).aSj().aUf();
    if ((this.cYz > 0) && (this.cYz <= 99))
    {
      this.jYY.setVisibility(0);
      this.jYY.setText(this.cYz);
      return;
    }
    if (this.cYz > 99)
    {
      this.jYY.setVisibility(0);
      this.jYY.setText("99+");
      this.jYY.setTextSize(1, 9.0F);
      return;
    }
    this.jYY.setVisibility(4);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    setOnClickListener(this.jZa);
    this.jYY = ((TextView)findViewById(f.e.game_msg_unread_count));
    aUW();
    x.i("MicroMsg.GameInfoViewForeign", "initView finished");
  }
  
  public void setSourceScene(int paramInt)
  {
    this.jNv = paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameInfoViewForeign.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */