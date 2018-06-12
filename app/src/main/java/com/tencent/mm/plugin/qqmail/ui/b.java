package com.tencent.mm.plugin.qqmail.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.bp.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.qqmail.b.h.d;
import com.tencent.mm.plugin.qqmail.b.p;
import com.tencent.mm.plugin.qqmail.b.p.c;
import com.tencent.mm.plugin.qqmail.b.w;
import com.tencent.mm.plugin.qqmail.b.y;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
  implements e
{
  private TextView meJ;
  private ImageView meK;
  ComposeUI mgk;
  ViewGroup mgl;
  Map<String, y> mgm = new HashMap();
  Map<String, com.tencent.mm.plugin.qqmail.b.o> mgn = new HashMap();
  Map<String, String> mgo = new LinkedHashMap();
  Map<String, String> mgp = new LinkedHashMap();
  b mgq = null;
  private View.OnClickListener mgr = null;
  int mode = 5;
  
  private b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup)
  {
    this.mgk = paramComposeUI;
    this.mgl = paramViewGroup;
    this.mgr = null;
    this.meJ = paramTextView;
    this.meK = paramImageView;
    boV();
    au.DF().a(484, this);
  }
  
  public b(ComposeUI paramComposeUI, TextView paramTextView, ImageView paramImageView, ViewGroup paramViewGroup, byte paramByte)
  {
    this(paramComposeUI, paramTextView, paramImageView, paramViewGroup);
  }
  
  private void a(final y paramy)
  {
    LinearLayout localLinearLayout = (LinearLayout)((ViewGroup)View.inflate(this.mgk, R.i.qqmail_comm_widget, null)).findViewById(R.h.plugin_qqmail_compose_attach_item_ll);
    ImageView localImageView1 = (ImageView)localLinearLayout.findViewById(R.h.plugin_qqmail_compose_attach_item_icon_iv);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(R.h.plugin_qqmail_compose_attach_item_name_tv);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(R.h.plugin_qqmail_compose_attach_item_size_tv);
    ProgressBar localProgressBar = (ProgressBar)localLinearLayout.findViewById(R.h.plugin_qqmail_compose_attach_item_uploading_pb);
    TextView localTextView3 = (TextView)localLinearLayout.findViewById(R.h.plugin_qqmail_compose_attach_upload_failed_tv);
    final ImageView localImageView2 = (ImageView)localLinearLayout.findViewById(R.h.plugin_qqmail_compose_attach_item_reupload_iv);
    ImageView localImageView3 = (ImageView)localLinearLayout.findViewById(R.h.plugin_qqmail_compose_attach_item_delete_iv);
    ((ViewGroup)localLinearLayout.getParent()).removeView(localLinearLayout);
    localImageView1.setImageResource(FileExplorerUI.TY(paramy.name));
    localTextView1.setText(paramy.name);
    localTextView2.setText(bi.bF(paramy.size));
    a locala = new a((byte)0);
    locala.gmn = localImageView1;
    locala.eMe = localTextView1;
    locala.mfT = localTextView2;
    locala.mgA = localProgressBar;
    locala.mgB = localTextView3;
    locala.mgC = localImageView2;
    locala.mgD = localImageView3;
    localLinearLayout.setTag(locala);
    localLinearLayout.setId(Math.abs(paramy.path.hashCode() / 2));
    if (this.mgr != null) {
      localLinearLayout.setOnClickListener(this.mgr);
    }
    this.mgl.addView(localLinearLayout);
    boV();
    localLinearLayout.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (localImageView2.getVisibility() == 0) {
          localImageView2.performClick();
        }
      }
    });
    localImageView2.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (b.this.mode == 5)
        {
          l = b.this.Kb(paramy.path);
          paramy.mea = l;
        }
        while (b.this.mode != 6) {
          return;
        }
        long l = b.this.eh(paramy.path, paramy.name);
        paramy.mea = l;
      }
    });
    localImageView3.setOnClickListener(new b.3(this, paramy, localLinearLayout));
    this.mgl.post(new b.4(this, paramy));
    if (paramy.state == 0)
    {
      if (this.mode != 5) {
        break label346;
      }
      paramy.mea = Kb(paramy.path);
    }
    label346:
    while (this.mode != 6) {
      return;
    }
    paramy.mea = eh(paramy.path, paramy.name);
  }
  
  final long Kb(String paramString)
  {
    p.c localc = new p.c();
    localc.mdl = false;
    localc.mdk = true;
    p localp = w.bow();
    b.5 local5 = new b.5(this, paramString);
    return localp.a("/cgi-bin/uploaddata", 1, null, new h.d("UploadFile", paramString), localc, local5);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() == 484)
    {
      paramString = (com.tencent.mm.plugin.qqmail.b.o)paraml;
      paraml = paramString.filePath;
      y localy = (y)this.mgm.get(paraml);
      if ((localy != null) && ((paramInt1 != 0) || (paramInt2 != 0)))
      {
        x.e("MicroMsg.FileUploadHelper", "upload error, errType: %d, errCode: %d, file: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paraml });
        localy.state = 3;
        this.mgn.remove(paraml);
        au.DF().c(paramString);
        ah.A(new b.7(this, localy));
      }
    }
  }
  
  final void b(y paramy)
  {
    int i = Math.abs(paramy.path.hashCode() / 2);
    Object localObject = (LinearLayout)this.mgl.findViewById(i);
    if (localObject == null) {
      return;
    }
    localObject = (a)((LinearLayout)localObject).getTag();
    switch (paramy.state)
    {
    default: 
      return;
    case 0: 
    case 1: 
      ((a)localObject).eMe.setTextColor(-16777216);
      ((a)localObject).mgA.setVisibility(0);
      ((a)localObject).mgB.setVisibility(8);
      ((a)localObject).mgC.setVisibility(8);
      ((a)localObject).mgD.setVisibility(0);
      return;
    case 2: 
      ((a)localObject).eMe.setTextColor(-16777216);
      ((a)localObject).mgA.setVisibility(8);
      ((a)localObject).mgB.setVisibility(8);
      ((a)localObject).mgC.setVisibility(8);
      ((a)localObject).mgD.setVisibility(0);
      return;
    }
    ((a)localObject).eMe.setTextColor(a.g(this.mgk, R.e.lightgrey));
    ((a)localObject).mgA.setVisibility(8);
    ((a)localObject).mgB.setVisibility(0);
    ((a)localObject).mgC.setVisibility(0);
    ((a)localObject).mgD.setVisibility(0);
  }
  
  public final void bN(List<y> paramList)
  {
    if (paramList == null) {}
    for (;;)
    {
      return;
      Object localObject = paramList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        y localy = (y)((Iterator)localObject).next();
        a(localy);
        this.mgm.put(localy.path, localy);
      }
      if (this.mode == 6)
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          localObject = (y)paramList.next();
          this.mgo.put(((y)localObject).path, ((y)localObject).meb);
          this.mgp.put(((y)localObject).path, ((y)localObject).name);
        }
      }
    }
  }
  
  public final String boR()
  {
    String str1 = "";
    Iterator localIterator = this.mgm.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str3 = (String)localIterator.next();
      String str2 = str1;
      if (str1.length() > 0) {
        str2 = str1 + "|";
      }
      str1 = str2 + ((y)this.mgm.get(str3)).meb;
    }
    return str1;
  }
  
  public final LinkedList<y> boS()
  {
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.mgm.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedList.add(this.mgm.get(str));
    }
    return localLinkedList;
  }
  
  public final void boT()
  {
    Iterator localIterator;
    Object localObject;
    if (this.mode == 5)
    {
      localIterator = this.mgm.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localObject = (y)this.mgm.get(localObject);
        if (((y)localObject).state != 2)
        {
          w.bow().cancel(((y)localObject).mea);
          ((y)localObject).state = 3;
          b((y)localObject);
        }
      }
    }
    if (this.mode == 6)
    {
      localIterator = this.mgm.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        localObject = (y)this.mgm.get(localObject);
        if (((y)localObject).state != 2)
        {
          com.tencent.mm.plugin.qqmail.b.o localo = (com.tencent.mm.plugin.qqmail.b.o)this.mgn.get(((y)localObject).path);
          if (localo != null)
          {
            au.DF().c(localo);
            ((y)localObject).state = 3;
            b((y)localObject);
          }
          this.mgo.remove(((y)localObject).path);
          this.mgp.remove(((y)localObject).path);
          this.mgn.remove(((y)localObject).path);
        }
      }
    }
  }
  
  public final boolean boU()
  {
    Iterator localIterator = this.mgm.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      localObject = (y)this.mgm.get(localObject);
      if ((((y)localObject).state != 2) && (((y)localObject).state != 3)) {
        return false;
      }
    }
    return true;
  }
  
  public final void boV()
  {
    int j;
    int i;
    if (this.mgm.size() == 0)
    {
      this.meJ.setText(this.mgk.getString(R.l.plugin_qqmail_composeui_attach) + " " + this.mgk.getString(R.l.plugin_qqmail_composeui_attach_hint));
      this.meK.setImageResource(R.k.qqmail_attach_icon_normal);
      ((View)this.mgl.getParent()).setVisibility(8);
      j = this.mgl.getChildCount();
      i = 0;
      label96:
      if (i >= j) {
        return;
      }
      if (j != 1) {
        break label239;
      }
      this.mgl.getChildAt(i).setBackgroundResource(R.g.mail_attach_list_item);
    }
    for (;;)
    {
      i += 1;
      break label96;
      this.meJ.setText(this.mgk.getString(R.l.plugin_qqmail_composeui_attach) + this.mgk.getResources().getQuantityString(R.j.plugin_qqmail_composeui_attach_summary, this.mgm.size(), new Object[] { Integer.valueOf(this.mgm.size()), bi.bF(boW()) }));
      this.meK.setImageResource(R.k.qqmail_attach_icon_pressed);
      ((View)this.mgl.getParent()).setVisibility(0);
      break;
      label239:
      if (i == 0) {
        this.mgl.getChildAt(i).setBackgroundResource(R.g.mail_attach_list_item1);
      } else if ((i > 0) && (i < j - 1)) {
        this.mgl.getChildAt(i).setBackgroundResource(R.g.mail_attach_list_item2);
      } else {
        this.mgl.getChildAt(i).setBackgroundResource(R.g.mail_attach_list_item3);
      }
    }
  }
  
  public final int boW()
  {
    Iterator localIterator = this.mgm.keySet().iterator();
    String str;
    long l;
    for (int i = 0; localIterator.hasNext(); i = (int)(((y)this.mgm.get(str)).size + l))
    {
      str = (String)localIterator.next();
      l = i;
    }
    return i;
  }
  
  public final void eg(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (this.mgm.containsKey(paramString1))) {}
    File localFile;
    do
    {
      return;
      localFile = new File(paramString1);
    } while ((!localFile.exists()) || (!localFile.isFile()));
    y localy = new y();
    localy.path = paramString1;
    if (paramString2 == null) {}
    for (localy.name = localFile.getName();; localy.name = paramString2)
    {
      localy.size = localFile.length();
      localy.state = 0;
      this.mgm.put(paramString1, localy);
      a(localy);
      return;
    }
  }
  
  final long eh(String paramString1, String paramString2)
  {
    if (this.mgn.containsKey(paramString1)) {
      return ((com.tencent.mm.plugin.qqmail.b.o)this.mgn.get(paramString1)).hashCode();
    }
    paramString2 = new com.tencent.mm.plugin.qqmail.b.o(paramString1, paramString1, new b.6(this, paramString1, paramString2));
    y localy = (y)this.mgm.get(paramString1);
    if (localy != null) {
      localy.state = 1;
    }
    b(localy);
    au.DF().a(paramString2, 0);
    this.mgn.put(paramString1, paramString2);
    return paramString2.hashCode();
  }
  
  private final class a
  {
    TextView eMe;
    ImageView gmn;
    TextView mfT;
    ProgressBar mgA;
    TextView mgB;
    ImageView mgC;
    ImageView mgD;
    
    private a() {}
  }
  
  public static abstract interface b
  {
    public abstract void boM();
    
    public abstract void onComplete();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */