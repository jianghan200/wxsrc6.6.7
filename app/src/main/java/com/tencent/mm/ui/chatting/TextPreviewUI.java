package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.br.g;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.CustomScrollView;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.widget.textview.a.a;

@com.tencent.mm.ui.base.a(3)
public class TextPreviewUI
  extends MMActivity
  implements e
{
  private bd bXQ;
  private int bottom = 0;
  private TextView ih = null;
  private Animation nem;
  private Animation nen;
  private boolean qNz = false;
  private TextView tKB = null;
  private com.tencent.mm.ui.widget.textview.a tNb;
  private com.tencent.mm.ui.widget.b.a tNc;
  private CharSequence tNd;
  private View tNe;
  private View tNf;
  private View tNg;
  private CustomScrollView tNh;
  private final int tNi = 0;
  private final int tNj = 1;
  private final int tNk = 2;
  private boolean tNl = false;
  private ToolsBar tNm;
  private View tNn;
  private CharSequence text = null;
  private int yA;
  
  private void aQ(bd parambd)
  {
    com.tencent.mm.ui.chatting.view.b localb = new com.tencent.mm.ui.chatting.view.b(this.mController.tml);
    localb.tZc = new TextPreviewUI.4(this, localb, parambd);
    localb.show();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      switch (paraml.getType())
      {
      }
    }
    while (paraml.getType() != 525)
    {
      return;
      x.i("MicroMsg.TextPreviewUI", "set msg remind!");
      com.tencent.mm.ui.widget.snackbar.b.d(this.mController.tml, this.mController.tml.getResources().getString(R.l.has_remind_tip), "");
      return;
    }
    x.e("MicroMsg.TextPreviewUI", "[setMsgRemind] scene type:%s errCode:%s, errType:%s, errMsg:%s", new Object[] { Integer.valueOf(525), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), bi.oV(paramString) });
    ActionBarActivity localActionBarActivity = this.mController.tml;
    paraml = paramString;
    if (bi.oW(paramString)) {
      paraml = getResources().getString(R.l.remind_err_desc);
    }
    com.tencent.mm.ui.base.h.b(localActionBarActivity, paraml, this.mController.tml.getResources().getString(R.l.remind_err_title), true);
    com.tencent.mm.plugin.report.service.h.mEJ.a(795L, 4L, 1L, false);
  }
  
  protected final int getLayoutId()
  {
    return R.i.chatting_item_full_screen;
  }
  
  public void onBackPressed()
  {
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    if (d.fR(19)) {
      getWindow().setFlags(67109888, 67109888);
    }
    this.tNe = findViewById(R.h.text_screen);
    this.text = getIntent().getCharSequenceExtra("key_chat_text");
    long l = getIntent().getLongExtra("Chat_Msg_Id", 0L);
    au.HU();
    this.bXQ = c.FT().dW(l);
    this.ih = ((TextView)findViewById(R.h.full_screen_text));
    this.tKB = ((TextView)findViewById(R.h.full_screen_text_span));
    Object localObject1 = this.text;
    Object localObject2 = this.tKB;
    paramBundle = (Bundle)localObject1;
    if ((localObject1 instanceof SpannableString))
    {
      ((TextView)localObject2).setText(((SpannableString)localObject1).toString());
      j.g((TextView)localObject2, 1);
      paramBundle = ((TextView)localObject2).getText();
    }
    this.text = paramBundle;
    paramBundle = this.ih;
    localObject1 = g.cjL();
    localObject2 = this.mController.tml;
    paramBundle.setText(((g)localObject1).a(this.text, this.ih.getTextSize()));
    this.tNf = findViewById(R.h.know_more_btn_container);
    this.tNg = this.tNf.findViewById(R.h.jump_tip_btn);
    this.tNh = ((CustomScrollView)findViewById(R.h.full_screen_scroll_container));
    this.ih.getViewTreeObserver().addOnPreDrawListener(new TextPreviewUI.1(this));
    this.nen = AnimationUtils.loadAnimation(this.mController.tml, R.a.push_up_in);
    this.nem = AnimationUtils.loadAnimation(this.mController.tml, R.a.push_down_out);
    this.tNc = new com.tencent.mm.ui.widget.b.a(this.mController.tml, this.ih);
    this.tNc.uKX = true;
    this.tNc.uKW = new TextPreviewUI.8(this);
    this.tNc.ofq = new TextPreviewUI.9(this);
    if ((this.tNb == null) && (bi.oW(bf.n(this.bXQ))))
    {
      paramBundle = new a.a(this.ih, this.tNc);
      paramBundle.uPh = R.e.selected_blue;
      paramBundle.uPr = 18;
      paramBundle.uPi = R.e.cursor_handle_color;
      this.tNb = new com.tencent.mm.ui.widget.textview.a(paramBundle);
      this.tNb.uPc = new TextPreviewUI.10(this);
    }
    this.tNe.setOnClickListener(new TextPreviewUI.11(this));
    this.ih.setOnClickListener(new TextPreviewUI.12(this));
    if (!bi.oW(bf.n(this.bXQ)))
    {
      this.tNf.setVisibility(0);
      this.tNg.setOnClickListener(new TextPreviewUI.13(this));
    }
    for (;;)
    {
      setBackBtn(new TextPreviewUI.14(this));
      this.tNh.setOnTouchListener(new TextPreviewUI.15(this));
      this.tNh.setOnScrollChangeListener(new TextPreviewUI.2(this));
      au.DF().a(525, this);
      return;
      if (!bf.l(this.bXQ))
      {
        paramBundle = (ViewStub)findViewById(R.h.viewstub_text_more_btn);
        if (paramBundle != null) {
          this.tNn = paramBundle.inflate();
        }
        this.tNm = ((ToolsBar)findViewById(R.h.tools_bar));
        this.tNm.setVisibility(0);
        if (this.tNm != null)
        {
          this.tNm.c(0, new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              if (TextPreviewUI.d(TextPreviewUI.this) != null) {
                TextPreviewUI.b(TextPreviewUI.this.mController.tml, TextPreviewUI.k(TextPreviewUI.this).toString());
              }
            }
          });
          this.tNm.c(1, new TextPreviewUI.6(this));
          this.tNm.c(2, new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              TextPreviewUI.b(TextPreviewUI.this, TextPreviewUI.d(TextPreviewUI.this));
            }
          });
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(525, this);
  }
  
  protected void onResume()
  {
    super.onResume();
    if ((this.tNb != null) && (!this.tNb.ccw)) {
      this.tNb.cBp();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/TextPreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */