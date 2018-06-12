package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bm;
import com.tencent.mm.model.bn;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class VoiceSearchResultUI
  extends MMActivity
{
  private int ecA = 2;
  private TextView hSp;
  private int iLq = -1;
  int showType = 1;
  private ListView uFC;
  private String uFE = null;
  private b uFP;
  private String[] uFQ;
  private boolean uFR = false;
  boolean uFS = false;
  
  private static String[] K(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return paramArrayOfString;
    }
    x.d("MicroMsg.VoiceSearchResultUI", "oldlist.length " + paramArrayOfString.length);
    HashMap localHashMap = new HashMap();
    ArrayList localArrayList = new ArrayList();
    int j = paramArrayOfString.length;
    int i = 0;
    while (i < j)
    {
      String str1 = paramArrayOfString[i];
      String str2 = r.gT(str1);
      x.d("MicroMsg.VoiceSearchResultUI", "displayname " + str2);
      if ((!localHashMap.containsValue(str2)) || (!s.fq(str1)))
      {
        x.d("MicroMsg.VoiceSearchResultUI", "username " + str1);
        localHashMap.put(str2, str1);
        localArrayList.add(str1);
      }
      i += 1;
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
  
  private void L(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramArrayOfString != null) && (this.uFP != null))
    {
      int j = paramArrayOfString.length;
      int i = 0;
      while (i < j)
      {
        String str = paramArrayOfString[i];
        if (this.uFP.abp(str)) {
          localArrayList.add(str);
        }
        i += 1;
      }
    }
    if (localArrayList.size() == 0)
    {
      this.hSp.setVisibility(0);
      if (this.uFE != null) {
        this.hSp.setText(this.uFE);
      }
    }
    for (;;)
    {
      if (this.uFP != null) {
        this.uFP.ed(localArrayList);
      }
      return;
      this.hSp.setText(getString(R.l.address_empty_voicesearch_tip));
      continue;
      this.hSp.setVisibility(8);
    }
  }
  
  static boolean abq(String paramString)
  {
    Cursor[] arrayOfCursor = new Cursor[2];
    arrayOfCursor[0] = au.HU().dAb.a(s.dAN, null, paramString);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    try
    {
      while (arrayOfCursor[0].moveToNext())
      {
        String str = arrayOfCursor[0].getString(arrayOfCursor[0].getColumnIndex("username"));
        localArrayList1.add(str);
        if (!str.endsWith("@chatroom")) {
          localArrayList2.add(str);
        }
        x.d("MicroMsg.VoiceSearchResultUI", "block user " + str);
      }
      int i;
      int j;
      return false;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.VoiceSearchResultUI", localException, "", new Object[0]);
      arrayOfCursor[1] = au.HU().dAc.a(paramString, "@micromsg.with.all.biz.qq.com", localArrayList1, localArrayList2);
      i = arrayOfCursor[1].getCount();
      j = arrayOfCursor[0].getCount();
      arrayOfCursor[0].close();
      arrayOfCursor[1].close();
      x.d("MicroMsg.VoiceSearchResultUI", "contactCount " + i + " conversationCount " + j);
      if (i + j <= 1) {
        return true;
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.voice_search_result;
  }
  
  protected final void initView()
  {
    this.uFC = ((ListView)findViewById(R.h.voice_search_resultlist));
    this.hSp = ((TextView)findViewById(R.h.empty_voicesearch_tip_tv));
    this.uFQ = getIntent().getStringArrayExtra("VoiceSearchResultUI_Resultlist");
    this.uFE = getIntent().getStringExtra("VoiceSearchResultUI_Error");
    this.iLq = getIntent().getIntExtra("VoiceSearchResultUI_VoiceId", -1);
    this.showType = getIntent().getIntExtra("VoiceSearchResultUI_ShowType", 1);
    int i;
    LinkedList localLinkedList;
    if (this.showType == 1)
    {
      i = 2;
      this.ecA = i;
      this.uFS = getIntent().getBooleanExtra("VoiceSearchResultUI_IsVoiceControl", false);
      x.i("MicroMsg.VoiceSearchResultUI", "showType = %s, isVoiceControl = %s", new Object[] { Integer.valueOf(this.showType), Boolean.valueOf(this.uFS) });
      this.uFP = new b(getApplicationContext(), this.showType);
      this.uFP.mA(false);
      localLinkedList = new LinkedList();
      switch (this.showType)
      {
      case 1: 
      default: 
        label208:
        if (this.uFP != null) {
          this.uFP.dQ(localLinkedList);
        }
        this.uFC.setAdapter(this.uFP);
        this.hSp.setVisibility(8);
        x.d("MicroMsg.VoiceSearchResultUI", "voiceId  " + this.iLq);
        if (this.showType == 2)
        {
          setMMTitle("");
          this.uFQ = K(this.uFQ);
        }
        break;
      }
    }
    for (;;)
    {
      setMMTitle(getString(R.l.voice_search_result));
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          StringBuilder localStringBuilder;
          if (!VoiceSearchResultUI.a(VoiceSearchResultUI.this))
          {
            paramAnonymousMenuItem = h.mEJ;
            localStringBuilder = new StringBuilder().append(VoiceSearchResultUI.b(VoiceSearchResultUI.this)).append(",").append(VoiceSearchResultUI.c(VoiceSearchResultUI.this)).append(",");
            if (VoiceSearchResultUI.d(VoiceSearchResultUI.this) != null) {
              break label112;
            }
          }
          label112:
          for (int i = 0;; i = VoiceSearchResultUI.d(VoiceSearchResultUI.this).length)
          {
            paramAnonymousMenuItem.k(10452, i + ",0");
            if (VoiceSearchResultUI.e(VoiceSearchResultUI.this)) {
              VoiceSearchResultUI.this.moveTaskToBack(true);
            }
            VoiceSearchResultUI.this.finish();
            return true;
          }
        }
      });
      this.uFC.setOnItemClickListener(new VoiceSearchResultUI.2(this));
      L(this.uFQ);
      return;
      i = 1;
      break;
      localLinkedList.add("lbsapp");
      localLinkedList.add("shakeapp");
      localLinkedList.add("qqfriend");
      localLinkedList.add("facebookapp");
      localLinkedList.add("feedsapp");
      localLinkedList.add("fmessage");
      localLinkedList.add("voipapp");
      localLinkedList.add("voicevoipapp");
      localLinkedList.add("voiceinputapp");
      localLinkedList.add("linkedinplugin");
      localLinkedList.add("notifymessage");
      i = q.GQ();
      if ((i & 0x1) != 0) {
        localLinkedList.add("qqmail");
      }
      if ((!s.Ht()) || ((i & 0x2) != 0)) {
        localLinkedList.add("tmessage");
      }
      if ((i & 0x20) != 0) {
        localLinkedList.add("qmessage");
      }
      if ((i & 0x80) != 0) {
        localLinkedList.add("qqsync");
      }
      if ((i & 0x10) != 0) {
        localLinkedList.add("medianote");
      }
      if ((0x80000 & i) != 0) {
        localLinkedList.add("newsapp");
      }
      if (((0x40000 & i) != 0) || (!s.Hs())) {
        localLinkedList.add("blogapp");
      }
      if ((0x10000 & i) != 0) {
        localLinkedList.add("masssendapp");
      }
      if ((i & 0x2000000) == 0) {
        break label208;
      }
      localLinkedList.add("voiceinputapp");
      break label208;
      setMMTitle(getString(R.l.voice_search_result));
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    this.uFR = false;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    this.uFP.aYc();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (4 == paramInt)
    {
      h localh;
      StringBuilder localStringBuilder;
      if (!this.uFR)
      {
        localh = h.mEJ;
        localStringBuilder = new StringBuilder().append(this.ecA).append(",").append(this.iLq).append(",");
        if (this.uFQ != null) {
          break label103;
        }
      }
      label103:
      for (int i = 0;; i = this.uFQ.length)
      {
        localh.k(10452, i + ",0");
        if (!this.uFS) {
          break;
        }
        moveTaskToBack(true);
        finish();
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    this.uFR = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/voicesearch/VoiceSearchResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */