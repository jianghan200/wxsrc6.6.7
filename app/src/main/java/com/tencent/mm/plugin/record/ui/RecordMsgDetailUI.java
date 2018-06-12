package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.y.g.a;
import java.util.Iterator;
import java.util.LinkedList;

public class RecordMsgDetailUI
  extends RecordMsgBaseUI
{
  private long bJC = -1L;
  private boolean bUY = true;
  private String bXN = null;
  private p fUo = null;
  private com.tencent.mm.protocal.b.a.c msX = null;
  private boolean msY = false;
  private String msZ = "";
  private String mta = "";
  private String title = "";
  
  private String a(com.tencent.mm.protocal.b.a.c paramc)
  {
    if (paramc != null)
    {
      Object localObject = paramc.dzs.iterator();
      int i = 0;
      String str1 = null;
      String str2 = null;
      paramc = null;
      while (((Iterator)localObject).hasNext())
      {
        vx localvx = (vx)((Iterator)localObject).next();
        if (localvx.rAi.rAJ.rBh != null)
        {
          paramc = this.mController.tml.getString(R.l.record_chatroom_title);
          i = 1;
        }
        else
        {
          if (localvx.rAi.rAJ.bSS == null) {
            break label226;
          }
          if (str2 == null)
          {
            str2 = localvx.rAk;
          }
          else
          {
            if (str2 == localvx.rAk) {
              break label226;
            }
            str1 = localvx.rAk;
          }
        }
      }
      label226:
      for (;;)
      {
        break;
        if ((str2 != null) && (str1 == null) && (i == 0)) {
          localObject = this.mController.tml.getString(R.l.favorite_record_chatroom_title, new Object[] { str2 });
        }
        do
        {
          do
          {
            do
            {
              do
              {
                return (String)localObject;
                localObject = paramc;
              } while (str2 == null);
              localObject = paramc;
            } while (str1 == null);
            localObject = paramc;
          } while (str2.equals(str1));
          localObject = paramc;
        } while (i != 0);
        return this.mController.tml.getString(R.l.favorite_record_chat_title, new Object[] { str2, str1 });
      }
    }
    return null;
  }
  
  private void aL()
  {
    f localf = new f();
    localf.msv = this.msX.dzs;
    localf.bJC = this.bJC;
    localf.bXN = this.bXN;
    super.bqA();
    this.msU.a(localf);
    n.getRecordMsgCDNStorage().a((e)this.msU);
  }
  
  protected final void bqA()
  {
    this.bJC = getIntent().getLongExtra("message_id", -1L);
    this.bXN = getIntent().getStringExtra("record_xml");
    this.bUY = getIntent().getBooleanExtra("record_show_share", true);
    this.msY = getIntent().getBooleanExtra("big_appmsg", false);
    this.msX = com.tencent.mm.plugin.record.b.h.Ks(this.bXN);
    if (this.msX != null) {
      if (a(this.msX) != null)
      {
        this.title = a(this.msX);
        if (!bi.cX(this.msX.dzs))
        {
          this.msZ = ((vx)this.msX.dzs.getFirst()).rAm;
          this.mta = ((vx)this.msX.dzs.getLast()).rAm;
        }
      }
    }
    for (;;)
    {
      if ((this.bXN != null) && (this.msX != null)) {
        break label328;
      }
      bqI();
      setBackBtn(new RecordMsgDetailUI.1(this));
      if ((this.msY) && (ao.asF().fH(this.bJC) != null))
      {
        au.HU();
        localObject = com.tencent.mm.model.c.FT().dW(this.bJC);
        localObject = new ac(this.bJC, ((cm)localObject).field_msgSvrId, new com.tencent.mm.ab.f()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, l paramAnonymousl)
          {
            if (paramAnonymousInt1 == paramAnonymousInt2)
            {
              if (RecordMsgDetailUI.a(RecordMsgDetailUI.this) != null)
              {
                RecordMsgDetailUI.a(RecordMsgDetailUI.this).dismiss();
                RecordMsgDetailUI.b(RecordMsgDetailUI.this);
              }
              au.HU();
              com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().dW(RecordMsgDetailUI.c(RecordMsgDetailUI.this));
              paramAnonymousl = localbd.field_content;
              if (com.tencent.mm.model.s.fq(localbd.field_talker)) {
                paramAnonymousl = com.tencent.mm.model.bd.iC(localbd.field_content);
              }
              paramAnonymousl = g.a.gp(paramAnonymousl);
              if (paramAnonymousl != null)
              {
                RecordMsgDetailUI.a(RecordMsgDetailUI.this, paramAnonymousl.dwW);
                RecordMsgDetailUI.a(RecordMsgDetailUI.this, com.tencent.mm.plugin.record.b.h.Ks(RecordMsgDetailUI.d(RecordMsgDetailUI.this)));
                if (RecordMsgDetailUI.e(RecordMsgDetailUI.this) != null)
                {
                  if (RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)) == null) {
                    break label230;
                  }
                  RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this)));
                }
              }
            }
            for (;;)
            {
              RecordMsgDetailUI.c(RecordMsgDetailUI.this, ((vx)RecordMsgDetailUI.e(RecordMsgDetailUI.this).dzs.getFirst()).rAm);
              RecordMsgDetailUI.d(RecordMsgDetailUI.this, ((vx)RecordMsgDetailUI.e(RecordMsgDetailUI.this).dzs.getLast()).rAm);
              RecordMsgDetailUI.f(RecordMsgDetailUI.this);
              return;
              label230:
              RecordMsgDetailUI.b(RecordMsgDetailUI.this, RecordMsgDetailUI.e(RecordMsgDetailUI.this).title);
            }
          }
        });
        au.DF().a((l)localObject, 0);
      }
      return;
      this.title = this.msX.title;
      break;
      au.HU();
      Object localObject = com.tencent.mm.model.c.FT().dW(this.bJC);
      localObject = g.a.J(((cm)localObject).field_content, ((cm)localObject).field_reserved);
      if (localObject != null)
      {
        this.title = ((g.a)localObject).title;
        this.fUo = p.b(this, getString(R.l.loading_tips), true, 0, null);
      }
    }
    label328:
    aL();
  }
  
  protected final h bqB()
  {
    e locale = new e(this, new g());
    locale.fromScene = getIntent().getIntExtra("from_scene", 0);
    return locale;
  }
  
  protected final String bqC()
  {
    return this.title;
  }
  
  protected final String bqD()
  {
    return this.msZ;
  }
  
  protected final String bqE()
  {
    return this.mta;
  }
  
  protected final void bqF()
  {
    if (!this.bUY) {
      return;
    }
    addIconOptionMenu(0, R.g.mm_title_btn_menu, new RecordMsgDetailUI.3(this));
  }
  
  protected final void c(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    if (-1 != paramInt2) {
      x.e("MicroMsg.RecordMsgDetailUI", "processResult %d", new Object[] { Integer.valueOf(paramInt2) });
    }
    label76:
    label87:
    do
    {
      return;
      if (1001 == paramInt1)
      {
        if (paramIntent == null)
        {
          localObject = null;
          if (paramIntent != null) {
            break label76;
          }
        }
        for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
        {
          if (!bi.oW((String)localObject)) {
            break label87;
          }
          x.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but toUser is null");
          return;
          localObject = paramIntent.getStringExtra("Select_Conv_User");
          break;
        }
        au.HU();
        final com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().dW(this.bJC);
        if (localbd.field_msgId != this.bJC)
        {
          x.w("MicroMsg.RecordMsgDetailUI", "want to send record msg, but message info is null");
          return;
        }
        final p localp = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.favorite_forward_tips), false, null);
        au.Em().H(new Runnable()
        {
          public final void run()
          {
            com.tencent.mm.plugin.record.b.h.a(localObject, paramIntent, localbd);
            ah.A(new Runnable()
            {
              public final void run()
              {
                RecordMsgDetailUI.4.this.iYD.dismiss();
              }
            });
          }
          
          public final String toString()
          {
            return super.toString() + "|onActivityResult";
          }
        });
        return;
      }
    } while ((1002 != paramInt1) || (!paramIntent.getBooleanExtra("kfavorite", false)));
    final Object localObject = new ch();
    com.tencent.mm.pluginsdk.model.e.a((ch)localObject, paramIntent);
    ((ch)localObject).bJF.activity = this;
    ((ch)localObject).bJF.bJM = 8;
    a.sFg.m((b)localObject);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    n.getRecordMsgCDNStorage().b((e)this.msU);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/record/ui/RecordMsgDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */