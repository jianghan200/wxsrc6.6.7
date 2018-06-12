package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.model.f;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

public final class l
  extends m
{
  public l(Context paramContext)
  {
    super(paramContext);
    this.jZR = f.f.game_list_item;
  }
  
  protected final void a(com.tencent.mm.plugin.game.model.d paramd, m.b paramb)
  {
    paramb.kal.removeAllViews();
    if (!bi.oW(paramd.jLf))
    {
      View localView = View.inflate(this.mContext, f.f.game_hotad_item, null);
      ImageView localImageView = (ImageView)localView.findViewById(f.e.game_hotad);
      com.tencent.mm.ak.a.a locala = o.Pj();
      paramd = paramd.jLf;
      c.a locala1 = new c.a();
      locala1.dXx = true;
      locala.a(paramd, localImageView, locala1.Pt());
      paramb.kal.addView(localView, new ViewGroup.LayoutParams(-1, com.tencent.mm.bp.a.fromDPToPix(this.mContext, 100)));
    }
  }
  
  protected final void a(com.tencent.mm.plugin.game.model.d paramd, m.b paramb, int paramInt)
  {
    paramb.kac.setText(paramd.position);
    Object localObject = paramb.kac;
    int i;
    if (this.jZT)
    {
      i = 0;
      ((TextView)localObject).setVisibility(i);
      localObject = DI(paramd.field_appId);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
        break label313;
      }
      paramb.kad.setImageBitmap((Bitmap)localObject);
      label79:
      paramb.jZe.setText(paramd.field_appName);
      if (!bi.oW(paramd.jLb)) {
        break label326;
      }
      paramb.kaf.setVisibility(8);
      label109:
      if (!bi.oW(paramd.jLc)) {
        break label348;
      }
      paramb.kag.setVisibility(8);
      label128:
      if (bi.cX(paramd.jLm)) {
        break label370;
      }
      paramb.kae.setVisibility(0);
      paramb.kae.setText((CharSequence)paramd.jLm.get(0));
    }
    for (;;)
    {
      paramb.kai.setTextSize(this.jWv);
      paramb.kah.setOnClickListener(this.jXl);
      paramb.kai.setOnClickListener(this.jXl);
      paramb.kah.setTag(paramd);
      paramb.kai.setTag(paramd);
      this.jWA.a(paramb.kai, paramb.kah, paramd, (n)this.jZW.get(paramd.field_appId));
      paramb.kaj.setData(paramd.jLk);
      paramb.kak.removeAllViews();
      paramd = (View)this.jZX.get(paramInt);
      if (paramd != null)
      {
        if ((paramd.getParent() instanceof ViewGroup)) {
          ((ViewGroup)paramd.getParent()).removeAllViews();
        }
        paramb.kak.addView(paramd);
      }
      return;
      i = 8;
      break;
      label313:
      paramb.kad.setImageResource(f.d.game_default_icon);
      break label79;
      label326:
      paramb.kaf.setVisibility(0);
      paramb.kaf.setText(paramd.jLb);
      break label109;
      label348:
      paramb.kag.setVisibility(0);
      paramb.kag.setText(paramd.jLc);
      break label128;
      label370:
      if (!bi.oW(paramd.jLp))
      {
        paramb.kae.setVisibility(0);
        paramb.kae.setText(paramd.jLp);
      }
      try
      {
        paramb.kae.setBackgroundDrawable(f.cm(Color.parseColor(paramd.jLq), com.tencent.mm.bp.a.fromDPToPix(this.mContext, 10)));
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        x.e("MicroMsg.GameLibraryListAdapter", localIllegalArgumentException.getMessage());
        paramb.kae.setVisibility(8);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.GameLibraryListAdapter", localException.getMessage());
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/ui/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */