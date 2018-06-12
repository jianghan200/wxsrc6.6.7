package com.tencent.mm.plugin.dbbackup;

import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.dbbackup.a.a;
import com.tencent.mm.plugin.dbbackup.a.a.b;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class DBRecoveryUI
  extends MMActivity
  implements a.b
{
  private static final int[] hZI = { 0, 5, 70, 80, 90, 100, 100 };
  private ProgressBar eWx;
  private int fdx;
  private a hZA;
  private View hZB;
  private View hZC;
  private TextView hZD;
  private View hZE;
  private int hZF;
  private boolean hZG;
  private DialogInterface.OnClickListener hZH = new DBRecoveryUI.1(this);
  
  private static void aCC()
  {
    x localx = g.Ei().DT();
    localx.set(89, Integer.valueOf(2));
    localx.lm(true);
  }
  
  public final void G(int paramInt1, int paramInt2, int paramInt3)
  {
    float f1 = 1.0F;
    if ((paramInt1 <= 0) || (paramInt1 > 6)) {
      return;
    }
    int i;
    int j;
    float f2;
    if (paramInt3 > 0)
    {
      i = hZI[(paramInt1 - 1)];
      j = hZI[paramInt1];
      f2 = paramInt2 / paramInt3;
      if (f2 <= 1.0F) {
        break label145;
      }
    }
    for (;;)
    {
      f2 = i;
      paramInt3 = (int)(f1 * (j - i) + f2);
      this.eWx.setProgress(paramInt3);
      for (;;)
      {
        this.hZF = paramInt1;
        String str = getResources().getStringArray(com.tencent.mm.R.c.data_recovery_progress)[(paramInt1 - 1)];
        this.hZD.setText(String.format(str, new Object[] { Integer.valueOf(paramInt2) }));
        return;
        if (this.hZF != paramInt1) {
          this.eWx.setProgress(hZI[(paramInt1 - 1)]);
        }
      }
      label145:
      f1 = f2;
    }
  }
  
  public final void aCB()
  {
    this.hZG = false;
    aCC();
    h.a(this, R.l.data_recovery_canceled, 0, false, this.hZH);
  }
  
  public final void aid()
  {
    this.hZG = false;
    aCC();
    h.a(this, R.l.data_recovery_failed, 0, false, this.hZH);
  }
  
  protected final int getLayoutId()
  {
    return R.i.db_recover_ui;
  }
  
  public void onBackPressed()
  {
    if (this.hZG)
    {
      this.hZE.callOnClick();
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.fdx = getIntent().getIntExtra("scene", 2);
    this.hZG = false;
    setMMTitle(R.l.data_recovery);
    this.hZB = findViewById(R.h.start_recover);
    this.hZC = findViewById(R.h.do_recover);
    this.eWx = ((ProgressBar)findViewById(R.h.progress_bar));
    this.hZD = ((TextView)findViewById(R.h.progress_text));
    paramBundle = findViewById(R.h.start_btn);
    paramBundle.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        h.a(DBRecoveryUI.this, R.l.data_recover_warning, 0, R.l.data_recovery_sure, R.l.data_recovery_cancel, false, new DBRecoveryUI.2.1(this), null, R.e.backup_green);
      }
    });
    this.hZE = findViewById(R.h.cancel_btn);
    this.hZE.setOnClickListener(new DBRecoveryUI.3(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if (DBRecoveryUI.g(DBRecoveryUI.this)) {
          DBRecoveryUI.d(DBRecoveryUI.this).callOnClick();
        }
        for (;;)
        {
          return true;
          DBRecoveryUI.this.finish();
        }
      }
    });
    if (this.fdx == 0) {
      paramBundle.callOnClick();
    }
    f.mDy.a(873L, 14L, 1L, false);
    if (this.fdx == 3)
    {
      f.mDy.a(873L, 15L, 1L, false);
      return;
    }
    f.mDy.a(181L, this.fdx + 51, 1L, true);
  }
  
  public final void onSuccess()
  {
    this.hZG = false;
    ah.i(new DBRecoveryUI.6(this, h.a(this, R.l.data_recovery_success, 0, false, new DBRecoveryUI.5(this))), 5000L);
  }
  
  public final void p(long paramLong1, long paramLong2)
  {
    this.hZG = false;
    aCC();
    h.a(this, getString(R.l.data_recovery_space_not_enough, new Object[] { Long.valueOf(paramLong2 / 1024L / 1024L), Long.valueOf(paramLong1 / 1024L / 1024L) }), null, false, this.hZH);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/dbbackup/DBRecoveryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */