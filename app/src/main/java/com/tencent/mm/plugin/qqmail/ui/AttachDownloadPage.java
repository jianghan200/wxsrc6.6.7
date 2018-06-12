package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.s;
import java.util.HashMap;
import java.util.Map;

public class AttachDownloadPage
  extends MMActivity
{
  private TextView eBR;
  private ProgressBar eVR;
  private int elC = 0;
  private long emm = 0L;
  private long gTK;
  private TextView guR;
  private Button jcf;
  private Button jch;
  private View jck;
  private String mcT;
  private String mcf;
  private long mea;
  private MMImageView mel;
  private ImageView mem;
  private ImageView men;
  private TextView meo;
  private String mep;
  private int meq;
  private boolean mer = false;
  private String mes;
  private boolean met = true;
  private int retryCount = 0;
  
  private void boC()
  {
    this.jck.setVisibility(0);
    this.jcf.setVisibility(8);
    this.jch.setVisibility(8);
    this.mem.setVisibility(0);
    this.men.setVisibility(8);
    this.meo.setVisibility(8);
    this.eBR.setVisibility(8);
    this.guR.setVisibility(8);
    this.mem.setOnClickListener(new AttachDownloadPage.3(this));
    this.men.setOnClickListener(new AttachDownloadPage.4(this));
  }
  
  private void boD()
  {
    if (this.meq == 1) {
      if (FileExplorerUI.TZ(this.mes)) {
        if (this.elC == 3)
        {
          localIntent = new Intent();
          localIntent.putExtra("key_favorite", true);
          localIntent.putExtra("key_favorite_source_type", 9);
          localIntent.putExtra("key_image_path", hf(false));
          com.tencent.mm.plugin.qqmail.a.a.ezn.d(this.mController.tml, localIntent);
          finish();
        }
      }
    }
    while (this.meq != 0)
    {
      Intent localIntent;
      return;
      if ((this.elC == 0) || (this.met))
      {
        this.retryCount = 0;
        this.met = false;
        boE();
        boC();
        return;
      }
      this.jck.setVisibility(8);
      this.eBR.setVisibility(0);
      this.meo.setVisibility(8);
      this.jcf.setVisibility(0);
      this.jch.setVisibility(8);
      this.guR.setVisibility(0);
      this.jcf.setOnClickListener(new AttachDownloadPage.5(this));
      if (this.elC == 3)
      {
        this.eBR.setText(R.l.mail_attach_preview_status);
        this.guR.setText(R.l.mail_attach_preview_open_downloaded);
        this.guR.setOnClickListener(new AttachDownloadPage.6(this));
        enableOptionMenu(true);
        return;
      }
      this.eBR.setText(R.l.mail_attach_preview_status);
      if (this.elC == 2) {
        this.guR.setText(R.l.mail_attach_preview_open_redownload);
      }
      for (;;)
      {
        this.guR.setOnClickListener(new AttachDownloadPage.7(this));
        return;
        this.guR.setText(R.l.mail_attach_preview_open_notdownload);
      }
    }
    this.jck.setVisibility(8);
    this.jcf.setVisibility(8);
    this.jch.setVisibility(0);
    this.meo.setVisibility(8);
    this.eBR.setVisibility(0);
    this.guR.setVisibility(8);
    if (this.elC == 3)
    {
      this.jch.setText(R.l.mail_attach_downloaded);
      enableOptionMenu(true);
    }
    for (;;)
    {
      this.eBR.setText(R.l.mail_attach_download_status);
      this.jch.setOnClickListener(new AttachDownloadPage.8(this));
      return;
      if (this.elC == 2) {
        this.jch.setText(R.l.mail_attach_redownload);
      } else {
        this.jch.setText(R.l.mail_attach_download);
      }
    }
  }
  
  private void boE()
  {
    boH();
    if (this.elC == 4) {
      if (this.retryCount < 5)
      {
        this.retryCount += 1;
        boE();
      }
    }
    for (;;)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("mailid", this.mcf);
      localHashMap.put("attachid", this.mcT);
      localHashMap.put("username", "");
      localHashMap.put("offset", this.emm);
      localHashMap.put("datalen", this.gTK);
      localHashMap.put("default_attach_name", boF() + ".temp");
      p.c localc = new p.c();
      localc.mdl = false;
      localc.mdm = false;
      this.mea = w.bow().a("/cgi-bin/mmdownload", localHashMap, localc, new AttachDownloadPage.9(this));
      return;
      boD();
      continue;
      if (this.elC == 3)
      {
        e.i(this.mep, boF() + ".temp", boF());
        this.elC = 3;
        boD();
      }
    }
  }
  
  private String boF()
  {
    int i = this.mcT.hashCode();
    int j = this.mes.lastIndexOf(".");
    String str1 = "";
    String str2;
    if (j != -1)
    {
      str2 = this.mes.substring(0, j);
      str1 = this.mes.substring(j, this.mes.length());
    }
    for (;;)
    {
      return String.format("%s_%d%s", new Object[] { str2, Integer.valueOf(i & 0xFFFF), str1 });
      str2 = this.mes;
    }
  }
  
  private String boG()
  {
    return this.mep + this.mes;
  }
  
  private void boH()
  {
    if (e.cn(hf(true)))
    {
      this.emm = e.cm(hf(true));
      this.elC = 2;
      return;
    }
    if (e.cn(hf(false)))
    {
      this.elC = 3;
      return;
    }
    if (e.cn(boG()))
    {
      if (e.cm(boG()) == this.gTK)
      {
        e.i(this.mep, this.mes, boF());
        this.elC = 3;
        return;
      }
      if (e.cm(boG()) > this.gTK)
      {
        e.deleteFile(boG());
        this.emm = 0L;
        this.elC = 4;
        return;
      }
      this.emm = 0L;
      this.elC = 0;
      return;
    }
    this.emm = 0L;
    this.elC = 0;
  }
  
  private String hf(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder().append(this.mep).append(boF());
    if (!paramBoolean) {}
    for (String str = "";; str = ".temp") {
      return str;
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.attach_download_page;
  }
  
  protected final void initView()
  {
    this.mel = ((MMImageView)findViewById(R.h.download_type_icon));
    this.jck = findViewById(R.h.download_progress_area);
    this.eVR = ((ProgressBar)findViewById(R.h.download_pb));
    this.mem = ((ImageView)findViewById(R.h.download_stop_btn));
    this.men = ((ImageView)findViewById(R.h.download_restart_btn));
    this.meo = ((TextView)findViewById(R.h.attach_download_speed_tv));
    this.jcf = ((Button)findViewById(R.h.attach_preview_btn));
    this.jch = ((Button)findViewById(R.h.attach_download_btn));
    this.eBR = ((TextView)findViewById(R.h.attach_download_status_tv));
    this.guR = ((TextView)findViewById(R.h.attach_try_open_tv));
    if (FileExplorerUI.TZ(this.mes)) {
      this.mel.setBackgroundResource(R.k.download_image_icon);
    }
    for (;;)
    {
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          AttachDownloadPage.this.finish();
          return true;
        }
      });
      addIconOptionMenu(0, R.k.ofm_send_icon, new AttachDownloadPage.2(this));
      enableOptionMenu(false);
      boH();
      if (this.elC != 1) {
        break;
      }
      boC();
      return;
      if (FileExplorerUI.Ua(this.mes))
      {
        this.mel.setImageResource(R.k.app_attach_file_icon_video);
      }
      else
      {
        int i = o.SQ(e.cp(this.mes));
        if (i > 0) {
          this.mel.setImageResource(i);
        } else {
          this.mel.setImageResource(R.k.app_attach_file_icon_unknow);
        }
      }
    }
    boD();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.download_no_match_msg, R.l.download_no_match_title, 3);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.meq = getIntent().getIntExtra("is_preview", 0);
    this.mer = getIntent().getBooleanExtra("is_compress", false);
    this.mes = getIntent().getStringExtra("attach_name");
    this.mcf = getIntent().getStringExtra("mail_id");
    this.mcT = getIntent().getStringExtra("attach_id");
    this.gTK = getIntent().getLongExtra("total_size", 0L);
    w.bow();
    this.mep = p.getDownloadPath();
    setMMTitle(this.mes);
    initView();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    w.bow().cancel(this.mea);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/AttachDownloadPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */