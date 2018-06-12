package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.af;
import com.tencent.mm.plugin.game.d.k;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.e.e;
import com.tencent.mm.plugin.game.f.b;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  extends LinearLayout
  implements View.OnClickListener
{
  private LayoutInflater Bc;
  private int jNv;
  private String mAppId;
  private Context mContext;
  
  public f(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.Bc = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    setOrientation(0);
  }
  
  public final void a(af paramaf, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramaf == null) || (bi.cX(paramaf.jQF)))
    {
      setVisibility(8);
      return;
    }
    if (paramaf.jQF.size() == 1)
    {
      paramaf.jQF.add(null);
      paramaf.jQF.add(null);
    }
    label69:
    k localk;
    LinearLayout localLinearLayout;
    ImageView localImageView;
    TextView localTextView1;
    TextView localTextView2;
    for (;;)
    {
      this.mAppId = paramString;
      this.jNv = paramInt2;
      paramaf = paramaf.jQF.iterator();
      for (;;)
      {
        if (!paramaf.hasNext()) {
          break label325;
        }
        localk = (k)paramaf.next();
        localLinearLayout = (LinearLayout)this.Bc.inflate(f.f.game_center_4_block_entrance_item, this, false);
        addView(localLinearLayout, new LinearLayout.LayoutParams(-2, -2, 1.0F));
        localImageView = (ImageView)localLinearLayout.findViewById(f.e.entrance_icon);
        localTextView1 = (TextView)localLinearLayout.findViewById(f.e.entrance_title);
        localTextView2 = (TextView)localLinearLayout.findViewById(f.e.entrance_desc);
        if (localk != null) {
          break;
        }
        localImageView.setImageResource(f.d.game_wait_unlock);
        localTextView1.setText(f.i.game_wait_unlock);
        localTextView1.setTextColor(this.mContext.getResources().getColor(f.b.game_title_hint));
      }
      if (paramaf.jQF.size() == 2) {
        paramaf.jQF.add(null);
      }
    }
    localLinearLayout.setOnClickListener(this);
    e.aVj().g(localImageView, localk.jPG);
    localTextView1.setText(localk.bHD);
    if (!bi.oW(localk.jOS))
    {
      localTextView2.setText(localk.jOS);
      localTextView2.setVisibility(0);
    }
    for (;;)
    {
      localLinearLayout.setTag(localk);
      if (paramInt1 != 2) {
        break label69;
      }
      an.a(this.mContext, 10, 1002, localk.jPC, paramString, paramInt2, an.Dx(localk.jPA));
      break label69;
      label325:
      break;
      localTextView2.setVisibility(8);
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof k)))
    {
      x.w("MicroMsg.GameBlockEntranceView", "getTag is null");
      return;
    }
    paramView = (k)paramView.getTag();
    if (bi.oW(paramView.jOU))
    {
      x.w("MicroMsg.GameBlockEntranceView", "jumpUrl is null");
      return;
    }
    int i = c.r(this.mContext, paramView.jOU, "game_center_mygame_comm");
    an.a(this.mContext, 10, 1002, paramView.jPC, i, this.mAppId, this.jNv, an.Dx(paramView.jPA));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */