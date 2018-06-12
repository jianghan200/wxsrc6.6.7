package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.Editable;
import android.text.Spannable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View.OnKeyListener;
import com.tencent.mm.R.f;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.a;
import com.tencent.mm.plugin.wenote.model.a.h;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.g;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.l;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.u;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class k
  implements com.tencent.mm.plugin.wenote.model.nativenote.b.c
{
  public static int mScreenHeight;
  public static int mScreenWidth;
  public static k qrq = null;
  private static DisplayMetrics qrr;
  public static int qrs = -1;
  private static int qru = -1;
  public int JP;
  public long bJA = -1L;
  public int gwO;
  public String qrA = null;
  public long qrB = -1L;
  public int qrC = 0;
  public boolean qrD = false;
  private View.OnKeyListener qrE = new k.1(this);
  public final al qrF = new al(new k.2(this), true);
  private transient ArrayList<WXRTEditText> qro = new ArrayList();
  public com.tencent.mm.plugin.wenote.ui.nativenote.a qrp;
  private int qrt;
  public long qrv = -1L;
  private String qrw = "";
  public com.tencent.mm.plugin.wenote.model.nativenote.b.b qrx = null;
  private boolean qry = false;
  public int qrz = -1;
  
  public k(com.tencent.mm.plugin.wenote.ui.nativenote.a parama)
  {
    this.qrp = parama;
    qrq = this;
    this.JP = com.tencent.mm.pluginsdk.e.cM(parama.caT());
    this.gwO = com.tencent.mm.pluginsdk.e.eL(parama.caT());
    int[] arrayOfInt = com.tencent.mm.compatible.util.j.db(parama.caT());
    mScreenHeight = arrayOfInt[1];
    mScreenWidth = arrayOfInt[0];
    qrr = parama.caT().getResources().getDisplayMetrics();
    this.qrt = (mScreenHeight - this.JP - this.gwO - (int)aq(8.0F));
    this.qrw = c.bZD().bZK();
    com.tencent.mm.plugin.wenote.model.nativenote.spans.m.qta = 0.0F;
  }
  
  public static float aq(float paramFloat)
  {
    return TypedValue.applyDimension(1, paramFloat, qrr);
  }
  
  private void bi(String paramString, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        fz localfz = new fz();
        localfz.bOL.type = 19;
        localfz.bOL.bJH = c.bZD().Sm(paramString);
        if (localfz.bOL.bJH == null)
        {
          x.e("MicroMsg.Note.WXRTManager", "updateNoteInfoStorage error, favProtoItem is null");
          return;
        }
        localfz.bOL.title = paramString;
        localfz.bOL.bJA = this.bJA;
        paramString = localfz.bOL;
        int i;
        if (paramBoolean)
        {
          i = 1;
          paramString.bOS = i;
          localfz.bOL.desc = "fav_update_note_storage";
          com.tencent.mm.sdk.b.a.sFg.m(localfz);
          if (paramBoolean)
          {
            this.qrz = localfz.bOL.bOO.getIntExtra("fav_note_item_status", -1);
            this.qrA = localfz.bOL.bOO.getStringExtra("fav_note_xml");
            this.qrB = localfz.bOL.bOO.getLongExtra("fav_note_item_updatetime", -1L);
          }
        }
        else
        {
          i = 0;
        }
      }
      finally {}
    }
  }
  
  public static k caj()
  {
    return qrq;
  }
  
  private void cak()
  {
    if ((this.qrv < 0L) && (this.bJA > 0L))
    {
      this.qrF.J(60000L, 60000L);
      this.qrv = bi.VG();
      this.qrw = c.bZD().bZK();
    }
  }
  
  public static void can()
  {
    if (qrq != null) {
      qrq.qrp.caU().kr(true);
    }
  }
  
  public final void Bs(int paramInt)
  {
    this.qrp.caU().Q(paramInt, 0L);
  }
  
  public final void a(WXRTEditText paramWXRTEditText, int paramInt1, int paramInt2)
  {
    if ((this.qrC != 2) || (!this.qrD)) {}
    while (paramWXRTEditText == null) {
      return;
    }
    this.qrp.caU().ep(paramInt1, paramInt2);
    boolean bool8;
    boolean bool7;
    boolean bool6;
    boolean bool5;
    if (paramWXRTEditText.getEditTextType() == 0)
    {
      Iterator localIterator = u.qtA.iterator();
      boolean bool1 = false;
      boolean bool4 = false;
      boolean bool3 = false;
      boolean bool2 = false;
      t localt;
      for (;;)
      {
        bool8 = bool1;
        bool7 = bool4;
        bool6 = bool3;
        bool5 = bool2;
        if (!localIterator.hasNext()) {
          break label178;
        }
        localt = (t)localIterator.next();
        if (!localt.q(paramWXRTEditText)) {
          break label223;
        }
        if ((localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.b))
        {
          bool2 = true;
        }
        else if ((localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.c))
        {
          bool3 = true;
        }
        else
        {
          if (!(localt instanceof l)) {
            break;
          }
          bool4 = true;
        }
      }
      if (!(localt instanceof com.tencent.mm.plugin.wenote.model.nativenote.spans.j)) {
        break label223;
      }
      bool1 = true;
    }
    label178:
    label223:
    for (;;)
    {
      break;
      bool8 = false;
      bool7 = false;
      bool6 = false;
      bool5 = false;
      this.qrx.ks(bool5);
      this.qrx.kt(bool6);
      this.qrx.ku(bool7);
      this.qrx.kv(bool8);
      return;
    }
  }
  
  public final void a(WXRTEditText paramWXRTEditText, Spannable paramSpannable1, Spannable paramSpannable2, int paramInt)
  {
    String str = paramWXRTEditText.a(i.qrk);
    com.tencent.mm.plugin.wenote.model.a.b localb;
    int i;
    int j;
    if (paramWXRTEditText.getEditTextType() == 0)
    {
      localb = c.bZD().Bv(paramWXRTEditText.getRecyclerItemPosition());
      if ((localb != null) && (localb.getType() == 1))
      {
        if (paramSpannable1 != null) {
          break label104;
        }
        i = 0;
        if (paramSpannable2 != null) {
          break label116;
        }
        j = 0;
        label56:
        if (!c.bZD().eq(j - i, 0)) {
          break label128;
        }
        this.qrp.caU().bZn();
        this.qrp.caU().Bo(paramWXRTEditText.getRecyclerItemPosition());
      }
    }
    label104:
    label116:
    label128:
    do
    {
      return;
      i = com.tencent.mm.plugin.wenote.b.c.Ss(paramSpannable1.toString());
      break;
      j = com.tencent.mm.plugin.wenote.b.c.Ss(paramSpannable2.toString());
      break label56;
      c.bZD().bZG();
      ((h)localb).qoJ = paramInt;
      ((h)localb).content = str;
      ((h)localb).qoH = true;
      localb.qoN = false;
      paramWXRTEditText = c.bZD();
      paramWXRTEditText.qpU = (j - i + paramWXRTEditText.qpU);
      return;
      paramWXRTEditText.setText("");
    } while (bi.oW(str));
    paramSpannable2 = new h();
    if (str.equals("<br/>")) {}
    for (paramSpannable1 = "";; paramSpannable1 = str)
    {
      paramSpannable2.content = paramSpannable1;
      paramInt = c.bZD().a(paramSpannable2, paramWXRTEditText, true, false, false);
      c.bZD().er(paramInt - 1, paramInt + 1);
      return;
    }
  }
  
  public final void a(WXRTEditText paramWXRTEditText, boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {}
    try
    {
      cak();
      this.qrp.caU().a(paramWXRTEditText, paramBoolean, paramInt);
      return;
    }
    finally {}
  }
  
  public final void b(WXRTEditText paramWXRTEditText)
  {
    this.qrp.caU().a(paramWXRTEditText);
  }
  
  public final <V, C extends g<V>> void b(t<V, C> paramt, V paramV)
  {
    WXRTEditText localWXRTEditText = cai();
    if (localWXRTEditText != null)
    {
      if (localWXRTEditText.getEditTextType() == 0)
      {
        int i = localWXRTEditText.getSelection().Tw;
        int j = localWXRTEditText.getText().length();
        if (((paramV instanceof Boolean)) && (((Boolean)paramV).booleanValue()) && (i == j))
        {
          localWXRTEditText.cab();
          localWXRTEditText.getText().append("\n");
          localWXRTEditText.cac();
          localWXRTEditText.setSelection(i);
        }
        localWXRTEditText.a(paramt, paramV);
      }
    }
    else {
      return;
    }
    localWXRTEditText.qqV = true;
    localWXRTEditText.qoR = paramt.caD();
    localWXRTEditText.getText().append("\n");
  }
  
  public final void bZx()
  {
    this.qrp.caU().bZx();
    cak();
  }
  
  public final void bZz()
  {
    this.qrp.caU().bZl();
  }
  
  public final WXRTEditText cai()
  {
    Object localObject1 = c.bZD();
    ArrayList localArrayList = this.qro;
    if (localArrayList != null) {
      localArrayList.clear();
    }
    label130:
    for (;;)
    {
      com.tencent.mm.plugin.wenote.model.a.b localb;
      try
      {
        if (((c)localObject1).gBc == null)
        {
          if (this.qro != null) {
            break;
          }
          return null;
        }
        Iterator localIterator = ((c)localObject1).gBc.iterator();
        if (!localIterator.hasNext()) {
          break label130;
        }
        localb = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
        if (localb.qoM != null)
        {
          localArrayList.add(localb.qoM);
          continue;
        }
        if (localb.qoK == null) {
          continue;
        }
      }
      finally {}
      if (localb.qoL != null)
      {
        ((ArrayList)localObject2).add(localb.qoK);
        ((ArrayList)localObject2).add(localb.qoL);
      }
    }
    localObject1 = this.qro.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      WXRTEditText localWXRTEditText = (WXRTEditText)((Iterator)localObject1).next();
      if (localWXRTEditText.hasFocus()) {
        return localWXRTEditText;
      }
    }
    return null;
  }
  
  public final void cal()
  {
    if ((this.bJA > 0L) && (this.qrv > 0L))
    {
      String str = c.bZD().bZK();
      if (!str.equals(this.qrw))
      {
        this.qrw = str;
        if (this.qry) {
          break label63;
        }
        this.qry = true;
        bi(this.qrw, true);
      }
    }
    return;
    label63:
    bi(this.qrw, false);
  }
  
  public final WXRTEditText cam()
  {
    WXRTEditText localWXRTEditText2 = cai();
    WXRTEditText localWXRTEditText1 = localWXRTEditText2;
    if (localWXRTEditText2 == null)
    {
      localWXRTEditText1 = localWXRTEditText2;
      if (this.qro.size() > 0) {
        localWXRTEditText1 = (WXRTEditText)this.qro.get(this.qro.size() - 1);
      }
    }
    return localWXRTEditText1;
  }
  
  public final void e(boolean paramBoolean, long paramLong)
  {
    this.qrp.caU().e(paramBoolean, paramLong);
  }
  
  public final void o(WXRTEditText paramWXRTEditText)
  {
    if (paramWXRTEditText.qqJ == 0) {
      paramWXRTEditText.setTextSize(0, com.tencent.mm.bp.a.ad(paramWXRTEditText.getContext(), R.f.NormalTextSize));
    }
    b.setTextSize(paramWXRTEditText.getTextSize());
    paramWXRTEditText.qqz = this;
    paramWXRTEditText.setRichTextEditing(null);
    paramWXRTEditText.setOnKeyListener(this.qrE);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/nativenote/manager/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */