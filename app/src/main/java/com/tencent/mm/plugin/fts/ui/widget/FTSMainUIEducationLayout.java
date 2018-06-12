package com.tencent.mm.plugin.fts.ui.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.bp.a;
import com.tencent.mm.plugin.fts.ui.m;
import com.tencent.mm.plugin.fts.ui.n.b;
import com.tencent.mm.plugin.fts.ui.n.d;
import com.tencent.mm.plugin.fts.ui.n.e;
import com.tencent.mm.plugin.fts.ui.n.g;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class FTSMainUIEducationLayout
  extends LinearLayout
{
  public float fto;
  public float ftp;
  public float gcx = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  public View.OnClickListener jxn;
  public List<LinearLayout> jzM;
  public Map<Integer, TextView> jzN = new HashMap();
  private String jzO = "";
  public long jzP;
  private boolean jzQ = true;
  public TextView jzR;
  protected boolean jzS = true;
  private boolean jzT;
  public View.OnClickListener jzU;
  private View.OnClickListener jzV;
  
  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initView();
  }
  
  public FTSMainUIEducationLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initView();
  }
  
  private void aQZ()
  {
    Iterator localIterator = this.jzM.iterator();
    while (localIterator.hasNext()) {
      removeView((LinearLayout)localIterator.next());
    }
    this.jzM.clear();
    this.jzN.clear();
    this.jzO = "";
  }
  
  private void aRa()
  {
    a(getContext().getString(n.g.search_education_timeline), null, getContext().getString(n.g.search_education_article), null, getContext().getString(n.g.search_education_biz_contact), null, a.ad(getContext(), n.b.NormalTextSize));
    aRb();
  }
  
  private void bA(Object paramObject)
  {
    String str;
    if ((paramObject != null) && ((paramObject instanceof JSONObject)))
    {
      str = ((JSONObject)paramObject).optString("businessType");
      if (!bi.oW(str)) {
        if (this.jzO != null) {
          break label105;
        }
      }
    }
    label105:
    for (paramObject = "";; paramObject = this.jzO)
    {
      this.jzO = ((String)paramObject);
      if (this.jzO.length() > 0) {
        this.jzO += "|";
      }
      this.jzO += str;
      return;
    }
  }
  
  private void initView()
  {
    setOrientation(1);
    this.jzM = new ArrayList();
  }
  
  public final void J(JSONObject paramJSONObject)
  {
    aQZ();
    try
    {
      if (!K(paramJSONObject)) {
        aRa();
      }
      return;
    }
    catch (Exception paramJSONObject)
    {
      aRa();
    }
  }
  
  public boolean K(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {}
    JSONArray localJSONArray;
    do
    {
      return false;
      paramJSONObject.optString("title");
      localJSONArray = paramJSONObject.optJSONArray("items");
    } while (localJSONArray == null);
    int i;
    int j;
    Object localObject2;
    Object localObject1;
    String str;
    label64:
    JSONObject localJSONObject;
    if (w.fD(ad.getContext()).equalsIgnoreCase("en"))
    {
      i = a.ad(getContext(), n.b.BigerMoreTextSize);
      j = 0;
      localObject2 = null;
      localObject1 = null;
      str = null;
      paramJSONObject = null;
      if (j >= Math.min(localJSONArray.length(), 9)) {
        break label183;
      }
      localJSONObject = localJSONArray.optJSONObject(j);
      if (j % 3 != 0) {
        break label125;
      }
      paramJSONObject = localJSONObject.optString("hotword");
      localObject1 = localJSONObject;
    }
    for (;;)
    {
      j += 1;
      break label64;
      i = a.ad(getContext(), n.b.NormalTextSize);
      break;
      label125:
      if (j % 3 == 1)
      {
        str = localJSONObject.optString("hotword");
        localObject2 = localJSONObject;
      }
      else
      {
        a(paramJSONObject, localObject1, str, localObject2, localJSONObject.optString("hotword"), localJSONObject, i);
        localObject2 = null;
        localObject1 = null;
        str = null;
        paramJSONObject = null;
      }
    }
    label183:
    if ((paramJSONObject != null) && (localObject1 != null)) {
      a(paramJSONObject, localObject1, str, localObject2, null, null, i);
    }
    return true;
  }
  
  public final void a(String paramString1, Object paramObject1, String paramString2, Object paramObject2, String paramString3, Object paramObject3, int paramInt)
  {
    x.i("MicroMsg.FTS.FTSMainUIEducationLayout", "addCellLayout %s %s %s", new Object[] { paramString1, paramString2, paramString3 });
    if (!bi.oW(paramString1))
    {
      LinearLayout localLinearLayout = (LinearLayout)inflate(getContext(), n.e.fts_main_ui_education_cell_layout, null);
      TextView localTextView = (TextView)localLinearLayout.findViewById(n.d.textview_1);
      localTextView.setText(paramString1);
      localTextView.setTag(paramObject1);
      localTextView.setVisibility(0);
      localTextView.setOnClickListener(this.jxn);
      localTextView.setClickable(this.jzQ);
      this.jzN.put(Integer.valueOf(m.a((JSONObject)paramObject1, paramString1, getContext())), localTextView);
      bA(paramObject1);
      if (!bi.oW(paramString2))
      {
        paramString1 = (TextView)localLinearLayout.findViewById(n.d.textview_2);
        paramString1.setText(paramString2);
        paramString1.setTag(paramObject2);
        paramString1.setVisibility(0);
        paramString1.setOnClickListener(this.jxn);
        paramString1.setClickable(this.jzQ);
        paramObject1 = localLinearLayout.findViewById(n.d.divider_1);
        ((View)paramObject1).getLayoutParams().height = paramInt;
        ((View)paramObject1).setVisibility(0);
        this.jzN.put(Integer.valueOf(m.a((JSONObject)paramObject2, paramString2, getContext())), paramString1);
        bA(paramObject2);
        if (!bi.oW(paramString3))
        {
          paramString1 = (TextView)localLinearLayout.findViewById(n.d.textview_3);
          paramString1.setText(paramString3);
          paramString1.setTag(paramObject3);
          paramString1.setVisibility(0);
          paramString1.setOnClickListener(this.jxn);
          paramString1.setClickable(this.jzQ);
          paramObject1 = localLinearLayout.findViewById(n.d.divider_2);
          ((View)paramObject1).getLayoutParams().height = paramInt;
          ((View)paramObject1).setVisibility(0);
          this.jzN.put(Integer.valueOf(m.a((JSONObject)paramObject3, paramString3, getContext())), paramString1);
          bA(paramObject3);
        }
      }
      this.jzM.add(localLinearLayout);
      addView(localLinearLayout);
    }
  }
  
  /* Error */
  public final void aL()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 182	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:aQZ	()V
    //   4: aload_0
    //   5: ldc_w 331
    //   8: invokestatic 337	com/tencent/mm/plugin/websearch/api/r:PX	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   11: invokevirtual 186	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:K	(Lorg/json/JSONObject;)Z
    //   14: ifne +7 -> 21
    //   17: aload_0
    //   18: invokespecial 188	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:aRa	()V
    //   21: aload_0
    //   22: getfield 63	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzS	Z
    //   25: ifeq +89 -> 114
    //   28: ldc_w 339
    //   31: invokestatic 337	com/tencent/mm/plugin/websearch/api/r:PX	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   34: ldc -64
    //   36: invokevirtual 196	org/json/JSONObject:optJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   39: iconst_0
    //   40: invokevirtual 226	org/json/JSONArray:optJSONObject	(I)Lorg/json/JSONObject;
    //   43: ldc -28
    //   45: invokevirtual 146	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   48: astore_2
    //   49: aload_2
    //   50: invokestatic 152	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   53: ifne +61 -> 114
    //   56: aload_0
    //   57: invokevirtual 47	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   60: getstatic 342	com/tencent/mm/plugin/fts/ui/n$e:fts_main_ui_education_hotword_layout	I
    //   63: aconst_null
    //   64: invokestatic 249	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   67: checkcast 4	android/widget/LinearLayout
    //   70: astore_3
    //   71: aload_3
    //   72: getstatic 345	com/tencent/mm/plugin/fts/ui/n$d:hotword_tv	I
    //   75: invokevirtual 258	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   78: checkcast 260	android/widget/TextView
    //   81: aload_2
    //   82: invokevirtual 264	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   85: aload_3
    //   86: aload_0
    //   87: getfield 347	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzU	Landroid/view/View$OnClickListener;
    //   90: invokevirtual 348	android/widget/LinearLayout:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   93: aload_3
    //   94: aload_2
    //   95: invokevirtual 349	android/widget/LinearLayout:setTag	(Ljava/lang/Object;)V
    //   98: aload_0
    //   99: aload_3
    //   100: invokevirtual 328	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   103: aload_0
    //   104: getfield 73	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzM	Ljava/util/List;
    //   107: aload_3
    //   108: invokeinterface 325 2 0
    //   113: pop
    //   114: aload_0
    //   115: getfield 351	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzT	Z
    //   118: ifeq +443 -> 561
    //   121: ldc_w 353
    //   124: invokestatic 359	com/tencent/mm/kernel/g:l	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   127: checkcast 353	com/tencent/mm/plugin/appbrand/n/g
    //   130: invokeinterface 363 1 0
    //   135: astore_3
    //   136: aload_3
    //   137: getfield 368	com/tencent/mm/plugin/appbrand/n/g$b:dEw	Ljava/util/List;
    //   140: ifnull +421 -> 561
    //   143: aload_3
    //   144: getfield 368	com/tencent/mm/plugin/appbrand/n/g$b:dEw	Ljava/util/List;
    //   147: invokeinterface 371 1 0
    //   152: ifle +409 -> 561
    //   155: aload_0
    //   156: invokevirtual 47	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:getContext	()Landroid/content/Context;
    //   159: getstatic 374	com/tencent/mm/plugin/fts/ui/n$e:fts_main_ui_education_wxapp_layout	I
    //   162: aconst_null
    //   163: invokestatic 249	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   166: checkcast 4	android/widget/LinearLayout
    //   169: astore_2
    //   170: aload_2
    //   171: getstatic 377	com/tencent/mm/plugin/fts/ui/n$d:title_tv	I
    //   174: invokevirtual 258	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   177: checkcast 260	android/widget/TextView
    //   180: aload_3
    //   181: getfield 380	com/tencent/mm/plugin/appbrand/n/g$b:bSc	Ljava/lang/String;
    //   184: invokevirtual 264	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   187: iconst_4
    //   188: anewarray 382	android/widget/ImageView
    //   191: astore 4
    //   193: aload 4
    //   195: iconst_0
    //   196: aload_2
    //   197: getstatic 385	com/tencent/mm/plugin/fts/ui/n$d:app1_iv	I
    //   200: invokevirtual 258	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   203: checkcast 382	android/widget/ImageView
    //   206: aastore
    //   207: aload 4
    //   209: iconst_1
    //   210: aload_2
    //   211: getstatic 388	com/tencent/mm/plugin/fts/ui/n$d:app2_iv	I
    //   214: invokevirtual 258	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   217: checkcast 382	android/widget/ImageView
    //   220: aastore
    //   221: aload 4
    //   223: iconst_2
    //   224: aload_2
    //   225: getstatic 391	com/tencent/mm/plugin/fts/ui/n$d:app3_iv	I
    //   228: invokevirtual 258	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   231: checkcast 382	android/widget/ImageView
    //   234: aastore
    //   235: aload 4
    //   237: iconst_3
    //   238: aload_2
    //   239: getstatic 394	com/tencent/mm/plugin/fts/ui/n$d:app4_iv	I
    //   242: invokevirtual 258	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   245: checkcast 382	android/widget/ImageView
    //   248: aastore
    //   249: aload_2
    //   250: getstatic 397	com/tencent/mm/plugin/fts/ui/n$d:more_iv	I
    //   253: invokevirtual 258	android/widget/LinearLayout:findViewById	(I)Landroid/view/View;
    //   256: checkcast 382	android/widget/ImageView
    //   259: astore 5
    //   261: iconst_0
    //   262: istore_1
    //   263: iload_1
    //   264: aload_3
    //   265: getfield 368	com/tencent/mm/plugin/appbrand/n/g$b:dEw	Ljava/util/List;
    //   268: invokeinterface 371 1 0
    //   273: if_icmpge +116 -> 389
    //   276: iload_1
    //   277: iconst_4
    //   278: if_icmpge +111 -> 389
    //   281: aload_3
    //   282: getfield 368	com/tencent/mm/plugin/appbrand/n/g$b:dEw	Ljava/util/List;
    //   285: iload_1
    //   286: invokeinterface 400 2 0
    //   291: checkcast 402	com/tencent/mm/plugin/appbrand/n/g$c
    //   294: astore 6
    //   296: new 404	com/tencent/mm/ak/a/a/c$a
    //   299: dup
    //   300: invokespecial 405	com/tencent/mm/ak/a/a/c$a:<init>	()V
    //   303: astore 7
    //   305: aload 7
    //   307: getstatic 410	com/tencent/mm/plugin/fts/ui/n$f:default_avatar	I
    //   310: putfield 413	com/tencent/mm/ak/a/a/c$a:dXN	I
    //   313: aload 7
    //   315: iconst_1
    //   316: putfield 416	com/tencent/mm/ak/a/a/c$a:dXW	Z
    //   319: invokestatic 422	com/tencent/mm/ak/o:Pj	()Lcom/tencent/mm/ak/a/a;
    //   322: aload 6
    //   324: getfield 425	com/tencent/mm/plugin/appbrand/n/g$c:fmD	Ljava/lang/String;
    //   327: aload 4
    //   329: iload_1
    //   330: aaload
    //   331: aload 7
    //   333: invokevirtual 429	com/tencent/mm/ak/a/a/c$a:Pt	()Lcom/tencent/mm/ak/a/a/c;
    //   336: invokevirtual 434	com/tencent/mm/ak/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/ak/a/a/c;)V
    //   339: aload 4
    //   341: iload_1
    //   342: aaload
    //   343: iconst_0
    //   344: invokevirtual 435	android/widget/ImageView:setVisibility	(I)V
    //   347: aload 4
    //   349: iload_1
    //   350: aaload
    //   351: aload 6
    //   353: invokevirtual 436	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   356: aload_0
    //   357: getfield 438	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzV	Landroid/view/View$OnClickListener;
    //   360: ifnull +14 -> 374
    //   363: aload 4
    //   365: iload_1
    //   366: aaload
    //   367: aload_0
    //   368: getfield 438	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzV	Landroid/view/View$OnClickListener;
    //   371: invokevirtual 439	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   374: iload_1
    //   375: iconst_1
    //   376: iadd
    //   377: istore_1
    //   378: goto -115 -> 263
    //   381: astore_2
    //   382: aload_0
    //   383: invokespecial 188	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:aRa	()V
    //   386: goto -365 -> 21
    //   389: aload_3
    //   390: getfield 368	com/tencent/mm/plugin/appbrand/n/g$b:dEw	Ljava/util/List;
    //   393: invokeinterface 371 1 0
    //   398: ifle +26 -> 424
    //   401: aload 5
    //   403: iconst_0
    //   404: invokevirtual 435	android/widget/ImageView:setVisibility	(I)V
    //   407: aload 5
    //   409: ldc_w 441
    //   412: invokevirtual 436	android/widget/ImageView:setTag	(Ljava/lang/Object;)V
    //   415: aload 5
    //   417: aload_0
    //   418: getfield 438	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzV	Landroid/view/View$OnClickListener;
    //   421: invokevirtual 439	android/widget/ImageView:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   424: aload_0
    //   425: aload_2
    //   426: invokevirtual 328	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:addView	(Landroid/view/View;)V
    //   429: aload_0
    //   430: getfield 73	com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout:jzM	Ljava/util/List;
    //   433: aload_2
    //   434: invokeinterface 325 2 0
    //   439: pop
    //   440: aload_3
    //   441: getfield 368	com/tencent/mm/plugin/appbrand/n/g$b:dEw	Ljava/util/List;
    //   444: invokeinterface 79 1 0
    //   449: astore 4
    //   451: ldc 41
    //   453: astore_2
    //   454: aload 4
    //   456: invokeinterface 85 1 0
    //   461: ifeq +47 -> 508
    //   464: aload 4
    //   466: invokeinterface 89 1 0
    //   471: checkcast 402	com/tencent/mm/plugin/appbrand/n/g$c
    //   474: astore 5
    //   476: new 159	java/lang/StringBuilder
    //   479: dup
    //   480: invokespecial 160	java/lang/StringBuilder:<init>	()V
    //   483: aload_2
    //   484: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   487: aload 5
    //   489: getfield 444	com/tencent/mm/plugin/appbrand/n/g$c:username	Ljava/lang/String;
    //   492: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   495: ldc_w 446
    //   498: invokevirtual 164	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   501: invokevirtual 170	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   504: astore_2
    //   505: goto -51 -> 454
    //   508: getstatic 452	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   511: sipush 14630
    //   514: iconst_5
    //   515: anewarray 234	java/lang/Object
    //   518: dup
    //   519: iconst_0
    //   520: getstatic 457	com/tencent/mm/plugin/fts/a/e:jqM	Ljava/lang/String;
    //   523: aastore
    //   524: dup
    //   525: iconst_1
    //   526: aload_3
    //   527: getfield 380	com/tencent/mm/plugin/appbrand/n/g$b:bSc	Ljava/lang/String;
    //   530: aastore
    //   531: dup
    //   532: iconst_2
    //   533: aload_2
    //   534: aastore
    //   535: dup
    //   536: iconst_3
    //   537: aload_3
    //   538: getfield 460	com/tencent/mm/plugin/appbrand/n/g$b:gsQ	I
    //   541: invokestatic 291	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   544: aastore
    //   545: dup
    //   546: iconst_4
    //   547: invokestatic 466	java/lang/System:currentTimeMillis	()J
    //   550: ldc2_w 467
    //   553: ldiv
    //   554: invokestatic 473	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   557: aastore
    //   558: invokevirtual 477	com/tencent/mm/plugin/report/service/h:h	(I[Ljava/lang/Object;)V
    //   561: return
    //   562: astore_2
    //   563: goto -449 -> 114
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	566	0	this	FTSMainUIEducationLayout
    //   262	116	1	i	int
    //   48	202	2	localObject1	Object
    //   381	53	2	localException1	Exception
    //   453	81	2	str	String
    //   562	1	2	localException2	Exception
    //   70	468	3	localObject2	Object
    //   191	274	4	localObject3	Object
    //   259	229	5	localObject4	Object
    //   294	58	6	localc	com.tencent.mm.plugin.appbrand.n.g.c
    //   303	29	7	locala	com.tencent.mm.ak.a.a.c.a
    // Exception table:
    //   from	to	target	type
    //   4	21	381	java/lang/Exception
    //   21	114	562	java/lang/Exception
  }
  
  public void aRb() {}
  
  public String getVertBizTypes()
  {
    if (this.jzO == null) {
      return "";
    }
    return this.jzO;
  }
  
  public void setCellClickable(boolean paramBoolean)
  {
    this.jzQ = paramBoolean;
  }
  
  public void setNeedHotWord(boolean paramBoolean)
  {
    this.jzS = paramBoolean;
  }
  
  public void setNeedWXAPP(boolean paramBoolean)
  {
    this.jzT = paramBoolean;
  }
  
  public void setOnCellClickListener(View.OnClickListener paramOnClickListener)
  {
    this.jxn = paramOnClickListener;
  }
  
  public void setOnHotwordClickListener(View.OnClickListener paramOnClickListener)
  {
    this.jzU = paramOnClickListener;
  }
  
  public void setOnWxAppClickListener(View.OnClickListener paramOnClickListener)
  {
    this.jzV = paramOnClickListener;
  }
  
  public void setSelected(int paramInt)
  {
    Iterator localIterator = this.jzN.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((Integer)localEntry.getKey()).intValue() == paramInt) {
        ((TextView)localEntry.getValue()).setTextColor(Color.parseColor("#B5B5B5"));
      } else {
        ((TextView)localEntry.getValue()).setTextColor(Color.parseColor("#45C01A"));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/widget/FTSMainUIEducationLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */