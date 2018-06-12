package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.t;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.plugin.wenote.model.a.b;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.d;
import com.tencent.mm.plugin.wenote.model.nativenote.c.e;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.x;

public abstract class h
  extends a
{
  public static float qvC = Resources.getSystem().getDisplayMetrics().density;
  public static int qvD = Resources.getSystem().getDisplayMetrics().widthPixels;
  public static int qvE = (int)(40.0F * qvC + 0.5F);
  public ImageView bOA;
  public LinearLayout eRj;
  public View.OnClickListener jXR = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      if (h.this.qtF.cai() != null)
      {
        x.e("Micromsg.NoteOtherItemHolder", "click item , now is editing, quit it");
        return;
      }
      if (h.this.qtF.qrC == 2)
      {
        h.this.qtF.qrp.caU().bZy();
        h.this.qtF.cal();
      }
      int i = ((RecyclerView.t)paramAnonymousView.getTag()).gm();
      kp localkp = new kp();
      if (com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(i) == null)
      {
        x.e("Micromsg.NoteOtherItemHolder", "click not response, null == NoteDataManager.getMgr().get(position),position is %d,datalist size = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().size()) });
        return;
      }
      if (com.tencent.mm.plugin.wenote.model.c.bZb().qnC == null)
      {
        x.e("Micromsg.NoteOtherItemHolder", "getWnNoteBase is null");
        return;
      }
      x.i("Micromsg.NoteOtherItemHolder", "click item, type is %d", new Object[] { Integer.valueOf(com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(i).getType()) });
      localkp.bUP.bUR = ((n)com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bZD().Bv(i)).qpc;
      localkp.bUP.context = paramAnonymousView.getContext();
      localkp.bUP.type = 1;
      com.tencent.mm.plugin.wenote.model.c.bZb().qnC.b(localkp);
    }
  };
  public LinearLayout qvA;
  public LinearLayout qvB;
  public WXRTEditText qvo;
  public WXRTEditText qvp;
  public LinearLayout qvq;
  public TextView qvr;
  public TextView qvs;
  public ImageView qvt;
  public View qvu;
  public LinearLayout qvv;
  public LinearLayout qvw;
  public LinearLayout qvx;
  public LinearLayout qvy;
  public LinearLayout qvz;
  
  public h(View paramView, k paramk)
  {
    super(paramView, paramk);
    this.bOA = ((ImageView)paramView.findViewById(R.h.edit_imageView));
    this.qvu = paramView.findViewById(R.h.video_click_area);
    this.qvq = ((LinearLayout)paramView.findViewById(R.h.note_card_ll));
    this.eRj = ((LinearLayout)paramView.findViewById(R.h.note_voice_ll));
    this.qvr = ((TextView)paramView.findViewById(R.h.note_card_title));
    this.qvs = ((TextView)paramView.findViewById(R.h.note_card_detail));
    this.qvt = ((ImageView)paramView.findViewById(R.h.note_card_icon));
    this.qvr.setTextSize(16.0F);
    this.qvs.setTextSize(12.0F);
    this.qvv = ((LinearLayout)paramView.findViewById(R.h.note_split_ll));
    this.qvv.setVisibility(8);
    this.qvx = ((LinearLayout)paramView.findViewById(R.h.note_reminder_ll));
    this.qvx.setVisibility(8);
    this.qvy = ((LinearLayout)paramView.findViewById(R.h.note_bottom_logo_ll));
    this.qvy.setVisibility(8);
    this.qvz = ((LinearLayout)paramView.findViewById(R.h.other_cover_view));
    this.qvz.setBackgroundColor(1347529272);
    this.qvz.setVisibility(8);
    this.qvz.setOnClickListener(new h.1(this));
    this.qvA = ((LinearLayout)paramView.findViewById(R.h.other_up_cover_view));
    this.qvA.setBackgroundColor(1347529272);
    this.qvA.setVisibility(4);
    this.qvB = ((LinearLayout)paramView.findViewById(R.h.other_down_cover_view));
    this.qvB.setBackgroundColor(1347529272);
    this.qvB.setVisibility(4);
    this.qvw = ((LinearLayout)paramView.findViewById(R.h.edit_view_ll));
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.qvw.getLayoutParams();
    localLayoutParams.width = (qvD - qvE);
    localLayoutParams.height = -2;
    this.qvw.setLayoutParams(localLayoutParams);
    this.qvp = ((WXRTEditText)paramView.findViewById(R.h.btnNext));
    this.qvo = ((WXRTEditText)paramView.findViewById(R.h.btnPrev));
    ((LinearLayout)paramView.findViewById(R.h.btnNextLL)).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        h.this.qvp.bZZ();
        h.this.qvp.requestFocus();
      }
    });
    ((LinearLayout)paramView.findViewById(R.h.btnPrevLL)).setOnClickListener(new h.3(this));
    this.qvp.setEditTextType(2);
    this.qvo.setEditTextType(1);
    this.qvo.qqL = this;
    this.qvp.qqL = this;
    if ((paramk.qrC != 2) || (!this.qtF.qrD))
    {
      this.qvp.setKeyListener(null);
      this.qvp.setEnabled(false);
      this.qvp.setFocusable(false);
      this.qvo.setKeyListener(null);
      this.qvo.setEnabled(false);
      this.qvo.setFocusable(false);
    }
    this.qtF.o(this.qvo);
    this.qtF.o(this.qvp);
  }
  
  public void a(b paramb, int paramInt1, int paramInt2)
  {
    x.i("Micromsg.NoteOtherItemHolder", "ImageItemHolder position is " + gl());
    this.qvo.setPosInDataList(paramInt1);
    this.qvp.setPosInDataList(paramInt1);
    if (e.isEnabled()) {
      e.cap().a(this.qvz, this.qvA, this.qvB, paramInt1);
    }
    paramb.qoK = this.qvo;
    paramb.qoL = this.qvp;
    paramb.qoM = null;
    if (paramb.qoH) {
      if (paramb.qoN) {
        this.qvo.requestFocus();
      }
    }
    for (;;)
    {
      if (this.qvq.getVisibility() == 0)
      {
        if (!paramb.qoO) {
          break;
        }
        this.qvq.setBackgroundResource(R.g.wenote_basecard_pressed_bg);
      }
      return;
      this.qvp.requestFocus();
      continue;
      if (this.qvo.hasFocus()) {
        this.qvo.clearFocus();
      }
      if (this.qvp.hasFocus()) {
        this.qvp.clearFocus();
      }
    }
    this.qvq.setBackgroundResource(R.g.wenote_basecard_bg);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/ui/nativenote/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */