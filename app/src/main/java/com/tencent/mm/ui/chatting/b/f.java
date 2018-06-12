package com.tencent.mm.ui.chatting.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.ar.n;
import com.tencent.mm.ar.r;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.y;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.b.class)
public class f
  extends a
  implements com.tencent.mm.ui.chatting.b.b.b
{
  private static HashMap<String, com.tencent.mm.pluginsdk.ui.e> tOJ = new HashMap();
  private com.tencent.mm.pluginsdk.ui.e mnM = null;
  private Bitmap tOG;
  private ImageView tOH;
  private final j.a tOI = new f.1(this);
  
  private boolean bC(Context paramContext, String paramString)
  {
    if (tOJ.containsKey(paramString))
    {
      this.mnM = ((com.tencent.mm.pluginsdk.ui.e)tOJ.get(paramString));
      return true;
    }
    try
    {
      this.mnM = new com.tencent.mm.pluginsdk.ui.e(bi.convertStreamToString(paramContext.getAssets().open(paramString)));
      tOJ.put(paramString, this.mnM);
      return true;
    }
    catch (Exception paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ChattingUI.ChattingBackgroundComponent", paramContext, "", new Object[0]);
    }
    return false;
  }
  
  private void cuK()
  {
    if ((this.tOG != null) && (!this.tOG.isRecycled()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "recycle bitmap:%s", new Object[] { this.tOG.toString() });
      this.tOG.recycle();
    }
    if (this.tOH != null) {
      this.tOH.setImageBitmap(null);
    }
  }
  
  private int cuL()
  {
    return this.bAG.tTq.getMMResources().getColor(R.e.chatting_bg_purecolor);
  }
  
  private void setBackgroundColor(int paramInt)
  {
    cuK();
    if (this.tOH == null)
    {
      View localView = this.bAG.findViewById(R.h.chatting_bg_ll);
      if (localView != null) {
        localView.setBackgroundColor(paramInt);
      }
      return;
    }
    this.tOH.setImageDrawable(new ColorDrawable(paramInt));
  }
  
  public final void bVP()
  {
    com.tencent.mm.ar.a locala = r.Qq().mw(this.bAG.getTalkerUserName());
    int i;
    if (locala == null)
    {
      au.HU();
      i = ((Integer)c.DT().get(12311, Integer.valueOf(-2))).intValue();
      if (i != -2) {
        break label83;
      }
      setBackgroundColor(cuL());
      bC(this.bAG.tTq.getContext(), "chatting/purecolor_chat.xml");
    }
    for (;;)
    {
      return;
      i = locala.ecv;
      break;
      label83:
      r.Qp();
      int j = n.bP(this.bAG.tTq.getContext());
      if (i == 0) {
        switch (j)
        {
        default: 
          i = -1;
          if (i == -1) {
            continue;
          }
          cuK();
        }
      }
      try
      {
        this.tOG = BitmapFactory.decodeResource(this.bAG.tTq.getMMResources(), i);
        if (this.tOG == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.ChattingBackgroundComponent", "setBackground decodeFile fail, bm is null, resId = " + i);
          setBackgroundColor(this.bAG.tTq.getMMResources().getColor(R.e.chatting_bg_purecolor));
          bC(this.bAG.tTq.getContext(), "chatting/reserved_chat.xml");
          return;
          i = R.g.chatting_bg_default;
        }
      }
      catch (IncompatibleClassChangeError localIncompatibleClassChangeError)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Crash", localIncompatibleClassChangeError, "May cause dvmFindCatchBlock crash!", new Object[0]);
          throw ((IncompatibleClassChangeError)new IncompatibleClassChangeError("May cause dvmFindCatchBlock crash!").initCause(localIncompatibleClassChangeError));
          if (this.tOH == null) {
            this.tOH = ((ImageView)this.bAG.findViewById(R.h.chatting_bg_iv));
          }
          if (this.tOH != null) {
            this.tOH.setImageBitmap(this.tOG);
          }
        }
        n localn = r.Qp();
        String str;
        if (i > 0)
        {
          bC(this.bAG.tTq.getContext(), "chatting/default_chat.xml");
          switch (j)
          {
          default: 
            str = null;
          }
        }
        for (;;)
        {
          cuK();
          this.tOG = y.oQ(str);
          if (this.tOG != null) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.ChattingBackgroundComponent", "setBackground decodeFile fail, bm is null, path = " + str);
          setBackgroundColor(cuL());
          return;
          str = localn.bl(i, 1) + "horizontal_hdpi.jpg";
          continue;
          str = localn.bl(i, 1) + "horizontal_ldpi.jpg";
          continue;
          str = localn.bl(i, 1) + "vertical_hdpi.jpg";
          continue;
          str = localn.bl(i, 1) + "vertical_ldpi.jpg";
          continue;
          bC(this.bAG.tTq.getContext(), "chatting/default_chat.xml");
          if (str == null) {
            str = n.Q("default", j);
          } else {
            str = n.Q(this.bAG.getTalkerUserName(), j);
          }
        }
        if (this.tOH == null) {
          this.tOH = ((ImageView)this.bAG.findViewById(R.h.chatting_bg_iv));
        }
        if (this.tOH == null) {
          continue;
        }
        this.tOH.setImageBitmap(this.tOG);
        return;
      }
      catch (Throwable localThrowable)
      {
        for (;;) {}
      }
    }
  }
  
  public final void cpF() {}
  
  public final void cpG()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingEnterAnimStart]");
    bVP();
  }
  
  public final void cpH()
  {
    r.Qq().c(this.tOI);
    r.Qp().c(this.tOI);
  }
  
  public final void cpI() {}
  
  public final void cpJ() {}
  
  public final void cpL()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChattingBackgroundComponent", "[onChattingExitAnimEnd]");
    if (au.HX())
    {
      r.Qq().d(this.tOI);
      r.Qp().d(this.tOI);
    }
    cuK();
  }
  
  public final com.tencent.mm.pluginsdk.ui.e cuM()
  {
    return this.mnM;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */