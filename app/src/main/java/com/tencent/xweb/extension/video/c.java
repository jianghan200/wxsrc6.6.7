package com.tencent.xweb.extension.video;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.a;
import com.tencent.xweb.util.e;
import java.util.Timer;
import org.xwalk.core.Log;
import org.xwalk.core.R.id;
import org.xwalk.core.R.layout;

public final class c
  implements GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener
{
  private Window CS;
  private AudioManager dge;
  private WebView eFe;
  Activity mActivity;
  private int mMode = 0;
  private float oUn = 1.0F;
  int tuZ;
  private GestureDetector uG;
  private boolean vBA;
  private long vBB;
  private double vBC;
  private double vBD;
  private double vBE;
  private final int vBF = 0;
  private final int vBG = 1;
  private final int vBH = 2;
  private final int vBI = 3;
  int vBJ = -3;
  private int vBK = 0;
  private double vBL = 0.0D;
  private float vBM = 0.0F;
  private float vBN = 0.0F;
  private a vBO;
  private WindowManager.LayoutParams vBP;
  private String vBQ;
  private Timer vBR;
  private boolean vBS;
  private int vBT = 0;
  private double vBU;
  private int vBV = 200;
  private Drawable vBW;
  private boolean vBX;
  private boolean vBY;
  public boolean vBZ = false;
  private ViewGroup vBj;
  private FrameLayout vBk;
  private SurfaceView vBl;
  View vBm;
  private ViewGroup vBn;
  private VideoStatusLayout vBo;
  private ProgressBar vBp;
  private TextView vBq;
  private TextView vBr;
  private ClickableFrameLayout vBs;
  private LinearLayout vBt;
  private ImageView vBu;
  private ImageView vBv;
  private ImageView vBw;
  private b vBx;
  private WebChromeClient.CustomViewCallback vBy;
  private ScaleGestureDetector vBz;
  private int vCa;
  
  public c(Activity paramActivity, WebView paramWebView)
  {
    this.mActivity = paramActivity;
    this.eFe = paramWebView;
    this.vBk = new FrameLayout(paramActivity);
    this.vBk.setBackgroundColor(-16777216);
    if (paramWebView.isXWalkKernel())
    {
      this.vBl = new SurfaceView(paramActivity);
      this.vBl.getHolder().setFormat(-3);
      this.vBl.getHolder().addCallback(new c.1(this));
      this.vBl.setZOrderOnTop(false);
      this.vBl.setZOrderMediaOverlay(false);
      this.vBk.addView(this.vBl);
    }
    this.uG = new GestureDetector(paramActivity, this);
    this.vBz = new ScaleGestureDetector(paramActivity, this);
    this.uG.setIsLongpressEnabled(false);
    this.vBn = ((ViewGroup)LayoutInflater.from(paramActivity).inflate(R.layout.video_control, null));
    this.vBn.setVisibility(8);
    this.vBx = new b((FrameLayout)this.vBn.findViewById(R.id.player_progress_root), new c.12(this));
    this.vBp = ((ProgressBar)this.vBn.findViewById(R.id.progressLoading));
    this.vBq = ((TextView)this.vBn.findViewById(R.id.tv_current_time));
    this.vBr = ((TextView)this.vBn.findViewById(R.id.tv_total_time));
    this.vBu = ((ImageView)this.vBn.findViewById(R.id.imageFrame));
    this.vBo = ((VideoStatusLayout)this.vBn.findViewById(R.id.layoutStatus));
    this.vBs = ((ClickableFrameLayout)this.vBn.findViewById(R.id.layoutBlank));
    this.vBs.setGestureDetector(this.uG);
    this.vBs.setOnTouchListener(new c.13(this));
    this.vBv = ((ImageView)this.vBn.findViewById(R.id.imageExit));
    this.vBv.setOnClickListener(new c.14(this));
    this.vBt = ((LinearLayout)this.vBn.findViewById(R.id.layoutVideoControl));
    this.vBt.setVisibility(4);
    this.vBw = ((ImageView)this.vBn.findViewById(R.id.imagePlay));
    this.vBw.setOnClickListener(new c.15(this));
    ah(paramActivity);
  }
  
  private void ag(Runnable paramRunnable)
  {
    if (this.mActivity != null) {
      this.mActivity.runOnUiThread(paramRunnable);
    }
  }
  
  /* Error */
  private void ah(Activity paramActivity)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 357	com/tencent/xweb/extension/video/c:vBQ	Ljava/lang/String;
    //   4: ifnonnull +222 -> 226
    //   7: new 359	java/io/File
    //   10: dup
    //   11: invokestatic 365	org/xwalk/core/XWalkEnvironment:getAvailableVersion	()I
    //   14: ldc_w 367
    //   17: invokestatic 371	org/xwalk/core/XWalkEnvironment:getExtractedCoreFile	(ILjava/lang/String;)Ljava/lang/String;
    //   20: invokespecial 374	java/io/File:<init>	(Ljava/lang/String;)V
    //   23: astore_3
    //   24: aload_3
    //   25: invokevirtual 377	java/io/File:isFile	()Z
    //   28: ifeq +369 -> 397
    //   31: aload_3
    //   32: invokevirtual 380	java/io/File:exists	()Z
    //   35: ifeq +362 -> 397
    //   38: new 382	java/io/FileInputStream
    //   41: dup
    //   42: aload_3
    //   43: invokespecial 385	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   46: astore 8
    //   48: iconst_1
    //   49: istore_2
    //   50: iload_2
    //   51: ifne +12 -> 63
    //   54: ldc_w 387
    //   57: ldc_w 389
    //   60: invokestatic 395	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   63: iload_2
    //   64: ifeq +402 -> 466
    //   67: new 397	java/io/InputStreamReader
    //   70: dup
    //   71: aload 8
    //   73: ldc_w 399
    //   76: invokespecial 402	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;Ljava/lang/String;)V
    //   79: astore 4
    //   81: new 404	java/io/BufferedReader
    //   84: dup
    //   85: aload 4
    //   87: invokespecial 407	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   90: astore_3
    //   91: aload_3
    //   92: astore 6
    //   94: aload 4
    //   96: astore 5
    //   98: new 409	java/lang/StringBuffer
    //   101: dup
    //   102: ldc_w 411
    //   105: invokespecial 412	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   108: astore 7
    //   110: aload_3
    //   111: astore 6
    //   113: aload 4
    //   115: astore 5
    //   117: aload_3
    //   118: invokevirtual 416	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   121: astore 9
    //   123: aload 9
    //   125: ifnull +280 -> 405
    //   128: aload_3
    //   129: astore 6
    //   131: aload 4
    //   133: astore 5
    //   135: aload 7
    //   137: aload 9
    //   139: invokevirtual 420	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   142: pop
    //   143: aload_3
    //   144: astore 6
    //   146: aload 4
    //   148: astore 5
    //   150: aload 7
    //   152: ldc_w 422
    //   155: invokevirtual 420	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   158: pop
    //   159: goto -49 -> 110
    //   162: astore 7
    //   164: aload_3
    //   165: astore 6
    //   167: aload 4
    //   169: astore 5
    //   171: ldc_w 387
    //   174: new 424	java/lang/StringBuilder
    //   177: dup
    //   178: ldc_w 426
    //   181: invokespecial 427	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   184: aload 7
    //   186: invokevirtual 430	java/io/IOException:getMessage	()Ljava/lang/String;
    //   189: invokevirtual 433	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: invokevirtual 436	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   195: invokestatic 395	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: aload 4
    //   200: ifnull +8 -> 208
    //   203: aload 4
    //   205: invokevirtual 439	java/io/InputStreamReader:close	()V
    //   208: aload_3
    //   209: ifnull +7 -> 216
    //   212: aload_3
    //   213: invokevirtual 440	java/io/BufferedReader:close	()V
    //   216: aload 8
    //   218: ifnull +8 -> 226
    //   221: aload 8
    //   223: invokevirtual 443	java/io/InputStream:close	()V
    //   226: aload_0
    //   227: getfield 445	com/tencent/xweb/extension/video/c:dge	Landroid/media/AudioManager;
    //   230: ifnonnull +17 -> 247
    //   233: aload_0
    //   234: aload_1
    //   235: ldc_w 447
    //   238: invokevirtual 451	android/app/Activity:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   241: checkcast 453	android/media/AudioManager
    //   244: putfield 445	com/tencent/xweb/extension/video/c:dge	Landroid/media/AudioManager;
    //   247: aload_0
    //   248: aload_0
    //   249: getfield 445	com/tencent/xweb/extension/video/c:dge	Landroid/media/AudioManager;
    //   252: iconst_3
    //   253: invokevirtual 457	android/media/AudioManager:getStreamMaxVolume	(I)I
    //   256: putfield 115	com/tencent/xweb/extension/video/c:vBK	I
    //   259: aload_0
    //   260: aload_0
    //   261: getfield 445	com/tencent/xweb/extension/video/c:dge	Landroid/media/AudioManager;
    //   264: iconst_3
    //   265: invokevirtual 460	android/media/AudioManager:getStreamVolume	(I)I
    //   268: i2d
    //   269: putfield 117	com/tencent/xweb/extension/video/c:vBL	D
    //   272: aload_0
    //   273: getfield 462	com/tencent/xweb/extension/video/c:vBO	Lcom/tencent/xweb/extension/video/a;
    //   276: ifnonnull +15 -> 291
    //   279: aload_0
    //   280: new 464	com/tencent/xweb/extension/video/a
    //   283: dup
    //   284: aload_1
    //   285: invokespecial 465	com/tencent/xweb/extension/video/a:<init>	(Landroid/content/Context;)V
    //   288: putfield 462	com/tencent/xweb/extension/video/c:vBO	Lcom/tencent/xweb/extension/video/a;
    //   291: aload_0
    //   292: getfield 467	com/tencent/xweb/extension/video/c:CS	Landroid/view/Window;
    //   295: ifnonnull +11 -> 306
    //   298: aload_0
    //   299: aload_1
    //   300: invokevirtual 471	android/app/Activity:getWindow	()Landroid/view/Window;
    //   303: putfield 467	com/tencent/xweb/extension/video/c:CS	Landroid/view/Window;
    //   306: aload_0
    //   307: getfield 473	com/tencent/xweb/extension/video/c:vBP	Landroid/view/WindowManager$LayoutParams;
    //   310: ifnonnull +14 -> 324
    //   313: aload_0
    //   314: aload_0
    //   315: getfield 467	com/tencent/xweb/extension/video/c:CS	Landroid/view/Window;
    //   318: invokevirtual 479	android/view/Window:getAttributes	()Landroid/view/WindowManager$LayoutParams;
    //   321: putfield 473	com/tencent/xweb/extension/video/c:vBP	Landroid/view/WindowManager$LayoutParams;
    //   324: aload_0
    //   325: aload_0
    //   326: getfield 473	com/tencent/xweb/extension/video/c:vBP	Landroid/view/WindowManager$LayoutParams;
    //   329: getfield 484	android/view/WindowManager$LayoutParams:screenBrightness	F
    //   332: putfield 123	com/tencent/xweb/extension/video/c:oUn	F
    //   335: aload_0
    //   336: getfield 123	com/tencent/xweb/extension/video/c:oUn	F
    //   339: ldc_w 485
    //   342: fcmpl
    //   343: ifne +26 -> 369
    //   346: aload_0
    //   347: aload_0
    //   348: getfield 131	com/tencent/xweb/extension/video/c:mActivity	Landroid/app/Activity;
    //   351: invokevirtual 489	android/app/Activity:getContentResolver	()Landroid/content/ContentResolver;
    //   354: ldc_w 491
    //   357: invokestatic 497	android/provider/Settings$System:getInt	(Landroid/content/ContentResolver;Ljava/lang/String;)I
    //   360: i2d
    //   361: ldc2_w 498
    //   364: ddiv
    //   365: d2f
    //   366: putfield 123	com/tencent/xweb/extension/video/c:oUn	F
    //   369: return
    //   370: astore_3
    //   371: ldc_w 387
    //   374: new 424	java/lang/StringBuilder
    //   377: dup
    //   378: ldc_w 501
    //   381: invokespecial 427	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   384: aload_3
    //   385: invokevirtual 502	java/io/FileNotFoundException:getMessage	()Ljava/lang/String;
    //   388: invokevirtual 433	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   391: invokevirtual 436	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   394: invokestatic 395	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   397: iconst_0
    //   398: istore_2
    //   399: aconst_null
    //   400: astore 8
    //   402: goto -352 -> 50
    //   405: aload_3
    //   406: astore 6
    //   408: aload 4
    //   410: astore 5
    //   412: aload_0
    //   413: aload 7
    //   415: invokevirtual 503	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   418: putfield 357	com/tencent/xweb/extension/video/c:vBQ	Ljava/lang/String;
    //   421: aload 4
    //   423: invokevirtual 439	java/io/InputStreamReader:close	()V
    //   426: aload_3
    //   427: invokevirtual 440	java/io/BufferedReader:close	()V
    //   430: goto -214 -> 216
    //   433: astore_3
    //   434: goto -218 -> 216
    //   437: astore_1
    //   438: aconst_null
    //   439: astore 6
    //   441: aconst_null
    //   442: astore 4
    //   444: aload 4
    //   446: ifnull +8 -> 454
    //   449: aload 4
    //   451: invokevirtual 439	java/io/InputStreamReader:close	()V
    //   454: aload 6
    //   456: ifnull +8 -> 464
    //   459: aload 6
    //   461: invokevirtual 440	java/io/BufferedReader:close	()V
    //   464: aload_1
    //   465: athrow
    //   466: ldc_w 387
    //   469: ldc_w 505
    //   472: invokestatic 395	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   475: goto -259 -> 216
    //   478: astore_1
    //   479: ldc_w 387
    //   482: new 424	java/lang/StringBuilder
    //   485: dup
    //   486: ldc_w 507
    //   489: invokespecial 427	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   492: aload_1
    //   493: invokevirtual 508	android/provider/Settings$SettingNotFoundException:getMessage	()Ljava/lang/String;
    //   496: invokevirtual 433	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   499: invokevirtual 436	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   502: invokestatic 395	org/xwalk/core/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   505: return
    //   506: astore_3
    //   507: goto -281 -> 226
    //   510: astore_3
    //   511: goto -47 -> 464
    //   514: astore_1
    //   515: aconst_null
    //   516: astore 6
    //   518: goto -74 -> 444
    //   521: astore_1
    //   522: aload 5
    //   524: astore 4
    //   526: goto -82 -> 444
    //   529: astore_3
    //   530: goto -314 -> 216
    //   533: astore 7
    //   535: aconst_null
    //   536: astore_3
    //   537: aconst_null
    //   538: astore 4
    //   540: goto -376 -> 164
    //   543: astore 7
    //   545: aconst_null
    //   546: astore_3
    //   547: goto -383 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	550	0	this	c
    //   0	550	1	paramActivity	Activity
    //   49	350	2	i	int
    //   23	190	3	localObject1	Object
    //   370	57	3	localFileNotFoundException	java.io.FileNotFoundException
    //   433	1	3	localException1	Exception
    //   506	1	3	localException2	Exception
    //   510	1	3	localException3	Exception
    //   529	1	3	localException4	Exception
    //   536	11	3	localObject2	Object
    //   79	460	4	localObject3	Object
    //   96	427	5	localObject4	Object
    //   92	425	6	localObject5	Object
    //   108	43	7	localStringBuffer	StringBuffer
    //   162	252	7	localIOException1	java.io.IOException
    //   533	1	7	localIOException2	java.io.IOException
    //   543	1	7	localIOException3	java.io.IOException
    //   46	355	8	localFileInputStream	java.io.FileInputStream
    //   121	17	9	str	String
    // Exception table:
    //   from	to	target	type
    //   98	110	162	java/io/IOException
    //   117	123	162	java/io/IOException
    //   135	143	162	java/io/IOException
    //   150	159	162	java/io/IOException
    //   412	421	162	java/io/IOException
    //   38	48	370	java/io/FileNotFoundException
    //   421	430	433	java/lang/Exception
    //   67	81	437	finally
    //   346	369	478	android/provider/Settings$SettingNotFoundException
    //   221	226	506	java/lang/Exception
    //   449	454	510	java/lang/Exception
    //   459	464	510	java/lang/Exception
    //   81	91	514	finally
    //   98	110	521	finally
    //   117	123	521	finally
    //   135	143	521	finally
    //   150	159	521	finally
    //   171	198	521	finally
    //   412	421	521	finally
    //   203	208	529	java/lang/Exception
    //   212	216	529	java/lang/Exception
    //   67	81	533	java/io/IOException
    //   81	91	543	java/io/IOException
  }
  
  private void mX(boolean paramBoolean)
  {
    ag(new c.2(this, paramBoolean));
  }
  
  private void mY(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if ((this.mActivity.getWindow().getAttributes().flags & 0x800) != 0)
      {
        this.vBY = true;
        this.mActivity.getWindow().clearFlags(2048);
        if (!this.vBZ)
        {
          if ((this.mActivity.getWindow().getAttributes().flags & 0x400) == 0) {
            break label88;
          }
          this.vBX = true;
        }
      }
      for (;;)
      {
        this.vBZ = true;
        return;
        this.vBY = false;
        break;
        label88:
        this.vBX = false;
        this.mActivity.getWindow().addFlags(1024);
      }
    }
    if (this.vBY) {
      this.mActivity.getWindow().addFlags(2048);
    }
    if (!this.vBX) {
      this.mActivity.getWindow().clearFlags(1024);
    }
    this.vCa = 0;
    this.vBZ = false;
    this.vBA = false;
  }
  
  private static String q(double paramDouble1, double paramDouble2)
  {
    String str1 = String.format("%02d", new Object[] { Integer.valueOf((int)(paramDouble1 / 3600.0D)) });
    String str2 = String.format("%02d", new Object[] { Integer.valueOf((int)(paramDouble1 % 3600.0D) / 60) });
    String str3 = String.format("%02d", new Object[] { Integer.valueOf((int)(paramDouble1 % 3600.0D) % 60) });
    if (paramDouble2 > 3600.0D) {
      return String.format("%s:%s:%s", new Object[] { str1, str2, str3 });
    }
    return String.format("%s:%s", new Object[] { str2, str3 });
  }
  
  public final void a(WebView paramWebView, boolean paramBoolean)
  {
    if ((paramWebView != null) && (paramWebView.getFullscreenVideoKind() == WebView.a.vAM) && (this.vBQ != null))
    {
      Log.i("XWebNativeInterface", "evaluteJavascript:" + paramBoolean);
      String str = this.vBQ;
      if (paramBoolean)
      {
        str = this.vBQ;
        str = "window.addEventListener('DOMContentLoaded', function() {" + str + "});this.xwebReturn = function (){return \"1\";};this.xwebReturn()";
      }
      paramWebView.evaluateJavascript(str, new c.16(this));
    }
  }
  
  public final void cIA()
  {
    if (this.vBR != null)
    {
      this.vBR.cancel();
      this.vBR.purge();
      this.vBR = null;
    }
  }
  
  public final void cIB()
  {
    ag(new c.18(this));
  }
  
  public final void cIC()
  {
    ag(new Runnable()
    {
      public final void run()
      {
        c.a(c.this, false);
        c.j(c.this).setVisibility(4);
      }
    });
  }
  
  public final void cIz()
  {
    if (this.vBR != null)
    {
      this.vBR.cancel();
      this.vBR.purge();
      this.vBR = null;
    }
    this.vBR = new Timer();
    this.vBR.schedule(new c.17(this), 4000L);
  }
  
  public final void e(final double paramDouble, final boolean paramBoolean)
  {
    ag(new Runnable()
    {
      public final void run()
      {
        if ((paramBoolean) && (c.a(c.this) != 0.0D)) {
          c.l(c.this).c((int)(100.0D * (paramDouble / c.a(c.this))), false);
        }
        c.m(c.this).setText(c.a(c.this, paramDouble));
        c.o(c.this).setText(c.n(c.this));
      }
    });
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    this.vBT = 0;
    return true;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final void onHideCustomView()
  {
    if (this.vBy != null) {
      this.vBy.onCustomViewHidden();
    }
    Log.i("XWebNativeInterface", "detach");
    if (!this.vBZ) {
      Log.i("XWebNativeInterface", "detach has exited fullscreen");
    }
    do
    {
      ViewGroup localViewGroup;
      do
      {
        return;
        if (this.vBW != null)
        {
          this.eFe.setBackground(this.vBW);
          this.vBW = null;
        }
        localViewGroup = (ViewGroup)this.mActivity.getWindow().getDecorView();
      } while (this.vBk.getParent() != localViewGroup);
      if (this.eFe.isXWalkKernel())
      {
        this.vBk.removeView(this.eFe);
        this.vBj.addView(this.eFe, 0);
      }
      if (this.vBm != null) {
        this.vBk.removeView(this.vBm);
      }
      this.vBk.removeView(this.vBn);
      this.vBn.setVisibility(8);
      if (this.vBJ != -3)
      {
        this.mActivity.setRequestedOrientation(this.vBJ);
        this.vBJ = -3;
      }
      mY(false);
    } while (!(this.vBk.getParent() instanceof ViewGroup));
    ((ViewGroup)this.vBk.getParent()).removeView(this.vBk);
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    if ((this.mMode == 1) && (this.vBm != null))
    {
      float f = paramScaleGestureDetector.getScaleFactor();
      this.vBm.getLeft();
      this.vBm.getTop();
      this.vBm.getBottom();
      this.vBm.getRight();
      int i = (int)(this.vBm.getWidth() * f);
      int j = (int)(f * this.vBm.getHeight());
      paramScaleGestureDetector = new FrameLayout.LayoutParams(-2, -2, 17);
      paramScaleGestureDetector.width = i;
      paramScaleGestureDetector.height = j;
      if (this.vBm != null) {
        this.vBm.setLayoutParams(paramScaleGestureDetector);
      }
      return true;
    }
    return false;
  }
  
  public final boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    return true;
  }
  
  public final void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector) {}
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null)) {
      return true;
    }
    float f1 = paramMotionEvent2.getX();
    float f2 = paramMotionEvent1.getX();
    float f3 = paramMotionEvent2.getY() - paramMotionEvent1.getY();
    if (this.vBn.getHeight() > this.vBn.getWidth())
    {
      paramFloat2 = this.vBn.getWidth();
      paramFloat1 = this.vBn.getHeight();
    }
    double d1;
    switch (this.vBT)
    {
    default: 
    case 0: 
      for (;;)
      {
        return true;
        paramFloat2 = this.vBn.getHeight();
        paramFloat1 = this.vBn.getWidth();
        break;
        if (Math.abs(f1 - f2) - Math.abs(f3) > 1.0F)
        {
          this.vBT = 3;
        }
        else
        {
          ah(this.mActivity);
          d1 = Math.ceil(25.0F * this.eFe.getContext().getResources().getDisplayMetrics().density);
          if ((paramMotionEvent1.getY() < 2.0D * d1) || (paramMotionEvent1.getY() > this.vBn.getHeight() - d1 * 2.0D)) {
            this.vBT = 0;
          } else if (paramMotionEvent1.getX() < this.vBn.getWidth() / 2.0F) {
            this.vBT = 2;
          } else {
            this.vBT = 1;
          }
        }
      }
    case 1: 
      paramFloat1 = f3 * -1.0F;
      d1 = this.vBK * paramFloat1 / paramFloat2 * 1.2F;
      int j = (int)d1;
      int i = j;
      if (j == 0)
      {
        i = j;
        if (Math.abs(d1) > 0.20000000298023224D)
        {
          if (paramFloat1 <= 0.0F) {
            break label418;
          }
          i = 1;
        }
      }
      d1 = this.vBL;
      double d2 = i + d1;
      if (d2 > this.vBK) {
        d1 = this.vBK;
      }
      for (;;)
      {
        this.dge.setStreamVolume(3, (int)d1, 4);
        i = (int)(d1 / Float.valueOf(this.vBK).floatValue() * 100.0D);
        this.vBo.setVolumnProgress(i);
        this.vBo.show();
        break;
        i = j;
        if (paramFloat1 >= 0.0F) {
          break label333;
        }
        i = -1;
        break label333;
        d1 = d2;
        if (d2 < 0.0D) {
          d1 = 0.0D;
        }
      }
    case 2: 
      label333:
      label418:
      paramFloat2 = -1.0F * f3 / paramFloat2 * 1.2F + this.oUn;
      if (paramFloat2 < 0.0F) {
        paramFloat1 = 0.0F;
      }
      for (;;)
      {
        this.vBP.screenBrightness = paramFloat1;
        this.CS.setAttributes(this.vBP);
        this.vBo.setBrightProgress((int)(paramFloat1 * 100.0F));
        this.vBo.show();
        break;
        paramFloat1 = paramFloat2;
        if (paramFloat2 > 1.0F) {
          paramFloat1 = 1.0F;
        }
      }
    }
    paramFloat2 = paramMotionEvent2.getX() - paramMotionEvent1.getX();
    this.vBN = this.vBx.tua;
    if (paramFloat2 > 0.0F)
    {
      f1 = this.vBN;
      this.vBM = ((int)(paramFloat2 / paramFloat1 * 100.0F + f1));
      if (this.vBM > 100.0F) {
        this.vBM = 100.0F;
      }
    }
    for (;;)
    {
      d1 = this.vBC * this.vBM / 100.0D;
      this.vBo.setVideoTimeProgress(q(d1, this.vBC) + "/" + q(this.vBC, this.vBC));
      this.vBo.show();
      this.vBU = d1;
      break;
      f1 = this.vBN;
      this.vBM = ((int)(paramFloat2 / paramFloat1 * 100.0F + f1));
      if (this.vBM < 0.0F) {
        this.vBM = 0.0F;
      }
    }
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    Log.i("XWebNativeInterface", "onShowCustomView");
    this.vBm = paramView;
    this.vBy = paramCustomViewCallback;
    if ((this.vBm != null) || (this.eFe.isXWalkKernel()))
    {
      if (!this.eFe.isXWalkKernel()) {
        break label75;
      }
      e.cIO();
    }
    label75:
    do
    {
      do
      {
        for (;;)
        {
          Log.i("XWebNativeInterface", "attach");
          if (!this.vBZ) {
            break;
          }
          Log.i("XWebNativeInterface", "attach has entered fullscreen");
          return;
          if (this.eFe.isSysKernel()) {
            e.cIS();
          }
        }
        mY(true);
        paramView = (FrameLayout)this.mActivity.getWindow().getDecorView();
        if ((this.eFe.isXWalkKernel()) && (this.vBk.getParent() == paramView) && (this.vBm != null))
        {
          this.vBk.addView(this.vBm, 0, new FrameLayout.LayoutParams(-1, -1, 17));
          return;
        }
      } while (this.vBk.getParent() == paramView);
      paramView.addView(this.vBk, new FrameLayout.LayoutParams(-1, -1, 17));
      if (this.vBm != null)
      {
        this.vBk.addView(this.vBm, this.vBk.getChildCount(), new FrameLayout.LayoutParams(-1, -1, 17));
        if (this.eFe.isSysKernel()) {
          this.vBm.setVisibility(4);
        }
      }
      if (this.eFe.isXWalkKernel())
      {
        this.vBj = ((ViewGroup)this.eFe.getParent());
        this.vBj.removeView(this.eFe);
        this.vBk.addView(this.eFe, this.vBk.getChildCount());
      }
      this.vBk.addView(this.vBn, this.vBk.getChildCount(), new FrameLayout.LayoutParams(-1, -1, 17));
      this.vBW = this.eFe.getBackground();
      this.eFe.setBackgroundColor(-16777216);
    } while (!this.eFe.isSysKernel());
    this.vBk.postDelayed(new c.11(this), this.vBV);
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    cIA();
    if (this.vBS) {
      cIC();
    }
    for (;;)
    {
      return true;
      cIB();
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onSpecialVideoEnterFullscreen(int paramInt)
  {
    Log.i("XWebNativeInterface", "onSpecialVideoEnterFullscreen:" + paramInt);
    e.at(paramInt, this.eFe.isXWalkKernel());
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onSpecialVideoHook(int paramInt)
  {
    Log.i("XWebNativeInterface", "onSpecialVideoHook:" + paramInt);
    e.au(paramInt, this.eFe.isXWalkKernel());
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoEnterFullscreen(final boolean paramBoolean1, long paramLong, final double paramDouble1, double paramDouble2, boolean paramBoolean2, boolean paramBoolean3, double paramDouble3, double paramDouble4, double[] paramArrayOfDouble)
  {
    Log.i("XWebNativeInterface", "onVideoEnterFullscreen:isVideoTag:" + paramBoolean1 + ",width:" + paramDouble1 + ",height:" + paramDouble2 + ",pause:" + paramBoolean2 + ",seeking:" + paramBoolean3 + ",currentTime:" + paramDouble3 + ",duration:" + paramDouble4);
    if (this.eFe.isXWalkKernel())
    {
      e.cIP();
      if (paramBoolean1)
      {
        if (!this.eFe.isXWalkKernel()) {
          break label206;
        }
        e.cIQ();
        label119:
        this.vBA = true;
      }
      this.vBB = paramLong;
      this.vBC = paramDouble4;
      this.vBD = paramDouble1;
      this.vBE = paramDouble2;
      if (!paramBoolean3) {
        break label222;
      }
      onVideoSeeking();
    }
    for (;;)
    {
      ag(new Runnable()
      {
        public final void run()
        {
          if (paramBoolean1) {
            c.q(c.this).setVisibility(0);
          }
          Object localObject2 = c.this;
          int k = (int)paramDouble1;
          int m = (int)this.vCj;
          Object localObject1;
          int i;
          Point localPoint;
          int j;
          label181:
          double d1;
          if (((c)localObject2).vBJ == -3)
          {
            localObject1 = ((c)localObject2).mActivity;
            if (localObject1 != null)
            {
              ((c)localObject2).vBJ = ((Activity)localObject1).getRequestedOrientation();
              if (k > m) {
                break label236;
              }
              ((Activity)localObject1).setRequestedOrientation(1);
              i = 1;
              ((c)localObject2).tuZ = i;
              if (((c)localObject2).vBm != null)
              {
                localObject1 = ((c)localObject2).vBm;
                localObject2 = ((WindowManager)((c)localObject2).mActivity.getSystemService("window")).getDefaultDisplay();
                localPoint = new Point(0, 0);
                ((Display)localObject2).getSize(localPoint);
                if (i != 0) {
                  break label248;
                }
                j = Math.max(localPoint.x, localPoint.y);
                i = Math.min(localPoint.x, localPoint.y);
                d1 = k * 1.0D / m;
                if (d1 < j * 1.0D / i) {
                  break label281;
                }
                double d2 = j;
                i = (int)(1.0D / d1 * d2);
              }
            }
          }
          for (;;)
          {
            ((View)localObject1).setLayoutParams(new FrameLayout.LayoutParams(j, i, 17));
            return;
            label236:
            ((Activity)localObject1).setRequestedOrientation(0);
            i = 0;
            break;
            label248:
            i = Math.max(localPoint.x, localPoint.y);
            j = Math.min(localPoint.x, localPoint.y);
            break label181;
            label281:
            j = (int)(d1 * i);
          }
        }
      });
      onVideoTimeUpdate(paramDouble3, paramDouble4, paramArrayOfDouble);
      mX(paramBoolean2);
      return;
      if (!this.eFe.isSysKernel()) {
        break;
      }
      e.cIT();
      break;
      label206:
      if (!this.eFe.isSysKernel()) {
        break label119;
      }
      e.cIU();
      break label119;
      label222:
      onVideoSeeked();
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoExitFullscreen()
  {
    Log.i("XWebNativeInterface", "onVideoExitFullscreen");
    this.vBA = false;
    ag(new Runnable()
    {
      public final void run()
      {
        c.q(c.this).setVisibility(8);
      }
    });
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoGetFrame(long paramLong, double paramDouble, String paramString)
  {
    if ((paramLong == this.vBB) && (this.vBU == paramDouble) && (paramString != null) && (paramString.startsWith("data:image/png;base64,")))
    {
      paramString = Base64.decode(paramString.substring(22), 0);
      paramString = BitmapFactory.decodeByteArray(paramString, 0, paramString.length);
      this.vBu.setImageBitmap(paramString);
      this.vBu.setVisibility(0);
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoPause()
  {
    Log.i("XWebNativeInterface", "onVideoPause");
    mX(true);
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoPlay()
  {
    Log.i("XWebNativeInterface", "onVideoPlay");
    mX(false);
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoPlaying()
  {
    Log.i("XWebNativeInterface", "onVideoPlaying");
    ag(new c.5(this));
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoSeeked()
  {
    Log.i("XWebNativeInterface", "onVideoSeeked");
    ag(new c.8(this));
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoSeeking()
  {
    Log.i("XWebNativeInterface", "onVideoSeeking");
    ag(new c.7(this));
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoTimeUpdate(double paramDouble1, double paramDouble2, double[] paramArrayOfDouble)
  {
    this.vBC = paramDouble2;
    e(paramDouble1, true);
    ag(new c.4(this, paramDouble2, paramArrayOfDouble));
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void onVideoWaiting()
  {
    Log.i("XWebNativeInterface", "onVideoWaiting");
    ag(new c.6(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/xweb/extension/video/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */