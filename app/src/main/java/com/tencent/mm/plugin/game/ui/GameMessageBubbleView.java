package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.b;
import com.tencent.mm.plugin.game.model.s.d;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.v;
import com.tencent.mm.plugin.game.model.w;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class GameMessageBubbleView
  extends LinearLayout
  implements View.OnClickListener
{
  View kaM;
  private TextView kaN;
  private ImageView kaO;
  private s kaP;
  private final long kaQ = 500L;
  private long kaR = 0L;
  private Context mContext;
  private boolean mHasInit = false;
  
  public GameMessageBubbleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }
  
  public final void aVb()
  {
    ((b)g.l(b.class)).aSi();
    this.kaP = v.aUb();
    if (this.kaP == null)
    {
      this.kaM.setOnClickListener(null);
      setVisibility(8);
      return;
    }
    this.kaP.aTW();
    if ((this.kaP.field_msgType == 100) && ((bi.oW(this.kaP.jMv.cZG)) || (bi.oW(this.kaP.jMv.jNg)) || (bi.oW(this.kaP.jMv.jNh)) || (!this.kaP.jMw.containsKey(this.kaP.jMv.jNh))))
    {
      x.w("MicroMsg.GameMessageHeaderView", "bubble is invalid");
      this.kaM.setOnClickListener(null);
      setVisibility(8);
      return;
    }
    this.kaN.setText(this.kaP.jMv.cZG);
    o.Pj().a(this.kaP.jMv.jNg, this.kaO);
    this.kaM.setOnClickListener(this);
    setVisibility(0);
  }
  
  public void onClick(View paramView)
  {
    if (System.currentTimeMillis() - this.kaR <= 500L) {}
    while (this.kaP == null) {
      return;
    }
    ((b)g.l(b.class)).aSi();
    v.aUc();
    int i;
    if (this.kaP.field_msgType == 100)
    {
      if (!bi.oW(this.kaP.jMv.jNh))
      {
        paramView = (s.d)this.kaP.jMw.get(this.kaP.jMv.jNh);
        if (paramView != null)
        {
          i = t.a(this.mContext, this.kaP, paramView, this.kaP.field_appId, 1007);
          if (i != 0) {
            an.a(this.mContext, 10, 1007, 1, i, 0, this.kaP.field_appId, 0, this.kaP.jNa, this.kaP.field_gameMsgId, this.kaP.jNb, null);
          }
          if (paramView.jNj != 4)
          {
            this.kaP.field_isRead = true;
            ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().c(this.kaP, new String[0]);
          }
        }
      }
      this.kaR = System.currentTimeMillis();
      return;
    }
    if ((this.kaP != null) && (this.kaP.jMy != 3))
    {
      this.kaP.field_isRead = true;
      ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().c(this.kaP, new String[0]);
    }
    switch (this.kaP.jMy)
    {
    default: 
      x.e("MicroMsg.GameMessageHeaderView", "unknown bubble_action = " + this.kaP.jMy);
      return;
    case 1: 
      paramView = this.kaP.jMk;
      if (!bi.oW(paramView)) {
        i = com.tencent.mm.plugin.game.e.c.r(this.mContext, paramView, "game_center_bubble");
      }
      break;
    }
    for (;;)
    {
      an.a(this.mContext, 10, 1007, 1, i, 0, this.kaP.field_appId, 0, this.kaP.field_msgType, this.kaP.field_gameMsgId, this.kaP.jNb, null);
      this.kaR = System.currentTimeMillis();
      return;
      if (!bi.oW(this.kaP.field_appId))
      {
        paramView = new Bundle();
        paramView.putCharSequence("game_app_id", this.kaP.field_appId);
        paramView.putInt("game_report_from_scene", 1007);
        i = com.tencent.mm.plugin.game.e.c.b(this.mContext, this.kaP.field_appId, null, paramView);
      }
      else
      {
        x.e("MicroMsg.GameMessageHeaderView", "message type : " + this.kaP.field_msgType + " ,message.field_appId is null.");
        i = 0;
        continue;
        paramView = new Intent(this.mContext, GameMessageUI.class);
        paramView.putExtra("game_report_from_scene", 1007);
        this.mContext.startActivity(paramView);
        i = 6;
        continue;
        i = 0;
      }
    }
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
    if (!this.mHasInit)
    {
      this.kaO = ((ImageView)findViewById(f.e.game_msg_bubble_icon));
      this.kaN = ((TextView)findViewById(f.e.game_msg_bubble_desc));
      this.kaM = findViewById(f.e.game_msg_bubble_layout);
      setVisibility(8);
      this.mHasInit = true;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/GameMessageBubbleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */