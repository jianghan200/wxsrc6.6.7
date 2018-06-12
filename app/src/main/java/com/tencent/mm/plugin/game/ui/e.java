package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.plugin.game.d.ae;
import com.tencent.mm.plugin.game.d.cz;
import com.tencent.mm.plugin.game.e.c;
import com.tencent.mm.plugin.game.e.e.a.a;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.an;
import com.tencent.mm.plugin.game.widget.EllipsizingTextView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends LinearLayout
  implements View.OnClickListener
{
  private LayoutInflater Bc;
  private int jNv;
  private String mAppId;
  private Context mContext;
  
  public e(Context paramContext)
  {
    super(paramContext);
    this.mContext = paramContext;
    this.Bc = ((LayoutInflater)this.mContext.getSystemService("layout_inflater"));
    setOrientation(1);
  }
  
  private void h(ViewGroup paramViewGroup)
  {
    ImageView localImageView = (ImageView)this.Bc.inflate(f.f.game_divide_line, paramViewGroup, false);
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)localImageView.getLayoutParams();
    localMarginLayoutParams.leftMargin = com.tencent.mm.bp.a.fromDPToPix(this.mContext, 20);
    localImageView.setLayoutParams(localMarginLayoutParams);
    paramViewGroup.addView(localImageView);
  }
  
  public final void a(ae paramae, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramae == null) || (bi.cX(paramae.jQF))) {
      setVisibility(8);
    }
    label20:
    label40:
    com.tencent.mm.plugin.game.d.j localj;
    e.a.a locala;
    label100:
    do
    {
      return;
      break label40;
      break label40;
      this.mAppId = paramString;
      this.jNv = paramInt2;
      paramae = paramae.jQF.iterator();
      do
      {
        for (;;)
        {
          if (!paramae.hasNext()) {
            break label20;
          }
          localj = (com.tencent.mm.plugin.game.d.j)paramae.next();
          if (localj == null) {
            break;
          }
          locala = new e.a.a();
          switch (localj.jPF)
          {
          default: 
            if (paramInt1 != 2) {
              break label588;
            }
            an.a(this.mContext, 10, 1002, localj.jPC, paramString, paramInt2, an.Dx(localj.jPA));
          }
        }
      } while (localj.jPD == null);
      h(this);
      localView = this.Bc.inflate(f.f.game_center_4_block_content_multiline_view, this, true);
      localTextView1 = (TextView)localView.findViewById(f.e.multiline_module);
      localTextView2 = (TextView)localView.findViewById(f.e.multiline_title);
      localObject = (EllipsizingTextView)localView.findViewById(f.e.multiline_desc);
      ((EllipsizingTextView)localObject).setMaxLines(2);
      ImageView localImageView = (ImageView)localView.findViewById(f.e.multiline_picture);
      localTextView1.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mContext, localj.jPB, localTextView1.getTextSize()));
      localTextView2.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mContext, localj.jPD.bHD, localTextView2.getTextSize()));
      ((EllipsizingTextView)localObject).setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mContext, localj.jPD.jOS, ((EllipsizingTextView)localObject).getTextSize()));
      if (!bi.oW(localj.jPD.jOT)) {
        com.tencent.mm.plugin.game.e.e.aVj().a(localImageView, localj.jPD.jOT, locala.aVk());
      }
      for (;;)
      {
        localView.setTag(new a(localj.jPC, localj.jPD.jOU, localj.jPA));
        localView.setOnClickListener(this);
        break;
        localImageView.setVisibility(8);
      }
    } while (localj.jPE == null);
    h(this);
    View localView = this.Bc.inflate(f.f.game_center_4_block_content_singleline_view, this, true);
    TextView localTextView1 = (TextView)localView.findViewById(f.e.singleline_module);
    TextView localTextView2 = (TextView)localView.findViewById(f.e.singleline_title);
    Object localObject = (ImageView)localView.findViewById(f.e.singleline_picture);
    localTextView1.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mContext, localj.jPB, localTextView1.getTextSize()));
    localTextView2.setText(com.tencent.mm.pluginsdk.ui.d.j.a(this.mContext, localj.jPE.bHD, localTextView2.getTextSize()));
    if (!bi.oW(localj.jPE.jOT)) {
      if (localj.jPE.jTr == 1)
      {
        locala.kdA = true;
        locala.kdD = f.d.game_default_square;
        label530:
        com.tencent.mm.plugin.game.e.e.aVj().a((ImageView)localObject, localj.jPE.jOT, locala.aVk());
      }
    }
    for (;;)
    {
      localView.setTag(new a(localj.jPC, localj.jPE.jOU, localj.jPA));
      localView.setOnClickListener(this);
      break label100;
      label588:
      break;
      locala.dXW = true;
      locala.kdD = f.d.game_default_round;
      break label530;
      ((ImageView)localObject).setVisibility(8);
    }
  }
  
  public final void onClick(View paramView)
  {
    if ((paramView.getTag() == null) || (!(paramView.getTag() instanceof a)))
    {
      x.w("MicroMsg.GameBlockContentView", "getTag is null");
      return;
    }
    paramView = (a)paramView.getTag();
    if (bi.oW(paramView.jumpUrl))
    {
      x.w("MicroMsg.GameBlockContentView", "jumpUrl is null");
      return;
    }
    int i = c.r(this.mContext, paramView.jumpUrl, "game_center_mygame_comm");
    an.a(this.mContext, 10, 1002, paramView.jOu, i, this.mAppId, this.jNv, an.Dx(paramView.jLt));
  }
  
  private static final class a
  {
    public String jLt;
    public int jOu;
    public String jumpUrl;
    
    public a(int paramInt, String paramString1, String paramString2)
    {
      this.jOu = paramInt;
      this.jumpUrl = paramString1;
      this.jLt = paramString2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/ui/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */