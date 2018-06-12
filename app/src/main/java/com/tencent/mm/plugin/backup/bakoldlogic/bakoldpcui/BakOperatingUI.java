package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui;

import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e.d;
import com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.f;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

public class BakOperatingUI
  extends MMWizardActivity
  implements e.d
{
  private int haC = -1;
  private boolean haG = false;
  private ProgressBar haH = null;
  private TextView haI = null;
  private TextView haJ = null;
  private TextView haK = null;
  private boolean haL = false;
  private int haM = 0;
  private boolean haN = false;
  private ag handler = new ag(Looper.getMainLooper());
  
  private void ati()
  {
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().pause();
    int i = R.l.bak_chat_recover_cancel;
    Object localObject = new BakOperatingUI.6(this);
    BakOperatingUI.7 local7 = new BakOperatingUI.7(this);
    localObject = h.a(this, i, 0, R.l.app_yes, R.l.app_no, (DialogInterface.OnClickListener)localObject, local7);
    ((c)localObject).setCanceledOnTouchOutside(false);
    ((c)localObject).setCancelable(false);
  }
  
  /* Error */
  public final void aqO()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 60	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:haN	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_0
    //   16: putfield 33	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:haG	Z
    //   19: ldc -117
    //   21: ldc -115
    //   23: iconst_1
    //   24: anewarray 143	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: getfield 31	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:haC	I
    //   33: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: aastore
    //   37: invokestatic 154	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield 54	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:handler	Lcom/tencent/mm/sdk/platformtools/ag;
    //   44: new 156	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$11
    //   47: dup
    //   48: aload_0
    //   49: invokespecial 157	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$11:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI;)V
    //   52: invokevirtual 161	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
    //   55: pop
    //   56: goto -45 -> 11
    //   59: astore_2
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_2
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	BakOperatingUI
    //   6	2	1	bool	boolean
    //   59	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	59	finally
    //   14	56	59	finally
  }
  
  public final void atb()
  {
    for (;;)
    {
      try
      {
        x.d("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", new Object[] { Integer.valueOf(this.haC) });
        boolean bool = this.haN;
        if (bool) {
          return;
        }
        if ((6 == this.haC) || (5 == com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZV))
        {
          this.haC = 6;
          this.haG = true;
          com.tencent.mm.plugin.backup.a.ezn.vo();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().arg();
          this.handler.post(new Runnable()
          {
            public final void run()
            {
              if (6 == BakOperatingUI.j(BakOperatingUI.this)) {
                BakOperatingUI.m(BakOperatingUI.this).post(new BakOperatingUI.10.1(this));
              }
              while (1 != BakOperatingUI.j(BakOperatingUI.this)) {
                return;
              }
              Intent localIntent = new Intent(BakOperatingUI.this, BakFinishUI.class);
              localIntent.putExtra("cmd", BakOperatingUI.j(BakOperatingUI.this));
              MMWizardActivity.D(BakOperatingUI.this, localIntent);
            }
          });
          continue;
        }
      }
      finally {}
      tmp117_114[0] = Integer.valueOf(this.haC);
      x.e("MicroMsg.BakOperatingUI", "onNetFinish now cmd:%d", tmp117_114);
    }
  }
  
  public final void atc()
  {
    this.handler.post(new BakOperatingUI.3(this));
  }
  
  protected final int getLayoutId()
  {
    return R.i.bak_topc_operate;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.bak_chat_to_pc_title);
    if (!this.haG)
    {
      if (6 != this.haC) {
        break label123;
      }
      addTextOptionMenu(0, getString(R.l.bak_chat_recover_background), new BakOperatingUI.1(this));
    }
    for (;;)
    {
      setBackBtn(new BakOperatingUI.5(this));
      this.haH = ((ProgressBar)findViewById(R.h.bak_chat_operate_progress_bar));
      this.haH.setProgress(this.haM);
      this.haJ = ((TextView)findViewById(R.h.bak_topc_operate_tip));
      this.haK = ((TextView)findViewById(R.h.bak_topc_operate_tip_sub));
      this.haI = ((TextView)findViewById(R.h.bak_chat_pc_back_tip));
      return;
      label123:
      if (1 == this.haC) {
        addTextOptionMenu(0, getString(R.l.bak_chat_back_background), new BakOperatingUI.4(this));
      } else {
        x.e("MicroMsg.BakOperatingUI", "BakOperatingUI operate type is invalid");
      }
    }
  }
  
  /* Error */
  public final void mT(final int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc -117
    //   4: ldc_w 262
    //   7: iconst_2
    //   8: anewarray 143	java/lang/Object
    //   11: dup
    //   12: iconst_0
    //   13: iload_1
    //   14: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   17: aastore
    //   18: dup
    //   19: iconst_1
    //   20: aload_0
    //   21: getfield 60	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:haN	Z
    //   24: invokestatic 267	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   27: aastore
    //   28: invokestatic 154	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: aload_0
    //   32: getfield 60	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:haN	Z
    //   35: istore_2
    //   36: iload_2
    //   37: ifeq +6 -> 43
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: aload_0
    //   44: getfield 54	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:handler	Lcom/tencent/mm/sdk/platformtools/ag;
    //   47: new 10	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$8
    //   50: dup
    //   51: aload_0
    //   52: iload_1
    //   53: invokespecial 270	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$8:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI;I)V
    //   56: invokevirtual 161	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
    //   59: pop
    //   60: goto -20 -> 40
    //   63: astore_3
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_3
    //   67: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	this	BakOperatingUI
    //   0	68	1	paramInt	int
    //   35	2	2	bool	boolean
    //   63	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	36	63	finally
    //   43	60	63	finally
  }
  
  /* Error */
  public final void mU(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 60	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:haN	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: ldc -117
    //   16: ldc_w 273
    //   19: iconst_1
    //   20: anewarray 143	java/lang/Object
    //   23: dup
    //   24: iconst_0
    //   25: iload_1
    //   26: invokestatic 149	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   29: aastore
    //   30: invokestatic 154	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: aload_0
    //   34: getfield 54	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI:handler	Lcom/tencent/mm/sdk/platformtools/ag;
    //   37: new 275	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$9
    //   40: dup
    //   41: aload_0
    //   42: iload_1
    //   43: invokespecial 276	com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI$9:<init>	(Lcom/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI;I)V
    //   46: invokevirtual 161	com/tencent/mm/sdk/platformtools/ag:post	(Ljava/lang/Runnable;)Z
    //   49: pop
    //   50: goto -39 -> 11
    //   53: astore_3
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_3
    //   57: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	58	0	this	BakOperatingUI
    //   0	58	1	paramInt	int
    //   6	2	2	bool	boolean
    //   53	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	53	finally
    //   14	50	53	finally
  }
  
  public void onCreate(Bundle paramBundle)
  {
    x.i("MicroMsg.BakOperatingUI", "onCreate");
    super.onCreate(paramBundle);
    if (getIntent().getExtras().getBoolean("WizardRootKillSelf", false)) {
      x.i("MicroMsg.BakOperatingUI", "onCreate WizardRootKillSelf cmd:%d", new Object[] { Integer.valueOf(this.haC) });
    }
    do
    {
      return;
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().a(this);
      com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().dD(true);
      this.haL = getIntent().getBooleanExtra("from_bak_banner", false);
      int i;
      if (this.haL)
      {
        i = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZV;
        if ((2 == i) || (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZU == 2))
        {
          this.haC = 1;
          this.haM = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().asY();
        }
      }
      for (;;)
      {
        if ((this.haC == 6) && (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZO.haf))
        {
          this.haG = true;
          com.tencent.mm.plugin.backup.a.ezn.vo();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().arg();
        }
        x.i("MicroMsg.BakOperatingUI", "before initView onCreate BakOperatingUI  nowCmd:%d fromBanner:%b status:%d opePercent:%d", new Object[] { Integer.valueOf(this.haC), Boolean.valueOf(this.haL), Integer.valueOf(com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZV), Integer.valueOf(this.haM) });
        initView();
        if (com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().gZU != 2) {
          break;
        }
        this.haJ.setText(getString(R.l.bak_chat_to_pc_prepareing_tip));
        this.haI.setText(getString(R.l.bak_chat_pc_prepare_progress_tip) + this.haM + "%");
        this.haK.setText(getString(R.l.bak_chat_to_pc_operating_tip));
        return;
        if (4 == i)
        {
          this.haC = 6;
          this.haM = com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().asY();
        }
        else if (5 == i)
        {
          this.haC = 6;
          this.haG = true;
          com.tencent.mm.plugin.backup.a.ezn.vo();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().arg();
          continue;
          this.haC = getIntent().getIntExtra("cmd", 6);
        }
      }
      if (6 == this.haC)
      {
        if (this.haG)
        {
          this.haJ.setText(getString(R.l.bak_chat_to_pc_merging_tip));
          this.haK.setText(getString(R.l.bak_chat_to_pc_merge_operating_tip));
          this.haI.setText(getString(R.l.bak_chat_pc_merge_progress_tip) + this.haM + "%");
          return;
        }
        this.haJ.setText(getString(R.l.bak_chat_to_pc_recovering_tip));
        this.haI.setText(getString(R.l.bak_chat_pc_restore_progress_tip) + this.haM + "%");
        this.haK.setText(getString(R.l.bak_chat_to_pc_operating_tip));
        return;
      }
    } while (1 != this.haC);
    this.haJ.setText(getString(R.l.bak_chat_to_pc_backing_tip));
    this.haI.setText(getString(R.l.bak_chat_pc_back_progress_tip) + this.haM + "%");
    this.haK.setText(getString(R.l.bak_chat_to_pc_operating_tip));
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().a(null);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().dD(false);
    x.i("MicroMsg.BakOperatingUI", "BakOperatingUI onDestroy nowCmd:%d", new Object[] { Integer.valueOf(this.haC) });
  }
  
  public final void onError(int paramInt)
  {
    this.handler.post(new BakOperatingUI.2(this, paramInt));
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if (paramInt == 4) {}
    for (;;)
    {
      try
      {
        if (this.haG)
        {
          ati();
          com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().pause();
          return bool;
        }
        x.d("MicroMsg.BakOperatingUI", "onKeyDown keyCode == KeyEvent.KEYCODE_BACK  finishWizard cmd:%d", new Object[] { Integer.valueOf(this.haC) });
        this.haN = true;
        com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().dD(false);
        DT(1);
        continue;
        bool = super.onKeyDown(paramInt, paramKeyEvent);
      }
      finally {}
    }
  }
  
  protected void onPause()
  {
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().dD(false);
    super.onPause();
    x.i("MicroMsg.BakOperatingUI", "onPause nowCmd:%d", new Object[] { Integer.valueOf(this.haC) });
  }
  
  protected void onResume()
  {
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().dD(true);
    com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.a.asN().asO().a(this);
    x.i("MicroMsg.BakOperatingUI", "onResume nowCmd:%d", new Object[] { Integer.valueOf(this.haC) });
    super.onResume();
  }
  
  public void onStart()
  {
    super.onStart();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcui/BakOperatingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */