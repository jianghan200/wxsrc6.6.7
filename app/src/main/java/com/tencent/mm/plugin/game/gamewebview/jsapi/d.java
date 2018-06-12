package com.tencent.mm.plugin.game.gamewebview.jsapi;

import android.os.Handler;
import android.os.HandlerThread;
import com.tencent.mm.plugin.game.gamewebview.ipc.GWMainProcessTask;
import com.tencent.mm.plugin.game.gamewebview.ipc.GameWebViewMainProcessService;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

public final class d
{
  private Map<String, c> fEL;
  public Handler fwr;
  protected com.tencent.mm.plugin.game.gamewebview.ui.d jGw;
  public JSONObject jGx;
  public HashSet<String> jGy = new HashSet();
  
  public d(com.tencent.mm.plugin.game.gamewebview.ui.d paramd)
  {
    this.jGw = paramd;
    this.fEL = e.aSw();
    paramd = new HandlerThread("GameWebviewAsyncJSThread");
    paramd.start();
    this.fwr = new Handler(paramd.getLooper());
  }
  
  private static String Df(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("err_msg", paramString);
    return new JSONObject(localHashMap).toString();
  }
  
  private static JSONObject ti(String paramString)
  {
    String str = paramString;
    try
    {
      if (bi.oW(paramString)) {
        str = "{}";
      }
      paramString = new JSONObject(str);
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.GameJsApiInterface", paramString.getMessage());
    }
    return new JSONObject();
  }
  
  /* Error */
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final String invokeHandler(String paramString1, String paramString2, int paramInt, long paramLong)
  {
    // Byte code:
    //   0: invokestatic 115	java/lang/System:currentTimeMillis	()J
    //   3: lstore 7
    //   5: ldc 95
    //   7: ldc 117
    //   9: iconst_2
    //   10: anewarray 4	java/lang/Object
    //   13: dup
    //   14: iconst_0
    //   15: aload_1
    //   16: aastore
    //   17: dup
    //   18: iconst_1
    //   19: lload 7
    //   21: lload 4
    //   23: lsub
    //   24: invokestatic 123	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   27: aastore
    //   28: invokestatic 127	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   31: aload_1
    //   32: invokestatic 133	com/tencent/mm/plugin/game/gamewebview/a/b:CZ	(Ljava/lang/String;)I
    //   35: istore 6
    //   37: iload 6
    //   39: ifle +17 -> 56
    //   42: getstatic 139	com/tencent/mm/plugin/report/service/h:mEJ	Lcom/tencent/mm/plugin/report/service/h;
    //   45: ldc2_w 140
    //   48: iload 6
    //   50: i2l
    //   51: lconst_1
    //   52: iconst_0
    //   53: invokevirtual 145	com/tencent/mm/plugin/report/service/h:a	(JJJZ)V
    //   56: aload_0
    //   57: getfield 36	com/tencent/mm/plugin/game/gamewebview/jsapi/d:fEL	Ljava/util/Map;
    //   60: aload_1
    //   61: invokeinterface 149 2 0
    //   66: instanceof 151
    //   69: istore 9
    //   71: iload 9
    //   73: ifeq +63 -> 136
    //   76: aload_0
    //   77: aload_1
    //   78: aload_2
    //   79: iload_3
    //   80: invokevirtual 155	com/tencent/mm/plugin/game/gamewebview/jsapi/d:w	(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;
    //   83: astore 10
    //   85: aload_2
    //   86: ifnonnull +76 -> 162
    //   89: iconst_0
    //   90: istore_3
    //   91: ldc 95
    //   93: ldc -99
    //   95: iconst_4
    //   96: anewarray 4	java/lang/Object
    //   99: dup
    //   100: iconst_0
    //   101: aload_1
    //   102: aastore
    //   103: dup
    //   104: iconst_1
    //   105: iload_3
    //   106: invokestatic 162	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   109: aastore
    //   110: dup
    //   111: iconst_2
    //   112: iload 9
    //   114: invokestatic 167	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   117: aastore
    //   118: dup
    //   119: iconst_3
    //   120: invokestatic 115	java/lang/System:currentTimeMillis	()J
    //   123: lload 7
    //   125: lsub
    //   126: invokestatic 123	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   129: aastore
    //   130: invokestatic 127	com/tencent/mm/sdk/platformtools/x:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: aload 10
    //   135: areturn
    //   136: aload_0
    //   137: getfield 57	com/tencent/mm/plugin/game/gamewebview/jsapi/d:fwr	Landroid/os/Handler;
    //   140: new 169	com/tencent/mm/plugin/game/gamewebview/jsapi/d$1
    //   143: dup
    //   144: aload_0
    //   145: aload_1
    //   146: aload_2
    //   147: iload_3
    //   148: invokespecial 172	com/tencent/mm/plugin/game/gamewebview/jsapi/d$1:<init>	(Lcom/tencent/mm/plugin/game/gamewebview/jsapi/d;Ljava/lang/String;Ljava/lang/String;I)V
    //   151: invokevirtual 176	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   154: pop
    //   155: ldc -78
    //   157: astore 10
    //   159: goto -74 -> 85
    //   162: aload_2
    //   163: invokevirtual 184	java/lang/String:length	()I
    //   166: istore_3
    //   167: goto -76 -> 91
    //   170: astore_2
    //   171: ldc 95
    //   173: ldc -70
    //   175: iconst_3
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_1
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: aload_2
    //   186: invokevirtual 98	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   189: aastore
    //   190: dup
    //   191: iconst_2
    //   192: aload_2
    //   193: invokevirtual 190	java/lang/Exception:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   196: aastore
    //   197: invokestatic 192	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: aload_2
    //   201: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	202	0	this	d
    //   0	202	1	paramString1	String
    //   0	202	2	paramString2	String
    //   0	202	3	paramInt	int
    //   0	202	4	paramLong	long
    //   35	14	6	i	int
    //   3	121	7	l	long
    //   69	44	9	bool	boolean
    //   83	75	10	str	String
    // Exception table:
    //   from	to	target	type
    //   56	71	170	java/lang/Exception
    //   76	85	170	java/lang/Exception
    //   91	133	170	java/lang/Exception
    //   136	155	170	java/lang/Exception
    //   162	167	170	java/lang/Exception
  }
  
  final String w(String paramString1, String paramString2, int paramInt)
  {
    if ((this.jGw == null) || (this.jGw.getPageActivity() == null))
    {
      x.e("MicroMsg.GameJsApiInterface", "activity is null");
      paramString2 = "";
      return paramString2;
    }
    Object localObject = (c)this.fEL.get(paramString1);
    boolean bool2 = localObject instanceof f;
    paramString1 = ti(paramString2);
    if (localObject == null) {
      paramString1 = Df("system:function_not_exist");
    }
    for (;;)
    {
      paramString2 = paramString1;
      if (bool2) {
        break;
      }
      if (paramString1 != null) {
        this.jGw.E(paramInt, paramString1);
      }
      return "";
      if (this.jGy.contains(((c)localObject).getName())) {
        this.jGy.remove(((c)localObject).getName());
      }
      for (boolean bool1 = true;; bool1 = this.jGw.bs(((c)localObject).getName(), ((c)localObject).aSs()))
      {
        if (bool1) {
          break label157;
        }
        paramString1 = Df("system:access_denied");
        break;
      }
      try
      {
        label157:
        if (this.jGx != null)
        {
          if (!bi.oW(this.jGx.optString("srcUsername"))) {
            paramString1.put("src_username", this.jGx.optString("srcUsername"));
          }
          if (!bi.oW(this.jGx.optString("srcDisplayname"))) {
            paramString1.put("src_displayname", this.jGx.optString("srcDisplayname"));
          }
          if (!bi.oW(this.jGx.optString("KTemplateId"))) {
            paramString1.put("tempalate_id", this.jGx.optString("KTemplateId"));
          }
          paramString1.put("message_id", this.jGx.optLong("message_id"));
          paramString1.put("message_index", this.jGx.optInt("message_index"));
          paramString1.put("webview_scene", this.jGx.optInt("scene"));
          paramString1.put("stastic_scene", this.jGx.optInt("stastic_scene"));
        }
        paramString1.put("current_url", this.jGw.getCurrentURL());
        paramString1.put("current_appid", this.jGw.getCacheAppId());
        if (bool2) {
          paramString1 = "";
        }
      }
      catch (Exception paramString2)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.GameJsApiInterface", paramString2, "", new Object[0]);
        }
        paramString2 = (a)localObject;
        if (paramString2.aSu() == 2)
        {
          localObject = new GameJsApiActivityTask(this.jGw.getPageActivity());
          ((GameJsApiActivityTask)localObject).jGq = this.jGw;
          ((GameJsApiActivityTask)localObject).fFd = paramInt;
          ((GameJsApiActivityTask)localObject).jGt = paramString2.getName();
          ((GameJsApiActivityTask)localObject).fII = paramString1.toString();
          ((GameJsApiActivityTask)localObject).aNI();
          paramString1 = null;
        }
        else if (paramString2.aSu() == 1)
        {
          localObject = new GameJsApiMMTask();
          ((GameJsApiMMTask)localObject).jGq = this.jGw;
          ((GameJsApiMMTask)localObject).fFd = paramInt;
          ((GameJsApiMMTask)localObject).jGt = paramString2.getName();
          ((GameJsApiMMTask)localObject).fII = paramString1.toString();
          ((GameJsApiMMTask)localObject).ahA();
          GameWebViewMainProcessService.a((GWMainProcessTask)localObject);
          paramString1 = null;
        }
        else
        {
          paramString2.a(this.jGw, paramString1, paramInt);
          paramString1 = null;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */