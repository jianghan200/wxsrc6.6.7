package com.tencent.mm.plugin.backup.backupui;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.ui.widget.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@a(3)
public class BackupSelectExtUI
  extends MMPreference
{
  private int afv = 0;
  private f eOE;
  private long endTime = 0L;
  private int gRy;
  private long gTv = 0L;
  private int gVj = 0;
  private SimpleDateFormat gVk = new SimpleDateFormat("yyyy.MM.dd");
  private CheckPreference gYV;
  private CheckPreference gYW;
  private Preference gYX;
  private Preference gYY;
  private boolean gYZ = false;
  private long startTime = 0L;
  
  private void aL()
  {
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(R.o.backup_select_ext_preference);
    this.gYV = ((CheckPreference)this.eOE.ZZ("backup_select_ext_time"));
    this.gYY = this.eOE.ZZ("backup_select_begin_time");
    this.gYX = this.eOE.ZZ("backup_select_end_time");
    this.gYW = ((CheckPreference)this.eOE.ZZ("backup_select_ext_content"));
    if (!this.gYZ)
    {
      this.eOE.c(this.eOE.ZZ("backup_select_ext_content_title"));
      this.eOE.c(this.gYW);
    }
    if (this.gRy == 1)
    {
      this.eOE.ZZ("backup_select_ext_time_title").setTitle(R.l.backup_pc_select_ext_time_title);
      this.gYV.setTitle(R.l.backup_pc_select_ext_time);
      if (this.gYZ)
      {
        this.eOE.ZZ("backup_select_ext_content_title").setTitle(R.l.backup_pc_select_ext_content_title);
        this.gYW.setTitle(R.l.backup_pc_select_ext_content_text_only);
      }
    }
    label198:
    switch (this.gVj)
    {
    default: 
    case 0: 
      for (;;)
      {
        if (this.gYZ) {}
        switch (this.afv)
        {
        default: 
          label256:
          this.eOE.notifyDataSetChanged();
          return;
          if (this.gRy != 2) {
            break label198;
          }
          this.eOE.ZZ("backup_select_ext_time_title").setTitle(R.l.backup_move_select_ext_time_title);
          this.gYV.setTitle(R.l.backup_move_select_ext_time);
          if (!this.gYZ) {
            break label198;
          }
          this.eOE.ZZ("backup_select_ext_content_title").setTitle(R.l.backup_move_select_ext_content_title);
          this.gYW.setTitle(R.l.backup_move_select_ext_content_text_only);
          break label198;
          this.gYY.setEnabled(false);
          this.gYX.setEnabled(false);
          this.gYV.qpJ = false;
          this.eOE.c(this.gYY);
          this.eOE.c(this.gYX);
          enableOptionMenu(true);
        }
      }
    }
    if ((this.startTime == 0L) || (this.endTime == 0L))
    {
      this.gYY.setSummary(R.l.backup_select_time_choose_date);
      this.gYX.setSummary(R.l.backup_select_time_choose_date);
    }
    label569:
    for (;;)
    {
      for (boolean bool = false;; bool = true)
      {
        enableOptionMenu(bool);
        this.gYY.setEnabled(true);
        this.gYX.setEnabled(true);
        this.gYV.qpJ = true;
        break;
        this.gYY.setSummary(this.gVk.format(new Date(this.startTime)));
        this.gYX.setSummary(this.gVk.format(new Date(this.endTime - 86400000L)));
        if ((this.startTime == 0L) || (this.endTime == 0L)) {
          break label569;
        }
      }
      this.gYW.qpJ = false;
      break label256;
      this.gYW.qpJ = true;
      break label256;
    }
  }
  
  public final int Ys()
  {
    return R.o.backup_select_ext_preference;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("backup_select_ext_time")) {
      if (this.gVj == 0)
      {
        i = 1;
        this.gVj = i;
        switch (this.gVj)
        {
        }
      }
    }
    do
    {
      return true;
      i = 0;
      break;
      this.gYV.qpJ = false;
      paramf.c(this.gYY);
      paramf.c(this.gYX);
      enableOptionMenu(true);
      paramf.notifyDataSetChanged();
      return true;
      aL();
      return true;
      if (!paramPreference.mKey.equals("backup_select_ext_content")) {
        break label207;
      }
    } while (!this.gYZ);
    if (this.afv == 0) {}
    for (int i = 1;; i = 0)
    {
      this.afv = i;
      switch (this.afv)
      {
      default: 
        return true;
      case 0: 
        this.gYW.qpJ = false;
        paramf.notifyDataSetChanged();
        return true;
      }
    }
    this.gYW.qpJ = true;
    paramf.notifyDataSetChanged();
    return true;
    label207:
    if (paramPreference.mKey.equals("backup_select_begin_time"))
    {
      showDialog(1);
      return true;
    }
    if (paramPreference.mKey.equals("backup_select_end_time"))
    {
      showDialog(2);
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    this.gRy = getIntent().getIntExtra("BACKUP_MODE", 0);
    setMMTitle(R.l.backup_select_ext_more_choose);
    this.gVj = getIntent().getIntExtra("BACKUP_SELECT_TIME_MODE", 0);
    this.gYZ = getIntent().getBooleanExtra("BACKUP_SELECT_SUPPORT_CONTENT_TYPE", false);
    this.afv = getIntent().getIntExtra("BACKUP_SELECT_CONTENT_TYPE", 0);
    this.startTime = getIntent().getLongExtra("BACKUP_SELECT_TIME_START_TIME", 0L);
    this.endTime = getIntent().getLongExtra("BACKUP_SELECT_TIME_END_TIME", 0L);
    this.gTv = getIntent().getLongExtra("BACKUP_SELECT_TIME_MIN_CONVERSATION_TIME", 0L);
    aL();
    setBackBtn(new BackupSelectExtUI.2(this));
    a(0, getString(R.l.bak_chat_choose_finish), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if ((BackupSelectExtUI.g(BackupSelectExtUI.this) == 1) && (BackupSelectExtUI.d(BackupSelectExtUI.this) >= BackupSelectExtUI.e(BackupSelectExtUI.this)))
        {
          if (BackupSelectExtUI.h(BackupSelectExtUI.this) == 1) {
            h.b(BackupSelectExtUI.this.mController.tml, BackupSelectExtUI.this.getString(R.l.backup_pc_choose_time_finish_date_error), "", true);
          }
          while (BackupSelectExtUI.h(BackupSelectExtUI.this) != 2) {
            return true;
          }
          h.b(BackupSelectExtUI.this.mController.tml, BackupSelectExtUI.this.getString(R.l.backup_move_choose_time_finish_date_error), "", true);
          return true;
        }
        paramAnonymousMenuItem = new Intent();
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_MODE", BackupSelectExtUI.g(BackupSelectExtUI.this));
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_CONTENT_TYPE", BackupSelectExtUI.i(BackupSelectExtUI.this));
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_START_TIME", BackupSelectExtUI.d(BackupSelectExtUI.this));
        paramAnonymousMenuItem.putExtra("BACKUP_SELECT_TIME_END_TIME", BackupSelectExtUI.e(BackupSelectExtUI.this));
        BackupSelectExtUI.this.setResult(-1, paramAnonymousMenuItem);
        BackupSelectExtUI.this.finish();
        return true;
      }
    }, s.b.tmX);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    initView();
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    Object localObject = Calendar.getInstance();
    switch (paramInt)
    {
    default: 
      int i = ((Calendar)localObject).get(1);
      int j = ((Calendar)localObject).get(2);
      localObject = new d(this.mController.tml, new BackupSelectExtUI.1(this, paramInt), i, j, ((Calendar)localObject).get(5), ((Calendar)localObject).getTimeInMillis(), (byte)0);
      ((d)localObject).setCanceledOnTouchOutside(false);
      l = bi.VF() / 86400000L * 86400000L + 57600000L - 1L;
      if (l > this.gTv)
      {
        ((d)localObject).gP(l);
        ((d)localObject).gQ(this.gTv);
      }
      return (Dialog)localObject;
    case 1: 
      if (this.startTime == 0L) {}
      for (l = bi.VF();; l = this.startTime)
      {
        ((Calendar)localObject).setTimeInMillis(l);
        break;
      }
    }
    if (this.endTime == 0L) {}
    for (long l = bi.VF();; l = this.endTime - 86400000L)
    {
      ((Calendar)localObject).setTimeInMillis(l);
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/backupui/BackupSelectExtUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */