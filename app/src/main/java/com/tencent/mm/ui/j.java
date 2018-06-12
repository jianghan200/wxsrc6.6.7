package com.tencent.mm.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.g.a.bb;
import com.tencent.mm.g.a.ia.a;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.protocal.b.a.a;
import com.tencent.mm.protocal.b.a.b;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.util.LinkedList;

public final class j
{
  int bIA = 0;
  ProgressDialog eHw;
  com.tencent.mm.ui.widget.a.c eJi;
  boolean mRA;
  private View mRx;
  private TextView mRy;
  EditText mRz;
  MMFragmentActivity tiY;
  LauncherUI.b tiZ;
  ia.a tja = null;
  e tjb;
  boolean tjc = false;
  com.tencent.mm.sdk.b.c tjd = new j.1(this);
  com.tencent.mm.sdk.b.c<bb> tje = new j.2(this);
  
  public j(MMFragmentActivity paramMMFragmentActivity, LauncherUI.b paramb)
  {
    this.tiY = paramMMFragmentActivity;
    this.tiZ = paramb;
  }
  
  final boolean a(ia.a parama)
  {
    if ((parama == null) || (parama.bRz == null) || (parama.bRz.qXY == null) || (parama.bRz.qXY.size() == 0)) {
      return false;
    }
    int i = parama.bRz.id;
    String str1 = parama.bRz.title;
    String str2 = parama.bRz.bIr;
    int j = parama.type;
    int k = parama.bRz.qXY.size();
    if (j == 0) {
      if (k == 1)
      {
        parama = (a)parama.bRz.qXY.get(0);
        x.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert id[%d], title[%s], msg[%s], id[%d], action[%d], btnstr[%s], btnurl[%s]", new Object[] { Integer.valueOf(i), str1, str2, Integer.valueOf(parama.id), Integer.valueOf(parama.actionType), parama.qXW, parama.qXX });
        h.a(this.tiY, str2, str1, parama.qXW, false, new j.7(this, i, parama));
      }
    }
    for (;;)
    {
      return true;
      a locala1 = (a)parama.bRz.qXY.get(1);
      parama = (a)parama.bRz.qXY.get(0);
      x.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert title[%s], msg[%s], id1[%d], action1[%d], btnstr1[%s],btnurl1[%s], id2[%d], action2[%d], btnstr2[%s], btnurl2[%s]", new Object[] { str1, str2, Integer.valueOf(locala1.id), Integer.valueOf(locala1.actionType), locala1.qXW, locala1.qXX, Integer.valueOf(parama.id), Integer.valueOf(parama.actionType), parama.qXW, parama.qXX });
      h.a(this.tiY, str2, str1, locala1.qXW, parama.qXW, false, new j.8(this, i, locala1), new j.9(this, i, parama));
      continue;
      if (j == 1)
      {
        locala1 = (a)parama.bRz.qXY.get(0);
        a locala2 = (a)parama.bRz.qXY.get(1);
        h.a(this.tiY, str2, str1, locala1.qXW, locala2.qXW, false, parama.bRA, parama.bRB);
      }
    }
  }
  
  final e cpu()
  {
    if (this.tjb == null) {
      this.tjb = new j.11(this);
    }
    return this.tjb;
  }
  
  final void cpv()
  {
    if (this.eJi != null)
    {
      this.eJi.show();
      return;
    }
    if (this.mRx == null)
    {
      this.mRx = View.inflate(this.tiY, R.i.sendrequest_dialog, null);
      this.mRy = ((TextView)this.mRx.findViewById(R.h.sendrequest_tip));
      this.mRy.setText(getString(R.l.settings_independent_password_tip));
      this.mRz = ((EditText)this.mRx.findViewById(R.h.sendrequest_content));
      this.mRz.setInputType(129);
    }
    this.eJi = h.a(this.tiY, null, this.mRx, new j.12(this), new j.13(this));
  }
  
  final String getString(int paramInt)
  {
    return this.tiY.getString(paramInt);
  }
  
  final void lx(boolean paramBoolean)
  {
    x.d("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert handlePassword " + paramBoolean);
    if (paramBoolean)
    {
      cpv();
      return;
    }
    Intent localIntent = new Intent(this.tiY, RegByMobileSetPwdUI.class);
    localIntent.putExtra("kintent_hint", getString(R.l.settings_modify_password_tip));
    this.tiY.startActivity(localIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */